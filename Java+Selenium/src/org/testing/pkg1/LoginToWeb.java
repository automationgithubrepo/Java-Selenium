package org.testing.pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LoginToWeb 
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver web =new FirefoxDriver();
	web.get("https://www.facebook.com");
	web.manage().window().maximize();
	
	//Create Account on Facebook
	web.findElement(By.name("firstname")).sendKeys("Namita");
	web.findElement(By.name("lastname")).sendKeys("Mishra");
	web.findElement(By.name("reg_email__")).sendKeys("amitnamita199512@gmail.com");
	web.findElement(By.name("reg_passwd__")).sendKeys("amit@1234");
	web.findElement(By.xpath("//select[@id='day']/option[@value='10']")).click();
	web.findElement(By.xpath("//select[@id='month']/option[@value='4']")).click();
	web.findElement(By.xpath("//select[@id='year']/option[@value='1996']")).click();
	web.findElement(By.name("reg_email_confirmation__")).sendKeys("amitnamita199512@gmail.com");
	web.findElement(By.xpath("//span[@id='u_0_z']/span[1]/input[1]")).click();
	web.findElement(By.id("u_0_13")).click();


	}

	
	
}
