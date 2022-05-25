package com.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.Browser;

public class Registration extends Browser {

	public static void main(String[] args) {
		
		chrome_launch();
		open_URL("https://demo.opencart.com");
		TC_Registration_001();
 
	}
	
	public static void TC_Registration_001() {
		WebElement  MyAccount= driver.findElement(By.linkText("My Account"));
		MyAccount.click();
		
		WebElement Register= driver.findElement(By.linkText("Register"));
		Register.click();
	}

}
