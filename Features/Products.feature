Feature: Add New Product

  Scenario: Adding new product in the product list.
    Given User launch Chrome browser and Open the URL "https://freezer-analytics.web.app"
    And User enters Email as "badal.resoluteai@gmail.com" and Password as "12345678"
    And Click on login btn
    Then Verify dashboard page
    Then Go to the Products section
    Then Click on Add Product
    And Write Product name as "Cheese" on product name field
    And Click on Submit
    Then search product name "Chesse" on search field
    Then Click on View Product
    Then Click on Edit Product
    Then Click on Delete Product
    Then Click on Logout
    And Driver close
