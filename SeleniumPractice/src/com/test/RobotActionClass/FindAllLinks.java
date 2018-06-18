package com.test.RobotActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.gecko.driver", "D:\\Tools\\geckodriver.exe");
		
WebDriver driver=new FirefoxDriver();	

driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);

driver.get("http://toolsqa.com/");

List <WebElement> el=driver.findElements(By.tagName("a"));
 
 int ListSize=el.size();
 
 System.out.println(ListSize);
 
 for (int i=0;i<el.size();i++)
	 
 {
	 
	 System.out.println(el.get(i).getText());
	 	 
 }

	
	}

}
