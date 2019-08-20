package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class Demo1 {
	public WebDriver driver;	
	
	@BeforeTest
	
	public void A()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
	}	
	
	@Test
	public void C()
	{
		System.out.println("Print");
	}
	
	@AfterTest
	public void B()
	{
		
		driver.close();
	}

}
