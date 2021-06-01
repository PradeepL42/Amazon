# new feature
# Tags: optional

Feature: A description

  Scenario: Launch the app and navigate to home screen
    Given I launch the app
    Then I wait for the page to load
    Then I skip login
    Then I wait for the page to load
    Then I tap on humburger
    Then I wait for the page to load
    Then I scroll the list
    Then I wait for the page to load
    Then I tap on settings
    Then I wait for the page to load
    Then I tap on Country and Language
    Then I wait for the page to load
    Then I tap on device back button
    Then I wait for the page to load


    Scenario: Search for an item
      Given I search for the item
      Then I wait for the page to load

