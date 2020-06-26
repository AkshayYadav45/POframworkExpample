package testcases;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.Baseclass;
import pageObject.RegisterPO;

public class RegisterPageFill extends Baseclass {

	@Test(priority=2)
	public void fillRegisterPage() throws AWTException, InterruptedException {

		RegisterPO rp=PageFactory.initElements(driver, RegisterPO.class);
		rp.fristNameFill("akshay");
		rp.lastNameFill("yadav");
		
	}
}
