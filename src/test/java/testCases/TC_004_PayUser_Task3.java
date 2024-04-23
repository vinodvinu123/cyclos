package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePagePayUSer;
import pageObjects.PayUserTask3;
import testBase.BaseClassPayUser;

public class TC_004_PayUser_Task3 extends BaseClassPayUser{
	@Test 
	public void register() throws InterruptedException {
		HomePagePayUSer L1=new HomePagePayUSer (driver);
		
		PayUserTask3 T3 = new PayUserTask3(driver);
		
		L1.click_register();
		L1.username();
		L1.password();
		L1.submit();
		Thread.sleep(2000);
		T3.payuser();
		T3.book();
		T3.Emma();
		T3.amount();
		Thread.sleep(3000);
		T3.paynow();
		T3.paynow1();
		Thread.sleep(3000);
		T3.instalements();
		T3.des();
		T3.next();
		T3.Confirm();
		
	}
}
