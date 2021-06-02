/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.45
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.CommonResponseError;
import com.ezmax.api.model.EzsignsignatureCreateObjectV1Request;
import com.ezmax.api.model.EzsignsignatureCreateObjectV1Response;
import com.ezmax.api.model.EzsignsignatureDeleteObjectV1Response;
import com.ezmax.api.model.EzsignsignatureGetObjectV1Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectEzsignsignatureApi
 */
@Ignore
public class ObjectEzsignsignatureApiTest {

    private final ObjectEzsignsignatureApi api = new ObjectEzsignsignatureApi();

    
    /**
     * Create a new Ezsignsignature
     *
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsignsignatureCreateObjectV1Test() throws ApiException {
        List<EzsignsignatureCreateObjectV1Request> ezsignsignatureCreateObjectV1Request = null;
        EzsignsignatureCreateObjectV1Response response = api.ezsignsignatureCreateObjectV1(ezsignsignatureCreateObjectV1Request);

        // TODO: test validations
    }
    
    /**
     * Delete an existing Ezsignsignature
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsignsignatureDeleteObjectV1Test() throws ApiException {
        Integer pkiEzsignsignatureID = null;
        EzsignsignatureDeleteObjectV1Response response = api.ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID);

        // TODO: test validations
    }
    
    /**
     * Retrieve an existing Ezsignsignature&#39;s children IDs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsignsignatureGetChildrenV1Test() throws ApiException {
        Integer pkiEzsignsignatureID = null;
        api.ezsignsignatureGetChildrenV1(pkiEzsignsignatureID);

        // TODO: test validations
    }
    
    /**
     * Retrieve an existing Ezsignsignature
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsignsignatureGetObjectV1Test() throws ApiException {
        Integer pkiEzsignsignatureID = null;
        EzsignsignatureGetObjectV1Response response = api.ezsignsignatureGetObjectV1(pkiEzsignsignatureID);

        // TODO: test validations
    }
    
}
