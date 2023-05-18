Feature: Validate J P Morgan logo

  @PasitiveCase @Sanity
  Scenario Outline: Validate the J P Morgan logo with  google search inputs
    Given google home page
    When search with "<search>" and select the index  "<index>"
    Then Validate the title "<title>"
    Examples:
      | search             | index |  title |
      | J. P. Morgan       |  1    |  J.P. Morgan |
      | Whatfix            |  1    |  J.P. Morgan |


