package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class GetRequestTC 
{
	@Test
	public void tc2() throws IOException
	{
		Properties pr = PropertiesFileLoad.propertiesFile();
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.GetRequest("QA_URI", PostRequestTC.id);
		System.out.println("Get Reqiest Response Data ");
		System.out.println(res.asString());

		ResponseStatusCodeValidation.responseStatusCode(res, 200);
		//ResponseDataValidation.responseData(res, "Ritika", "[2].firstName");
		
	}

}
