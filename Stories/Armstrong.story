Sample story

Narrative:
In order to test Armstrong class
As a user
I want to check if number is an Armstrong number

Scenario:  liczba Armstronga
Given Mam liczbe
When num = 9
Then liczba Armstronga - true

Scenario:  liczba jest liczba Armstronga
Given Mam liczbe
When num = 9
Then liczba jest Armstronga - true

Scenario:  Armstrong
Given Mam liczbe
When num = 9
Then Armstrong - true

Scenario:  nie liczba jest liczba Armstronga
Given Mam liczbe
When num = 10
Then liczba Armstronga - false

Scenario:  null daje blad
Given Mam liczbe
When num = null
Then dostane blad