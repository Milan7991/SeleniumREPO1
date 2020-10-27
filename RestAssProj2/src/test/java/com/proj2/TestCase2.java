package com.proj2;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestCase2 {

	
	@Test
	public void getWeatherDetail()
	{
		//Specify base URI
		RestAssured.baseURI= "https://gorest.co.in";
		
		//Request Object
		RequestSpecification testReq = RestAssured.given();
		
		//Response Object
		Response testRes = testReq.request(Method.GET,"/public-api/posts");
		
		//print body
		
		/*String Response = testRes.getBody().asString();
		System.out.println("printing body..."+Response);
		*/
		
		//print header or verify
		Headers allHead=testRes.headers();
		
		for (Header head: allHead)
		{
			System.out.println(head.getName() + "==> "+ head.getValue());
			
		}
		
}
}
