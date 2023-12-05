package QualiAssignmentTestcases;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
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
	public static String Password;


	public RegisterAndLoginWithSameCreds()
	{
		super();
	}

	@AfterMethod
	/*public void TocloseTheBrwoser()
	{
		driver.quit();
	}*/

	@BeforeMethod
	public void SetUp()
	{
		driver=ToInitializetheBrowserAndLaunchTheURL(prop.getProperty("BrowserName"));
		Homepagelocators homepage=new Homepagelocators(driver);
		homepage.ClickonMyAccountbutton();
		
	}
	@Test(priority=1)
	public void CheckErrorMessageswithNullFields()
	{
		
		RegisterpageLocators regpage=new RegisterpageLocators(driver);
		Homepagelocators homepage=new Homepagelocators(driver);
		homepage.ClickOnRegisterButton();
		regpage.ClickOnContinueButton();
		String ActualPrivacypolicywarning=regpage.PrivacyAndPolicyWarningMessage();
		String ExpectedPrivacyPolicyWarningMessage="Warning: You must agree to the Privacy Policy!";
		AssertJUnit.assertEquals(ActualPrivacypolicywarning, ExpectedPrivacyPolicyWarningMessage);

		String actualFirstNamewarningmessage=regpage.FirstNameWarningMessage();
		String ExpectedFirstNameWarningMessage="First Name must be between 1 and 32 characters!";
		AssertJUnit.assertEquals(actualFirstNamewarningmessage, ExpectedFirstNameWarningMessage);

		String ActualLastNameWarningMessage=regpage.LastNameWarningMessage();
		String ExpectedLastNameWarningMessage="Last Name must be between 1 and 32 characters!";
		AssertJUnit.assertEquals(ActualLastNameWarningMessage, ExpectedLastNameWarningMessage);

		String ActualEmailWarningMessage=regpage.EmailaddressWarningMessage();
		String ExpectedEmailWarningMessage="E-Mail Address does not appear to be valid!";
		AssertJUnit.assertEquals(ActualEmailWarningMessage,ExpectedEmailWarningMessage);

		String ActualTelephoneWaningMeagges=regpage.TelephoneWarningMessage();
		String ExpectedTelephoneWarningMessage="Telephone must be between 3 and 32 characters!";
		AssertJUnit.assertEquals(ActualTelephoneWaningMeagges,ExpectedTelephoneWarningMessage );

		String ActualPasswordWarningMeaage=regpage.PasswordWarningMessage();
		String ExpectedPasswordWarmingMessage="Password must be between 4 and 20 characters!";
		AssertJUnit.assertEquals(ActualPasswordWarningMeaage,ExpectedPasswordWarmingMessage);
	}
	@Test(priority=2)
	public void RegisterWithValidCreds() 
	{
		Homepagelocators homepage=new Homepagelocators(driver);
		homepage.ClickOnRegisterButton();
		
		RegisterpageLocators regpage=new RegisterpageLocators(driver);
	    regpage.FirstNameField();
		regpage.LastNameField();
		Random randomstring=new Random();//class to generate dynamic emailand pwd
		EmailId=regpage.EmailField("chaithra"+randomstring.nextInt()+"@gmail.com");
		System.out.println("My register account emailid is "+ EmailId);
		Password=regpage.PasswordField("123"+randomstring.nextInt());
		System.out.println("My register account Password is "+ Password);
	    //regpage.EmailField(EmailId);
		regpage.TelephoneField();
		//regpage.PasswordField(Password);
		regpage.ConfirmpasswordField(Password);
		regpage.ClickOnPrivacypolicyCheckBox();
		regpage.ClickOnContinueButton(); 
	     SuccessRegistrationpageLocators sucessreg=new SuccessRegistrationpageLocators(driver);
		String ActualAccountSuccesRegMsg=sucessreg.accountCreationSuccessMsg();
		String ExpectedAccountSuccessMsg="Your Account Has Been Created!";
		Assert.assertEquals(ActualAccountSuccesRegMsg,ExpectedAccountSuccessMsg);//registered successfully
		
		Homepagelocators homepage1=new Homepagelocators(driver);
		LoginPageLocators logpage=new LoginPageLocators(driver);
		logpage.logoutbutton();
		//homepage1.ClickonMyAccountbutton(); // To login with same email first need to logout
		//homepage1.ClickOnLogoutbutton();
		homepage1.ClickonMyAccountbutton();
		homepage1.ClickOnLoginButton();
		
	    logpage.EnterInputEmail(EmailId);
		logpage.EnterInputPassword(Password);
		logpage.ClickOnLoginbutton();
		String actualEditinfoMsg=logpage.CheckEditYourAccInfoText();
		String expectedEditinfoMsg="Edit your account information";
		AssertJUnit.assertEquals(actualEditinfoMsg, expectedEditinfoMsg);
		System.out.println("Edit your account information link is Displayed");
		}

}

