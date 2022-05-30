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

		//This field for My Account
		WebElement  MyAccount= driver.findElement(By.linkText("My Account"));
		MyAccount.click();

		//This field for register
		WebElement Register= driver.findElement(By.linkText("Register"));
		Register.click();

		//This field for User First Name
		WebElement FirstName= driver.findElement(By.id("input-firstname"));
		FirstName.clear();
		FirstName.sendKeys("Shihab");

		//This field for User Last Name
		WebElement LastName= driver.findElement(By.id("input-lastname"));
		LastName.clear();
		LastName.sendKeys("Ahmed");

		//This field for User Email
		WebElement EMail= driver.findElement(By.id("input-email"));
		EMail.clear();
		EMail.sendKeys("shihab.e@gmail.com");

		//This field for User Telephone
		WebElement Telephone= driver.findElement(By.id("input-telephone"));
		Telephone.clear();
		Telephone.sendKeys("01768-114616");

		//This field for User Password
		WebElement Password= driver.findElement(By.id("input-password"));
		Password.clear();
		Password.sendKeys("Shihab@4616");

		//This field for User ConfirmPassword
		WebElement PasswordConfirm= driver.findElement(By.id("input-confirm"));
		PasswordConfirm.clear();
		PasswordConfirm.sendKeys("Shihab@4616");

		//This field for User Yes/No
		WebElement Subscribe= driver.findElement(By.name("newsletter"));
		Subscribe.click();

		//This field for User Click  Privacy Policy
		WebElement  PrivacyPolicy= driver.findElement(By.name("agree"));
		PrivacyPolicy.click();

		//This field for User Click  for continue
		WebElement  Continue= driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		Continue.click();

		//This field for User Click  for LogOUt after registration
		WebElement  Logout= driver.findElement(By.linkText("Logout"));
		Logout.click();

	}

}
