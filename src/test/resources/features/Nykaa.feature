Feature: Nykaa makeup and Nykaa fashion Feature



  Scenario: Verify that the user can able to get  makeup icon
    Given the user navigates to the home page
    When the user able to hover on  the makeup icon
    Then the user should get the drop down page of makeup
    And the user able to click on the face icon



  Scenario: Verify that user able to select Face primer in face icon
  Given the user navigates to the home page
    When the user able to hover on  the makeup icon
    Then the user should get the drop down page of makeup
    And the user able to click on the face primer icon
   



  Scenario: Verify the user able to click on women and select Nykaa fashion
    Given the user navigates to the home page
    When the user able to hover on Nykaa Fashion icon
    Then the user able to click on Indian wear on women icon
    And  the user able to click on saree
    Then the user able to visible with saree items


    Scenario: Verify the use click on whats new on nykaa fashion
      Given  the user navigates to the home page
      When the user able to hover on Nykaa Fashion icon
      Then the user able to click on recently added icon on whats new
      And the use able to hover on men icon
      Then the user able to hover on What's New


    Scenario: Verify the user click on decor in nykaa fashion and search Homesake
      Given  the user navigates to the home page
      When the user able to hover on Nykaa Fashion icon
      Then the user able to click on Decor in Home
      And the user search Homesake on search bar


    Scenario:  Verify the user click on Puma on top brands in nykaa fashion
      Given  the user navigates to the home page
      When the user able to hover on Nykaa Fashion icon
      Then the user able to click on puma in top brands
      And the user search xhy on search bar

@smoke
  Scenario Outline: Verify the user search items in searchbar
  Given the user navigates to the home page
  When the user enters item name as "<itemname>"
  Then the user get the searched items

  Examples:
  |itemname|
  |adidas|
  |foundation|

