@FunctionalTest
Feature: ECommerce Application

@SmokeTest @RegressionTest
Scenario: Successful Login
Given This is a blank test

@RegressionTest
Scenario: unSuccessful Login
Given This is a blank test

@SmokeTest
Scenario: Add a product to bag
Given This is a blank test

Scenario: Add multiple product to bag
Given This is a blank test

@SmokeTest @RegreessionTest
Scenario: Remove a product from bag
Given This is a blank test

@RegressionTest
Scenario: Remove all products from bag
Given This is a blank test

@SmokeTest
Scenario: Increase product quanlity from bag page
Given This is a blank test

Scenario: Decrease product quanlity from bag pag
Given This is a blank test

@SmokeTest @End2End
Scenario: Buy a product with cash payment
Given This is a blank test

@SmokeTest @End2End
Scenario: Buy a product with CC payment
Given This is a blank test

@End2End
Scenario Outline:Payment declined
Given This is a blank test
Examples:
|PaymentMethod|
|CC Card|
|DD Card|
|Bank Transfer|
|PayPal|
|Cash|
