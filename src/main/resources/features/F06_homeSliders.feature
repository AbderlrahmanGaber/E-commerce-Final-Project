@smoke
  Feature: selecting fom HomeSlider
    Background: user should Login with valid email and password

    Scenario: user select from the HomeSlider Nokia
        Given user go to login page
        When user login with Valid userName and Password
        And user click on login button
        Then click on the HomeSlider Nokia

    Scenario: user select from the HomeSlider IPhone
        Given user go to login page
        When user login with Valid userName and Password
        And user click on login button
        Then click on the HomeSlider Iphone