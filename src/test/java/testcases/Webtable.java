package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.Baseclass;
import pageObject.WebtablePO;

public class Webtable extends Baseclass {
    @Test(priority=3)
	public void webtablehandle() {
	
	WebtablePO wp=PageFactory.initElements(driver, WebtablePO.class);
	wp.table();
	
	}
}
