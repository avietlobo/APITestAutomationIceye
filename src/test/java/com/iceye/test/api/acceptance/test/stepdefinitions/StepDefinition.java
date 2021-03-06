package com.iceye.test.api.acceptance.test.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.iceye.utils.PropertyFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefinition {

	private RequestSpecification httpRequest;
	private Response response;
	public static String responseTextFormat;
	private static final Logger logger = LogManager.getLogger(StepDefinition.class);

	@Given("^I request close approach data as an Iceye user$")
	public void i_request_close_approach_data_as_an_Iceye_user() {
		try {
			RestAssured.baseURI = PropertyFileReader.readPropertiesFile().getProperty("baseURI");
			httpRequest = RestAssured.given().log().all();
		}

		catch (Exception e) {
			logger.error("Exception occured in the_API_call_got_success_with_status_code");
		}
	}

	@Given("^request for all close-approach data for \"([^\"]*)\" Eros within \"([^\"]*)\" between \"([^\"]*)\" and \"([^\"]*)\"$")
	public void request_for_all_close_approach_data_for_Eros_within_between_and(String arg1, String arg2, String arg3,
			String arg4) throws Throwable {
		// This block is responsible to build the request and fetch the API response
		Map<String, String> queryParameter = new HashMap();
		queryParameter.put("des", arg1);
		queryParameter.put("date-min", arg3);
		queryParameter.put("date-max", arg4);
		queryParameter.put("dist-max", arg2);
		try {
			response = httpRequest.formParams(queryParameter).get().then().log().all().extract().response();
			responseTextFormat = response.asString();
		} catch (NullPointerException e) {
			logger.error("Recevied null response for method for all close-approach data for Eros");
		} catch (Exception e) {
			logger.error("Exception occured in method for all close-approach data for Eros");
		}
		logger.info(
				"Reponse received from http request send for all close-approach data for \\\"([^\\\"]*)\\\" Eros within \\\"([^\\\"]*)\\\" between \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\"$");

	}

	@Then("^the API call got success with status code (\\d+)$")
	public void the_API_call_got_success_with_status_code(int arg1) {

		try {
			assertEquals(response.getStatusCode(), 200);
		} catch (NullPointerException e) {
			logger.error("Recevied null response in method the_API_call_got_success_with_status_code");
		}

		catch (Exception e) {
			logger.error("Exception occured in method the_API_call_got_success_with_status_code");
		}

	}

	@Then("^\"([^\"]*)\" in response body is \"([^\"]*)\"$")
	public void in_response_body_is(String arg1, String arg2) throws Throwable {
		try {
			assertTrue(response.getStatusLine().contains(arg2));
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception occured");
		}
	}

	@Given("^request for Earth close-approach data for NEOs within \"([^\"]*)\" lunar distances on or after \"([^\"]*)\" sorted by \"([^\"]*)\"$")
	public void request_for_Earth_close_approach_data_for_NEOs_within_lunar_distances_on_or_after_sorted_by(String arg1,
			String arg2, String arg3) throws Throwable {
		// This block is responsible to build the request and fetch the API response
		Map<String, String> queryParameter = new HashMap();
		queryParameter.put("dist-max", arg1);
		queryParameter.put("date-min", arg2);
		queryParameter.put("sort", arg3);
		try {
			response = httpRequest.formParams(queryParameter).get().then().log().all().extract().response();
			responseTextFormat = response.asString();
		} catch (NullPointerException e) {
			logger.error("Recevied null response for Earth close-approach data for NEOs");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception occured");
		}
		logger.info(
				"Reponse received from http request send for Earth close-approach data for NEOs within \\\"([^\\\"]*)\\\" lunar distances on or after \\\"([^\\\"]*)\\\" sorted by");

	}

}
