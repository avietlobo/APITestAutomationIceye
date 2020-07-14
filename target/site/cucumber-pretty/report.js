$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/SBDBCloseApproachDataAPI.feature");
formatter.feature({
  "line": 1,
  "name": "SBDB Close-Approach Data API Module",
  "description": "",
  "id": "sbdb-close-approach-data-api-module",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Get all close-approach data for Asteroid TC01",
  "description": "",
  "id": "sbdb-close-approach-data-api-module;get-all-close-approach-data-for-asteroid-tc01",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I request close approach data as an Iceye user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "request for all close-approach data for \"\u003cobject\u003e\" Eros within \"\u003cdist\u003e\" between \"\u003cdate-min\u003e\" and \"\u003cdate-max\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the assertion should work correctly for get close-approach data for \"\u003cobject\u003e\" API between \"\u003cdate-min\u003e\" and \"\u003cdate-max\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "sbdb-close-approach-data-api-module;get-all-close-approach-data-for-asteroid-tc01;",
  "rows": [
    {
      "cells": [
        "object",
        "dist",
        "date-min",
        "date-max"
      ],
      "line": 12,
      "id": "sbdb-close-approach-data-api-module;get-all-close-approach-data-for-asteroid-tc01;;1"
    },
    {
      "cells": [
        "433",
        "0.2",
        "1900-01-01",
        "2100-01-01"
      ],
      "line": 13,
      "id": "sbdb-close-approach-data-api-module;get-all-close-approach-data-for-asteroid-tc01;;2"
    },
    {
      "cells": [
        "2000 SG344",
        "0.2",
        "1900-01-01",
        "2100-01-01"
      ],
      "line": 14,
      "id": "sbdb-close-approach-data-api-module;get-all-close-approach-data-for-asteroid-tc01;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Get all close-approach data for Asteroid TC01",
  "description": "",
  "id": "sbdb-close-approach-data-api-module;get-all-close-approach-data-for-asteroid-tc01;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I request close approach data as an Iceye user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "request for all close-approach data for \"433\" Eros within \"0.2\" between \"1900-01-01\" and \"2100-01-01\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the assertion should work correctly for get close-approach data for \"433\" API between \"1900-01-01\" and \"2100-01-01\"",
  "matchedColumns": [
    0,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.i_request_close_approach_data_as_an_Iceye_user()"
});
formatter.result({
  "duration": 733846600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "433",
      "offset": 41
    },
    {
      "val": "0.2",
      "offset": 59
    },
    {
      "val": "1900-01-01",
      "offset": 73
    },
    {
      "val": "2100-01-01",
      "offset": 90
    }
  ],
  "location": "stepDefination.request_for_all_close_approach_data_for_Eros_within_between_and(String,String,String,String)"
});
formatter.result({
  "duration": 3430683300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 42
    }
  ],
  "location": "stepDefination.the_API_call_got_success_with_status_code(int)"
});
formatter.result({
  "duration": 3036800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "status",
      "offset": 1
    },
    {
      "val": "OK",
      "offset": 30
    }
  ],
  "location": "stepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "duration": 113600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "433",
      "offset": 69
    },
    {
      "val": "1900-01-01",
      "offset": 87
    },
    {
      "val": "2100-01-01",
      "offset": 104
    }
  ],
  "location": "Assertions.the_assertion_should_work_correctly_for_get_close_approach_data_for_API_between_and(String,String,String)"
});
formatter.result({
  "duration": 683185000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Get all close-approach data for Asteroid TC01",
  "description": "",
  "id": "sbdb-close-approach-data-api-module;get-all-close-approach-data-for-asteroid-tc01;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I request close approach data as an Iceye user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "request for all close-approach data for \"2000 SG344\" Eros within \"0.2\" between \"1900-01-01\" and \"2100-01-01\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the assertion should work correctly for get close-approach data for \"2000 SG344\" API between \"1900-01-01\" and \"2100-01-01\"",
  "matchedColumns": [
    0,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.i_request_close_approach_data_as_an_Iceye_user()"
});
formatter.result({
  "duration": 1822800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000 SG344",
      "offset": 41
    },
    {
      "val": "0.2",
      "offset": 66
    },
    {
      "val": "1900-01-01",
      "offset": 80
    },
    {
      "val": "2100-01-01",
      "offset": 97
    }
  ],
  "location": "stepDefination.request_for_all_close_approach_data_for_Eros_within_between_and(String,String,String,String)"
});
formatter.result({
  "duration": 1409367900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 42
    }
  ],
  "location": "stepDefination.the_API_call_got_success_with_status_code(int)"
});
formatter.result({
  "duration": 109700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "status",
      "offset": 1
    },
    {
      "val": "OK",
      "offset": 30
    }
  ],
  "location": "stepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "duration": 60300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000 SG344",
      "offset": 69
    },
    {
      "val": "1900-01-01",
      "offset": 94
    },
    {
      "val": "2100-01-01",
      "offset": 111
    }
  ],
  "location": "Assertions.the_assertion_should_work_correctly_for_get_close_approach_data_for_API_between_and(String,String,String)"
});
formatter.result({
  "duration": 183279000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Get Earth close-approach data for NEOs within a lunar distance TC02",
  "description": "",
  "id": "sbdb-close-approach-data-api-module;get-earth-close-approach-data-for-neos-within-a-lunar-distance-tc02",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "I request close approach data as an Iceye user",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "request for Earth close-approach data for NEOs within \"\u003cdist-max\u003e\" lunar distances on or after \"\u003cdate\u003e\" sorted by \"\u003cfilter\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "the assertion should work correctly for NEOs within \"\u003cdist-max\u003e\" lunar distances on or after \"\u003cdate\u003e\" sorted by \"\u003cfilter\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "sbdb-close-approach-data-api-module;get-earth-close-approach-data-for-neos-within-a-lunar-distance-tc02;",
  "rows": [
    {
      "cells": [
        "dist-max",
        "date",
        "filter"
      ],
      "line": 26,
      "id": "sbdb-close-approach-data-api-module;get-earth-close-approach-data-for-neos-within-a-lunar-distance-tc02;;1"
    },
    {
      "cells": [
        "10LD",
        "2018-01-01",
        "dist"
      ],
      "line": 27,
      "id": "sbdb-close-approach-data-api-module;get-earth-close-approach-data-for-neos-within-a-lunar-distance-tc02;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 27,
  "name": "Get Earth close-approach data for NEOs within a lunar distance TC02",
  "description": "",
  "id": "sbdb-close-approach-data-api-module;get-earth-close-approach-data-for-neos-within-a-lunar-distance-tc02;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "I request close approach data as an Iceye user",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "request for Earth close-approach data for NEOs within \"10LD\" lunar distances on or after \"2018-01-01\" sorted by \"dist\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "the assertion should work correctly for NEOs within \"10LD\" lunar distances on or after \"2018-01-01\" sorted by \"dist\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.i_request_close_approach_data_as_an_Iceye_user()"
});
formatter.result({
  "duration": 924100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10LD",
      "offset": 55
    },
    {
      "val": "2018-01-01",
      "offset": 90
    },
    {
      "val": "dist",
      "offset": 113
    }
  ],
  "location": "stepDefination.request_for_Earth_close_approach_data_for_NEOs_within_lunar_distances_on_or_after_sorted_by(String,String,String)"
});
formatter.result({
  "duration": 4064942400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 42
    }
  ],
  "location": "stepDefination.the_API_call_got_success_with_status_code(int)"
});
formatter.result({
  "duration": 151500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "status",
      "offset": 1
    },
    {
      "val": "OK",
      "offset": 30
    }
  ],
  "location": "stepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "duration": 73300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10LD",
      "offset": 53
    },
    {
      "val": "2018-01-01",
      "offset": 88
    },
    {
      "val": "dist",
      "offset": 111
    }
  ],
  "location": "Assertions.the_assertion_should_work_correctly_for_NEOs_within_lunar_distances_on_or_after_sorted_by(String,String,String)"
});
formatter.result({
  "duration": 139968600,
  "status": "passed"
});
});