@regression @infor
Feature: Home page Scenarios

  @test1 @smoke
  Scenario: Verify the Date of the latest Blog
    Given user is on the homepage
    When user clicks product partners on Partners section
    And user clicks Read the blog button
    Then user should see that last blog is published on "November 7, 2022"




