@smoke
  Feature: user can hover on main Categories and select  sub-categories
    Background: user should login with valid username and password
       Scenario: user hover on a category then select a sub-category
         Given user go to login page
         When user login with Valid userName and Password
         And user click on login button
         And Hover on a Category
         Then Select a Sub-Category