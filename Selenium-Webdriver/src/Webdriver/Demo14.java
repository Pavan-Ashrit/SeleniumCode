package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		//Once in the programm, it will be applicable for all the lines
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		//Explicitly wait
		WebDriverWait mywait = new WebDriverWait(driver, 30);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		driver.findElement(By.name("username")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		
		driver.findElement(By.name("login")).click();
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("FLIGHT FINDER")));
		System.out.println("Logged in Successfully");
		
		
		//fluent wait is better than explicit wait
		//fluent wait is similar to explicit wait but has one feature i.e we can set the time interval
			
		

	}

}
