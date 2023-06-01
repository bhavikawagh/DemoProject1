package com.jbk.takescreenshote;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShote {
	WebDriver driver;
public void	homePage(String url){
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
}
public void takeScreenShote(){
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File target= new File("D:\\Selenium_Workspace\\ScreenShote\\login.png");
	try {
		FileHandler.copy(source,target);
	} catch (IOException e) {
				e.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();
	}
}
	
}