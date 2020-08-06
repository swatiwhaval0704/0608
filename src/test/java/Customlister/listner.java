package Customlister;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listner implements ITestListener   {
 
	//Use Of ReportNG reporting
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.err.println("Test Passed: "+ result.getTestName());
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("org.uncommons.reportng.escape-output" ,"false");
		
		 
		Reporter.log(" <a href=\"E:\\Selinium\\queries\\testng.png\" target=\"blank\">Screenshotlink </a>");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
