package com.test.DropdownsAndSelect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver", "D:\\Tools\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//Select ‘Continents’ Drop down ( Use Id to identify the element )		
		
		Select dropdown=new Select(driver.findElement(By.id("continents")));
		
//Select option ‘Europe’ (Use selectByIndex)
		
		dropdown.selectByIndex(1);
		
		Thread.sleep(2000);
//Select option ‘Africa’ now (Use selectByVisibleText)
		
		dropdown.selectByVisibleText("Africa");		
		

		//Print all the options for the selected drop down and select one option of your choice
		
		
		System.out.println(dropdown.getAllSelectedOptions().toString()); 
		

		
		
		
		
		
		
		
	}

}
