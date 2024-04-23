package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePagePayUSer;
import pageObjects.PayUserTask2;
import pageObjects.PayUserTask3;
import testBase.BaseClassPayUser;

public class TC_005_PayUser_Task2 extends BaseClassPayUser{
	@Test 
	public void register() throws InterruptedException {
	HomePagePayUSer L1=new HomePagePayUSer (driver);	
	PayUserTask2 T2 = new PayUserTask2(driver);
	L1.click_register();
	Thread.sleep(3000);
	L1.username();
	Thread.sleep(3000);
	L1.password();
	Thread.sleep(3000);
	L1.submit();
	Thread.sleep(3000);
	T2.payuser();
	Thread.sleep(3000);
	T2.book();
	Thread.sleep(3000);
	T2.Emma();
	Thread.sleep(3000);
	T2.amount();
	Thread.sleep(3000);
	T2.paynow();
	Thread.sleep(3000);
	T2.Scheduled();
	Thread.sleep(3000);
	T2.date();
	Thread.sleep(3000);
	T2.des();
	Thread.sleep(3000);
	T2.next1();
	Thread.sleep(3000);
	T2.Previous();
	Thread.sleep(3000);
	T2.changeamount();
	Thread.sleep(3000);
	T2.next();
	Thread.sleep(3000);
	T2.Confirm1();
}
}

