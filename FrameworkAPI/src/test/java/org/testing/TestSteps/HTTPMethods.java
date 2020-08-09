package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

public class HTTPMethods 
{
	
//URI ----------->env.Properties
	
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	
	public Response PostRequest(String bodyData, String uriKey)
	{
		Response res = (Response) given()
				.contentType(ContentType.JSON)
				.body(bodyData)
				.when()
				.post(pr.getProperty(uriKey));
		return res;
	}
	
	public Response GetRequest(String uriKey, String Endpoint)
	{
		String uri = pr.getProperty(uriKey)+"/"+Endpoint;
		Response res = given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
				//.get(pr.getProperty(uriKey));
				return res;		
	}
	
	public Response GetRequestWithQuery(String uriKey, String Query)
	{
		String uri = pr.getProperty(uriKey)+"?"+Query;
		System.out.println(uri);
		Response res= 
				given().contentType(ContentType.JSON)
				.when()
				.get(uri);
		
		return res;
		
	}
	
	public Response GetRequestWithQueryValue(String uriKey, String QueryParameter, String QueryValue)
	{
		String uri = pr.getProperty(uriKey)+"?"+QueryParameter+"="+QueryValue;
		System.out.println(uri);
		Response res= 
				given().contentType(ContentType.JSON)
				.when()
				.get(uri);
		
		return res;
		
	}
	
	public Response PutRequest(String bodyData, String uriKey, String idValue)
	{
		String uri = pr.getProperty(uriKey)+"/"+idValue;
		System.out.println(uri);
		Response res = given()
				.contentType(ContentType.JSON)
				.body(bodyData)
				.when()
				.put(uri);
			return res;
		
	}
	
	public Response DeleteRequest(String uriKey, String idValue)
	{
		String uri = pr.getProperty(uriKey)+"/"+idValue;
		System.out.println(uri);
		Response res = 
				given().contentType(ContentType.JSON)
				.when()
				.delete(uri);
		
		return res;
			}
	
	public Response PatchRequest(String body, String uriKey, String Endpoint)
		{
		String uri = pr.getProperty(uriKey)+"/"+Endpoint;
		Response res =
				given().contentType(ContentType.JSON).when().patch(uri);
		
		return res;
		
	}
}






















