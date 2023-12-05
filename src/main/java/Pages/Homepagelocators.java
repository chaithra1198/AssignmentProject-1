package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	
public class Homepagelocators{
		
	     WebDriver driver;
		
		//these are objects
		
		@FindBy(xpath="//span[text()='My Account']")
		WebElement MyAccountButton;
	    
	    @FindBy(linkText="Login")
	    WebElement LoginButton;
	    
	    @FindBy(linkText="Register")
	    WebElement Registerbutton;
	    
	    @FindBy(linkText = "Logout")
	    WebElement ClickonLogoutButton;
	    
	    
	   
	    public Homepagelocators(WebDriver driver)
		{
		    this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		

		public void ClickonMyAccountbutton()
	    {
	    	MyAccountButton.click();
	    }
		public void ClickOnLoginButton() 
		
		{
			LoginButton.click();
		}
       public void ClickOnRegisterButton() 
		
		{
	        Registerbutton.click();
		}
       
       public void ClickOnLogoutbutton()
       {
    	   ClickonLogoutButton.click();
    	   
       }


}
