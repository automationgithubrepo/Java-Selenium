package org.testing.pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LoginToWeb 
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver web =new FirefoxDriver();
	web.get("http://www.demo.guru99.com/V4/");
	web.manage().window().maximize();
    web.findElement(By.name("uid")).sendKeys("Userld");
    web.findElement(By.name("password")).sendKeys("Password");
    web.findElement(By.name("btnLogin")).click();
    System.out.println("Login Successful");
	}

	
	
}
