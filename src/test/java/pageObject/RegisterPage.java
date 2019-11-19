package pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement fristName;

	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastName;
	
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	WebElement Address;

	@FindBy(xpath="//input[@onchange='uploadimg()']")
	WebElement ChooseFile;
	
	public void fristNameFill(String name) {
		fristName.sendKeys(name);
	}
	public void lastNameFill(String name) {
		lastName.sendKeys(name);
	}
	public void address(String adress) {
		Address.sendKeys(adress);
	}
	public void chooseFile() {
		Actions act=new Actions(driver);
		act.moveToElement(ChooseFile).click().build().perform();
	}
	public void chooseFrom() throws AWTException, InterruptedException {
		Robot r=new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_K);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_Y);
		r.keyPress(KeyEvent.VK_ENTER);
	}
}
