Feature: DataBase SQL query Feature Scenarios 

#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps


@DB
Scenario: Execute all information from Actor Table 
	Given User connects to PostgreSql Database 
	When User sends querry 'select * from public.actor' 
	Then User should get all information from that table
	
	