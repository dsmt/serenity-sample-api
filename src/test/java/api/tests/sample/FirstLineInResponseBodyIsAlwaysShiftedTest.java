package api.tests.sample;

import api.steps.ExampleSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Alex Starostin <dsmt42@gmail.com>
 * @since Oct 27, 2017
 */
@RunWith(SerenityRunner.class)
public class FirstLineInResponseBodyIsAlwaysShiftedTest {

    @Steps
    ExampleSteps exampleSteps;

    @Test
    @Issue("#970")
    public void firstLineInResponseBodyIsAlwaysShifted() {
        exampleSteps.stepWithShiftedFirstLineInResponseBody();
    }
}
