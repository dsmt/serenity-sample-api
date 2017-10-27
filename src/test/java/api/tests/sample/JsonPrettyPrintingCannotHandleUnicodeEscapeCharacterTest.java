package api.tests.sample;

import api.steps.ExampleSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @since Jun 20, 2017
 * @author Alex Starostin <dsmt42@gmail.com>
 */
@RunWith(SerenityRunner.class)
public class JsonPrettyPrintingCannotHandleUnicodeEscapeCharacterTest {

    @Steps
    ExampleSteps exampleSteps;

    @Test
    @Issue("#")
    public void jsonPrettyPrintingCannotHandleUnicodeEscapeCharacter() {

        String s1 = "\\u";

        exampleSteps.stepWithValidJsonString("test");
        exampleSteps.stepWithJsonStringThatPreventsPrettyPrinting(s1);
    }
}
