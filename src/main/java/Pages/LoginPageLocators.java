package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLocators {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='input-email']")
	private WebElement EnterInputEmail;
	
	@FindBy(xpath = "//*[@id='input-password']")
	private WebElement EnterInputPassword;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement ClickOnLoginbutton;
	
	@FindBy(linkText = "Edit your account information")
	private WebElement ValidatingEditYourAccountInfoText;
	
	@FindBy(linkText = "Change your password")
	private WebElement ValidatingchangeYourPwd;
	
	@FindBy(linkText = "Modify your address book entries")
	private WebElement ValidatingAddresBookEntries;
	
	@FindBy(linkText = "Modify your wish list")
	private WebElement validatingModifyyourwishlist;
	
	@FindBy(linkText = "View your order history")
	private WebElement ValidatingViewyourorderhistory;
	
	@FindBy(linkText = "Downloads")
	private WebElement validatingDownloads;
	
	@FindBy(linkText = "Your Reward Points")
	private WebElement validatingYourRewardPoints;
	
	@FindBy(linkText = "View your return requests")
	private WebElement validatingViewyourreturnrequests;
	
	@FindBy(linkText = "Your Transactions")
	private WebElement validatingYourTransactions;
	
	@FindBy(linkText = "Recurring payments")
	private WebElement validatingRecurringpayments;
	
	@FindBy(linkText = "Register for an affiliate account")
	private WebElement validatingRegisterforanaffiliateaccount;
	
	@FindBy(linkText = "Subscribe / unsubscribe to newsletter")
	private WebElement validatingSubscribeunsubscribetonewsletter;
	

	
	public void EnterInputEmail(String emailid)
	{ 
		EnterInputEmail.sendKeys(emailid);
	}
	public void EnterInputPassword(String Password)
	{ 
		EnterInputPassword.sendKeys(Password);
	}
	
	//constructor
	public LoginPageLocators(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void ClickOnLoginbutton() 
	{
		ClickOnLoginbutton.click();
		
	}
	public String CheckEditYourAccInfoText()
	{
		String EditYourAccInfoText=ValidatingEditYourAccountInfoText.getText();
		return EditYourAccInfoText;
	}
	public String CheckEditYourPWDText()
	{
		String EditYourPWDText=ValidatingchangeYourPwd.getText();
		return EditYourPWDText;
	}
	public String ChcekAddresBookEntriesText()
	{
		String AddressBookEntriesText=ValidatingAddresBookEntries.getText();
		return AddressBookEntriesText;
	}
	public String ChcekModifyyourwishlist()
	{
		String ModifyYourwidText=validatingModifyyourwishlist.getText();
		return ModifyYourwidText;
	}
	public String ChcekViewyourorderhistory()
	{
		String ViewyourorderhistoryText=ValidatingViewyourorderhistory.getText();
		return ViewyourorderhistoryText;
	}
	public String ChcekDownloads()
	{
		String DownloadsText=validatingDownloads.getText();
		return DownloadsText;
	}
	public String ChcekYourRewardPoints()
	{
		String YourRewardPointsText=validatingYourRewardPoints.getText();
		return YourRewardPointsText;
	}
	public String CheckViewyourreturnrequests()
	{
		String ViewyourreturnrequestsText=validatingViewyourreturnrequests.getText();
		return ViewyourreturnrequestsText;
	}
	public String CheckvaYourTransactions()
	{
		String YourTransactionsText=validatingYourTransactions.getText();
		return YourTransactionsText;
	}
	public String CheckRecurringpayments()
	{
		String RecurringpaymentsText=validatingRecurringpayments.getText();
		return RecurringpaymentsText;
	}
	public String CheckvalidatingRegisterforanaffiliateaccount()
	{
		String RecurringpaymentsText=validatingRegisterforanaffiliateaccount.getText();
		return RecurringpaymentsText;
	}
	public String CheckvalidatingSubscribeunsubscribetonewsletter()
	{
		String validatingSubscribeunsubscribetonewsletterText=validatingSubscribeunsubscribetonewsletter.getText();
		return validatingSubscribeunsubscribetonewsletterText;
	}
	
	
}
