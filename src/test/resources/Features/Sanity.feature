Feature: feature to test sanity test

  @sanity
  Scenario: Navigate to goodRx page successfully
    Given I navigate to the 'GoodRx' website
    Then  I click on the 'search' field
    And  I input data on 'input field'
    Then  I click on 'search button'
