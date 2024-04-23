package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Receive_QR_Code extends BasePage{

	public Receive_QR_Code(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="(//div[@class='quick-access-icon'])[1]")
	WebElement payuser;
	
	@FindBy(xpath="//div[text()='Receive QR-code']")	
	WebElement ReceiveQRCode;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement amount;
	
	@FindBy(xpath="//button[@type='button']//span[text()='Generate QR code']")
	WebElement generateQRcode;
	
	@FindBy(xpath="//button[@type='button']//span[text()='Generate new QR code']")
	WebElement generateNEWQRcode;
	
	public void payuser() {
		payuser.click();
	}
	public void ReceiveQRCode() {
		ReceiveQRCode.click();
	}
	public void amount() {
		amount.sendKeys("1,00");
	}
	public void generateQRcode() {
		generateQRcode.click();;
	}
	public void generateNEWQRcode() {
		generateNEWQRcode.click();;
	}
}
