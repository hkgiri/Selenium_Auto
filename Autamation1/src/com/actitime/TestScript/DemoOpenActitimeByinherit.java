package com.actitime.TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class DemoOpenActitimeByinherit extends BaseClass{
	@Test
	public void openDriver() {
		Reporter.log("OpenDriver",true);
	}
}
