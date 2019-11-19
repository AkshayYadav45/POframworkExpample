package Tour;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.NavigationBar;

public class NavigationSel extends Baseclass{
 

	@Test(priority=1)
	public void registerPageHandle() throws AWTException, InterruptedException {
		
		NavigationBar n=new NavigationBar(driver);
		n.Enter();
	
	
	}
}
