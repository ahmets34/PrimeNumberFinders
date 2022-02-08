

Feature: As a user should test the prime numbers

  Background:
  Given start to generate


  Scenario: Enter 2 numbers for Prime Number Generator
#    Given start to generate
    When enter two numbers 7900 and 7920
    Then check the numbers are prime


  Scenario: Enter another 2 numbers for Prime Number Generator
#    Given start to generate
    When enter another number ( 1 and 100 )
    Then check the new numbers are prime
#
 Scenario: Enter reversed 2 numbers for Prime Number Generator

#    Given start to generate
    When enter another number ( 100 and 1 )
    Then check the new numbers are prime

  Scenario: Enter another reversed 2 numbers for Prime Number Generator

#    Given start to generate
    When enter two numbers 7920 and 7900
    Then check the numbers are prime




