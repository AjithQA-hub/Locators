package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask8 {
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\Locators1\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		driver.manage().window().maximize();
		
		WebElement From = driver.findElement(By.xpath("//input[@title='From station']"));
        From.sendKeys("Erode");
        
        WebElement To = driver.findElement(By.xpath("//input[@title='To station']"));
        To.sendKeys("Kochin");
        
        WebElement logbtn = driver.findElement(By.xpath("//button[@type='submit']"));
        logbtn.click();
		
	}

}
