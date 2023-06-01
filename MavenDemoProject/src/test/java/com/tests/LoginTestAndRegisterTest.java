package com.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.pages.RegisterPage;
import com.pages.loginPage;

public class LoginTestAndRegisterTest {
	WebDriver driver = null;
	loginPage lp= null;
	RegisterPage rp= null;
	@BeforeSuite
	public void setup() { // open a browser and launch application
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		lp = new loginPage(driver); 
		rp= new RegisterPage(driver);
	}

	@Test(priority = 1)
	public void loginTest() {
		lp.loginToApplication("kiran@gmail.com", "123456");
		driver.navigate().back();
		// Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
	}

	@Test(priority = 2)
	public void registerTest() {
		rp = new RegisterPage(driver);
		rp.loginNewMember("Bhavik", "9123456789", "bhavi@gmail.com", "12345");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		driver.navigate().refresh();

	}

	@Test(priority = 3)
	public void alreadyMemberTest() {
		rp.alreadyMembership();
	}

	@Test(priority = 4)
	public void loginTestAgain() {
		lp.loginToApplication("kiran@gmail.com", "123456");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		}
}
