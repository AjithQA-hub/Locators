package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask13 {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\Locators1\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://inmakesedu.com/");
		
		driver.manage().window().maximize();
		
		WebElement address1= driver.findElement(By.xpath("//a[contains(text(),'Mai tower')]"));
		String text1= address1.getText();
		System.out.println(text1);
	}

}
