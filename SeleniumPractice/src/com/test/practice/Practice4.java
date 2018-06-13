package com.test.practice;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver", "D:\\Tools\\geckodriver.exe");
		
WebDriver driver=new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		
		//Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
		
		//driver.findElement(By.name("selenium_commands")).click();
		
		
//Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
		

		Select mList=new Select(driver.findElement(By.name("selenium_commands")));
		
		mList.selectByIndex(0);
		
		Thread.sleep(2000);
		
		mList.deselectByIndex(0);
		
		Thread.sleep(2000);
		
	//Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
		
    mList.selectByVisibleText("Navigation Commands");
		
          Thread.sleep(2000);
		
	mList.deselectByVisibleText("Navigation Commands");
		
//Print and select all the options for the selected Multiple selection list.
	
	List<WebElement> iList=mList.getOptions();
	
	int SizeList=iList.size();
	
	System.out.println(SizeList);
	
	for (int i=0;i<SizeList;i++)
		
	{
		
		String sValue=mList.getOptions().get(i).getText();
		
		System.out.println(sValue);		
		
	
		mList.selectByIndex(i);
		
		
	}

	mList.deselectAll();
	
	Thread.sleep(2000);
	
	
		
	//driver.close();	
		
	}

}
