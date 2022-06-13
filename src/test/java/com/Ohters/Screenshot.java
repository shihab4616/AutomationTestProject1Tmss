package com.Ohters;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ImiKrof.Login;
 
public class Screenshot extends Login {

	public static void main(String[] args) throws IOException {
		
		firefox_launch();
		open_URL("https://timf.imikrof.com/login");
		Login.Login_TC_001();
		GetScreenshot();
 
	}
	

	public static void GetScreenshot() throws IOException {
		
		//Scareenshot Capture
		File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Save
		FileUtils.copyFile(ScreenshotFile, new File("./src/ScreenshotImages/visibleImage.png"));
			
	}


}