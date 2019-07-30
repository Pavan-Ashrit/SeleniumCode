package Webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		Thread.sleep(3000);		
		driver.manage().window().maximize();
		String ParentWindow = driver.getWindowHandle();
		System.out.println("Parent window name-->"+ParentWindow);
		
		WebElement button = driver.findElement(By.id("button1"));
		for (int i=0;i<3;i++)
		{
			Thread.sleep(3000);
			button.click();
			Thread.sleep(3000);
		}
		//This is to identify child windows
		
		List<String> childwindow = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Parent window + Child window are --> "+childwindow);
		String lastwindow = "";
		for (int i=1;i<childwindow.size();i++)
		{
			driver.switchTo().window(childwindow.get(i));
			driver.navigate().to("https://www.google.com");
			String title = driver.getTitle();
			lastwindow = childwindow.get(i).toString();
		}
		driver.switchTo().window(ParentWindow);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lastwindow);
		driver.navigate().to("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
	}
	

}
