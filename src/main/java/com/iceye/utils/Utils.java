package com.iceye.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.ArrayUtils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {
	
	
	
	public static RequestSpecification req;
	public RequestSpecification requestSpecification() throws IOException
	{
		
		if(req==null)
		{
		PrintStream log =new PrintStream(new FileOutputStream("logging.txt"));
		 req=new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl")).addQueryParam("key", "qaclick123")
				 .addFilter(RequestLoggingFilter.logRequestTo(log))
				 .addFilter(ResponseLoggingFilter.logResponseTo(log))
		.setContentType(ContentType.JSON).build();
		 return req;
		}
		return req;
		
		
	}
	
	
	public static String getGlobalValue(String key) throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\rahul\\restassured\\APIFramework\\src\\test\\java\\resources\\global.properties");
		prop.load(fis);
		return prop.getProperty(key);
	
		
		
	}
	
	
	public static String getJsonPath(Response response,String key)
	{
		  String resp=response.asString();
		JsonPath  js = new JsonPath(resp);
		return js.get(key).toString();
	}
	
	
	
	
	public static boolean checkBetween(String dateToCheck, String startDate, String endDate) {
	    boolean res = false;
	    SimpleDateFormat fmt1 = new SimpleDateFormat("yyyy-MM-dd"); //22-05-2013
	    SimpleDateFormat fmt2 = new SimpleDateFormat("yyyy-MMM-dd"); //22-05-2013
	    try {
	     Date requestDate = fmt2.parse(dateToCheck);
	     Date fromDate = fmt1.parse(startDate);
	     Date toDate = fmt1.parse(endDate);
	     res = requestDate.compareTo(fromDate) >= 0 && requestDate.compareTo(toDate) <=0;
	    }catch(ParseException pex){
	        pex.printStackTrace();
	    }
	    return res;
	   }

	public static boolean isSorted (int[] a) {
		// works with v3.4 or above
		return ArrayUtils.isSorted(a);
	}
	


}
