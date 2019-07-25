package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://elearning.upskills.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.name("submitAuth")).click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@class='block-items-admin']/ul/li[4]/a")).click();
		 driver.findElement(By.id("user_import_import_file")).sendKeys("C:\\Users\\IBM_ADMIN\\Desktop\\Links.txt");
	}

}
