package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Browser {

	public static WebDriver driver;

	public static void main(String[] args) {

		chrome_launch();
		//chrome_close();
		//firefox_launch();
		//edge_launch();

	}

	public static void chrome_launch() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}

	public static void firefox_launch() {

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}

	public static void edge_launch() {

		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://www.youtube.com");
		driver.manage().window().maximize();
	}
	
	public static void chrome_close() {
		
		driver.close();
		
	}
}
