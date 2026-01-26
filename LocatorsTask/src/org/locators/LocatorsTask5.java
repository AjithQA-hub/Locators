package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask5 {
	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\Locators1\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement Firstname= driver.findElement(By.xpath("//input[@type='text']"));
        Firstname.sendKeys("Ajith");
        
        WebElement Lastname = driver.findElement(By.xpath("//input[@type='text']"));
        Lastname.sendKeys("V");
        
		
	}

}
