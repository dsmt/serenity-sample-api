package api.tests.sample.six;

import api.steps.BasicAPISteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @since Mar 31, 2017
 * @author Aleksei Starostin <starostin@truckerpath.com>
 */
@RunWith(SerenityRunner.class)
public class PageGet004Test {

    @Steps
    BasicAPISteps basicAPISteps;

    @Test
    public void openPage() {
        basicAPISteps.openPage();
    }
}
