package com.test.IframeHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalIframesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.gecko.driver", "D:\\Tools\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		
		//By finding all the web elements using iframe tag		
		
		List<WebElement>FrameList=driver.findElements(By.tagName("iframe"));
		
		System.out.println(FrameList.size());
		
		
		//By executing a java script
	
		
					JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
					Integer wLength=Integer.parseInt(js.executeScript("return window.length").toString());

							System.out.println(wLength);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
