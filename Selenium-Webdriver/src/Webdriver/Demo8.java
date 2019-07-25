package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement link = driver.findElement(By.id("btnLogin"));
		Actions act = new Actions(driver);
		Action mouseover = act.moveToElement(link).build();
		mouseover.perform();
		act.sendKeys(link,(Keys.ENTER)).perform();
		
		Thread.sleep(3000);
/*		WebElement newlink = driver.findElement(By.linkText("Performance"));
		Action mouse = act.moveToElement(newlink).build();
		mouse.perform();
		act.sendKeys(newlink,(Keys.ENTER)).perform();*/
		
		
		act.sendKeys(Keys.TAB , Keys.TAB , Keys.TAB , Keys.ENTER).build().perform();
//		driver.navigate().back();
		WebElement newlink = driver.findElement(By.linkText("PIM"));
		Action mouse = act.moveToElement(newlink).build();
		mouse.perform();
		
		driver.findElement(By.linkText("Employee List")).click();
		act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		
	
		

	}

}
