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
import com.ezmax.api.model.CommonResponseError;
import com.ezmax.api.model.EzsignfolderCreateObjectV1Request;
import com.ezmax.api.model.EzsignfolderCreateObjectV1Response;
import com.ezmax.api.model.EzsignfolderDeleteObjectV1Response;
import com.ezmax.api.model.EzsignfolderGetObjectV1Response;
import com.ezmax.api.model.EzsignfolderSendV1Request;
import com.ezmax.api.model.EzsignfolderSendV1Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectEzsignfolderApi
 */
@Ignore
public class ObjectEzsignfolderApiTest {

    private final ObjectEzsignfolderApi api = new ObjectEzsignfolderApi();

    
    /**
     * Create a new Ezsignfolder
     *
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsignfolderCreateObjectV1Test() throws ApiException {
        List<EzsignfolderCreateObjectV1Request> ezsignfolderCreateObjectV1Request = null;
        EzsignfolderCreateObjectV1Response response = api.ezsignfolderCreateObjectV1(ezsignfolderCreateObjectV1Request);

        // TODO: test validations
    }
    
    /**
     * Delete an existing Ezsignfolder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsignfolderDeleteObjectV1Test() throws ApiException {
        Integer pkiEzsignfolderID = null;
        EzsignfolderDeleteObjectV1Response response = api.ezsignfolderDeleteObjectV1(pkiEzsignfolderID);

        // TODO: test validations
    }
    
    /**
     * Retrieve an existing Ezsignfolder&#39;s children IDs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsignfolderGetChildrenV1Test() throws ApiException {
        Integer pkiEzsignfolderID = null;
        api.ezsignfolderGetChildrenV1(pkiEzsignfolderID);

        // TODO: test validations
    }
    
    /**
     * Retrieve an existing Ezsignfolder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsignfolderGetObjectV1Test() throws ApiException {
        Integer pkiEzsignfolderID = null;
        EzsignfolderGetObjectV1Response response = api.ezsignfolderGetObjectV1(pkiEzsignfolderID);

        // TODO: test validations
    }
    
    /**
     * Send the Ezsignfolder to the signatories for signature
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsignfolderSendV1Test() throws ApiException {
        Integer pkiEzsignfolderID = null;
        EzsignfolderSendV1Request ezsignfolderSendV1Request = null;
        EzsignfolderSendV1Response response = api.ezsignfolderSendV1(pkiEzsignfolderID, ezsignfolderSendV1Request);

        // TODO: test validations
    }
    
}
