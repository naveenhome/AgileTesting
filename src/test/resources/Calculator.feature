Feature: calculator

  Scenario: Addition
    Given user enter 55 and 35
    When select "Add"
    And click on calculate
    Then Result should be 90

  Scenario Outline: Regression test
    Given user enter <Number1> and <Number2>
    When select <Operation>
    And click on calculate
    Then Result should be <Result>

    Examples: 
      | Number1 | Number2 | Operation | Result |
      | 5       | 4       | "Mul"     | 9      |
      | 15      | 14      | "Add"     | 29     |
      | 50      | 40      | "Add"     | 80     |
