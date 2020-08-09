package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class DeleteRequestTC 
{
	@Test
	public void TC5() throws IOException
	{
		/*******Properties File Load*****/
		Properties pr = PropertiesFileLoad.propertiesFile();
		
		/*********HttpMethod*******/
		HTTPMethods http = new HTTPMethods(pr);
		System.out.println("########Test Case 5########");
		System.out.println("ID Fetched is : " + PostRequestTC.id);
		Response res = http.DeleteRequest("QA_URI", PostRequestTC.id);
		System.out.println("Deleted Data in TC_5 is " + res.asString());
		
		}
	

}
