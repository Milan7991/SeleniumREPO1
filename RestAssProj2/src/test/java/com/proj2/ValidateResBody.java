package com.proj2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateResBody {

	
	@Test
	public void getWeatherDetail()
	{
		//Specify base URI
		RestAssured.baseURI= "https://reqres.in";
		
		//Request Object
		RequestSpecification testReq = RestAssured.given();
		
		//Response Object
		Response testRes = testReq.request(Method.GET,"/api/users?delay=3");

		String bodyRes = testRes.getBody().asString();
		System.out.println(bodyRes.contains("George"));
		
		//Capture specific value from response
		String idVal = testRes.jsonPath().get("id");
		System.out.println("Value of Id is = " +idVal);
		testRes.jsonPath().get("email");
		testRes.jsonPath().get("first_name");

	}
	
}
