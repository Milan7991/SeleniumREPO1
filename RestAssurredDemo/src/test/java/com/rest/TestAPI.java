package com.rest;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
//import static io.restassured.RestAssured.

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestAPI {

	
/*@Test
public void test_get() throws URISyntaxException
{
	URI uri = new URI("https://reqres.in/api/users") ;
	
	//Response res =when().get(uri); 
	//System.out.println(res.asString());
	Response res = given()
	.accept(ContentType.JSON)
	.when()
	.get(uri);
	System.out.println(res.asString());
	 

}*/
	
	
@Test
public void getStatuscode() throws URISyntaxException
{
URI uri = new URI("https://reqres.in/api/users");
	
//validating the response code	
given()
	.accept(ContentType.JSON)
	.when()
	.get(uri)
	.then()
	.assertThat()
	.statusCode(HttpStatus.SC_OK);
	

//printing the status code here
	/*System.out.println(given()
	.accept(ContentType.JSON)
	.when()
	.get(uri).thenReturn().statusCode()+ " print ing");*/
	
	
	
	
}

	
}
