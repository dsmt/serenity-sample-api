package api.tests.sample;

import api.steps.ExampleSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.swing.text.html.HTML;

/**
 * @since Oct 17, 2017
 * @author Alex Starostin <dsmt42@gmail.com>
 */
@RunWith(SerenityRunner.class)
public class CharSequenceShouldNotBeConvertedToHTMLSpecialCharsInGETQueryStringTest {

    @Steps
    ExampleSteps exampleSteps;

    @Test
    @Issue("#")
    public void charSequenceShouldNotBeConvertedToHTMLSpecialCharsInGETQueryString() {

        exampleSteps.stepWithHtmlSpecialCharInGetQuery("ugrave");
        exampleSteps.stepWithHtmlSpecialCharInGetQuery("divide");
    }
}
