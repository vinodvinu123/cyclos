package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.HomePageLogin;
import pageObjects.LoginPage;
import testBase.BaseClassLogin;

public class TC_002_Login extends BaseClassLogin{
	@Test
	public void LoginAccount() throws InterruptedException {
		HomePageLogin hpl=new HomePageLogin(driver);
		LoginPage lp=new LoginPage(driver);
		hpl.click_login();
		logger.info("click on login");
		lp.setUser(RB.getString("User"));
		logger.info("Entered user");
		
	   lp.setpassword(RB.getString("password"));
		logger.info("Entered password");
		lp.clicksubmit();
		logger.info("Clicked on Submit");
		
		
		

}
}
