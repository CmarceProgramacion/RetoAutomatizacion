Feature:Validate the content of multiple windows
  as an automator
  I want to open multiple windows
  to verify their content

  @CaseOne
  Scenario:validate the content when I open multiple windows
    Given that I access the herokuapp platform
    When I enter the multiple windows option and interact with their contents
    Then I verify the content of the windows that contain the phrase "New Window"