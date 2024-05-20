Feature: Launch and Login page of CRM Wiki page

  @test
  Scenario: Test and validate the launch and login page of wiki page
    Given Launch the wiki page
    And click on the login button
    Then enter the username and passowrd of the login page and click on submit
    And validate the login page