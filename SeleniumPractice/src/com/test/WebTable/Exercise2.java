package com.test.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String tRow	="1";
		String tCol="2";
		
		System.setProperty("webdriver.gecko.driver", "D:\\Tools\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
				        
		driver.get("http://toolsqa.com/automation-practice-table/#");
		
//Get the value from cell ‘Dubai’ with using dynamic xpath
		
		String cValue=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+tRow+"]/td["+tCol+"]")).getText();
		
		System.out.println(cValue);

		
//Print all the column values of row ‘Clock Tower Hotel’
		
		for(int i=1;i<4;i++)
			
		{
			String HotelValue=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/th")).getText();
			
			if (HotelValue.equalsIgnoreCase("Clock Tower Hotel"))
				
			{
				
				
				for(int j=1;j<6;j++)
					
				{
					
					
					System.out.print(driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]")).getText());
	
					System.out.print("\t");
					
					
				}
				
				
				
				
			}
			

			
			
			
			
			
		}




	
	}

}
