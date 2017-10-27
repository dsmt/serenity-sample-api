package api.steps;

import com.google.common.collect.ImmutableMap;
import io.restassured.http.ContentType;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.rest;

/**
 * @since Mar 31, 2017
 * @author Aleksei Starostin <starostin@truckerpath.com>
 */
public class ExampleSteps {

    private final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Step
    public void stepWithValidJsonString(String s) {
        rest()
                .contentType(ContentType.JSON)
                .body(ImmutableMap.of("string", s))
                .post(String.format("%s", BASE_URL));
    }

    @Step
    public void stepWithJsonStringThatPreventsPrettyPrinting(String s) {
        rest()
                .contentType(ContentType.JSON)
                .body(ImmutableMap.of("string", s))
                .post(String.format("%s", BASE_URL));
    }

    @Step
    public void stepWithHtmlSpecialCharInGetQuery(String htmlSpecialChar) {
        rest().get(String.format("%s?foo=1&%s=2", BASE_URL, htmlSpecialChar));
    }

    @Step
    public void stepWithShiftedFirstLineInResponseBody() {
        rest().get(BASE_URL);
    }
}
