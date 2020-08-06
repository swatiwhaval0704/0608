package Customlister;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure {

	
	@Test 
	
	public void  doLogin()
	{
	 Assert.assertEquals(true, false);
	 
	 Assert.assertEquals(true, true);
	System.out.println("test pass");
	}
}
