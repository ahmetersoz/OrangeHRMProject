
  Feature:Login Functionality

    Scenario:Navigate to Website
      Given Navigate to Campus
      When Login as an Admin and navigate to Admin UserManagement Page
      Then Click on Add Button
      When Entering the required info to the all input boxes and Click Save Button
      Then Verify that ESS is added on the list

