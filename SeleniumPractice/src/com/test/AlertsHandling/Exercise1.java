package com.test.AlertsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

					System.setProperty("webdriver.gecko.driver", "D:\\Tools\\geckodriver.exe");
		
					WebDriver driver=new FirefoxDriver();

					driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");	
		
//Simple alert....................
		
	driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();				
					
	Alert al=driver.switchTo().alert();
	
	System.out.println(al.getText());

	Thread.sleep(1000);
	
	al.accept();
	


//Confirm alert box................

		
driver.findElement(By.xpath("//*[@id='content']/p[8]/button")).click();

Alert al1=driver.switchTo().alert();

System.out.println(al1.getText());

Thread.sleep(1000);

al1.accept();
	
	
//prompt alert box.................
		
driver.findElement(By.xpath("//*[@id='content']/p[11]/button")).click();

Alert al2=driver.switchTo().alert();

System.out.println(al2.getText());

al1.sendKeys("Yes");

Thread.sleep(1000);

al1.accept();


	}
	
	
	

}
