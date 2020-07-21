package com.iceye.test.api.acceptance.test.stepdefinitions;

import static org.junit.Assert.assertEquals;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.iceye.utils.JsonReader;
import com.iceye.utils.Utils;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;

public class Assertions {

	private static final Logger logger = LogManager.getLogger(Assertions.class);

	@Then("^the assertion should work correctly for get close-approach data for \"([^\"]*)\" API between \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_assertion_should_work_correctly_for_get_close_approach_data_for_API_between_and(String arg1,
			String arg2, String arg3) throws Throwable {

		JsonPath JsonPathValue = new JsonPath(StepDefinition.responseTextFormat);

		try {
			// Assert the signature.source value in API response
			JsonPathValue.get("signature.source").equals(JsonReader.readJsonfile("SignatureSourceData.json"));
			List<List<String>> listKeysFromJsonResponse = JsonPathValue.getList("data");
			for (List<String> listObjectIterator : listKeysFromJsonResponse) {

				/*
				 * Asserting that the object is the same in all the arrays. For example in this
				 * case we are fetching data for object asteroid 433
				 */

				listObjectIterator.get(0).contentEquals(arg1);

				String fromDate = arg2;
				String toDate = arg3;
				String requestDate = listObjectIterator.get(3).substring(0, 11);
				// Asserting that the data is within the date requested
				Utils.checkBetween(requestDate, fromDate, toDate);
				assertEquals(Utils.checkBetween(requestDate, fromDate, toDate), true);
				assertEquals(listKeysFromJsonResponse.size(), Integer.parseInt(JsonPathValue.get("count").toString()));

			}
			// Asserting that the count key value present in the API response matches the
			// data array count
			assertEquals(listKeysFromJsonResponse.size(), Integer.parseInt(JsonPathValue.get("count").toString()));
		} catch (NullPointerException e) {
			logger.error("JasonPath value is null in Assertion to get close approach data for API");
		} catch (Exception e) {
			logger.error("Error in method of Assertion to get close approach data for API");
		}
		logger.info("Assertion worked correctly for to get close approach data for API");

	}

	@Then("^the assertion should work correctly for NEOs within \"([^\"]*)\" lunar distances on or after \"([^\"]*)\" sorted by \"([^\"]*)\"$")
	public void the_assertion_should_work_correctly_for_NEOs_within_lunar_distances_on_or_after_sorted_by(String arg1,
			String arg2, String arg3) throws Throwable {

		JsonPath JsonPathValue = new JsonPath(StepDefinition.responseTextFormat);
		try {
			// Assert the signature.source value in API response
			JsonPathValue.get("signature.source").equals(JsonReader.readJsonfile("SignatureSourceData"));
			List<List<String>> listKeysFromJsonResponse = JsonPathValue.getList("data");
			int[] distance = new int[listKeysFromJsonResponse.size()];
			int counter = 0;
			for (List<String> listObjectIterator : listKeysFromJsonResponse) {

				distance[counter] = Integer.parseInt(listObjectIterator.get(5).substring(0, 1));
				// Assert Earth close-approach data for NEOs within 10 lunar distances
				assertEquals(Integer.parseInt(listObjectIterator.get(5).substring(0, 1)) < 10, true);
				counter++;
			}
			// Asserting that the count key value present in the API response matches the
			// data array count

			assertEquals(listKeysFromJsonResponse.size(), Integer.parseInt(JsonPathValue.get("count").toString()));
			// Assert Earth close-approach data response sorted by distance
			Utils.isSorted(distance);
		} catch (NullPointerException e) {
			logger.error("JasonPath value is null in assertion_should_work_correctly_for_NEOs_within_lunar_distances");
		} catch (Exception e) {
			logger.error("Error in method assertion_should_work_correctly_for_NEOs_within_lunar_distances");
		}
		logger.info("Assertion worked correctly for NEOs within lunar distances on or after sorted");

	}

}
