/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.40
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.CommonResponseError;
import com.ezmax.api.model.GlobalCustomerGetEndpointV1Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GlobalCustomerApi
 */
@Ignore
public class GlobalCustomerApiTest {

    private final GlobalCustomerApi api = new GlobalCustomerApi();

    
    /**
     * Get customer endpoint
     *
     * Retrieve the customer&#39;s specific server endpoint where to send requests. This will help locate the proper region (ie: sInfrastructureregionCode) and the proper environment (ie: sInfrastructureenvironmenttypeDescription) where the customer&#39;s data is stored.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void globalCustomerGetEndpointV1Test() throws ApiException {
        String pksCustomerCode = null;
        String sInfrastructureproductCode = null;
        GlobalCustomerGetEndpointV1Response response = api.globalCustomerGetEndpointV1(pksCustomerCode, sInfrastructureproductCode);

        // TODO: test validations
    }
    
}
