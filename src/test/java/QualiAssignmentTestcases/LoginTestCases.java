package QualiAssignmentTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Homepagelocators;
import Pages.LoginPageLocators;
import QualiAssignmentbase.BaseAss1;

public class LoginTestCases extends BaseAss1 {
	public static WebDriver driver;
	
	public LoginTestCases()
	{
		super();
	}
	

	
	@BeforeMethod
	public void setUp() 
	{
		driver=ToInitializetheBrowserAndLaunchTheURL(prop.getProperty("BrowserName"));
		Homepagelocators homepage= new Homepagelocators(driver);
		homepage.ClickonMyAccountbutton();
		homepage.ClickOnLoginButton();
		
	}
	@AfterMethod
	public void SetUpToCloseTheBrowser()
	{
		driver.quit();
	}
	
	@Test(priority=1)
	public void LoginWithValidCredentials()
	{
		LoginPageLocators logpage=new LoginPageLocators(driver);
		logpage.EnterInputEmail("chaithrauser@gmail.com");
		logpage.EnterInputPassword("1234");
		logpage.ClickOnLoginbutton();
		
	    String actualEditinfoMsg=logpage.CheckEditYourAccInfoText();
		String expectedEditinfoMsg="Edit your account information";
		AssertJUnit.assertEquals(actualEditinfoMsg, expectedEditinfoMsg);
		System.out.println("Edit your account information link is Displayed");
		
		String ActualMessage=logpage.CheckEditYourPWDText();
		String ExpectedMessage="Change your password";
		AssertJUnit.assertEquals(ActualMessage, ExpectedMessage);
		System.out.println("Change your password link is Displayed");
		
		String ActualAddressMessage=logpage.ChcekAddresBookEntriesText();
		String ExpectedAddressMesssage="Modify your address book entries";
		AssertJUnit.assertEquals(ActualAddressMessage, ExpectedAddressMesssage);
		System.out.println("Modify your address book entries link is Displayed");
		
		String ActualWishlistMessage=logpage.ChcekModifyyourwishlist();
		String ExpectedWishListMessage="Modify your wish list";
		AssertJUnit.assertEquals(ActualWishlistMessage, ExpectedWishListMessage);
		System.out.println("Modify your wish list is Displayed");
		
		String ActualOrdertMessage=logpage.ChcekViewyourorderhistory();
		String ExpectedOrderMessage="View your order history";
		AssertJUnit.assertEquals(ActualOrdertMessage, ExpectedOrderMessage);
		System.out.println("View your order history link is Displayed");
		
		String ActualDownloadMessage=logpage.ChcekDownloads();
		String ExpectedDownloadMessage="Downloads";
		AssertJUnit.assertEquals(ActualDownloadMessage, ExpectedDownloadMessage);
		System.out.println("Downloads link is Displayed");
		
		String ActualRewardsMessage=logpage.ChcekYourRewardPoints();
		String ExpectedRewardsMessage="Your Reward Points";
		AssertJUnit.assertEquals(ActualRewardsMessage, ExpectedRewardsMessage);
		System.out.println("Your Reward Points link is Displayed");
		
		String ActualReturnRequestMessage=logpage.CheckViewyourreturnrequests();
		String ExpectedReturnRequestMessage="View your return requests";
		AssertJUnit.assertEquals(ActualReturnRequestMessage, ExpectedReturnRequestMessage);
		System.out.println("View your return requests link is Displayed");
		
		String ActualTransactionMessage=logpage.CheckvaYourTransactions();
		String ExpectedTransactionMessage="Your Transactions";
		AssertJUnit.assertEquals(ActualTransactionMessage, ExpectedTransactionMessage);
		System.out.println("Your Transactions link is Displayed");
		
		String ActualRecurringMessage=logpage.CheckRecurringpayments();
		String ExpectedRecurringMessage="Recurring payments";
		AssertJUnit.assertEquals(ActualRecurringMessage, ExpectedRecurringMessage);
		System.out.println("Recurring payments link is Displayed");
		
		String ActualRegisterMessage=logpage.CheckvalidatingRegisterforanaffiliateaccount();
		String ExpectedRegisterMessage="Register for an affiliate account";
		AssertJUnit.assertEquals(ActualRegisterMessage, ExpectedRegisterMessage);
		System.out.println("Register for an affiliate accoun link is Displayed");
		
		
	}

}
