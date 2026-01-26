package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask11 {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\Locators1\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://inmakesedu.com/");
		
		driver.manage().window().maximize();
		
		WebElement inmakes = driver.findElement(By.xpath("//h1[contains(text(),'Learning Today')]"));
		String text= inmakes.getText();
		System.out.println(text);
	}
}
