@login @smoke
Feature: Login

  @TC-1234
  Scenario: Verify login for valid credentials
  	Given I want to write a step with ""
    When I check for the "" in step
    Then I verify the "" in step

  @TC-1564
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
