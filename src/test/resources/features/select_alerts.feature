#Autor: Claudia Nieto
#Email: cmarce86@yahoo.es
#language: en

@Alerts
Feature: validate that the alerts
  As an automator
  I want to use javaScript alerts
  To validate its functionality

  Background: I access the herokuapp testing platform.
    Given that I access the herokuapp platform

  @CaseOne
  Scenario Outline:validate the JS alert accept
    When I select JS alert and interact with the alert
    Then verify that Result appears with the phrase "<phrase>"
    Examples:
      | phrase                            |
      | You successfully clicked an alert |


  @CaseTwo
  Scenario Outline:validate the JS Confirm
    When  I select JS Confirm and interact with the alert
    Then verify that Result appears with the phrase "<phrase>"

    Examples:
      | phrase          |
      | You clicked: Ok |


  @CaseThree
  Scenario Outline: validate the JS Prompt
    When  I select JS Prompt interact with the alert and enter the phrase "<phrase>"
    Then verify that Result appears with the phrase "<phrase>"

    Examples:
      | phrase |
      | SQA    |
