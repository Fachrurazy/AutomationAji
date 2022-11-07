Feature: Login Stockbit
  Scenario: Check Login is Succesfull with valid value
    Given Open browser Stockbit
    And Open Login Page Stockbit
    When User Do Enter Email "fachrurazyatijani@gmail.com"
    When User Do Enter Password "Testing123"
    Then Failed Notification
