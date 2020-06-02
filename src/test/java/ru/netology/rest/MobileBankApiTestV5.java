package ru.netology.rest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import static io.restassured.RestAssured.given;

public class MobileBankApiTestV5 {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("http://localhost:9999/api/v1")
                // Выполняемые действия
                .when()
                .get("/demo/accounts")
                // Проверки
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("every{ it.balance >= 0 }",is(true))
        ;
    }
}
