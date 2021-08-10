Feature: Verifying adactin details

  Scenario Outline: Verifying adactin login with credentials
    Given User is on the adactin page
    When User should enter the "<userName>" and "<password>"
    When User should search hotel by "<location>", "<hotels>","<room>","<roomNo>","<adult>","<child>"
    And User should click select hotel
    And User should book a hotel by "<first>", "<last>", "<add>", "<cc>", "<name>", "<month>", "<year>", "<cvv>"
    And User should get OrderNo
    Then User should verify success msg

    Examples: 
      | userName   | password | location | hotels      | room     | roomNo  | adult   | child   | first    | last  | add     | cc               | name | month   | year | cvv |
      | prasannavk | 6D1WWD   | Sydney   | Hotel Creek | Standard | 2 - Two | 2 - Two | 2 - Two | Prasanna | Kumar | Chennai | 1231231231231231 | VISA | January | 2022 | 996 |
     