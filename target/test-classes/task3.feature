@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: user verifies the Cutomer ID
    Given User should be in the home page and click the add customer
    When user should enter the details and click submit button
      | firtname    | lastname    | Email                  | address     | mobileno   |
      | Gunasekaran | Govindasamy | gunaanjali03@gmail.com | Krishnagiri | 9159491573 |
      | Gokulnath   | mahendiran  | gokulnath12@gmail.com  | Dharmapuri  | 9688461354 |
    Then User should verifies  customer ID
