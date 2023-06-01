package com.tests;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage1;
import com.pages.UserPage;
import com.pages.loginPage;
public class LoginTest1 {
   WebDriver driver=null;
   LoginPage1 lp=null;
   DashboardPage dp=null;
   
  
 @BeforeSuite
public void setUp() {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
}
 @Test(priority=1)
 public void loginTest1() {
	lp=new LoginPage1(driver);
	dp= lp.validLogin();
	Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
 }
 @Test(priority=2)
 public void DashBoardTest() {
	 ArrayList<String> expectedCourses=new ArrayList<String>();
	 expectedCourses.add("Selenium");
	 expectedCourses.add("Java / J2EE");
	 expectedCourses.add("Python");
	 expectedCourses.add("Php");
	ArrayList<String>actualCourses= dp.verifyCourses();
	Assert.assertEquals(actualCourses,expectedCourses);
 }
 @Test(priority=3)
 public void userClickTest() {
	 dp.clickUserBtn();
 }

@Test(priority=5)
public void addUserBtnClick() {
	UserPage up=new UserPage(driver);
	  up.clickAddUserBtn();
}
 
}
