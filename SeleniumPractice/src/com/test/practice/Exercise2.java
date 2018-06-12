package com.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver", "D:\\Tools\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.DemoQA.com");
		
		Thread.sleep(10);
		
		driver.findElement(By.xpath("//*[@id='menu-item-374']/a")).click();
		
		Thread.sleep(15);
		
		//driver.navigate().back();
		
		//Thread.sleep(16);
		
		//driver.navigate().forward();
		
		driver.navigate().to("http://demoqa.com/");
		
		driver.navigate().refresh();
	
		//driver.quit();
		
		
	}

}
