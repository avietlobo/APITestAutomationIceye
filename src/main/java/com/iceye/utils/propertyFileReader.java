package com.iceye.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {
	
	private static String filename=System.getProperty("user.dir")+"/Configuration/config.properties";
	public static Properties readPropertiesFile() throws IOException {
	      FileInputStream fis = null;
	      Properties prop = null;
	      try {
	    	  
	    	  System.out.println(filename);
	         fis = new FileInputStream(filename);
	        
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      return prop;
	   }
}
	
	


