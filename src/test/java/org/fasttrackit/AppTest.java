package org.fasttrackit;

import com.jayway.restassured.RestAssured;
import org.fasttrackit.transferobjects.Address;
import org.fasttrackit.transferobjects.CreateCustomerRequest;
import org.fasttrackit.transferobjects.CreateProjectWithInitialDetailsRequest;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void createProjectWithInitialDetailsWhenAnonymousUserAndRequiredFieldsProvided_shouldReturnProject() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

        Address address = new Address();
        address.setAddress("fdsalj");
        address.setCity("fda");
        address.setCountryCode("RO");
        address.setZipCode("fda");
        address.setCountyOrState("fdsafsda");

        CreateCustomerRequest customerRequest = new CreateCustomerRequest();
        customerRequest.setAddress("fdas");
        customerRequest.setEmail("fdsajlfjas" + System.currentTimeMillis() + "@fdasjfksad.com");
        customerRequest.setName("fdsafjlsadk");
        customerRequest.setPhoneNumber("kjsalfjlasdjlfasd");

        CreateProjectWithInitialDetailsRequest request = new CreateProjectWithInitialDetailsRequest();
        request.setAddress(address);
        request.setConstructionTypeInitialDescription("fsafsadfsa");
        request.setInitialDetails("fdasfsad");
        request.setCustomer(customerRequest);

        given().
                header("Content-Type", "application/json").
                body(request).
                when().
                post("http://192.168.1.2:7200/projects/incomplete").
                then().
                assertThat().
                statusCode(201);
    }

}
