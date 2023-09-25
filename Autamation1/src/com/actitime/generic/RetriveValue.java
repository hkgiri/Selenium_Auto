package com.actitime.generic;

import java.io.IOException;

public class RetriveValue {
	public static void main(String[] args) throws IOException {
		Filelib f=new Filelib();
		// Property File
		String url = f.getPropertyData("url");
		System.out.println(url);
		System.out.println(f.getPropertyData("username"));
		System.out.println(f.getPropertyData("password"));
		// write in the Excel File
		//f.setExcelData("CreateCustomer",1,2,"SBIN_001");
		//read in the Excel file 
		String data = f.getExcelData("CreateCustomer",1,2);
		System.out.println(data);
	}
}
