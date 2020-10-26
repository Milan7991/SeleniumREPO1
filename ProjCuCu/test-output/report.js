$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/New Ecl/ProjCuCu/src/main/java/feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the login page is",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter username and password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_on_login_page()"
});
formatter.result({
  "duration": 11254616549,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.title_login()"
});
formatter.result({
  "duration": 17743906,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_enter_username_and_password()"
});
formatter.result({
  "duration": 681124622,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 52946028,
  "status": "passed"
});
});