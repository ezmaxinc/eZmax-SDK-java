/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.32
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
 * API tests for ObjectFranchisebrokerApi
 */
@Ignore
public class ObjectFranchisebrokerApiTest {

    private final ObjectFranchisebrokerApi api = new ObjectFranchisebrokerApi();

    
    /**
     * Retrieve Franchisebrokers and IDs
     *
     * Get the list of Franchisebrokers to be used in a dropdown or autocomplete control.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void franchisebrokerGetAutocompleteV1Test() throws ApiException {
        String sSelector = null;
        String sQuery = null;
        CommonGetAutocompleteV1Response response = api.franchisebrokerGetAutocompleteV1(sSelector, sQuery);

        // TODO: test validations
    }
    
}
