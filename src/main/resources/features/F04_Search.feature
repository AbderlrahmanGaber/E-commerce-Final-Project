@smoke
  Feature: user can search in the Website successfully
    Background:user login successfully with valid email and password

    Scenario Outline: user enter different variables in the search field to search for
      Given user go to login page
      When user login with Valid userName and Password
      And user click on login button
      Then user could search using product name "<ProductName>"
      Examples:
      | ProductName |
      | book      |
      | laptop    |
      | nike      |

    Scenario Outline: user enter different variables in the search field to search for
      Given user go to login page
      When user login with Valid userName and Password
      And user click on login button
      Then user could search for product using sku "<sku>"
      Examples:
        | sku |
        | SCI_FAITH  |
        | APPLE_CAM  |
        | SF_PRO_11  |



