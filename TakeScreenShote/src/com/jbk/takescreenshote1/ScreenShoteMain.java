package com.jbk.takescreenshote1;

import com.jbk.takescreenshote.ScreenShote;

public class ScreenShoteMain extends ScreenShote{

	public static void main(String[] args) {
		ScreenShoteMain obj=new ScreenShoteMain();
		obj.homePage("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		obj.takeScreenShote();
		
	}

}
