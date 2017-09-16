@search
  Feature: Search google for Citizens Advice and verifying the search functionality on the Citizens Advice website.

    Scenario: User should able to search for citizens advice on google

      Given User is on Google page
      When User inputs Citizens Advice in a search box
      And User clicks on Citizens Advice
      Then User should able to navigate to Citizens Advice website
      And User should able to see list of items on main navigation header on the home page


