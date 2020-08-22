@Smoke @Regression @SeleniumQurate 
Feature: automation practice automation 
Background: 
	Given Automation Practice Web Page is opened_ 
	
Scenario: user should not be logged into application 
	Then unsucessful login verification must be done "selenium@qurate.com" and "fakepasswd" 
	
Scenario: Verify elements on home page 
	Then verify logo of website 
	And SearchBar with placeholder search 
	And empty Cart on page 
	And Phone Number on page 
	And Sign-in link with mouse hover text 
	And Menu bar Link - WOMEN 
	And Menu bar Link - DRESSES 
	And  Menu bar Link - T-SHIRTS 
	
	
Scenario: MouseHover dresses and click summer dresses and verify elemets 
	Then main bar visible with options 
	And Sign out link is not visible 
	And compare zero button 
	Then when dress with maximum price is clicked it redirect to product detail page 
	
	#Pre-requisite: Summer Dress with maximum price is clicked on Product listing page	
	
Scenario: 
	when add to cart button is clicked for size=M, popup must be displayed with same product and details 
	Then Product details verification of Popup after addToCart 
	
	#Pre-requisite: Summer Dress with maximum price and size=M is added to cart successfully

Scenario: 
	Shopping cart Summary validation as it must have one product selected in it 
	Then cart must have one product in it 
	
	#Pre-requisite: PROCEED TO CHECKOUT is clicked at Shopping Summary Page
	
Scenario: 
	Verify that user is able to login successfully with provided credentials 
	Then login authentication after shopping 
	
