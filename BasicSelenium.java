package com.company;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasicSelenium {
public static void main(String[] args)  {
	//System.setProperty("key","value");
	System.setProperty("webdriver.chrome.driver","/Users/ASUS/eclipse-workspace/seleniumDemo/driver1/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","/Users/ASUS/eclipse-workspace/seleniumDemo/driver1/geckodriver.exe");
	System.setProperty("webdriver.edge.driver","/Users/ASUS/eclipse-workspace/seleniumDemo/driver1/msedgedriver.exe");
	WebDriver driver = new ChromeDriver();
// 	WebDriver driver1 = new FirefoxDriver();
// 	WebDriver driver2 = new EdgeDriver();
	
	
	driver.get("https://www.google.com/");
	try {
		Thread.sleep(30000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(driver.getTitle());
	driver.close();
		driver.quit();
	
// 	driver1.get("https://www.google.com/");
// 	try {
// 		Thread.sleep(50000);
// 	} catch (InterruptedException e) {
// 		// TODO Auto-generated catch block
// 		e.printStackTrace();
// 	}
// 	System.out.println(driver1.getTitle());
// 	driver1.close();
// 	  driver1.quit();
	  
// 	driver2.get("https://www.flipkart.com/");
// 	try {
// 		Thread.sleep(80000);
// 	} catch (InterruptedException e) {
// 		// TODO Auto-generated catch block
// 		e.printStackTrace();
// 	}
// 	System.out.println(driver2.getTitle());
// 	System.out.println(driver2.getPageSource());
// 	System.out.println(driver2.getCurrentUrl());
// 	driver2.close();
// 		driver2.quit();
		
// }

}
