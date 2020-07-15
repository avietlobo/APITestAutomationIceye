Feature: SBDB Close-Approach Data API Module

Scenario Outline: Get all close-approach data for Asteroid TC01

Given I request close approach data as an Iceye user
And request for all close-approach data for "<object>" Eros within "<dist>" between "<date-min>" and "<date-max>"
Then the API call got success with status code 200
And "status" in response body is "OK"
Then the assertion should work correctly for get close-approach data for "<object>" API between "<date-min>" and "<date-max>"

Examples:
|object| dist |date-min  |  date-max  |
|433 |  0.2 |1900-01-01| 2100-01-01 |
|2000 SG344 |  0.2 |1900-01-01| 2100-01-01 |


Scenario Outline: Get Earth close-approach data for NEOs within a lunar distance TC02

Given I request close approach data as an Iceye user
And request for Earth close-approach data for NEOs within "<dist-max>" lunar distances on or after "<date>" sorted by "<filter>"
Then the API call got success with status code 200
And "status" in response body is "OK"
Then the assertion should work correctly for NEOs within "<dist-max>" lunar distances on or after "<date>" sorted by "<filter>"

Examples:
|dist-max | date      |filter | 
|10LD    |  2018-01-01 |dist   |





