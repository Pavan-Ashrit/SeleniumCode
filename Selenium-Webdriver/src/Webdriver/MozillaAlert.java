package Webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.*;

public class MozillaAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		js.executeScript("document.getElementById('txtPassword').value='admin123'");
		js.executeScript("document.getElementById('btnLogin').click()");
		
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		js.executeScript("prompt('Enter the credentials'),('Enter Yes/no')");
		Thread.sleep(3000);
		alert.sendKeys("yes");
		Thread.sleep(3000);
		alert.accept();

	}

}
