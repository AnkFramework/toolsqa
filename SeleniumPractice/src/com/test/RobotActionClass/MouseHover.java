package com.test.RobotActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.setProperty("webdriver.gecko.driver", "D:\\Tools\\geckodriver.exe");
		
WebDriver driver=new FirefoxDriver();	

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);


driver.get("http://store.demoqa.com/");

WebElement el=driver.findElement(By.linkText("Product Category"));

Actions act=new Actions(driver);

act.moveToElement(el).build().perform();

driver.findElement(By.linkText("iPads")).click();



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
