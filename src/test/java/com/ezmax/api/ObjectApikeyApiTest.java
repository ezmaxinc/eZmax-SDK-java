/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.28
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
