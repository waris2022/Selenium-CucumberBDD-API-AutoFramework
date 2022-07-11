package com.selenium.review;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBaselogin {

	 static Logger log= Logger.getLogger(SeleniumBaselogin.class.getName());////(11)this line as like: System.out.println();same work
	
	 ///=============================login method start====================================////
	
	 public static void getlogin(){//first i need to create a method 
	
	WebDriverManager.chromedriver().setup(); //(2) this is code for open a browser
    WebDriver driver = new ChromeDriver();//(3)
    //or//Driver.get("http://automationpractice.com/index.php");//(4)this line also  will go my application
    driver.navigate().to("http://automationpractice.com/index.php");;//(4) this line will go my application
    log.info("this my home page");
	
	driver.manage().window().maximize();//(5)for windows nmaxi.
	
    //this 3 waiting code i have write only one time and use after the URL code.
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));//(9)HTML dome page is loaded or not loaded,
//  driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(3));//(9)f anything asynchronous problem it is wait.
//  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));//(9) UI Element page is loaded or not loaded..
  	
	WebElement signInButton= driver.findElement(By.xpath("//*[@class='login']"));//(6)
	JavascriptExecutor highlighter= (JavascriptExecutor)driver;//(10)highlighter
	highlighter.executeScript("arguments[0].style.border='4px solid red'", signInButton);//(10)highlighter
	WebDriverWait waite =new WebDriverWait(driver,Duration.ofSeconds(30));
	waite.until(ExpectedConditions.elementToBeClickable(signInButton));
	signInButton.click();//(7)
	log.info("this login page");//(11)this line as like: System.out.println();same work
	//Thread.sleep(3000);// slow down for 3 sec

	
	WebElement email = driver.findElement(By.xpath("//*[@id='email']"));//(7)
	highlighter.executeScript("arguments[0].style.border='4px solid red'", email);
	waite.until(ExpectedConditions.elementToBeClickable(email));
	email.sendKeys("sarowerny@gmail.com");//prob
	log.info("this is email");//for print.
	
	
	WebElement password = driver.findElement(By.xpath("//*[@name='passwd']"));//(7)/prob
	highlighter.executeScript("arguments[0].style.border='4px solid red'", password);
	waite.until(ExpectedConditions.elementToBeClickable(password));
	password.sendKeys("student");// crime
	log.info("this is password");//for print.

	
	WebElement submitbtn= driver.findElement(By.xpath("//*[@id='SubmitLogin']"));//(7)prob
	highlighter.executeScript("arguments[0].style.border='4px solid red'", submitbtn);
	waite.until(ExpectedConditions.elementToBeClickable(submitbtn));
	submitbtn.click();
	log.info("signInBtn");//for print.
		
	
	////========================= ==login method done============    ======================////
	
	
	////-------------------------login validation-----------------------------___-----//////*[contains(text(),'Sign out')][1]
	//(1) what is validation ?what is Assert? what type assert ? witch one i using in my framework?

	List <WebElement> signout= driver.findElements(By.xpath("(//*[contains(text(),'Sign out')])"));//(12)here is list 2 xpath
    Assert.assertTrue(signout.get(1).isDisplayed());//(13)if it is disply test will pass this is call  hard assert. 
	
   if(signout.get(1).isDisplayed()) {
	 
	   log.info("login success");
	   
   }else { log.info("login failed");
   
  
   }//this is soft assert.
    SoftAssert soft =new SoftAssert();//this is the object of soft assert 
    soft.assertTrue(signout.get(0).isDisplayed());
	soft.assertAll();

//  WebElement signOut= driver.findElement(By.xpath("(//*[contains(text(),'Sign out')])[1]"));//(3) //here is groping 1 xpath
//  	highlighter.executeScript("arguments[0].style.border='4px solid green'",signOut);
//  	signOut.click();
  	//log.info("signoutisdone");
	
	
	// first copy WebElement hole line than write;list input list ; than inside the angel bracket<WebElement>i put WebElement than i have to chenge findElements because here 2 xpath
	//list csn handle multiple value.
	////-------------------------login validation done--------------------------------////
	
	////::::::::::::::::::::::::::dress/woman section check price:::::::::::::::::::::::///
	WebElement womanSection= driver.findElement(By.xpath("(//*[contains(text(),'Women')])[1]"));//(7)prob
	highlighter.executeScript("arguments[0].style.border='4px solid red'", womanSection);
	waite.until(ExpectedConditions.elementToBeClickable(womanSection));
	womanSection.click();
	log.info("found woman Section");//for print.
    
	List <WebElement> allPrice= driver.findElements(By.xpath("//*[@class='right-block']//*[@class='price product-price'] "));//this is a list of WebElement xpath.
	
	List<Double> myList =new ArrayList<>();  //here i use Arralist
	
	allPrice.forEach(x->{//this is the java 8 forEach loop.	
	
	myList.add(Double.parseDouble(x.getText().replace("$", "")));//(17)here first add i convert String  to the  Double then remove dolersign.
		

	});
	
	log.info("all the price from woman Section="+myList);//this line  will print all the price with dolar sign.
	
	double maxprice = Collections.max(myList);//(18)how to fiend max value from a list?then i fiend out the mex value.fore the fiend max i have to use java collection.

	
	log.info("the higest price found ="+maxprice);
	
	
	////:::::::::::::::::::::::dress/woman section done::::::::::::::::::::::::::::::::///
	soft.assertAll();
	//driver.quit();//(8)this code for windows close.	
	 }
public static void main(String[] args) {
	SeleniumBaselogin.getlogin();
}
}

//(1)first i create a method inside the methoa i write the code whatever browser i want to open.

//(2)i create a object for open a browser
//in my project i use WebDriverManager.chromedriver().setup(); also i can use system.set properties 
//but system .set  properties Driver version has problem to overcome this problem i use WebDriverManager.chromedriver().setup(); 
//Because  system .set properties my Driver version with the  Browser version must be same otherwise is not work and no need 
//my Driver path .for this reason i use WebDriverManager.chromedriver().setup();.

//or old code i facing challenges.old code  Driver version and Browser version  must be match otherwise is not work.
//.for this reason i use WebDriverManager.chromedriver().setup();.

//(3)here a i have  create a object for open a browser.
   //what is webdriver? webdriver is a selenium main component but it is a java interface.
   //what is Driver? Driver  is a object.what is new ? new is  java keyword when i create anything new
   //i have to use New keyword.what is ChromeDriver? ChromedDriver is a Class.
   // WebDriver driver= new ChromeDriver();//(ChromeDriver is  make by up casting)

//(4)two way i can open a URL. one is(1)Driver.get() (2)other one is Driver.navigate()

//(5)for making web page maximize.
 
//(6) how to write WebElement xpath first Driver then .(dod) then select findElement() remove null then inside the parameter By then .(dod) then select xpath(String xpathExpression)
   //then inside the xpath parameter ""(doble code) then inside the double code i have to write selenium locator.like this;("//*[@class='login']"); then = (equal sign)
   //then i  write  xpath name whatever i want to click so here i write  signInButton then write WebElement (WebElement is part of the web page).

//(7) then copy signInButton then .(dod) and then select click();if i want to open other thing like:for email.sendKeys and for password.sendKeys.


//(9)Q=what is implicitlyWait? An= it is wait untile HTML dome page is loddwded.here how long it wait 3 sec or whatever sec i want.if 
//Within 3 sec HTML not lowdaed  what will happen.there will be one Exception this Exception name is'TimeoutException'.
//what is the  disadvetege of implicitlyWait? its show down the Automation.
//Q=why is show down? An= because its works for each and every line of code.
//Q=what are the changing happen  in selenium implicitlyWait?
//An=old code this Driver.manage().timeouts().implicitlyWait(3,timeunit.seconds) up to selenium 3
//now this code Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)) for selenium 4

//implicitlyWait  is HTML dome page is loaded or not loaded,
//what is pageLoadTimeout is UI Element page is loaded or not loaded.
//what is scriptTimeout is if anything asynchronous problem it is wait.

//(11)this line as like: System.out.println()print method have no date and time for this reason i use lof4j ,log4j another name is logger,logger is a class ,how to write logger; first logger.than log than = than Logger than .(dod) than 
//select getloggerclass in side the parenthisis i put class name .(dod)than select class .(dod) getname(); than static word


//how to write highlighter code first i rite   
////=========================== login method done=================================////

////////////////For validation purpose i using Assert=hard Assert and softAssert////////////////////
//(12) what is validation ?what is ASSERT ? what type assert ? witch one i using in my framework?////
//what is validation ? validation means how i know my test is pass or failed.if LogOut  button there its means Login success.
//(13)for validation purpose i using Assert. Assert is two type one is Hard Assert other one is Soft Assert
//Hard Assert is ; if  any test cases failed  Hard Assert will stop there and it can not go to next test./or can not go to next line.
//Soft Assert is ; if  any test cases failed Soft Assert will not stop there and  it will run all test cases.
//tow type of Assert ()Hard Assert()Soft Assert
///witch one i using in your framework?

//(2)Q=how to handle multiple xpath.
//An=two way i can handle multiple xpath. one is *groping,another one  is code level call is *list of element,.if i use groping so groping give me out of two xpath give me one xpath.
//and  here i using list of element. so list also  give me out of two xpath give me one xpath.


                            //////////////////////how to write foreatch loo//////////////
//(14)how to do foreach loop? first i have to write list  name like; allprice  then .(dod) then select forEach(null) inside the parameter i have to put anything value like: p
// then lemda sign like -> then { } inside the carlibracate i bring logger code like; log.info("all the xpath from woman Section="+x)(this is give me all Xpath list not price) 
//if i want to print the price i have to use after the x .(dod)getText() method. it will give me the all price from women section.
               
//if i want to print the all the  value form the list i have do any kind of looping.so i using here basic for loop.
//formula is : first write for (){} then i have to  put condition inside the parenthesis i=0; i<allPrice.(dod) size(); (then i have to use size method) then i++
// then next line allprice .(dod)get(i) method inside pass (i) then .(dod) get text() give the price and value so if i want to print the price i have to wite
//code inside the method carlibrack like this:(log.info("all the price from woman Section"+allPrice);

                           ////////////////////////Calculation/////////////////////////////
//(17)how to Add all the price inside the list? first i bring (or coppy ) list name then .(dod) then Add() method inside add method parameter i bring all the price like this: myList.add(Double.parseDouble(x.getText().replace("$", "")));
//if i want to calculate data.i have to use either int or Double data type
//theswhay i change here String to Double (java collection can't handle primitive data type so list an handle wrapper class wrapper
// means Double is capital)then here getText() returning me String so i need to convert String to Double format.(how convert String to Double?
//first i have to do:  Double .(dod) then select parseDouble()then inside the method parameter  i have to pass my String name.here String name is x.getText()
//then i copy this line and past it  inside the myList.add() parameter.).then for the calculation i have to  Remove dolor sign. after the  x.getText() i put .(dod) then select replace() method
//inside the replace parameter i have to put doblecode "" inside the doblecode i put  dolor $ sign and another doblecode  "" i put nothing.i remove  all dolorsign with nothing only i keep number then i can calculate.


//(18)to find out the max value i have to use java collection.
	//first write Collections .(dod) then select max method  inside  the max method i have to pass whatever my list name. here list name is myList: .then befour Collections i put = (equalsign) and i write 
	//data type whatever i want,i use here double  and object name maxprice .then i bring logger code for print max value from all price ,code is -log.info("the higest price found  ="+maxprice);