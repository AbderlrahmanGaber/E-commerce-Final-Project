@smoke

  Feature: Register: user could register with new account

    Scenario: guest user could register with valid data successfully
      Given user go to register page
      When user select Gender type
      And User Enter First name
      And user enter last name
      And user enter date of birth
      And user enter Email
      And User fill password fields
      And user click on Register Button
      Then register success message displayed


