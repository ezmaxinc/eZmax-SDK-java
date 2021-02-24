/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.31
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.CommonResponseError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModuleSsprApi
 */
@Ignore
public class ModuleSsprApiTest {

    private final ModuleSsprApi api = new ModuleSsprApi();

    
    /**
     * Remind of forgotten username(s)
     *
     * This endpoint returns an email with the username(s) matching the email address provided in case of forgotten username
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ssprRemindUsernamesV1Test() throws ApiException {
        api.ssprRemindUsernamesV1();

        // TODO: test validations
    }
    
}