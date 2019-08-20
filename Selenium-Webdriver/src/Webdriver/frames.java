package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("number of frames  "+frames.size());
		Thread.sleep(3000);
		driver.manage().window().maximize();
		for(int i=0;i<frames.size();i++)
		{
			System.out.println(frames.get(i).getAttribute("name"));
		}
		driver.switchTo().frame("iframe2");
		Thread.sleep(3000);
		String Text = driver.findElement(By.linkText("Sortable")).getText();
		System.out.println(Text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframe1");
		driver.getCurrentUrl();
		driver.switchTo().defaultContent();
		driver.close();
		////*[@id='primary-menu']/li[1]/a/span/span

	}

}
