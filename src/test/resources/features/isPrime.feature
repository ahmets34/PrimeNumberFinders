Feature: As a user should test the prime number

  Background:
    Given start to generate

  Scenario Outline: Enter a number, checking for prime or not
#    Given start to generate
    When enter the <number>
    Then check the new <number> are prime

    Examples:
      | number |
      |2       |
      |5       |
      |7       |
      |67      |
      |103     |
      #for fail 15
      |15      |
      |11      |