Feature: Search Google
  Scenario: I want to using feature search on google
    Given I Open browser
    And Open website Google
    When I search "Andreas Cristian Manik"
    Then Showing result related with "Andreas Cristian Manik"
