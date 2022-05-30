package com.OpenCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.Browser;

public class LogIn extends Browser {

	public static void main(String[] args) {

		chrome_launch();
		open_URL("https://demo.opencart.com");
		Login_TC_001();

	}

	public static void Login_TC_001() {

		//This field for My Account
		WebElement  MyAccount= driver.findElement(By.linkText("My Account"));
		MyAccount.click();

		//This field for register
		WebElement Register= driver.findElement(By.linkText("Login"));
		Register.click();

		WebElement EMailAddress= driver.findElement(By.id("input-email"));
		EMailAddress.clear();
		EMailAddress.sendKeys("shihab.e@gmail.com");	

		WebElement Password= driver.findElement(By.id("input-password"));
		Password.clear();
		Password.sendKeys("Shihab@4616");	

		WebElement Login= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		Login.click();

	}

}
