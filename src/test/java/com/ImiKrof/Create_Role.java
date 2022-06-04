package com.ImiKrof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Create_Role extends Login {

	public static void main(String[] args) {
		
		chrome_launch();
		open_URL("https://timf.imikrof.com/login");
		Login_TC_001();
		CreateRole();
 
	}
	public static void CreateRole() {
		
		driver.get("https://timf.imikrof.com/s/employess/create");
		
		WebElement EmployeeID= driver.findElement(By.id("employee_id"));
		EmployeeID.click();
		EmployeeID.sendKeys("20103527");
		
		
		WebElement EmployeeDesignation= driver.findElement(By.id("employee_designation"));
		EmployeeDesignation.click();
		EmployeeDesignation.sendKeys("Contact Base");
		
		WebElement EmployeeDepartment= driver.findElement(By.id("employee_department"));
		EmployeeDepartment.click();
		EmployeeDepartment.sendKeys("TIMF");
		
		WebElement DomainOffice= driver.findElement(By.id("divisional_office"));
		DomainOffice.click();
		DomainOffice.sendKeys("Bogra - FO");
		
		WebElement ZoneOffice= driver.findElement(By.id("zone_office_id"));
		ZoneOffice.click();
		ZoneOffice.sendKeys("0003-Ullapara Zone");
		
		WebElement AreaOffice= driver.findElement(By.id("area_office_id"));
		AreaOffice.click();
		AreaOffice.sendKeys("0017-Bornali Area");
		
		WebElement BranchName= driver.findElement(By.id("branch_name"));
		BranchName.click();
		BranchName.sendKeys("0060-Paba Branch");
		
		WebElement JoiningDate= driver.findElement(By.id("joining_date"));
		JoiningDate.click();
		JoiningDate.sendKeys("03/25/1997");
		
		WebElement StartingSalary= driver.findElement(By.id("starting_salary"));
		StartingSalary.click();
		StartingSalary.sendKeys("0");
		
		WebElement CurrentSalary = driver.findElement(By.id("current_salary"));
		CurrentSalary.click();
		CurrentSalary.sendKeys("0");
		
	}

}
