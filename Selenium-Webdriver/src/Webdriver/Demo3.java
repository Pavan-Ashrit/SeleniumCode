package Webdriver;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(@name,'userName')]")).sendKeys("sunil");
		driver.findElement(By.xpath("//*[contains(@name,'password')]")).sendKeys("sunil");
		driver.findElement(By.xpath("//*[contains(@name,'login')]")).click();
		Thread.sleep(3000);
		
		if(driver.findElement(By.xpath("//input[@name='tripType' and @value='roundtrip']")).isSelected())
		{
			driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();
		}
		
		WebElement DD = driver.findElement(By.name("passCount"));
		Select sel = new Select(DD);
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i).getText()); 
		}
		//1st Option
		sel.selectByVisibleText("2");
		Thread.sleep(3000);
		//2nd Option
		sel.selectByIndex(2);
		Thread.sleep(3000);
		sel.selectByValue("1");
		
		WebElement From = driver.findElement(By.name("fromPort"));
		Select from = new Select(From);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("passFirst0")).sendKeys("FirstName");
		driver.findElement(By.name("passLast0")).sendKeys("LastName");
		driver.findElement(By.name("creditnumber")).sendKeys("373599679805945");
		Thread.sleep(3000);
		
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@name='ticketLess' and @value='checkbox']"));
		for (int i=0;i<=checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		Thread.sleep(3000);
		
		driver.findElement(By.name("buyFlights")).click();
		
	}

}
