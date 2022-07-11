package com.practice;

import java.time.Duration;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWebTable {

	static Logger log = Logger.getLogger(OpenWebTable.class.getName());

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://money.cnn.com/data/us_markets/"); 
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	///go to first table and find out row namber?
 List <WebElement>allRow =driver.findElements(By.xpath("//*[@id='wsod_marketMoversContainer']/table/tbody/tr"));
   log.info("total all Row count="+allRow.size() );
   
   //read first row 
    log.info("1st row darta="+allRow.get(0).getText());
    
    //read data from last row.*************************interview Q
    //how to find last row (with dynamic) fist i hane to do the list name.size () method then -1v  
    log.info("last Row data="+allRow.get(allRow.size()-1).getText());
  
    //read data from befoul last row
    log.info("befoul last Row data="+allRow.get(allRow.size()-2).getText());
	
	}
	
}	
	
