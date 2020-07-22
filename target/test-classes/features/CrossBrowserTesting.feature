#Author: your.email@your.domain.com
Feature: Cross Browser Testing for HRMS Login
  I want to use this template for my CrossBrowser Testing
  @CB23
  Scenario Outline: HRMS Login Test Cross Browser
    Given User Opens HRMS in Different "<Browser>"
    When user enters valid Admin1 Credentials and click login Button
    Then User Verifies log in Successful1
    Examples: 
      | Browser |
      | chrome  |
      | firefox |
      #| edge    |
      #| ie      |


