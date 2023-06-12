Feature: Add Templates

  Scenario: Add a new Template to the manage templates field.
    Given User launch Chrome browser and Open the URL "https://freezer-analytics.web.app"
    And User enters Email as "badal.resoluteai@gmail.com" and Password as "12345678"
    And Click on login btn
    Then Verify dashboard page
    Then Go to the Manage Template section
    Then Click on Add Template
    And Select Product type
    And Click on Choose file for Upload image
    Then Click on Submit btn
    Then Search the Template Name on Search field and Verify in Table
    And Click on View Template
    And Click on Edit Template
    And Click on Delete Template
    And Click on Logout
    Then Driver close
