package com.review.api;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReadData {
public void getAPIData(){
	//how to use url her 
	//API combination of request and response 
   Response response = RestAssured.get("https://httpbin.org/get");//after = sign is request and befour = sing is response.
	//1st test cases
   System.out.println("status code found="+response.statusCode());
	
// how you validation Automation test cases?// i have to use  assertion either i can use hard assert or soft assert
//(Assert,hard Assert and soft Assert its part of the  TestNG or Junit i usining TEstNG in my project) 
   Assert.assertEquals(response.statusCode(),200);
   
}
public static void main(String[] args) {
	ReadData obj =new ReadData();
	obj.getAPIData();
}
}
