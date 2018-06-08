Feature: Olx facebook login feature
  As a  Customer I want to be able to login to olx site successfully

  Scenario: olx login to facebook
    Given Customer is on the Olx site main page
    When Customer want to log in Olx site by using 'My Profile' link
    Then Customer has been redirected to Login Page
    And He is able lo log to Olx by using correct credentials