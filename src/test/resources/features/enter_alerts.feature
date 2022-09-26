Feature: validate that the alert is accepted
  As an automator
  I want to accept the javaScript alert
  To perform the SQA automation challenge

  Background: I access the herokuapp testing platform.
    Given that I access the herokuapp platform

  @CaseOne
  Scenario:validate when I select JS alert and select accept
    When I select JS alert and interact with the alert
    Then I verify that "Result" appears


  @CaseTwo
  Scenario:validate when I select JS Confirm and select accept alert
    When  I select JS Confirm and interact with the alert
    Then verify that "Result" appears with the phrase"Ok"


  @CaseThree
  Scenario Outline: validate when I select JS Prompt and select accept the alert
    When  I select JS Prompt, interact with the alert and enter the phrase "<phrase>".
    Then verify that Result appears with the phrase "<phrase>"

    Examples:
      | phrase                          |
      | Prueba de automatizacion de SQA |
