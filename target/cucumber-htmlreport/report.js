$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("VerifyBasket.feature");
formatter.feature({
  "line": 2,
  "name": "Basket",
  "description": "",
  "id": "basket",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Validate items added to basket",
  "description": "",
  "id": "basket;validate-items-added-to-basket",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC-100"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User opens warehouse home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on \"Shop\" menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "opens a phones page \"All pay monthly phones\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "selects a brand \"\u003cBrand\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "selects upfront cost \"\u003cUpfront Cost\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "selects monthly cost \"\u003cMonthly Cost\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "selects first phone in the search results",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "clicks on View deals",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "selects Cheapest total cost from Filter Plans",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "selects Network as \"\u003cNetwork\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "adds first plan to basket",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "adds first accessory to basket from Choose your Extras",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "clicks on Continue to bakset",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "clicks on Go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "selects \"\u003cMonthly Cap\u003e\" monthly cap",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "clicks on Continue to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "fills the details in About You section \"\u003cEmail\u003e\" \"\u003cTitle\u003e\" \"\u003cFirstName\u003e\" \"\u003cLastName\u003e\" \"\u003cContact\u003e\" \"\u003cMarital Status\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "sets pincode \"\u003cPincode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "clicks on Continue to delivery",
  "keyword": "And "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "basket;validate-items-added-to-basket;",
  "rows": [
    {
      "cells": [
        "Brand",
        "Upfront Cost",
        "Monthly Cost",
        "Network",
        "Monthly Cap",
        "Email",
        "Title",
        "FirstName",
        "LastName",
        "Contact",
        "Marital Status",
        "Pincode"
      ],
      "line": 27,
      "id": "basket;validate-items-added-to-basket;;1"
    },
    {
      "cells": [
        "Apple",
        "GBP_20",
        "GBP_100",
        "VODAFONE",
        "GBP_50",
        "abc@gmail.com",
        "Mr",
        "Dev",
        "Nadh",
        "9052557770",
        "Single",
        "500049"
      ],
      "line": 28,
      "id": "basket;validate-items-added-to-basket;;2"
    },
    {
      "cells": [
        "Samsung",
        "GBP_20",
        "GBP_50",
        "VODAFONE",
        "GBP_50",
        "abc@gmail.com",
        "Mr",
        "Dev",
        "Nadh",
        "9100826115",
        "Single",
        "500049"
      ],
      "line": 29,
      "id": "basket;validate-items-added-to-basket;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2958588178,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Validate items added to basket",
  "description": "",
  "id": "basket;validate-items-added-to-basket;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 4,
      "name": "@TC-100"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User opens warehouse home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on \"Shop\" menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "opens a phones page \"All pay monthly phones\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "selects a brand \"Apple\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "selects upfront cost \"GBP_20\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "selects monthly cost \"GBP_100\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "selects first phone in the search results",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "clicks on View deals",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "selects Cheapest total cost from Filter Plans",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "selects Network as \"VODAFONE\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "adds first plan to basket",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "adds first accessory to basket from Choose your Extras",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "clicks on Continue to bakset",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "clicks on Go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "selects \"GBP_50\" monthly cap",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "clicks on Continue to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "fills the details in About You section \"abc@gmail.com\" \"Mr\" \"Dev\" \"Nadh\" \"9052557770\" \"Single\"",
  "matchedColumns": [
    5,
    6,
    7,
    8,
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "sets pincode \"500049\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "clicks on Continue to delivery",
  "keyword": "And "
});
formatter.match({
  "location": "ValidateBasket.user_opens_warehouse_home_page()"
});
formatter.result({
  "duration": 8369289779,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shop",
      "offset": 16
    }
  ],
  "location": "ValidateBasket.user_clicks_on_menu(String)"
});
formatter.result({
  "duration": 511142197,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All pay monthly phones",
      "offset": 21
    }
  ],
  "location": "ValidateBasket.opens_a_phones_page(String)"
});
formatter.result({
  "duration": 5185914314,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple",
      "offset": 17
    }
  ],
  "location": "ValidateBasket.selects_a_brand(String)"
});
formatter.result({
  "duration": 2493331602,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GBP_20",
      "offset": 22
    }
  ],
  "location": "ValidateBasket.selects_upfront_cost(String)"
});
formatter.result({
  "duration": 290438146,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003clabel for\u003d\"sp_q_max_11_20\"\u003e...\u003c/label\u003e is not clickable at point (474, 895). Other element would receive the click: \u003cdiv class\u003d\"maskOnFinders\" style\u003d\"width: 1903px; height: 6504px; display: block;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027L37530WIN\u0027, ip: \u002710.224.125.26\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.45.615291 (ec3682e3c9061c..., userDataDir: C:\\Users\\vempc\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:62160}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 7aa331059a9915f9c693f6d3821fb5cb\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat com.cpwh.elmt.CPWHElmt.click(CPWHElmt.java:48)\r\n\tat com.cpwh.elmt.CPWHElmt.click(CPWHElmt.java:43)\r\n\tat com.cpwh.pages.filters.CommonFilters.selectUpfrontCost(CommonFilters.java:30)\r\n\tat com.cpwh.test.ValidateBasket.selects_upfront_cost(ValidateBasket.java:72)\r\n\tat ✽.And selects upfront cost \"GBP_20\"(VerifyBasket.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "GBP_100",
      "offset": 22
    }
  ],
  "location": "ValidateBasket.selects_monthly_cost(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidateBasket.selects_first_phone_in_search_results()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidateBasket.clicks_on_View_deals()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidateBasket.selects_Cheapest_total_cost_from_Filter_Plans()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "VODAFONE",
      "offset": 20
    }
  ],
  "location": "ValidateBasket.selects_Network_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidateBasket.adds_first_plan_to_basket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidateBasket.adds_first_accessory_to_basket_from_Choose_your_Extras()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidateBasket.clicks_on_Continue_to_bakset()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidateBasket.clicks_on_Go_to_checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "GBP_50",
      "offset": 9
    }
  ],
  "location": "ValidateBasket.selects_monthly_cap(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidateBasket.clicks_on_Continue_to_checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@gmail.com",
      "offset": 40
    },
    {
      "val": "Mr",
      "offset": 56
    },
    {
      "val": "Dev",
      "offset": 61
    },
    {
      "val": "Nadh",
      "offset": 67
    },
    {
      "val": "9052557770",
      "offset": 74
    },
    {
      "val": "Single",
      "offset": 87
    }
  ],
  "location": "ValidateBasket.fills_the_details_in_About_You_section(String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "500049",
      "offset": 14
    }
  ],
  "location": "ValidateBasket.sets_pincode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidateBasket.clicks_on_Continue_to_delivery()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 607369371,
  "status": "passed"
});
formatter.before({
  "duration": 2325283314,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Validate items added to basket",
  "description": "",
  "id": "basket;validate-items-added-to-basket;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 4,
      "name": "@TC-100"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User opens warehouse home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on \"Shop\" menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "opens a phones page \"All pay monthly phones\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "selects a brand \"Samsung\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "selects upfront cost \"GBP_20\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "selects monthly cost \"GBP_50\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "selects first phone in the search results",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "clicks on View deals",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "selects Cheapest total cost from Filter Plans",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "selects Network as \"VODAFONE\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "adds first plan to basket",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "adds first accessory to basket from Choose your Extras",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "clicks on Continue to bakset",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "clicks on Go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "selects \"GBP_50\" monthly cap",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "clicks on Continue to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "fills the details in About You section \"abc@gmail.com\" \"Mr\" \"Dev\" \"Nadh\" \"9100826115\" \"Single\"",
  "matchedColumns": [
    5,
    6,
    7,
    8,
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "sets pincode \"500049\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "clicks on Continue to delivery",
  "keyword": "And "
});
formatter.match({
  "location": "ValidateBasket.user_opens_warehouse_home_page()"
});
formatter.result({
  "duration": 7939747384,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shop",
      "offset": 16
    }
  ],
  "location": "ValidateBasket.user_clicks_on_menu(String)"
});
formatter.result({
  "duration": 521853717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All pay monthly phones",
      "offset": 21
    }
  ],
  "location": "ValidateBasket.opens_a_phones_page(String)"
});
formatter.result({
  "duration": 3239471182,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung",
      "offset": 17
    }
  ],
  "location": "ValidateBasket.selects_a_brand(String)"
});
formatter.result({
  "duration": 1349666398,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GBP_20",
      "offset": 22
    }
  ],
  "location": "ValidateBasket.selects_upfront_cost(String)"
});
formatter.result({
  "duration": 204128601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GBP_50",
      "offset": 22
    }
  ],
  "location": "ValidateBasket.selects_monthly_cost(String)"
});
formatter.result({
  "duration": 477563537,
  "status": "passed"
});
formatter.match({
  "location": "ValidateBasket.selects_first_phone_in_search_results()"
});
formatter.result({
  "duration": 4212292520,
  "status": "passed"
});
formatter.match({
  "location": "ValidateBasket.clicks_on_View_deals()"
});
formatter.result({
  "duration": 7544801815,
  "status": "passed"
});
formatter.match({
  "location": "ValidateBasket.selects_Cheapest_total_cost_from_Filter_Plans()"
});
formatter.result({
  "duration": 1246899192,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VODAFONE",
      "offset": 20
    }
  ],
  "location": "ValidateBasket.selects_Network_as(String)"
});
formatter.result({
  "duration": 179358235,
  "status": "passed"
});
formatter.match({
  "location": "ValidateBasket.adds_first_plan_to_basket()"
});
formatter.result({
  "duration": 5057621506,
  "status": "passed"
});
formatter.match({
  "location": "ValidateBasket.adds_first_accessory_to_basket_from_Choose_your_Extras()"
});
formatter.result({
  "duration": 192964158,
  "status": "passed"
});
formatter.match({
  "location": "ValidateBasket.clicks_on_Continue_to_bakset()"
});
formatter.result({
  "duration": 5584442059,
  "status": "passed"
});
formatter.match({
  "location": "ValidateBasket.clicks_on_Go_to_checkout()"
});
formatter.result({
  "duration": 164348324,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GBP_50",
      "offset": 9
    }
  ],
  "location": "ValidateBasket.selects_monthly_cap(String)"
});
formatter.result({
  "duration": 148249136,
  "status": "passed"
});
formatter.match({
  "location": "ValidateBasket.clicks_on_Continue_to_checkout()"
});
formatter.result({
  "duration": 9371302040,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@gmail.com",
      "offset": 40
    },
    {
      "val": "Mr",
      "offset": 56
    },
    {
      "val": "Dev",
      "offset": 61
    },
    {
      "val": "Nadh",
      "offset": 67
    },
    {
      "val": "9100826115",
      "offset": 74
    },
    {
      "val": "Single",
      "offset": 87
    }
  ],
  "location": "ValidateBasket.fills_the_details_in_About_You_section(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1344894661,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500049",
      "offset": 14
    }
  ],
  "location": "ValidateBasket.sets_pincode(String)"
});
formatter.result({
  "duration": 182113699,
  "status": "passed"
});
formatter.match({
  "location": "ValidateBasket.clicks_on_Continue_to_delivery()"
});
formatter.result({
  "duration": 317544603,
  "status": "passed"
});
formatter.after({
  "duration": 38291,
  "status": "passed"
});
});