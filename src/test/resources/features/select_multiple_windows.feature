#Autor: Claudia Nieto
#Email: cmarce86@yahoo.es
#language: en

@Windows
Feature:Validate the content of multiple windows
  as an automator
  I want to open multiple windows
  to verify their content

  @CaseOne
  Scenario Outline:validate the content when I open multiple windows
    Given that I access the herokuapp platform
    When I enter the multiple windows option and interact with their content "<phrase>"
    Then I verify the content of the window that contain the phrase "<phrase>"

    Examples:
      | phrase     |
      | New Window |
