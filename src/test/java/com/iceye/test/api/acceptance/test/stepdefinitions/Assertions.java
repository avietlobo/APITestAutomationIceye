package com.iceye.test.api.acceptance.test.stepdefinitions;

import static org.junit.Assert.assertEquals;
import java.util.List;
import com.iceye.utils.JsonReader;
import com.iceye.utils.Utils;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;

public class Assertions {

	@Then("^the assertion should work correctly for get close-approach data for \"([^\"]*)\" API between \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_assertion_should_work_correctly_for_get_close_approach_data_for_API_between_and(String arg1,
			String arg2, String arg3) throws Throwable {

		JsonPath JsonPathValue = new JsonPath(StepDefinition.responseTextFormat);

		JsonPathValue.get("signature.source").equals(JsonReader.readJsonfile("SignatureSourceData.json"));
		List<List<String>> listKeysFromJsonResponse = JsonPathValue.getList("data");
		for (List<String> listObjectIterator : listKeysFromJsonResponse) {
			listObjectIterator.get(0).contentEquals(arg1);

			String fromDate = arg2;
			String toDate = arg3;
			String requestDate = listObjectIterator.get(3).substring(0, 11);

			Utils.checkBetween(requestDate, fromDate, toDate);
			assertEquals(Utils.checkBetween(requestDate, fromDate, toDate), true);
			assertEquals(listKeysFromJsonResponse.size(), Integer.parseInt(JsonPathValue.get("count").toString()));

		}

		assertEquals(listKeysFromJsonResponse.size(), Integer.parseInt(JsonPathValue.get("count").toString()));

	}

	@Then("^the assertion should work correctly for NEOs within \"([^\"]*)\" lunar distances on or after \"([^\"]*)\" sorted by \"([^\"]*)\"$")
	public void the_assertion_should_work_correctly_for_NEOs_within_lunar_distances_on_or_after_sorted_by(String arg1,
			String arg2, String arg3) throws Throwable {

		JsonPath JsonPathValue = new JsonPath(StepDefinition.responseTextFormat);
		JsonPathValue.get("signature.source").equals(JsonReader.readJsonfile("SignatureSourceData"));
		List<List<String>> listKeysFromJsonResponse = JsonPathValue.getList("data");
		int[] distance = new int[listKeysFromJsonResponse.size()];
		int counter = 0;
		for (List<String> listObjectIterator : listKeysFromJsonResponse) {

			distance[counter] = Integer.parseInt(listObjectIterator.get(5).substring(0, 1));
			assertEquals(Integer.parseInt(listObjectIterator.get(5).substring(0, 1)) < 10, true);
			counter++;
		}

		assertEquals(listKeysFromJsonResponse.size(), Integer.parseInt(JsonPathValue.get("count").toString()));
		Utils.isSorted(distance);

	}

}
