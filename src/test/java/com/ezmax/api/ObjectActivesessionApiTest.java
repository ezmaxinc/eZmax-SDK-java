/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.37
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.ActivesessionGetCurrentV1Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectActivesessionApi
 */
@Ignore
public class ObjectActivesessionApiTest {

    private final ObjectActivesessionApi api = new ObjectActivesessionApi();

    
    /**
     * Get Current Activesession
     *
     * Retrieve the details about the current activesession
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activesessionGetCurrentV1Test() throws ApiException {
        ActivesessionGetCurrentV1Response response = api.activesessionGetCurrentV1();

        // TODO: test validations
    }
    
}
