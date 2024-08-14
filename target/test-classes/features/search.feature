
Feature: Amazon Search Functionality
  

  @tag1
  Scenario: Search Functionality on amazon web page
    Given User is on the home page by entering the url    
    When User enter "the power of subconscious mind book"
    And User click the search button    
    Then The result area should display results for "the power of subconscious mind book" 
    

