package com.review.api;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITestingWithTesstNG {
//TestNG have  annotation.
//annotation name is before test,before suite,before class before method.
//after test,after suite,after class after method.
Response response;//here i have change global 
@BeforeTest
public void setup() {
	 response = RestAssured.get("https://httpbin.org/get");
	
}

@Test
public void checkStatusCode() {
	  System.out.println("status code found="+response.statusCode());
	  Assert.assertEquals(response.statusCode(),200);
	
}

@AfterTest
public void teardown() {
	
	
}
}
