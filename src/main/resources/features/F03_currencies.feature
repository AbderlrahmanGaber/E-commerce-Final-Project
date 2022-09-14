@smoke

  Feature: user can select currency and applied to products successfully
    Background:user login successfully with valid email and password
      Scenario: user select currency successfully
        Given user go to login page
        When user login with Valid userName and Password
        And user click on login button
        Then Select euro currency