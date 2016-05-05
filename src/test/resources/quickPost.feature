Feature: Quick Post
As an employee 
I want to post my vehicle
So that other employees from same area can travel with me

@Regression @Smoke
Scenario: Valid Post
Given emplyee enter all valid data
When click on "Submit"
Then system display message "Posting was successful"
And Search page get reloaded with current posting on top

@WIP
Scenario: Duplicate post not allowed
Given "Naveen" has already posted his vehicle
And "Naveen" wanted to post again
When click on "Submit"
Then system display message "Duplicate posting Not allowed"

Scenario: InValid Post
Given emplyee enter all Invalid data
When click on "Submit"
Then system display message "Posting was unsuccessful"
And Search page get reloaded with current posting on top
