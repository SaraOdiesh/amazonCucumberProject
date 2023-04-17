#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@homepage
Feature: Search for coffee mug in Home & Kitchen department on Amazon

Scenario: Search for coffee mug in Home & Kitchen department
  Given I am on the Amazon home page
  When I verify that I am on the Amazon home page
  And the default dropdown value is "All Departments"
  When I select Home & Kitchen" department from the dropdown
  And search for "coffee mug"
  Then I verify that I am on the coffee mug search results page
  And verify that I am in the "Home & Kitchen" department
  
  

  