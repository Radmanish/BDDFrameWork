$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/DesktopFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Desktop Page Features",
  "description": "",
  "id": "desktop-page-features",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3369428400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User add a review to Canon EOS 5D item in Desktops tab",
  "description": "",
  "id": "desktop-page-features;user-add-a-review-to-canon-eos-5d-item-in-desktops-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@DesktopTesting"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on Show all desktops",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on Canon EOS 5D item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on write a review link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user fill the review information with below information",
  "rows": [
    {
      "cells": [
        "yourname",
        "yourReview",
        "Rating"
      ],
      "line": 15
    },
    {
      "cells": [
        "Alex",
        "VerygoodVerygoodVerygoodVerygoodVerygood",
        "Good"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 2597020600,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepDefenition.user_click_on_Desktops_tab()"
});
formatter.result({
  "duration": 63128900,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepDefenition.user_click_on_Show_all_desktops()"
});
formatter.result({
  "duration": 580030800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 24
    }
  ],
  "location": "DesktopStepDefenition.user_click_on_Canon_EOS_D_item(int)"
});
formatter.result({
  "duration": 4652403400,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepDefenition.user_click_on_write_a_review_link()"
});
formatter.result({
  "duration": 75317300,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepDefenition.user_fill_the_review_information_with_below_information(DataTable)"
});
formatter.result({
  "duration": 373686200,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepDefenition.user_click_on_Continue_Button()"
});
formatter.result({
  "duration": 71588300,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepDefenition.user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval()"
});
formatter.result({
  "duration": 456671000,
  "status": "passed"
});
formatter.after({
  "duration": 882447500,
  "status": "passed"
});
});