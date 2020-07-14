package com.iceye.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class JsonReader {
	
	
	public static String readJsonfile(String filename)
	{
		 String data="";
		
		try
		{
		
         data=new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"\\src\\test\\resources\\Data\\" + filename)));
	 
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return data;
    
	}

}
