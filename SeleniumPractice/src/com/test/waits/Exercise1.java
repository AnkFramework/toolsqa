package com.test.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Tools\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		
		driver.findElement(By.cssSelector("#timingAlert")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		Alert al=wait.until(ExpectedConditions.alertIsPresent());
		
		al.accept();
		
		 System.out.println("Alert Accepted");
		
		
		
		
		
		
		
		
		
		
		
	}

}
