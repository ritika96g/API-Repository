package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.JSONFileRead;
import org.testing.Utilities.JSONVariableReplacement;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseExtractionUsingJSONPath;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class PostRequestTC 
{
	static String id;
	static String firstName;
		@Test
	public void tc1() throws IOException
	{
		//Body Data Ready -----> taking from json file
		String body = JSONFileRead.bodyDataRead("../FrameworkAPI/src/test/java/org/testing/PayloadData/body.json");
		Random r = new Random();
		Integer v=r.nextInt();
		
		//Variable value replacement
		body = JSONVariableReplacement.jsonVariable(body, "id", v.toString());
		
		System.out.println(body);
		//Properties file read
		Properties pr = PropertiesFileLoad.propertiesFile();
		
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.PostRequest(body, "QA_URI");
		
		//Status code validation
		ResponseStatusCodeValidation.responseStatusCode(res, 201);
		ResponseDataValidation.responseData(res, "Ritika", "firstName");
		System.out.println("Status Code is : " + res.statusCode());
		System.out.println("Body Data : ");
		System.out.println(res.asString());
		
		id=ResponseExtractionUsingJSONPath.responseExtract("id", res);
		System.out.println("ID is : " + id);
		firstName = ResponseExtractionUsingJSONPath.responseExtract("firstName", res);
		System.out.println("First Name is : " + firstName);
		
		
		 
	}
    }

