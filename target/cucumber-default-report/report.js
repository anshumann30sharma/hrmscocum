$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/lastnameValidation.feature");
formatter.feature({
  "name": "Last Name validation against DB",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Last Name validation against DB",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dbTest1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to employee list page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_navigate_to_employee_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid employee id \"14688\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_enters_valid_employee_id(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify table is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.verify_table_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get last name from table",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeLastNameValidation.get_last_name_from_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get last name from db",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.DBSteps.get_last_from_db()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate last name from ui against db",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeLastNameValidation.validate_last_name_from_ui_against_db()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});