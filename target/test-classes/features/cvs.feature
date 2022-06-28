Feature: CVS Search Engine Functionality
  Scenario: Validate Search Engine
    Given user navigates to "https://www.cvs.com/"
    When user clicks on "shop" menu item
    Then user should see "search engine"
    When  user enter "vitamin " on cvs
    Then user should see "vitamin related" items