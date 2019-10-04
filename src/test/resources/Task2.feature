
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: verifies the Cutomer ID
    
    Given User should be in home page and click the add customer 
    When user should enter the details and click submit 
		|firtname|Gunasekaran|
		|lastname|Govindasamy|
		|Email|gunaanjali03@gmail.com|
		|address|Krishnagiri|
		|mobileno|9159491573|
    Then User should verify  customer ID
