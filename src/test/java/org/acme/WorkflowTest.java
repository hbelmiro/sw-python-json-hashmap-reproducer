package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
class WorkflowTest {

    @Test
    void test() {
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when().post("/workflow")
                .then()
                .statusCode(201)
                .body("workflowdata.output", is("Success!"));
    }
}
