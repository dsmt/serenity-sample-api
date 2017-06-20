package api.steps;

import com.google.common.collect.ImmutableMap;
import io.restassured.http.ContentType;
import static net.serenitybdd.rest.SerenityRest.rest;
import net.thucydides.core.annotations.Step;

/**
 * @since Mar 31, 2017
 * @author Aleksei Starostin <starostin@truckerpath.com>
 */
public class ExampleSteps {

    @Step(value = "--> _This_ <-- should be formatted in italics")
    public void stepWithItalicsInName() {
    }

    @Step(value = "While --> th_is and th_is <-- should not")
    public void stepWitoutItalicsInName() {
    }

    public void stepWithJSONStringThatRiseFormattingError(String s) {
        rest()
                .contentType(ContentType.JSON)
                .body(ImmutableMap.of("string", s))
                .post("https://echo.paw.cloud/");
    }
}
