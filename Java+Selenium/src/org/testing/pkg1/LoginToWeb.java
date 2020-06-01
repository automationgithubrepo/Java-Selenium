package org.testing.pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class LoginToWeb 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32_83.0\\chromedriver.exe");
	WebDriver web =new ChromeDriver();
	web.get("https://www.flipkart.com/");
	web.manage().window().maximize();
	Thread.sleep(2000);
	web.findElement(By.xpath("//div[1]/input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8249594648");
	Thread.sleep(2000);
	web.findElement(By.xpath("//div[2]/input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("amit@1234");
	web.findElement(By.xpath("//div[3]/button")).click();
	Thread.sleep(5000);
	
	//Shopping for OPPO Mobile
	WebElement element =web.findElement(By.xpath("//span[text()='Electronics']"));
	 Actions action=new Actions(web);
	 action.moveToElement(element).build().perform();
	 Thread.sleep(5000);
	web.findElement(By.xpath("//a[text()='OPPO']")).click();
	 Thread.sleep(5000);
	web.findElement(By.xpath("//*[@id='container']/div/div[3]/div[3]"
	+ "/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/div/div/div[1]/div[1]")).click();
	
	
	
	
	
	
	
	
	}

	
	
}
