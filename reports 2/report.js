$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("controls.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: ishan.s@outlook.com"
    },
    {
      "line": 2,
      "value": "#Created on: Jan 18, 2017"
    }
  ],
  "line": 4,
  "name": "Control",
  "description": "",
  "id": "control",
  "keyword": "Feature"
});
formatter.before({
  "duration": 64855451869,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Sliding of slider",
  "description": "",
  "id": "control;sliding-of-slider",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@ss"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on controls page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user slided the customized slider to 100%",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "slider value should changed to 100%",
  "keyword": "Then "
});
formatter.match({
  "location": "ControlsStepDefs.user_is_on_controls_page()"
});
formatter.result({
  "duration": 3218052943,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 37
    }
  ],
  "location": "ControlsStepDefs.user_slided_the_customized_slider_to(int)"
});
formatter.result({
  "duration": 4303268995,
  "status": "passed"
});
formatter.match({
  "location": "ControlsStepDefs.slider_value_should_changed_to()"
});
formatter.result({
  "duration": 2105973061,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
