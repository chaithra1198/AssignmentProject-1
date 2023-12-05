package QualiAssignmentTestcases;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Homepagelocators;
import Pages.LoginPageLocators;
import Pages.RegisterpageLocators;
import Pages.SuccessRegistrationpageLocators;
import QualiAssignmentbase.BaseAss1;

public class RegisterAndLoginWithSameCreds extends BaseAss1 {

	public static WebDriver driver;
	public static String EmailId;
	public static String PWD;


	RegisterAndLoginWithSameCreds()
	{
		super();
	}

	@AfterMethod
	public void TocloseTheBrwoser()
	{
		driver.quit();
	}

	@BeforeMethod
	public void SetUp()
	{
		driver=ToInitializetheBrowserAndLaunchTheURL(prop.getProperty("BrowserName"));
		Homepagelocators homepage=new Homepagelocators(driver);
		homepage.ClickonMyAccountbutton();
		homepage.ClickOnRegisterButton();
		
		

	}
	@Test(priority=1)
	public void CheckErrorMessageswithNullFields()
	{
		
		RegisterpageLocators regpage=new RegisterpageLocators(driver);
		regpage.ClickOnContinueButton();
		String ActualPrivacypolicywarning=regpage.PrivacyAndPolicyWarningMessage();
		String ExpectedPrivacyPolicyWarningMessage="Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(ActualPrivacypolicywarning, ExpectedPrivacyPolicyWarningMessage);

		String actualFirstNamewarningmessage=regpage.FirstNameWarningMessage();
		String ExpectedFirstNameWarningMessage="First Name must be between 1 and 32 characters!";
		Assert.assertEquals(actualFirstNamewarningmessage, ExpectedFirstNameWarningMessage);

		String ActualLastNameWarningMessage=regpage.LastNameWarningMessage();
		String ExpectedLastNameWarningMessage="Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(ActualLastNameWarningMessage, ExpectedLastNameWarningMessage);

		String ActualEmailWarningMessage=regpage.EmailaddressWarningMessage();
		String ExpectedEmailWarningMessage="E-Mail Address does not appear to be valid!";
		Assert.assertEquals(ActualEmailWarningMessage,ExpectedEmailWarningMessage);

		String ActualTelephoneWaningMeagges=regpage.TelephoneWarningMessage();
		String ExpectedTelephoneWarningMessage="Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(ActualTelephoneWaningMeagges,ExpectedTelephoneWarningMessage );

		String ActualPasswordWarningMeaage=regpage.PasswordWarningMessage();
		String ExpectedPasswordWarmingMessage="Password must be between 4 and 20 characters!";
		Assert.assertEquals(ActualPasswordWarningMeaage,ExpectedPasswordWarmingMessage);
	}
	@Test(priority=2)
	public void RegisterWithValidCredsAndLoginWithSameCreds() throws InterruptedException
	{
		Random randomstring=new Random();//class to generate dynamic emailand pwd
	    RegisterpageLocators regpage=new RegisterpageLocators(driver);
		EmailId=regpage.EmailField("chaithra"+randomstring.nextInt()+"@gmail.com");
		System.out.println("My register account emailid is "+ EmailId);
		PWD=regpage.PasswordField("123"+randomstring.nextInt());
		System.out.println("My register account Password is "+ PWD);
		regpage.FirstNameField();
		regpage.LastNameField();
		regpage.EmailField(EmailId);
		regpage.TelephoneField();
		regpage.PasswordField(PWD);
		regpage.ConfirmpasswordField();
		regpage.ClickOnPrivacypolicyCheckBox();
		regpage.ClickOnContinueButton(); 
		Thread.sleep(6000);
		SuccessRegistrationpageLocators sucessreg=new SuccessRegistrationpageLocators(driver);
		String ActualAccountSuccesRegMsg=sucessreg.accountCreationSuccessMsg();
		String ExpectedAccountSuccessMsg="Your Account Has Been Created!";
		Assert.assertEquals(ActualAccountSuccesRegMsg,ExpectedAccountSuccessMsg);//registered successfully*/
		
		//login with same creds
		Homepagelocators homepage=new Homepagelocators(driver);
		homepage.ClickonMyAccountbutton(); // To login with same email first need to logout
	    homepage.ClickOnLogoutbutton();
		homepage.ClickonMyAccountbutton();
		LoginPageLocators logpage=new LoginPageLocators(driver);
        logpage.ClickOnLoginbutton();
	    logpage.EnterInputEmail(EmailId);
		logpage.EnterInputPassword(PWD);
		logpage.ClickOnLoginbutton();
		
		


	}

}

