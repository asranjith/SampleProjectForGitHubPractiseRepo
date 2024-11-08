package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ChildWindowOfContactPage {
	public ChildWindowOfContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//conflict check.....
		System.out.println("as ranjith   ");
		
		System.out.println(" added");
	}

}
