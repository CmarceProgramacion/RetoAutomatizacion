#Autor: Claudia Nieto
#Email: cmarce86@yahoo.es
#language: en

@Iframe
Feature: Validate changes to a text in the editor
  As an automator
  I want to access the editor to write a text and change its formatting
  to verify the changes written in the editor


  Scenario Outline: Validate the formatting written in the editor
    Given that I access the herokuapp platform
    When I enter the content to the text editor with these formats
      | <content> | <size> | <source> | <color> | <alignment> |
    Then I check the content with the format "<alignment>"

    Examples:
      | content                                                        | size | source | color  | alignment    |
      | El 80% del exito se basa simplemente en insistir (Woody Allen) | 18pt | Impact | Orange | Align center |