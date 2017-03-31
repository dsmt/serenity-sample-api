package api.steps;

import static net.serenitybdd.rest.SerenityRest.rest;
import net.thucydides.core.annotations.Step;

/**
 * @since Mar 31, 2017
 * @author Aleksei Starostin <starostin@truckerpath.com>
 */
public class BasicAPISteps {

    @Step
    public void openPage() {
        rest().get("http://yandex.com/internet/");
    }
}
