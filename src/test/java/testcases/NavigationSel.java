package testcases;

import java.awt.AWTException;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Baseclass;
import pageObject.NavigationPO;


public class NavigationSel extends Baseclass{
	@Test(priority=1)
	public void registerPageHandle() throws AWTException, InterruptedException {
		NavigationPO np=PageFactory.initElements(driver,NavigationPO.class);
		np.Enter();
	}
}
