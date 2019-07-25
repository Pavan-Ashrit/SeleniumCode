package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		WebElement UN = driver.findElement(By.name("userName"));
		
		if(UN.isEnabled())
		{
			UN.sendKeys("sunil");
			Thread.sleep(3000);
			UN.clear();
			UN.sendKeys("Sunil");
			
		}
		
		if(driver.findElement(By.name("userName")).isDisplayed())
		{
			//System.out.println(UN.getAttribute("value"));
			String name = UN.getAttribute("value");
			System.out.println("This will get the attribute of the vlaue-->"+name);
			String name1 = UN.getAttribute("type");
			System.out.println("This will get the attribute of the type-->"+name1);
			//gettext can be used for label and dropdowns
			
			String label1 = driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText();
			System.out.println("Label name is-->"+label1);
			
		}
		
		/*driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.xpath("//input[@name='login']")).click();*/
		
	}

}
