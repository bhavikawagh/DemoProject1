package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RegisterPage {
      WebDriver driver;
 public RegisterPage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
 }
 @FindBy(xpath="//a[starts-with(text(),'Register')]")
 WebElement registerNewMember;

 @FindBy(id="name")
 WebElement username;

 @FindBy(id="mobile")
 WebElement usermobile;

 @FindBy(id="email")
 WebElement useremail;

 @FindBy(id="password")
 WebElement userpassword;

 @FindBy(xpath="//button")
 WebElement singBtn;

 @FindBy(xpath="//a[contains(text(),'I already')]")
 WebElement alreadyMember;
 
  public void loginNewMember(String uname,String umobile,String uemail,String pwd) {
	  registerNewMember.click();
	  username.sendKeys(uname);
	  usermobile.sendKeys(umobile);
	  useremail.sendKeys(uemail);
	  userpassword.sendKeys(pwd);
	  singBtn.click();
	 }
  public void alreadyMembership() {
	  alreadyMember.click();
  }
}
