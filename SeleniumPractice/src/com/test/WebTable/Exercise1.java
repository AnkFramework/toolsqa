package com.test.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver", "D:\\Tools\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
		
		//Get the value from cell ‘Dubai’ and print it on the console
		
		String sValue=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
	
		System.out.println(sValue);
	
		//Click on the link ‘Detail’ of the first row and last column
	
		
		String cValue=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[1]")).getText();
	
		System.out.println(cValue);
	
		
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
	
	
	
	
	
	
	}

}
