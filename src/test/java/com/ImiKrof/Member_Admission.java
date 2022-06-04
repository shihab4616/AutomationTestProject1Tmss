package com.ImiKrof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Member_Admission extends Login {

	public static void main(String[] args) {

		chrome_launch();
		open_URL("https://timf.imikrof.com/login");
		Login_TC_001();
		MemberAdmission_TC_001();

	}

	public static void MemberAdmission_TC_001() {

		//Member Admission FOrm 

		driver.get("https://timf.imikrof.com/s/member_information_create");

		//Add Samity Name
		WebElement SamityName=driver.findElement(By.id("samity"));
		SamityName.click();
		SamityName.sendKeys("0062-001-001 Komolpur");

		// Member Name
		WebElement MemberName=driver.findElement(By.id("m_member_name"));
		MemberName.click();
		MemberName.sendKeys("Automation Test");

		//Member Surname 
		WebElement MemberSurname =driver.findElement(By.id("m_member_sure_name"));
		MemberSurname.click();
		MemberSurname.sendKeys("A.T");

		//Member Primary Product : *
		WebElement PrimaryProduct=driver.findElement(By.id("cbo_primary_product"));
		PrimaryProduct.click();
		PrimaryProduct.sendKeys("Micro Credit - MC");

		//Member Gender
		WebElement Gender=driver.findElement(By.name("m_gender"));
		Gender.click();
		Gender.sendKeys("Male");

		//Member Date Of Birth (min:18, max:64): *
		WebElement dob=driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[3]/div[2]/table/tbody/tr[4]/td[4]/input"));
		dob.click();
		dob.sendKeys("2001-02-20");

		//Member Marital Status: *
		WebElement MaritalStatus=driver.findElement(By.id("txt_marital_status"));
		MaritalStatus.click();
		MaritalStatus.sendKeys("Married");

		//Member Mother Name :
		WebElement MotherName=driver.findElement(By.id("m_mother_name"));
		MotherName.click();
		MotherName.sendKeys("Sheikh Hasina");

		//Member Father Name :
		WebElement FatherName=driver.findElement(By.id("f_father_name"));
		FatherName.click();
		FatherName.sendKeys("Owazer Ali");

		//Member Spouse's
		WebElement Spouse=driver.findElement(By.id("Spouse_name"));
		Spouse.click();
		Spouse.sendKeys("Spouse_name");

		//Member Smart Card: *
		WebElement SmartCard=driver.findElement(By.id("smart_card"));
		SmartCard.click();
		SmartCard.sendKeys("1234567890");

		//Member Education Lavel *
		WebElement Education=driver.findElement(By.id("m_education_label"));
		Education.click();
		Education.sendKeys("Higher Secondary");

		//Member Mobile No: *
		WebElement Mobile=driver.findElement(By.id("m_mobile_no"));
		Mobile.click();
		Mobile.sendKeys("01768114616");

		//Member Passbook No: *
		WebElement Passbook=driver.findElement(By.id("passbook_no"));
		Passbook.click();
		Passbook.sendKeys("01050");


		//**************CONATCT DETAILS****************

		//Member Divison
		WebElement Divison=driver.findElement(By.name("present_divison"));
		Divison.click();
		Divison.sendKeys("Rangpur");

		//Member District : *
		WebElement District=driver.findElement(By.name("present_district"));
		District.click();
		District.sendKeys("Dinajpur");

		//Member Thana: *
		WebElement Thana=driver.findElement(By.name("present_thana"));
		Thana.click();
		Thana.sendKeys("Ambari");

		//Member Union : *
		WebElement Union=driver.findElement(By.name("present_union"));
		Union.click();
		Union.sendKeys("Ambari");

		//Member Village / Blcks *
		WebElement Village=driver.findElement(By.name("present_village_block"));
		Village.click();
		Village.sendKeys("Ambari");

		//Member Working Area *
		WebElement WorkingArea=driver.findElement(By.name("present_working_area"));
		WorkingArea.click();
		WorkingArea.sendKeys("Ambari");

		//Member Additional Address: House/Holding No , Road No, Post office etc. *
		WebElement AdditionalAddress=driver.findElement(By.name("present_additional_house"));
		AdditionalAddress.click();
		AdditionalAddress.sendKeys("2/1, Block-D,  Mirpur, Dhaka-1216");


		//*****Same as present address:*******

		WebElement SameAs=driver.findElement(By.xpath("//*[@id=\"same_as_present_address\"]"));
		SameAs.click();


		//******OTHER DETAILS***********


		//Member Type:
		WebElement MemberType=driver.findElement(By.id("cbo_member_type"));
		MemberType.click();
		MemberType.sendKeys("General");

		//Member Profession:
		WebElement Profession=driver.findElement(By.id("cbo_profession"));
		Profession.click();
		Profession.sendKeys("Others");

		//Member Religion : *
		WebElement Religion=driver.findElement(By.id("m_religion"));
		Religion.click();
		Religion.sendKeys("Muslim");



		//// ******GARDIAN INFO******

		//Member Gardian Name : *
		WebElement Gardian=driver.findElement(By.name("m_member_gardian_name"));
		Gardian.click();
		Gardian.sendKeys("Gardian");

		//Gardian Date Of Birth: *
		WebElement Gdob=driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[7]/div[2]/div[2]/table/tbody/tr[2]/td[2]/input"));
		Gdob.click();
		Gdob.sendKeys("1990-04-25");
		
		//Gardian National ID: *
		WebElement NID=driver.findElement(By.id("m_gardian_national_id"));
		NID.click();
		NID.sendKeys("0158475896545");
		
		//Gardian Mobile No: *
		WebElement MobileNo=driver.findElement(By.id("m_gardian_mobile_no"));
		MobileNo.click();
		MobileNo.sendKeys("01978114616");
		
		//Gardian Relation: *
		WebElement Relation=driver.findElement(By.id("m_gardian_relation"));
		Relation.click();
		Relation.sendKeys("Father");

	}

}
