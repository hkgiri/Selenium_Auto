package com.actitime.TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test(priority = 1,invocationCount = 3)
	public void CreateProject()
	{
		Reporter.log("CreateProject");
	}
	@Test(priority = 2,dependsOnMethods = "CreateProject")
	public void ModifyProject()
	{
		Reporter.log("ModifyProject");
	}
	@Test(priority = 3,dependsOnMethods = {"CreateProject","ModifyProject"})
	public void DeleteProject()
	{
		Reporter.log("DeleteProject");
	}
	
}

