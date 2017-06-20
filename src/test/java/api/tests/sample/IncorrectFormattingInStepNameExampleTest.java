package api.tests.sample;

import api.steps.ExampleSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @since Mar 31, 2017
 * @author Aleksei Starostin <starostin@truckerpath.com>
 */
@RunWith(SerenityRunner.class)
public class IncorrectFormattingInStepNameExampleTest {

    @Steps
    ExampleSteps exampleSteps;

    @Test
    public void formattingInStepNameExample() {
        exampleSteps.stepWithItalicsInName();
        exampleSteps.stepWitoutItalicsInName();
    }
}
