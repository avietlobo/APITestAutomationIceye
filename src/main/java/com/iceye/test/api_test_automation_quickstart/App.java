package com.iceye.test.api_test_automation_quickstart;

import java.util.stream.Stream;


/**
 * Hello world!
 *
 */
public class App 
{
	 private static String[] defaultOptions = {
	            "--glue", "com.iceye.test.api.acceptance.test.stepdefinitions",
	            "--plugin", "pretty",
	            "--plugin", "html:target/cucumber.html",
	            "--features", "src/test/resources/Features"
	    };
	 
	    public static void main(String[] args) {
	        Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
	        try {
				cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
}

