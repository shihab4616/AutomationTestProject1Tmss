package com.ImiKrof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class POMIS2A extends Login {

	public static void main(String[] args) {

		chrome_launch();
		open_URL("https://timf.imikrof.com/login");
		Login_TC_001();
		POMIS2A_TC_001();

	}

	public static void POMIS2A_TC_001() {

		WebElement Reprots= driver.findElement(By.linkText("Reports"));
		Reprots.click(); 

		WebElement PKSF= driver.findElement(By.linkText("1 PKSF-POMIS Reports"));
		PKSF.click(); 

		WebElement POMIS2= driver.findElement(By.linkText("1.3 PKSF POMIS-2A Report"));
		POMIS2.click(); 

		WebElement SelectBranch= driver.findElement(By.id("filter_bazr_info"));
		SelectBranch.click();
		SelectBranch.sendKeys("0063 - kichok Branch");
		SelectBranch.click();

		WebElement Month= driver.findElement(By.name("cbo_month"));
		Month.click();
		Month.sendKeys("November");
		Month.click();

		WebElement Year= driver.findElement(By.name("cbo_year"));
		Year.click();
		Year.sendKeys("2021");
		Year.click();

		WebElement ServiceCharge= driver.findElement(By.name("cbo_service_charge"));
		ServiceCharge.click();
		ServiceCharge.sendKeys("Without Service Charge");
		ServiceCharge.click();

		WebElement Show=driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/div/table/tbody/tr/td[9]/button"));
		Show.click(); 



	}

}
