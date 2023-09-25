package com.actitime.TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {
	@Test(priority = 1,invocationCount = 3)
	public void CreateTask()
	{
		Reporter.log("CreateTask");
	}
	@Test(priority = 2,dependsOnMethods = "CreateTask")
	public void ModifyTask()
	{
		Reporter.log("ModifyTask");
	}
	@Test(priority = 3,dependsOnMethods = {"CreateTask","ModifyTask"})
	public void DeleteTask()
	{
		Reporter.log("DeleteTask");
	}
}
