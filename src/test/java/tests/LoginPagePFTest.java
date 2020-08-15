package tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePage.BasePage;
import pages.LoginPagePF;

public class LoginPagePFTest {
	
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	LoginPagePF loginPagePF;
	
	@BeforeMethod
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_prop();
		driver = basePage.ini_driver(prop);
		loginPagePF = new LoginPagePF(driver);
	}
	
	@Test
	public void loginTest() {
		loginPagePF.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		basePage.quitBrowser();
	}
	
	
	
	
	
	

}
