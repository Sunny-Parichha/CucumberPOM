Feature: Account Page Feature

  Background:
    Given user has already logged in to aplication
    |username|password|
    |dec2020secondbatch@gmail.com|Selenium@12345|

  Scenario: Account Page title
    Given user is on Account Page
    When user gets the title of the page
    Then page title should be "My account - My Store"

  Scenario: Accounts section count
    Given user is on Account Page
    Then user gets accounts section
    |Order history and tables|
    |My credit slips|
    |My addresses|
    |My personal information|
    |My wishlists           |
    And  accounts section count should be 5