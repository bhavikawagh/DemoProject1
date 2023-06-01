package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
   WebDriver driver=null;
public LoginPage1(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(id="email")
WebElement username1;
@FindBy(id="password")
WebElement password1;
@FindBy(xpath="//button")
WebElement loginBtn;

public DashboardPage validLogin() {
	username1.sendKeys("kiran@gmail.com");
	password1.sendKeys("123456");
	loginBtn.click();
	return new DashboardPage(driver);
}

public void loginToApplication(String uname1,String pwd1) {
	username1.sendKeys(uname1);
	password1.sendKeys(pwd1);
	loginBtn.click();
  }
}
