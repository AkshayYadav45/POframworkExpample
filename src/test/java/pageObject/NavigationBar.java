package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar{
	WebDriver driver;
	
	public NavigationBar(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@id='enterimg']")
	WebElement entering;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']/li[3]/a")
	WebElement webTable;
	
	public void Enter() {
		entering.click();
	}
	public void webTablenavigate() {
		webTable.click();
	}
	
	
}
