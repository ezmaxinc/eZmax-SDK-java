/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.
 *
 * The version of the OpenAPI document: 1.0.30
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.CommonResponseError;
import com.ezmax.api.model.EzsigndocumentApplyEzsigntemplateV1Request;
import com.ezmax.api.model.EzsigndocumentApplyEzsigntemplateV1Response;
import com.ezmax.api.model.EzsigndocumentCreateObjectV1Request;
import com.ezmax.api.model.EzsigndocumentCreateObjectV1Response;
import com.ezmax.api.model.EzsigndocumentDeleteObjectV1Response;
import com.ezmax.api.model.EzsigndocumentEditObjectV1Request;
import com.ezmax.api.model.EzsigndocumentEditObjectV1Response;
import com.ezmax.api.model.EzsigndocumentGetDownloadUrlV1Response;
import com.ezmax.api.model.EzsigndocumentGetObjectV1Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObjectEzsigndocumentApi
 */
@Ignore
public class ObjectEzsigndocumentApiTest {

    private final ObjectEzsigndocumentApi api = new ObjectEzsigndocumentApi();

    
    /**
     * Apply an Ezsign Template to the Ezsigndocument.
     *
     * This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsigndocumentApplyEzsigntemplateV1Test() throws ApiException {
        Integer pkiEzsigndocumentID = null;
        EzsigndocumentApplyEzsigntemplateV1Request ezsigndocumentApplyEzsigntemplateV1Request = null;
        EzsigndocumentApplyEzsigntemplateV1Response response = api.ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV1Request);

        // TODO: test validations
    }
    
    /**
     * Create a new Ezsigndocument
     *
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsigndocumentCreateObjectV1Test() throws ApiException {
        List<EzsigndocumentCreateObjectV1Request> ezsigndocumentCreateObjectV1Request = null;
        EzsigndocumentCreateObjectV1Response response = api.ezsigndocumentCreateObjectV1(ezsigndocumentCreateObjectV1Request);

        // TODO: test validations
    }
    
    /**
     * Delete an existing Ezsigndocument
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsigndocumentDeleteObjectV1Test() throws ApiException {
        Integer pkiEzsigndocumentID = null;
        EzsigndocumentDeleteObjectV1Response response = api.ezsigndocumentDeleteObjectV1(pkiEzsigndocumentID);

        // TODO: test validations
    }
    
    /**
     * Modify an existing Ezsigndocument
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsigndocumentEditObjectV1Test() throws ApiException {
        Integer pkiEzsigndocumentID = null;
        EzsigndocumentEditObjectV1Request ezsigndocumentEditObjectV1Request = null;
        EzsigndocumentEditObjectV1Response response = api.ezsigndocumentEditObjectV1(pkiEzsigndocumentID, ezsigndocumentEditObjectV1Request);

        // TODO: test validations
    }
    
    /**
     * Retrieve an existing Ezsigndocument&#39;s children IDs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsigndocumentGetChildrenV1Test() throws ApiException {
        Integer pkiEzsigndocumentID = null;
        api.ezsigndocumentGetChildrenV1(pkiEzsigndocumentID);

        // TODO: test validations
    }
    
    /**
     * Retrieve a URL to download documents.
     *
     * This endpoint returns URLs to different files that can be downloaded during the signing process.  These links will expire after 5 minutes so the download of the file should be made soon after retrieving the link.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsigndocumentGetDownloadUrlV1Test() throws ApiException {
        Integer pkiEzsigndocumentID = null;
        String eDocumentType = null;
        EzsigndocumentGetDownloadUrlV1Response response = api.ezsigndocumentGetDownloadUrlV1(pkiEzsigndocumentID, eDocumentType);

        // TODO: test validations
    }
    
    /**
     * Retrieve an existing Ezsigndocument
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ezsigndocumentGetObjectV1Test() throws ApiException {
        Integer pkiEzsigndocumentID = null;
        EzsigndocumentGetObjectV1Response response = api.ezsigndocumentGetObjectV1(pkiEzsigndocumentID);

        // TODO: test validations
    }
    
}
