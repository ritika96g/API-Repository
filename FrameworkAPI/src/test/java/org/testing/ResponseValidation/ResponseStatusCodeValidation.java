package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidation 
{

	public static void responseStatusCode(Response res, int expectedStatusCode)
	{
		if(res.getStatusCode()==expectedStatusCode)
		{
			System.out.println("Staus Code is matching :" + res.getStatusCode());
		}
		else
		{
			System.out.println("Status Code is not matching");
		}
	}
}
