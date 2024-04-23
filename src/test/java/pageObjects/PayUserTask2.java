package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayUserTask2 extends BasePage{

	public PayUserTask2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//div[@class='quick-access-icon'])[1]")
	WebElement payuser;
	
	@FindBy(xpath="//input[@placeholder='Type to search']")
	WebElement book;
	
	@FindBy(xpath="//a[@class='select-option autocomplete-option-0']")
	WebElement Emma;
	
	@FindBy(xpath="//input[@id='id_3']")
	WebElement amount;
	
	@FindBy(xpath="(//button [@type='button'])[3]")
	WebElement paynow;
	
	@FindBy(xpath="//a[text()=' Scheduled ']")
	WebElement Scheduled;
	
	@FindBy(xpath="//input[@type=\"date\"]")
	WebElement date;
	
	@FindBy(xpath="//textarea[@id='id_6']")
	WebElement des;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement next;
	
	@FindBy(xpath="//span[text()='Previous']")
	WebElement Previous;
	
	@FindBy(xpath="//input[@id='id_3']")
	WebElement amount1;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement next1;
	
	@FindBy(xpath="//*[text()='Confirm']")
	WebElement Confirm1;
	
	@FindBy(xpath="//div[text()='Print']")
	WebElement print;

	public void payuser() {
		payuser.click();
	}
	public void book() {
		book.sendKeys("an");
	}
	public void Emma() {
		Emma.click();
	}
	public void amount() {
		amount.sendKeys("2");
	}
	public void paynow() {
		paynow.click();
	}
	public void Scheduled() {
		Scheduled.click();
	}
	public void date() {
		date.sendKeys("04-04-2024");
	}
	public void des() {
		des.sendKeys("pay now");
	}
	public void next() {
		next.click();
	}
	public void Previous() {
		Previous.click();
	}
	public void changeamount() {
		amount1.sendKeys("3");
	}
	public void next1() {
		next1.click();
	}
	public void Confirm1() {
		Confirm1.click();
	}
	public void print() {
		print.click();
	}
}
