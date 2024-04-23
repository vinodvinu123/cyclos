package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePagePayUSer;
import pageObjects.PayUserTask3;
import pageObjects.PayUserTask4;
import testBase.BaseClassPayUser;

public class TC_006_PayUser_Task4 extends BaseClassPayUser{
	@Test 
	public void register() throws InterruptedException {
		HomePagePayUSer L1=new HomePagePayUSer (driver);		
		PayUserTask4 T4 = new PayUserTask4(driver);
		
		L1.click_register();
		L1.username();
		L1.password();
		L1.submit();
		Thread.sleep(2000);
		T4.payuser();
		T4.book();
		T4.Emma();
		T4.amount();
		Thread.sleep(2000);
		T4.paynow();
		Thread.sleep(2000);
		T4.Recurring();
		Thread.sleep(2000);
		T4.futuredate();
		Thread.sleep(2000);
		T4.date();
		Thread.sleep(2000);
		T4.Fixednumberofoccurrences();
		Thread.sleep(2000);
		T4.Numberofoccurences();
		Thread.sleep(2000);
//		T4.months();
//		Thread.sleep(2000);
//		T4.weeks();
//		Thread.sleep(2000);
		T4.des();
		Thread.sleep(2000);
		T4.next();
		T4.Confirm();
  }
}
