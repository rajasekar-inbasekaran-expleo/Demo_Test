
Feature: Title of your feature


  
  Scenario Outline: 
    Given user launch The mobile Application
    When user Enter The "<Username>" in Username Filed
    Then user Enter The "<Password>" in Password Field
    And  user click the mobilelogin button
    

    Examples: 
      | Username        | Password        |
      |       jjjj      |     ll            |
      | rajasekar.inbasekaran@expleogroup.com     |     Raje@123    |
      
