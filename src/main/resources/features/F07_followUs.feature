@smoke

Feature: follow us feature
  Background: user should Login with valid email and password

 Scenario: user opens facebook link
    Given user go to login page
    When user login with Valid userName and Password
    And user click on login button
    Then click on FacebookLink

  Scenario: user opens twitter link
    Given user go to login page
    When user login with Valid userName and Password
    And user click on login button
    Then click on TwitterLink

  Scenario:  user opens rss link
    Given user go to login page
    When user login with Valid userName and Password
    And user click on login button
    Then click on RssLink

  Scenario: user opens youtube link
    Given user go to login page
    When user login with Valid userName and Password
    And user click on login button
    Then click on YoutubeLink
