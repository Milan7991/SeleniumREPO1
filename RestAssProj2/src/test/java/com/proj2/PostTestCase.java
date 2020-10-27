package com.proj2;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostTestCase {

	@Test
	public void RegistrationSuccessful()
	{
		//Specify base URI
		RestAssured.baseURI= "https://reqres.in";
		
		//Request Object
		RequestSpecification testReq = RestAssured.given();
		
		//Data to be sent
		JSONObject reqParam = new JSONObject();
		//{"name":"test","salary":"123","age":"23"}
		reqParam.put("name","Mohit");
		reqParam.put("job","Doctor");
		
		testReq.header("Content-Type","application/json");
		testReq.body(reqParam.toString());
		
		//Response Object
				Response testRes = testReq.request(Method.POST,"/api/users");
				
		//verify status code
		int scode = testRes.getStatusCode();
		System.out.println(scode);
		Assert.assertEquals(scode, 201);
		
		//verify the response
		System.out.println(testRes.jsonPath().get("name")+ "...Name in Response");
				
		
	
		
}
}
