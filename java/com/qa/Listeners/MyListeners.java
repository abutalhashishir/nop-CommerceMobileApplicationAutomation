package com.qa.Listeners;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.qa.base.Base;
import io.appium.java_client.android.AndroidDriver;



public class MyListeners extends Base implements ITestListener{
	 @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Testcase Case Execution Started: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Testcase Passed: " + result.getName());
	    }

	    @SuppressWarnings("rawtypes")
	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Testcase Failed: " + result.getName());
	        String testMethodName = result.getMethod().getMethodName();
	        AndroidDriver mobileDriver = null;
	        try {
	            mobileDriver = (AndroidDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        try {
	            if (mobileDriver != null) {
	                takeScreenShotPath(testMethodName, mobileDriver);
	            } else {
	                System.out.println("mobileDriver is null. Cannot capture screenshot.");
	            }
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        }
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Testcase Case Execution Skipped: " + result.getName());
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    }

	    @Override
	    public void onStart(ITestContext context) {
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	    }
}