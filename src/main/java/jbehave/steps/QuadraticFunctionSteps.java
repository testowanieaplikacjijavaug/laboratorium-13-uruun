package jbehave.steps;

import org.jbehave.core.annotations.*;
import org.jbehave.core.steps.Steps;
import jbehave.QuadraticFunction;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticFunctionSteps extends Steps
{
    private QuadraticFunction function;

    @Given("Mam rownanie kwadratowe")
    public void givenMamRownanie(){
        function = new QuadraticFunction();
    }
    @Then("dostane dwa miejsca zerowe: $x1 i $x2")
    @Aliases(values={
            "dostane dwa miejsca zerowe: $x1, $x2"})
    public void thenDostaneDwaRozwiązania(@Named("x1") double x1, @Named("x2") double x2)
    {
        function.calculate();
        assertAll(
                () -> assertEquals(Math.min(x1, x2), Math.min(function.getX1(), function.getX2()), 0.01),
                () -> assertEquals(Math.max(x1, x2), Math.max(function.getX1(), function.getX2()), 0.01)
        );
    }

    @Then("dostane jedno miejsce zerowe: $x1")
    public void thenOtrzymamJednoRozwiązanie(@Named("x1") double x1)
    {
        function.calculate();
        assertAll(
                () -> assertEquals(x1, function.getX1(), 0.01),
                () -> assertEquals(x1, function.getX2(), 0.01)
        );
    }

    @Then("dostane blad")
    public void thenOtrzymamWyjątek()
    {
        assertThrows(Exception.class, () -> function.calculate());
    }

    @When("dam a = $a, b = $b, c = $c")
    public void whenDamAbc(@Named("a") double a, @Named("b") double b, @Named("c") double c){
        function.setA(a);
        function.setB(b);
        function.setC(c);
    }
}