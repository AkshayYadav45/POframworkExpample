package Tour;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.NavigationBar;
import pageObject.RegisterPage;

public class Baseclass {
	WebDriver driver;
	public static Properties prop;
	public static FileInputStream f;


	@BeforeSuite
	public void openBrowser() throws IOException {
		f=new FileInputStream("D:\\ENCLIPS\\MAVENandTESTNG\\POframework\\src\\test\\resources\\config.properties");
		prop=new Properties();
		prop.load(f);
		if(prop.getProperty("Browser").contentEquals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}else {
			System.out.println("Browser not found");
		}
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	@Test(priority=1)
	public void registerPageHandle() throws AWTException, InterruptedException {
		NavigationBar n=new NavigationBar(driver);
		n.Enter();
		RegisterPage rp=new RegisterPage(driver);
		rp.fristNameFill("akshay");
		rp.lastNameFill("yadav");
		rp.address("pune");
		rp.chooseFile();
		rp.chooseFrom();
	}
	
	
}