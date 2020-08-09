package org.testng.Runner;

import java.io.IOException;
import java.util.concurrent.Delayed;

import org.testing.TestScripts.DeleteRequestTC;
import org.testing.TestScripts.GetRequestTC;
import org.testing.TestScripts.GetRequestWithQueryParameter;
import org.testing.TestScripts.PatchRequestTC;
import org.testing.TestScripts.PostRequestTC;
import org.testing.TestScripts.PutRequestTC;
import org.testng.annotations.Test;

public class RunnerClass 
{
	@Test
	public void run() throws IOException
	{
		PostRequestTC post = new PostRequestTC();
		post.tc1();
		
		GetRequestTC get = new GetRequestTC();
		get.tc2();
		
		GetRequestWithQueryParameter getParameter= new GetRequestWithQueryParameter();
		getParameter.tc3();
		
		PutRequestTC put = new PutRequestTC();
		put.TC4();
		
		DeleteRequestTC delete = new DeleteRequestTC();
		delete.TC5();
		
		PatchRequestTC patch = new PatchRequestTC();
		patch.TC6();
	}

}
