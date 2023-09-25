package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends BaseClass implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getName();
		System.out.println(name+" has got pass");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		System.out.println(name+" has got failed");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desti=new File("./screenshot/"+name+".png");
		try {
			FileUtils.copyFile(src, desti);
		} catch (IOException e) {
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getName();
		System.out.println(name+" has got skipped");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}
	@Override
	public void onStart(ITestContext context) {
	}
	@Override
	public void onFinish(ITestContext context) {
	}
}