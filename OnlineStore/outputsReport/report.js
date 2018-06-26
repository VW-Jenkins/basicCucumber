$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Hooks.feature");
formatter.feature({
  "line": 2,
  "name": "Test Hooks",
  "description": "",
  "id": "test-hooks",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Hooks"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "This scenario is to test hooks functionality",
  "description": "",
  "id": "test-hooks;this-scenario-is-to-test-hooks-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "This is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "This is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "This is the third step",
  "keyword": "Then "
});
formatter.match({
  "location": "Hooks_Steps.this_is_the_first_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Hooks_Steps.this_is_the_second_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Hooks_Steps.this_is_the_third_step()"
});
formatter.result({
  "status": "skipped"
});
});