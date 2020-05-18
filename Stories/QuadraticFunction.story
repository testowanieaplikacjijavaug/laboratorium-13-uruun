Sample story

Narrative:
In order to test quadratic function class
As a user
I want to solve multiple functions

Scenario:  Test funkcja kwadratowa z dwoma rozwiązaniami
Given Mam rownanie kwadratowe
When dam a = 1.0, b = 7.0, c = 0.0
Then dostane dwa miejsca zerowe: 0.0 i -7.0

Scenario:  Test funkcja kwadratowa z jednym rozwiązaniem
Given Mam rownanie kwadratowe
When dam a = 1, b = 2.0, c = 1.0
Then dostane jedno miejsce zerowe: -1.0

Scenario:  Test funkcja kwadratowa bez rozwiązań
Given Mam rownanie kwadratowe
When dam a = 1, b = 1, c = 1
Then dostane blad