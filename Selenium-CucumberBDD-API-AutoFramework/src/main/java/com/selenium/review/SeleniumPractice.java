package com.selenium.review;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();

	WebDriver driver =new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	
	
	driver.manage().window().maximize();


}
}



