package com.ImiKrof;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

public class POMIS_1 extends Login {

	public static void main(String[] args) {
		chrome_launch();
		open_URL("https://timf.imikrof.com/login");
		Login_TC_001();
		POMIS1_TC_001();
	}

	public static void POMIS1_TC_001() {

		WebElement Reports= driver.findElement(By.linkText("Reports"));
		Reports.click();

		WebElement PKSF= driver.findElement(By.linkText("1 PKSF-POMIS Reports"));
		PKSF.click();

		WebElement POMIS_1= driver.findElement(By.linkText("1.1 PKSF POMIS-1 Report"));
		POMIS_1.click();

		WebElement ReportLevel= driver.findElement(By.id("report_level"));
		ReportLevel.click();
		ReportLevel.sendKeys("Branch");

		WebElement Branch= driver.findElement(By.id("filter_bazr_info"));
		Branch.click();
		Branch.sendKeys("0063 - Kichok Branc");

		WebElement Month= driver.findElement(By.name("cbo_month"));
		Month.click();
		Month.sendKeys("April");

		WebElement Year= driver.findElement(By.name("cbo_year"));
		Year.click();
		Year.sendKeys("2021");

		WebElement LoanOption= driver.findElement(By.name("loan_option"));
		LoanOption.click();
		LoanOption.sendKeys("Loan Product");

		WebElement FundingOrganization= driver.findElement(By.id("branch"));
		FundingOrganization.click();
		FundingOrganization.sendKeys("All");

		WebElement Show=driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/table/tbody/tr[2]/td[7]/button"));
		Show.click();

	}

}
