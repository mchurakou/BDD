package pack;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by mikalai on 13.11.2015.
 */
public class CalcBehavior {
    private Calculator calc;

    @Given("operation: $operation")
    @Aliases(values={"we have $operation"})
    public void setupOperation(String operation) {
        calc = new Calculator();
        calc.setOperation(operation);
     }

    @When("first number: $first, second number: $second")
    public void setNumbers(int first, int second) {
        calc.setFirst(first);
        calc.setSecond(second);
    }

    @Then("result is $res")
    @Aliases(values={"we have result: $res"})
    public void calculate(int res) {
        assertThat(calc.calculate(), equalTo(res));
    }
}
