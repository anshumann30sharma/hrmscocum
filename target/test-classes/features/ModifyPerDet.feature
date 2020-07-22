Feature: Employee personal details

@modify
Scenario: Admin should be able to modify employee personal details
Given user logs in with valid admin credentials
And user clicks on PIM and searches employee by "10830" and clicks from dataTable
When user clicks on Edit button and modifies personal details
| DLNumber  | LicenseExpiryDate | SSN |  SIN       | Gender  | Marital Status |
Then admin saves the modification and takes "ModifiedDetails"