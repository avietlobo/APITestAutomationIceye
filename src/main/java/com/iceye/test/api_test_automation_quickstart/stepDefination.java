package com.iceye.test.api_test_automation_quickstart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import com.iceye.utils.propertyFileReader;



public class stepDefination {
	
	
	RequestSpecification httpRequest; 
	
	String baseUri;
	//String response;
	Response response;
	
	public static String response_;
	
	@Given("^I request close approach data as an Iceye user$")
	public void i_request_close_approach_data_as_an_Iceye_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   RestAssured.baseURI=propertyFileReader.readPropertiesFile().getProperty("baseURI");
	   httpRequest = RestAssured.given().log().all();
	}

	@Given("^request for all close-approach data for \"([^\"]*)\" Eros within \"([^\"]*)\" between \"([^\"]*)\" and \"([^\"]*)\"$")
	public void request_for_all_close_approach_data_for_Eros_within_between_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Map<String, String> params = new HashMap();
		params.put("des", arg1);
		params.put("date-min", arg3);
		params.put("date-max", arg4);
		params.put("dist-max", arg2);
		
		response=httpRequest.formParams(params).get().then().log().all().extract().response();
		response_=response.asString();
	}

	@Then("^the API call got success with status code (\\d+)$")
	public void the_API_call_got_success_with_status_code(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		assertEquals(response.getStatusCode(),200);

	}

	@Then("^\"([^\"]*)\" in response body is \"([^\"]*)\"$")
	public void in_response_body_is(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   assertTrue(response.getStatusLine().contains(arg2));



	}
	

	
	@Given("^request for Earth close-approach data for NEOs within \"([^\"]*)\" lunar distances on or after \"([^\"]*)\" sorted by \"([^\"]*)\"$")
	public void request_for_Earth_close_approach_data_for_NEOs_within_lunar_distances_on_or_after_sorted_by(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		Map<String, String> params = new HashMap();
		params.put("dist-max", arg1);
		params.put("date-min", arg2);
		params.put("sort", arg3);
	
		
		response=httpRequest.formParams(params).get().then().log().all().extract().response();
		response_=response.asString();
	}


	

}
