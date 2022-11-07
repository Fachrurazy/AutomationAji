Feature: Login FMUI
  Scenario: Check Login is Succesfull with valid value
    Given Open browser
    And Open Login Page FMUI
    When User Enter Username "1234"
    When User Enter Password "123456"
    Then User Navigated to Home Page
