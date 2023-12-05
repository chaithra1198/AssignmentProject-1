package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterpageLocators {
	
   WebDriver driver;
   
   //objects
   @FindBy(id = "input-firstname")
   private WebElement EnterInputfirsnametField;
   
   @FindBy(id = "input-lastname")
   private WebElement EnterInputlastnameField;
   
   @FindBy(id="input-email")
   private WebElement EnterEmail;
   
   @FindBy(id="input-telephone")
   private WebElement EnterTelephone;
   
   @FindBy(id="input-password")
   private WebElement EnterPassword;
   
   @FindBy(id="input-confirm")
   private WebElement EnterPasswordConfirm;
   
   @FindBy(xpath = "//*[@id='content']/form/div/div/input[1]")
   private WebElement ClickOnPrivacypolicyCheckBox;
   
   @FindBy(xpath="//input[@value='Continue']")
   private WebElement ClickOnContiue;
   
   @FindBy(xpath = "/html/body/div[2]/div/div/h1")
   private WebElement SuccessfullyAccCreationMsg;
   
   
   @FindBy(xpath = "/html/body/div[2]/div[1]")
   private WebElement PrivacyAndPolicyWarningMessage;
   
   @FindBy(xpath = "//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
   private WebElement WarningMessageforFirstName;
   
   @FindBy(xpath = "//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
   private WebElement WarningMessageForLastName;
   
   @FindBy(xpath = "//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
   private WebElement WarningMessageForEmailAddress;
   
   @FindBy(xpath = "//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
   private WebElement WarningMessageForTelephone;
   
   @FindBy(xpath = "//div[contains(text(),'Password must be between 4 and 20 characters!')]")
   private WebElement WarningMessageForPassword;
   
   public RegisterpageLocators(WebDriver driver)
	{
	    this.driver=driver;
		PageFactory.initElements(driver, this);
	}
   
   //actions
   
   public void FirstNameField()
   {
	   EnterInputfirsnametField.sendKeys("chaithra");
   }
   public void LastNameField()
   {
	   EnterInputlastnameField.sendKeys("Assighment");
   }
   public String EmailField(String EmailId)
   {
	   EnterEmail.sendKeys(EmailId);
	return EmailId;
	   
	
	}
   public void TelephoneField()
   {
	   EnterTelephone.sendKeys("9876543231");
   }
   public String PasswordField(String Password)
   {
	   EnterPassword.sendKeys(Password);
	return Password;
	
   }
   public String ConfirmpasswordField(String Password)
   {
	   EnterPasswordConfirm.sendKeys(Password);
	return Password;
   }
   
   public void ClickOnContinueButton()
   {
	   ClickOnContiue.click();
   }
   public String PrivacyAndPolicyWarningMessage()
   {
	   String WarningprivacyAndplicymessage=PrivacyAndPolicyWarningMessage.getText();
	   return WarningprivacyAndplicymessage;
   }
   
   public String FirstNameWarningMessage()
   {
	  String FirstNameWarningMessage=WarningMessageforFirstName.getText();
	  return FirstNameWarningMessage;
   }
   public String LastNameWarningMessage()
   {
	  String LastNameWarningMessage=WarningMessageForLastName.getText();
	  return LastNameWarningMessage;
   }
   public String EmailaddressWarningMessage()
   {
	  String EmailWarningMessage=WarningMessageForEmailAddress.getText();
	  return EmailWarningMessage;
   }
   public String TelephoneWarningMessage()
   {
	  String TelephoneWarningMessage=WarningMessageForTelephone.getText();
	  return TelephoneWarningMessage;
   }
   public String PasswordWarningMessage()
   {
	  String PasswordWarningMessage=WarningMessageForPassword.getText();
	  return PasswordWarningMessage;
   }
   public void AccountCreationSuccesmsg()
   {
	   SuccessfullyAccCreationMsg.getText();
   }
   public void ClickOnPrivacypolicyCheckBox()
   {
	   ClickOnPrivacypolicyCheckBox.click();
   }

}
