package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebtablePO {
	WebDriver driver;
	public WebtablePO() {
		this.driver=driver;
	}

	@FindBy(xpath="//a[text()='WebTable']")
	WebElement Webtable;

	public void table() {
		Webtable.click();
	}

}
