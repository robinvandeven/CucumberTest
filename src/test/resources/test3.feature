

  Feature: Add new task to schedule maintenance and delete it

    Scenario: I want to schedule a MSE cleanup task
      Given I log in on my local storeMate Online environment
        | Username | Password  |
        | Admin    | Admin     |
      When I navigate to Schedule Maintenance

      Then I add , run and remove a cleanup task for MSE