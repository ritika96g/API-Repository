package org.testing.Utilities;

import com.jayway.restassured.response.Response;

public class ResponseExtractionUsingJSONPath 
{
    public static String responseExtract(String jsonPath, Response res)
    {
    	return res.jsonPath().get(jsonPath);
    }
}
