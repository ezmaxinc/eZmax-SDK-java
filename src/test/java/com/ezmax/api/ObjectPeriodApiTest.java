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
import com.ezmax.api.model.CommonGetAutocompleteV1Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectPeriodApi
 */
@Ignore
public class ObjectPeriodApiTest {

    private final ObjectPeriodApi api = new ObjectPeriodApi();

    
    /**
     * Retrieve Periods and IDs
     *
     * Get the list of Periods to be used in a dropdown or autocomplete control.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void periodGetAutocompleteV1Test() throws ApiException {
        String sSelector = null;
        String sQuery = null;
        CommonGetAutocompleteV1Response response = api.periodGetAutocompleteV1(sSelector, sQuery);

        // TODO: test validations
    }
    
}
