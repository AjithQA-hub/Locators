package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask4 {
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\Locators1\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		
				WebElement email = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		        email.sendKeys("ajithkumarvam1@gmail.com");
		        
		        WebElement pswd = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		        pswd.sendKeys("Ajith!123");
		       
		        WebElement logbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		        logbtn.click();
	}

}
