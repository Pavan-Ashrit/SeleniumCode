package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
		//Supports all browsers
		WebDriver driver = new ChromeDriver();
		
	
		
		/*//Supports chrome browser
		//ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		
		//how to open the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	

		
		//maximize
		driver.manage().window().maximize();
		//Print Title
		String ExpectedTitle = "OrangeHRM";
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String ActualTitle = driver.getTitle();
		
		if(ExpectedTitle.equals(ActualTitle))
		{
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			//will close active browser instance
			driver.close();
			//will close multiple browser
			//driver.quit();
		}
		else
		{
			System.out.println("Expected is not equal to actual");
		}
	}

}
