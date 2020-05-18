Sample story

Narrative:
In order to test quadratic function class
As a user
I want to solve multiple functions

Scenario:  Test funkcja kwadratowa z dwoma rozwiazaniami
Given Mam rownanie kwadratowe
When dam a = <a>, b = <b>, c = <c>
Then dostane dwa miejsca zerowe: <x1> i <x2>

Examples:
|a|b|c|x1|x2|
|1.0|7.0|0.0|0.0|-7.0|
|16|4|-20|1|-1.25|

Scenario:  Test funkcja kwadratowa z jednym rozwiazaniem
Given Mam rownanie kwadratowe
When dam a = <a>, b = <b>, c = <c>
Then dostane jedno miejsce zerowe: <x>
Examples:
|a|b|c|x|
|1.0|2.0|1.0|-1.0|
|4|-4|1|0.5|

Scenario:  Test funkcja kwadratowa bez rozwiazan
Given Mam rownanie kwadratowe
When dam a = 1, b = 1, c = 1
Then dostane blad