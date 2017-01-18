#Author: ishan.s@outlook.com
#Created on: Jan 18, 2017

Feature: Control

  Scenario: Sliding of slider
    Given user is on controls page
    When user slided the customized slider to 100%
    Then slider value should changed to 100%
