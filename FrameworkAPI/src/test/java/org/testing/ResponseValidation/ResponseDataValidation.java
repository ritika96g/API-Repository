package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseDataValidation 
{
	//we will pass three inputs to the method ---->
	//Expected Data
	//Response Object
	//Jsonpath that will be used for extracting data from the response object
	//we will compare this data with expected data
	
public static void responseData(Response res, String expectedData, String jsonPath)
{
	String actualData = res.jsonPath().get(jsonPath);
	
	if(actualData.equals(expectedData))
	{
		System.out.println("Data is matching");
	}
	else
	{
		System.out.println("Data is not matching");
	}
}
}
