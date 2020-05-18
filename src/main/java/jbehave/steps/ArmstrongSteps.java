package jbehave.steps;

import jbehave.Armstrong;
import org.jbehave.core.annotations.*;
import org.jbehave.core.steps.Steps;
import jbehave.QuadraticFunction;

import static org.junit.jupiter.api.Assertions.*;

public class ArmstrongSteps extends Steps
{
    private Armstrong function;

    @Given("Mam liczbe")
    public void givenMamLiczbe(){
        function = new Armstrong();
    }

    @Then("liczba Armstronga - $bool")
    @Aliases(values={
            "liczba jest Armstronga - $bool",
            "Armstrong - $bool"})
    public void liczbaJestArmstronga(@Named("bool") boolean bool)
    {
        assertEquals(function.calc(), bool);
    }

    @Then("dostane blad")
    public void thenOtrzymamWyjatek()
    {
        assertThrows(Exception.class, () -> function.calc());
    }

    @When("num = $num")
    public void whenDamLiczbe(@Named("num") String num){
        function.set(num);
    }
}