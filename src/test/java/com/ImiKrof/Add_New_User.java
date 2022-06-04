package com.ImiKrof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Add_New_User extends Login {

	public static void main(String[] args) {
		chrome_launch();
		open_URL("https://timf.imikrof.com/login");
		Login_TC_001();
		AddNewUser_TC_001();

	}

	public static void AddNewUser_TC_001() {


		WebElement Admin=driver.findElement(By.linkText("Admin"));
		Admin.click();

		WebElement ManageUser=driver.findElement(By.linkText("Manage User"));
		ManageUser.click();

		driver.get("https://timf.imikrof.com/s/users-create");

		WebElement FullName= driver.findElement(By.name("full_name"));
		FullName.click();
		FullName.sendKeys("Automation Test");

		WebElement Email=driver.findElement(By.name("email"));
		Email.click();
		Email.sendKeys("automation@gmail.com");

		WebElement Username =driver.findElement(By.name("user_name"));
		Username .click();
		Username .sendKeys("automation");

		WebElement password  =driver.findElement(By.name("password"));
		password.click();
		password.sendKeys("automation");

		WebElement Confirmpassword  =driver.findElement(By.name("confirm_password"));
		Confirmpassword.click();
		Confirmpassword.sendKeys("automation");

		WebElement Status =driver.findElement(By.name("status"));
		Status.click();
		Status.sendKeys("Yes");

		WebElement UserRole =driver.findElement(By.name("role_id"));
		UserRole.click();
		UserRole.sendKeys("Test Role");

		WebElement save =driver.findElement(By.xpath("//*[@id=\"app\"]/form/div/div/div[2]/div[3]/div/div/table/tbody/tr/td/button"));
		save.click();


	}

}
