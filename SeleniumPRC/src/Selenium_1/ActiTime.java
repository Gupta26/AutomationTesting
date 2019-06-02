/**
 * 
 */
package Selenium_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime {

	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Login in ACTITIME
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//To click on Tasks
		driver.findElement(By.xpath("//a/div[contains(text()='TASKS']")).click();
	
		driver.findElement(By.cssSelector("td>a.tasks>div[class='label']")).click();

	}
}
