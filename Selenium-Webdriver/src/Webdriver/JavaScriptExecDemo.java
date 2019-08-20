package Webdriver;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String Title = driver.getTitle();
		/*System.out.println(Title);
		Thread.sleep(3000);	*/	
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title1 = js.executeScript("return document.title").toString();
		System.out.println(title1);
		
		String URL2 = js.executeScript("return document.URL").toString();
		System.out.println(URL2);
		
		String Domain = js.executeScript("return document.domain").toString();
		System.out.println(Domain);
		
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		
		Thread.sleep(3000);
		js.executeScript("history.go(0)");
		
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		
			
		WebElement ele = (WebElement)js.executeScript("return document.getElementById('txtUsername')");
		//fetching value using get attribute
		String name1 = ele.getAttribute("value");
		System.out.println(name1);
		
		js.executeScript("document.getElementById('txtPassword').value='admin123'");
		
		WebElement ele2 = (WebElement)js.executeScript("return document.getElementById('txtPassword')");
		String Pwdname = ele2.getAttribute("value");
		System.out.println(Pwdname);
		Thread.sleep(3000);
		
		js.executeScript("document.getElementById('btnLogin').click()");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click()");
		Thread.sleep(2000);
		/*Actions act = new Actions(driver);
		
		act.sendKeys(Keys.END).build().perform();*/
		//js.executeScript("window.scrollBy(0,600)");
		//Full page scroll
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(3000);
//		//js.executeScript("window.scrollTo(0,0)");
//		js.executeScript("window.screenTop");
		
		//js.executeScript("document.getElementById('ohrmList_chkSelectRecord_4').scrollIntoView()");
		
		/*String tabledata = driver.findElement(By.xpath("//*[@id='resultTable']")).getText();
		System.out.println(tabledata);*/
		
		String tabledata1 = js.executeScript("return document.getElementById('resultTable').innerText").toString();
		System.out.println(tabledata1);
		Thread.sleep(3000);
		//navigate one step back
		//driver.navigate().back();
		//similarly want to do with java script
		js.executeScript("window.history.back()");
		Thread.sleep(3000);
		//forward
		//driver.navigate().forward();
		js.executeScript("window.history.forward()");
		//create alert
		
		//Alerts
		js.executeScript("alert('welcome to session on selenium')");
		//switch betwenn alerts
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println(alerttext);
		alert.accept();
		
		js.executeScript("prompt('Enter the credentials'),('Enter Yes/no')");
		alert.sendKeys("yes");
		alert.accept();
	}
	

}
