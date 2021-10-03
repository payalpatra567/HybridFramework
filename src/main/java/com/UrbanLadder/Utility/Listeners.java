package com.UrbanLadder.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.UrbanLadder.ReusableComponents.reusablecomponent;




public class Listeners implements ITestListener{
	
	WebDriver driver ;
	reusablecomponent b = new reusablecomponent();
public void onTestFailure(ITestResult result) {
		
		try {
			b.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
