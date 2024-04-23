package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePagePayUSer;
import pageObjects.Receive_QR_Code;
import testBase.BaseClassPayUser;

public class TC_007_ReceiveQRCode extends BaseClassPayUser{
	@Test 
	public void register() throws InterruptedException {
		HomePagePayUSer L1=new HomePagePayUSer (driver);		
		Receive_QR_Code QR = new Receive_QR_Code(driver);
		
		L1.click_register();
		L1.username();
		L1.password();
		L1.submit();
		Thread.sleep(2000);
		QR.payuser();
		Thread.sleep(2000);
		QR.ReceiveQRCode();
		Thread.sleep(2000);
		QR.amount();
		Thread.sleep(2000);
		QR.generateQRcode();
		Thread.sleep(2000);
		QR.generateNEWQRcode();
		
		
  }
}
