package com.test.windowHandling;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.gecko.driver", "D:\\Tools\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		
//Open URL “http://toolsqa.wpengine.com/automation-practice-switch-windows/”
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		
//Get Window name (Use GetWindowHandle command)
		
		System.out.println(driver.getWindowHandle());
		
//Click on Button “New Message Window”, it will open a Pop Up Window
	
	
	       driver.findElement(By.xpath("//*[@id='content']/p[3]/button")).click();
	
	
//Get all the Windows name ( Use GetWindowHandles command)
	
	       	Set<String> st=driver.getWindowHandles();	

	       		int Setsize=st.size();

	       		System.out.println(Setsize);


	       		for (String str2:driver.getWindowHandles())
	       			
	       		{
	
	       				System.out.println(str2);

	       				driver.switchTo().window(str2);


	       					}
		
//Close the Pop Up Window (Use Switch Command to shift window)		

 	
	       			driver.close();
		





		
	
	}

}
