package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class PutRequestTC 
{
	
	@Test
	public void TC4() throws IOException
	{
		//Data Creation
		JSONObject data = new JSONObject();
		data.put("firstName", "DummyFirstName");
		data.put("lastName", "DM");
		data.put("id", "8989");
		data.put("designation", "QA Lead");
		
		/**************Loadf Properties File*****************/
		Properties pr = PropertiesFileLoad.propertiesFile();
		
		/******Printing Body***********/
		System.out.println("Body is : " + data);
		
		/************HTTP Methods*************************/
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.PutRequest(data.toString(), "QA_URI", PostRequestTC.id);
		ResponseStatusCodeValidation.responseStatusCode(res, 200);
		ResponseDataValidation.responseData(res, "DummyFirstName", "firstName");
		System.out.println("Put data in TC3 is " + res.asString());
	}

}
