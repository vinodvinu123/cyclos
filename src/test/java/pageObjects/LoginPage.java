package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
		
		@FindBy (xpath="//input[@placeholder='User']")
		WebElement txt_User;
		
		@FindBy (xpath="//input[@placeholder='Password']")
		WebElement txt_password;
		
		@FindBy (xpath="//span[text()='Submit']")
		WebElement btn_Submit;
		
		public void setUser(String User) {
			txt_User.sendKeys(User);
		}
		public void setpassword(String password) {
			txt_password.sendKeys(password);
		}
		public void clicksubmit() {
			btn_Submit.click();
		}
			
			
			
		}

