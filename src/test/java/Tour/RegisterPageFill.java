package Tour;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.RegisterPage;

public class RegisterPageFill extends Baseclass {

	@Test(priority=2)
	public void fillRegisterPage() throws AWTException, InterruptedException {

		RegisterPage rp=new RegisterPage(driver);

		rp.fristNameFill("akshay");
		rp.lastNameFill("yadav");
		rp.address("pune");
		rp.chooseFile();
		rp.chooseFrom();
		
	}
}
