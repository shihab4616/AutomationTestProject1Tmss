package com.ImiKrof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Member_Information extends Login {

	public static void main(String[] args) {

		chrome_launch();
		open_URL("https://timf.imikrof.com/login");
		Login_TC_001();
		MemberInfo();

	}

	public static void MemberInfo() {
		
		driver.get("https://timf.imikrof.com/s/member_information?refresh=true");

		//Search by Branch Name
		WebElement BranchName=driver.findElement(By.className("branch"));
		BranchName.click();
		BranchName.sendKeys("0063-Kichok Branch");

		//Search by Member ID
		WebElement MemberID=driver.findElement(By.name("name"));
		MemberID.click();
		MemberID.sendKeys("0063-065-0006");

		//Search by Member ID
		WebElement Search=driver.findElement(By.xpath("//*[@id=\"submit\"]/button"));
		Search.click();


	}

}
