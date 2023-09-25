package com.actitime.TestScript;


import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

import dev.failsafe.internal.util.Assert;

public class DemoCustomerModule extends BaseClass {
	@Test(priority = 1,invocationCount = 3)
	public void CreateCustomer()
	{
		Reporter.log("CreateCustomer",true);
	}
	@Test(priority = 2,dependsOnMethods = "CreateCustomer")
	public void ModifyCustomer()
	{
		Reporter.log("ModifyCustomer",true);
	}
	@Test(priority = 3,dependsOnMethods = {"CreateCustomer","ModifyCustomer"})
	public void DeleteCustomer()
	{
		Reporter.log("DeleteCustomer",true);
	}
	
}
