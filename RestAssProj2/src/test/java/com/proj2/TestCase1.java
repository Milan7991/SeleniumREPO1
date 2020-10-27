package com.proj2;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestCase1 {

	@Test
	public void getWeatherDetail()
	{
		//Specify base URI
		RestAssured.baseURI= "https://gorest.co.in";
		
		//Request Object
		RequestSpecification testReq = RestAssured.given();
		
		//Response Object
		Response testRes = testReq.request(Method.GET,"/public-api/posts");
		
		//printResponse
		
		/*String Response = testRes.getBody().asString();
		System.out.println("printing body..."+Response);
		*/
		//verify status code
		int scode = testRes.getStatusCode();
		System.out.println(scode);
		Assert.assertEquals(scode, 200);
		
		//verify status line
		String statusLine = testRes.getStatusLine();
		System.out.println(statusLine);
			
	}
}
	
	
