@CUCUMBER

Feature: Sixteen to 18 Feature

  @Smoke
  Scenario:  Smoke login
  Given I am in OrangeHRP Application
  When Login to Application
  Then Dashboard page is available
  And click on Admin menu

  @Regression
  Background:
    Given I am logged into Orange Application.
  Scenario:  Regression
    When I click on Admin Link
    Then Click on Job
    And validate text Job Title

    @S3
    Scenario:  S3
      Given I am in OrangeHRP Application
      When Login to Application
      Then Dashboard page is available
      And click on PIM menu

  @S4
  Scenario:  S4
    Given I am in OrangeHRP Application
    When Login to Application
    Then Dashboard page is available
    And Close the Application