package com.iceye.test.api.acceptance.test.stepdefinitions;


import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.iceye.utils.JsonReader;
import com.iceye.utils.Utils;

import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;


public class Assertions {
	
	
	  
	
	
	@Then("^the assertion should work correctly for get close-approach data for \"([^\"]*)\" API between \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_assertion_should_work_correctly_for_get_close_approach_data_for_API_between_and(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		 JsonPath js= new JsonPath(stepDefination.response_);
			
         
		    js.get("signature.source").equals(JsonReader.readJsonfile("TC02.json"));
			//js.get("signature.source").equals("NASA/JPL SBDB Close Approach Data API");
			List<List<String>> ls=js.getList("data");
			//assertEquals(ls.get(0).get(0),arg1);
			for(List<String> obj:ls)
			{
				obj.get(0).contentEquals(arg1);
			
				String fromDate = arg2;
			    String toDate = arg3;
	            String requestDate = obj.get(3).substring(0,11);  
	            
			    Utils.checkBetween(requestDate,fromDate, toDate);
			    assertEquals(Utils.checkBetween(requestDate,fromDate, toDate),true);
			
				assertEquals(ls.size(),Integer.parseInt(js.get("count").toString()));
				
			
			}
			
			
			
			assertEquals(ls.size(),Integer.parseInt(js.get("count").toString()));
		
		
		
	}
	
	

	@Then("^the assertion should work correctly for NEOs within \"([^\"]*)\" lunar distances on or after \"([^\"]*)\" sorted by \"([^\"]*)\"$")
	public void the_assertion_should_work_correctly_for_NEOs_within_lunar_distances_on_or_after_sorted_by(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		
		
		
		    JsonPath js= new JsonPath(stepDefination.response_);
			js.get("signature.source").equals(JsonReader.readJsonfile("TC02.json"));
			List<List<String>> ls=js.getList("data");
			
			int[] distance=new int[ls.size()];
			
			 int counter=0;
			for(List<String> obj:ls)
			{
				
			
				
				distance[counter]=Integer.parseInt(obj.get(5).substring(0,1));
				
			    assertEquals(Integer.parseInt(obj.get(5).substring(0,1))<10,true);
			
				
			counter++;
			}
			
			assertEquals(ls.size(),Integer.parseInt(js.get("count").toString()));
			Utils.isSorted(distance);
		
		
		
		
	}

	
	
	
	
	
	 }
	
	


