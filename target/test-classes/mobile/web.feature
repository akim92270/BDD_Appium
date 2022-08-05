Feature: Ebay Website

  Background:
    Given user navigates to "https://www.ebay.com/"

#  @Regression
#  Scenario: Ebay Login Page
#    Given user navigates to "https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F"
#    When user enters invalid email "techglobal@mail.com" and clicks continue button
#    Then user should see error message "Oops, that's not a match."

  @Smoke
  Scenario Outline: Ebay Search Validation
    When user types "<searchText>" on search box and presses enter
    Then the user should validate title is "<title>"

    Examples: Data for searchText and title

      | searchText   | title                |
      | iphone cases | iphone cases \| eBay |
      | keyholder    | keyholder \| eBay    |
      | football     | football \| eBay     |