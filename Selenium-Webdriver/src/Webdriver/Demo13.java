package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/IBM_ADMIN/Desktop/Selenium Proj/Sample2.html");
		
		////table/tbody/tr[2]/td[3]//parent::tr//preceding-sibling::tr/td[1] previous row
		
		
		String number = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
		System.out.println(number);
	}

}
