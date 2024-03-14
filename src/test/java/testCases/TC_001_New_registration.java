package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationConfirmation;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_New_registration extends BaseClass{
	@Test
	public void registrationAccount() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		RegistrationPage rp=new RegistrationPage(driver);
		RegistrationConfirmation rc=new RegistrationConfirmation(driver);
		hp.click_register();
		Thread.sleep(2000);
		rp.setname();
		Thread.sleep(2000);
		rp.setloginName();
		Thread.sleep(2000);
		rp.setEmail();
		Thread.sleep(2000);
		rp.setwebsite();
		Thread.sleep(2000);
		rp.setGender();
		Thread.sleep(2000);
		rp.withoutselectFromDropdown();
		Thread.sleep(2000);
		rp.setMobilephone();
		Thread.sleep(2000);
		rp.setLandlinephone();
		Thread.sleep(2000);
		rp.clickNext();
		Thread.sleep(3000);
		rc.psd();
		Thread.sleep(3000);
		rc.cpsw();
		Thread.sleep(3000);
		rc.cb();
		Thread.sleep(3000);
		rc.capcha();
		Thread.sleep(3000);
		rc.submit();
		
		
}
}
