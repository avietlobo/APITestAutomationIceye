package com.iceye.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.ArrayUtils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Utils {

	
	public static String getJsonPath(Response response, String key) {
		String resp = response.asString();
		JsonPath js = new JsonPath(resp);
		return js.get(key).toString();
	}

	public static boolean checkBetween(String dateToCheck, String startDate, String endDate) {
		boolean res = false;
		SimpleDateFormat fmt1 = new SimpleDateFormat("yyyy-MM-dd"); 
		SimpleDateFormat fmt2 = new SimpleDateFormat("yyyy-MMM-dd"); 
		try {
			Date requestDate = fmt2.parse(dateToCheck);
			Date fromDate = fmt1.parse(startDate);
			Date toDate = fmt1.parse(endDate);
			res = requestDate.compareTo(fromDate) >= 0 && requestDate.compareTo(toDate) <= 0;
		} catch (ParseException pex) {
			pex.printStackTrace();
		}
		return res;
	}

	public static boolean isSorted(int[] a) {
		
		return ArrayUtils.isSorted(a);
	}

}
