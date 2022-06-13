package com.ImiKrof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class POMIS3_Area {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://timf.imikrof.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("imikrof");
		
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("##imikrof@2021");
		
		WebElement login = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/div[3]/form/div/div[3]/input"));
		login.click();
		
		driver.get("https://timf.imikrof.com/REPORT_PKSF_POMIS_3");
		//Report Level	:
	      Select report_level = new Select(driver.findElement(By.xpath("//*[@id=\"report_level\"]")));
	      report_level.selectByVisibleText("Area");
	      
	      //Branch 	:
	      Select branch = new Select(driver.findElement(By.xpath("//*[@id=\"filter_bazr_info\"]")));
	      branch.selectByVisibleText("59 - Birgonj Area");
	      
	      //Month
	      Select month = new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/table/tbody/tr/td[3]/select")));
	      month.selectByVisibleText("May");
	      
	      //Year
	      Select year = new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/table/tbody/tr/td[4]/select")));
	      year.selectByVisibleText("2022");
	      
	      //Show
	      WebElement show = driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/table/tbody/tr/td[9]/button"));
	      show.click();
		
		Thread.sleep(2000);
	}

}
