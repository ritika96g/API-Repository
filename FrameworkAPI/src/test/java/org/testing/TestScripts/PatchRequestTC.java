package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class PatchRequestTC {
	@Test
	public void TC6() throws IOException
	{
		JSONObject Patchdata = new JSONObject();
		Patchdata.put("lastName", "samsung");
		Properties pr = PropertiesFileLoad.propertiesFile();
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.PatchRequest(Patchdata.toString(), "QA_URI", PostRequestTC.id);
		
	}

}
