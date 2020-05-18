Sample story

Narrative:
In order to test Armstrong class
As a user
I want to check if number is an Armstrong number

Scenario:  liczba jest liczba Armstronga
Given Mam liczbe
When num = 9
Then liczba Armstronga - true

Scenario:  nie liczba jest liczba Armstronga
Given Mam liczbe
When num = 10
Then liczba Armstronga - false

Scenario:  null daje blad
Given Mam liczbe
When num = null
Then dostane blad