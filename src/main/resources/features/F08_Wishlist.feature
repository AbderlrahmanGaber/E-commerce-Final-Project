@smoke
  Feature: Wishlist Feature to add items to wishlist
    Background: uset should login with vaild email and password
      Scenario: user click on wishlist button to add item to wishlist
        Given user go to login page
        When user login with Valid userName and Password
        And user click on login button
        Then user click on Wishlist button on this product "HTC One M8 Android L 5.0 Lollipop"

    Scenario: user click on wishlist button to add item to wishlist
      Given user go to login page
      When user login with Valid userName and Password
      And user click on login button
      Then user click on Wishlist button on this product "HTC One M8 Android L 5.0 Lollipop"
      And click on Wishlist Tab
      And Get The Quantity Value od The selected Item
