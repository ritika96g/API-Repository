package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.apache.http.HttpMessage;
import org.testing.ResponseValidation.ResponseStatusCodeValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;

import com.jayway.restassured.response.Response;

public class GetRequestWithQueryParameter 
{

	@Test
	public void tc3() throws IOException
	{
		Properties pr = PropertiesFileLoad.propertiesFile();
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.GetRequestWithQuery("QA_URI", PostRequestTC.firstName);
		System.out.println("Get Request Response Data ");
		System.out.println(res.asString());
		
		Response res1 = http.GetRequestWithQueryValue("QA_URI", "firstName", PostRequestTC.firstName);
		System.out.println("Get Request Response Data ");
		System.out.println(res1.asString());
		
		ResponseStatusCodeValidation.responseStatusCode(res, 200);
		ResponseStatusCodeValidation.responseStatusCode(res1, 200);
		
		
	}
}
























