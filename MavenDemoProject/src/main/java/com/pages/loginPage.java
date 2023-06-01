package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver=null;
public loginPage(WebDriver driver) //constructor
{
	this.driver = driver;
	PageFactory.initElements(driver,this);
	}
@FindBy(id="email")
WebElement username1;
@FindBy(id="password")
WebElement password1;
@FindBy(xpath="//button")
WebElement loginBtn;

public void loginToApplication(String uname1,String pwd1) {
	username1.sendKeys(uname1);
	password1.sendKeys(pwd1);
	loginBtn.click();
}
	
}
