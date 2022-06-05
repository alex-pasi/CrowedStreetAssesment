Feature: as a user I want to create an account on Crowed Street

  Scenario: verify user can create an account
    Given user is on the homepage
    When user clicks on Create An Account button
    And user provides all data into required fields
    And user answers accredited investor question
    And user agrees terms and conditions
    And user clicks on reCAPTCHA
    And user clicks on submit button
    Then account is successfully created and logged in user is on the marketplace page