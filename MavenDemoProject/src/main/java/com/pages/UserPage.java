package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
    WebDriver driver=null;
public UserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
@FindBy(xpath="//tr[2]//td[2]")
WebElement kiranText;

@FindBy(xpath="//button[text()='Add User']")
WebElement addUserBtn;
     

public void clickAddUserBtn() {
	System.out.println("Text="+kiranText.getText());
	addUserBtn.click();
}

}
