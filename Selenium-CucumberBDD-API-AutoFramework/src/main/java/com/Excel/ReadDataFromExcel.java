package com.Excel;

import org.testng.annotations.Test;

public class ReadDataFromExcel {
public void getStringconvertToDouble(String text) {
	
	double value = Double.parseDouble(text);//(small letter double (value)this is call primitive data type
	//(= capital letter Double call is wrapper class)
	
	System.out.println(value);
	
	
	
	
}
public static void main(String[] args) {
	new ReadDataFromExcel().getStringconvertToDouble("20.34");
}
}
