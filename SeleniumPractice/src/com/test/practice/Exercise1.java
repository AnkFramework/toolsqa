package com.test.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Tools\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();

//Condition:1
		
		driver.get("http://www.DemoQA.com");
		
//Condition:2 (GetPageName)
		
		
			Thread.sleep(10);
		
		System.out.println(driver.getTitle());
		
//Condition:3 (GetTitle Length)
		
		System.out.println(driver.getTitle().length());
		
		
//Condition:4 (GetTitle Length)
		
		System.out.println("Is this a correct URL:"+ driver.getCurrentUrl().equals("http://demoqa.com/")); 
		
		
//Condition:5 (Get Page Source (HTML Source code) and Page Source length)	
		
		//System.out.println(driver.getPageSource());
		
		System.out.println("PageSource length:"+driver.getPageSource().length());
		
		
//condition: 6 (Close the Browser)
		
		Thread.sleep(30);
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
