/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.46
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.ApikeyCreateObjectV1Request;
import com.ezmax.api.model.ApikeyCreateObjectV1Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectApikeyApi
 */
@Ignore
public class ObjectApikeyApiTest {

    private final ObjectApikeyApi api = new ObjectApikeyApi();

    
    /**
     * Create a new Apikey
     *
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apikeyCreateObjectV1Test() throws ApiException {
        List<ApikeyCreateObjectV1Request> apikeyCreateObjectV1Request = null;
        ApikeyCreateObjectV1Response response = api.apikeyCreateObjectV1(apikeyCreateObjectV1Request);

        // TODO: test validations
    }
    
}
