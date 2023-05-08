Feature: Alta Shop

  @Authentication @Positive @Login @ValidEmailAndPassword
  Scenario: Login using valid email and password
    Given User on login page
    When User input valid email "someone@mail.com"
    And User input valid password "123123"
    And User click login button
    Then User on home page

  @Authentication @Positive @Logout
  Scenario: User logout
    Given User on login page
    When User input valid email "someone@mail.com"
    And User input valid password "123123"
    And User click login button
    Then User on home page
    And User click profile icon
    Then User click logout button

  @Authentication @Positive @Register
  Scenario: User make an new account
    Given User on login page
    When User click register menu
    And User input full name
    And User input email
    And User input password "123450"
    Then User click register button

  @Authentication @Negative @Login @InvalidEmailAndPassword
  Scenario: Login using invalid email and password
    Given User on login page
    When User input invalid email "wrong@mail.com"
    And User input invalid password "wrong"
    And User click login button
    Then User cant login

  @Products @Positive @DetailProduct
  Scenario: User see detail product
    Given User on login page
    When User input valid email "someone@mail.com"
    And User input valid password "123123"
    And User click login button
    Then User on home page
    Then User click detail button

  @Products @Ratings @Positive @DetailProduct
  Scenario: User make rating product
    Given User on login page
    When User input valid email "someone@mail.com"
    And User input valid password "123123"
    And User click login button
    Then User on home page
    And User click detail button
    Then User click rating

  @Orders @Positive
  Scenario: User make an order
    Given User on login page
    When User input valid email "someone@mail.com"
    And User input valid password "123123"
    And User click login button
    Then User on home page
    And User click buy button
    And User click cart icon
    Then User click pay button

