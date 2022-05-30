package com.ImiKrof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BranchNotification extends Login {

	public static void main(String[] args) {
		
    chrome_launch();
    open_URL("https://timf.imikrof.com/login");
    Login_TC_001();
    Notification_TC_001();
	}
	
	public static void Notification_TC_001() {
		

		WebElement Admin=driver.findElement(By.linkText("Admin"));
		Admin.click();

		WebElement BranchNotification=driver.findElement(By.linkText("Branch Notification"));
		BranchNotification.click();
		
		driver.get("https://timf.imikrof.com/s/group_store");

		WebElement  Notification=driver.findElement(By.name("notification"));
		Notification.click();
		Notification.sendKeys("25.05.2022 theke software automating testing kora shuru kora hobe");
		
		
		WebElement  chekbox=driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div/div/div/section/div/form/div/div/div[2]/div/table/tbody/tr[2]/td[2]/input"));
		chekbox.click();
		
		WebElement save= driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div/div/div/section/div/form/div/div/div[3]/button"));
		save.click();
		
	}

}
