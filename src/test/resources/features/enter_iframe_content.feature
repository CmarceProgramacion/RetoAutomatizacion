@Iframe
Feature: Validate that a text is typed in the editor and the formatting is changed
  As an automator
  I want to access the editor to write a text and change its formatting
  to verify the content written in the editor


  Scenario Outline: Validate the content and formatting written in the editor
    Given that I access the herokuapp platform
    When I enter the content to the text editor with the format
      | <content> | <size> | <source> | <color> | <alignment> |
    Then I check the content with the format "<alignment>"

    Examples:
      | content                                                        | size | source | color  | alignment    |
      | El 80% del exito se basa simplemente en insistir (Woody Allen) | 18pt | Impact | Orange | Align center |