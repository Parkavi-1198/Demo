$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Validating facebook page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch Facebook on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.launch_facebook_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Facebook Title validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User print page title",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_print_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});