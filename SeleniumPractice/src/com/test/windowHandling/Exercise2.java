package com.test.windowHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver", "D:\\Tools\\geckodriver.exe");
		
WebDriver driver=new FirefoxDriver();

driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

driver.findElement(By.cssSelector("#alert")).click();

Thread.sleep(2000);

Alert al=driver.switchTo().alert();

al.accept();		
				
		
	}

}
