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
  "duration": 64245221293,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Sliding of slider",
  "description": "",
  "id": "control;sliding-of-slider",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on controls page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user slided the customized slider to 100%",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "slider value should changed to 100%",
  "keyword": "Then "
});
formatter.match({
  "location": "ControlsStepDefs.user_is_on_controls_page()"
});
formatter.result({
  "duration": 3396257362,
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
  "duration": 3876898888,
  "status": "passed"
});
formatter.match({
  "location": "ControlsStepDefs.slider_value_should_changed_to()"
});
formatter.result({
  "duration": 2319152157,
  "status": "passed"
});
formatter.after({
  "duration": 15181983910,
  "status": "passed"
});
});