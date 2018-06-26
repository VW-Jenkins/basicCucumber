Feature: Login Action

#Scenario Outline: Successful Login with Valid Credentials
#	Given User is on Home Page
#	When User Navigate to Login Page	
		#Parameterization without Example Keyword
		#And User enters "TestingLA4v@outlook.com" and "9Esu%YxUmZuP1lBA"

		#Data Driven Testing Using Examples Keyword & Scenario Outline
#	And User enter name & pwd  "<username>" and "<password>"
#	Then Message displayed Login Successfully	
#Examples:
#	|username|password|
#	|TestingLA4v@outlook.com|9Esu%YxUmZuP1lBA|
#	|TestingLA4v@outlook.com|9Esu%YxUmZuP1lBA|

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to Login Page	
	#Data table in Cucumber with out header
#	And User enter Credential to Login
#	|TestingLA4v@outlook.com|9Esu%YxUmZuP1lBA|
	
	
	#Data table in Cucumber with header
#	And User enter Credential to Login
#	|username|password|
#	|TestingLA4v@outlook.com|9Esu%YxUmZuP1lBA|

	#Data table maps in Cucumber
	And User enter Credential to Login
	|username|password|
	|TestingLA4v@outlook.com|9Esu%YxUmZuP1lBA|
	|TestingLA4v@outlook.com|9Esu%YxUmZuP1lBA|
	Then Message displayed Login Successfully
	
Scenario: Successful LogOut
	When User Logout from the Application
	Then Message displyaed LogOut Successfully