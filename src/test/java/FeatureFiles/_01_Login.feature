
  Feature:Login Functionality

    Scenario:Navigate to Website
      Given Navigate to OrangeHRM
      When Login as an Admin and navigate to Admin UserManagement Page
      Then User should successfully login
