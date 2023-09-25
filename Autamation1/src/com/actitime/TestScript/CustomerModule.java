package com.actitime.TestScript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.ListenerImplementation;

import dev.failsafe.internal.util.Assert;
//@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	
	@Test(groups= {"smoketest","regressiontest"})
	public void CreateCustomer() {
		Reporter.log("CreateCustomer",true);
	}
	@Test(groups="regressiontest")
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}
