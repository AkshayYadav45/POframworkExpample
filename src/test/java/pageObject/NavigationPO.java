package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPO{
	WebDriver driver;

	public NavigationPO(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(xpath="//img[@id='enterimg']")
	WebElement entering;
	
	public void Enter() {
		entering.click();
	}
	

}