@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: verify the Cutomer ID
    
    Given User should b in home page and click the add customer 
    When user should enters the details and click submit 
      | Gunasekaran | Govindasamy | gunaanjali03@gmail.com | krishnagiri | 9159491573 |
      | Gokulnath   | Mahendiran  | gokulnath23@gmail.com  | Dharmapurui | 9688461354 |
    Then User verify  customer ID
