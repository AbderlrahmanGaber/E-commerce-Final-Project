@smoke

 Feature: Login: users could use their accounts to login successfully

    Scenario: user enter valid email and password
      Given user go to login page
      When user login with Valid userName and Password
      And user click on login button
      Then user login to the system successfully

  Scenario: user enter InValid email and password

    Given  user go to login page
    When user login with InValid userName and Password
    And user click on login button
    Then user could not login to the system

