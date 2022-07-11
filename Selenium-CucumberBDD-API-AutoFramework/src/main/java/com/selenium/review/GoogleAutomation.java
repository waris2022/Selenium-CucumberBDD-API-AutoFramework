package com.selenium.review;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAutomation {
//go to google
	//write  iphone in gooogle search
	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement search =driver.findElement(By.xpath("//*[@name='q']"));//*[@name='q']""))
	search.sendKeys("iphone");	
WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
wait.until(ExpectedConditions.elementToBeClickable(search));
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].style.border='4px solid red'", search);


}
	
}
