Feature: Hotel Booking In Adactin Application


Scenario: User Login In The Web Application


Given user Launch The Adactin Application
When user Enter the Username In Username Field
And user Enter the Password In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page


Scenario: User Search Hotel in Search Page

When user Select The Location
And  user Select The Hotels
And user Select The Room Type
And user Select The Number Of Rooms
And user Select The Check In Date
And user Select The Check Out Date
And user Select The Adult Per Room
And user Select The Children Per Room
Then user Click The Search Button And It Navigate To Select Hotel Page

Scenario: User Select Hotel in Hotel Page

When user Select The Hotel
And user Click The Continue Button And Navigate To Book Hotel Page

Scenario: User Book Hotel In Hotel Page

When user Enter The First Name
And user Enter The Last Name
And user Enter The Billing Address
And user Enter The Credit Card Number
And user Enter The Credit Card Type
And user Enter The Expiry Date
And user Enter The CVV Number
Then user Click The Book Now Button And Navigate To Booking Confirmation Page

Scenario: User Select Logout Buttom

Then user Click The Logout Buttom



