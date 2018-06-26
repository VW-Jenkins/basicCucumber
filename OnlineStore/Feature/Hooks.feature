@Hooks
Feature: Test Hooks

Scenario: This scenario is to test hooks functionality
	Given This is the first step
	When This is the second step
	Then This is the third step
	
Scenario Outline: This second scenario is to test hooks functionality
	Given This is the first step
	When This is the second step
	Then This is the third step
Examples:
|Scenarios|
|First|
|Sceond|