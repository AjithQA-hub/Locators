package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask2 {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\LocatorsTask\\Drivers\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@autocomplete='username']"));
        email.sendKeys("ajithkumarvam1@gmail.com");
        
        
	}
}
