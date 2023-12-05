package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessRegistrationpageLocators {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/div/div/h1")
	private WebElement AccountCreationSuccesMsg;

	public SuccessRegistrationpageLocators(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String accountCreationSuccessMsg() 
	{
		String accountCreationSuccessMsg=AccountCreationSuccesMsg.getText();
		return accountCreationSuccessMsg;
	}

}
