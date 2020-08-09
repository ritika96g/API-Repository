
package org.testing.Utilities;

import java.util.regex.Pattern;

public class JSONVariableReplacement 
{
	public static String jsonVariable(String body, String variableName, String variableValue)
	{
		body=body.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		return body;
		
	}
	

}
