/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.38
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiCallback;
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.ApiResponse;
import eZmaxAPI.Configuration;
import eZmaxAPI.Pair;
import eZmaxAPI.ProgressRequestBody;
import eZmaxAPI.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ezmax.api.model.CommonResponseError;
import com.ezmax.api.model.EzsignfoldersignerassociationCreateObjectV1Request;
import com.ezmax.api.model.EzsignfoldersignerassociationCreateObjectV1Response;
import com.ezmax.api.model.EzsignfoldersignerassociationDeleteObjectV1Response;
import com.ezmax.api.model.EzsignfoldersignerassociationGetInPersonLoginUrlV1Response;
import com.ezmax.api.model.EzsignfoldersignerassociationGetObjectV1Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectEzsignfoldersignerassociationApi {
    private ApiClient localVarApiClient;

    public ObjectEzsignfoldersignerassociationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectEzsignfoldersignerassociationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for ezsignfoldersignerassociationCreateObjectV1
     * @param ezsignfoldersignerassociationCreateObjectV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfoldersignerassociationCreateObjectV1Call(List<EzsignfoldersignerassociationCreateObjectV1Request> ezsignfoldersignerassociationCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = ezsignfoldersignerassociationCreateObjectV1Request;

        // create path and map variables
        String localVarPath = "/1/object/ezsignfoldersignerassociation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ezsignfoldersignerassociationCreateObjectV1ValidateBeforeCall(List<EzsignfoldersignerassociationCreateObjectV1Request> ezsignfoldersignerassociationCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ezsignfoldersignerassociationCreateObjectV1Request' is set
        if (ezsignfoldersignerassociationCreateObjectV1Request == null) {
            throw new ApiException("Missing the required parameter 'ezsignfoldersignerassociationCreateObjectV1Request' when calling ezsignfoldersignerassociationCreateObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignfoldersignerassociationCreateObjectV1Call(ezsignfoldersignerassociationCreateObjectV1Request, _callback);
        return localVarCall;

    }

    /**
     * Create a new Ezsignfoldersignerassociation
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param ezsignfoldersignerassociationCreateObjectV1Request  (required)
     * @return EzsignfoldersignerassociationCreateObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public EzsignfoldersignerassociationCreateObjectV1Response ezsignfoldersignerassociationCreateObjectV1(List<EzsignfoldersignerassociationCreateObjectV1Request> ezsignfoldersignerassociationCreateObjectV1Request) throws ApiException {
        ApiResponse<EzsignfoldersignerassociationCreateObjectV1Response> localVarResp = ezsignfoldersignerassociationCreateObjectV1WithHttpInfo(ezsignfoldersignerassociationCreateObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Create a new Ezsignfoldersignerassociation
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param ezsignfoldersignerassociationCreateObjectV1Request  (required)
     * @return ApiResponse&lt;EzsignfoldersignerassociationCreateObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignfoldersignerassociationCreateObjectV1Response> ezsignfoldersignerassociationCreateObjectV1WithHttpInfo(List<EzsignfoldersignerassociationCreateObjectV1Request> ezsignfoldersignerassociationCreateObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = ezsignfoldersignerassociationCreateObjectV1ValidateBeforeCall(ezsignfoldersignerassociationCreateObjectV1Request, null);
        Type localVarReturnType = new TypeToken<EzsignfoldersignerassociationCreateObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Ezsignfoldersignerassociation (asynchronously)
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param ezsignfoldersignerassociationCreateObjectV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfoldersignerassociationCreateObjectV1Async(List<EzsignfoldersignerassociationCreateObjectV1Request> ezsignfoldersignerassociationCreateObjectV1Request, final ApiCallback<EzsignfoldersignerassociationCreateObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignfoldersignerassociationCreateObjectV1ValidateBeforeCall(ezsignfoldersignerassociationCreateObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<EzsignfoldersignerassociationCreateObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignfoldersignerassociationDeleteObjectV1
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfoldersignerassociationDeleteObjectV1Call(Integer pkiEzsignfoldersignerassociationID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}"
            .replaceAll("\\{" + "pkiEzsignfoldersignerassociationID" + "\\}", localVarApiClient.escapeString(pkiEzsignfoldersignerassociationID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ezsignfoldersignerassociationDeleteObjectV1ValidateBeforeCall(Integer pkiEzsignfoldersignerassociationID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsignfoldersignerassociationID' is set
        if (pkiEzsignfoldersignerassociationID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationDeleteObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignfoldersignerassociationDeleteObjectV1Call(pkiEzsignfoldersignerassociationID, _callback);
        return localVarCall;

    }

    /**
     * Delete an existing Ezsignfoldersignerassociation
     * 
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @return EzsignfoldersignerassociationDeleteObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public EzsignfoldersignerassociationDeleteObjectV1Response ezsignfoldersignerassociationDeleteObjectV1(Integer pkiEzsignfoldersignerassociationID) throws ApiException {
        ApiResponse<EzsignfoldersignerassociationDeleteObjectV1Response> localVarResp = ezsignfoldersignerassociationDeleteObjectV1WithHttpInfo(pkiEzsignfoldersignerassociationID);
        return localVarResp.getData();
    }

    /**
     * Delete an existing Ezsignfoldersignerassociation
     * 
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @return ApiResponse&lt;EzsignfoldersignerassociationDeleteObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignfoldersignerassociationDeleteObjectV1Response> ezsignfoldersignerassociationDeleteObjectV1WithHttpInfo(Integer pkiEzsignfoldersignerassociationID) throws ApiException {
        okhttp3.Call localVarCall = ezsignfoldersignerassociationDeleteObjectV1ValidateBeforeCall(pkiEzsignfoldersignerassociationID, null);
        Type localVarReturnType = new TypeToken<EzsignfoldersignerassociationDeleteObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete an existing Ezsignfoldersignerassociation (asynchronously)
     * 
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfoldersignerassociationDeleteObjectV1Async(Integer pkiEzsignfoldersignerassociationID, final ApiCallback<EzsignfoldersignerassociationDeleteObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignfoldersignerassociationDeleteObjectV1ValidateBeforeCall(pkiEzsignfoldersignerassociationID, _callback);
        Type localVarReturnType = new TypeToken<EzsignfoldersignerassociationDeleteObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignfoldersignerassociationGetChildrenV1
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfoldersignerassociationGetChildrenV1Call(Integer pkiEzsignfoldersignerassociationID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getChildren"
            .replaceAll("\\{" + "pkiEzsignfoldersignerassociationID" + "\\}", localVarApiClient.escapeString(pkiEzsignfoldersignerassociationID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ezsignfoldersignerassociationGetChildrenV1ValidateBeforeCall(Integer pkiEzsignfoldersignerassociationID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsignfoldersignerassociationID' is set
        if (pkiEzsignfoldersignerassociationID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationGetChildrenV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignfoldersignerassociationGetChildrenV1Call(pkiEzsignfoldersignerassociationID, _callback);
        return localVarCall;

    }

    /**
     * Retrieve an existing Ezsignfoldersignerassociation&#39;s children IDs
     * 
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public void ezsignfoldersignerassociationGetChildrenV1(Integer pkiEzsignfoldersignerassociationID) throws ApiException {
        ezsignfoldersignerassociationGetChildrenV1WithHttpInfo(pkiEzsignfoldersignerassociationID);
    }

    /**
     * Retrieve an existing Ezsignfoldersignerassociation&#39;s children IDs
     * 
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> ezsignfoldersignerassociationGetChildrenV1WithHttpInfo(Integer pkiEzsignfoldersignerassociationID) throws ApiException {
        okhttp3.Call localVarCall = ezsignfoldersignerassociationGetChildrenV1ValidateBeforeCall(pkiEzsignfoldersignerassociationID, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Retrieve an existing Ezsignfoldersignerassociation&#39;s children IDs (asynchronously)
     * 
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfoldersignerassociationGetChildrenV1Async(Integer pkiEzsignfoldersignerassociationID, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignfoldersignerassociationGetChildrenV1ValidateBeforeCall(pkiEzsignfoldersignerassociationID, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignfoldersignerassociationGetInPersonLoginUrlV1
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfoldersignerassociationGetInPersonLoginUrlV1Call(Integer pkiEzsignfoldersignerassociationID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl"
            .replaceAll("\\{" + "pkiEzsignfoldersignerassociationID" + "\\}", localVarApiClient.escapeString(pkiEzsignfoldersignerassociationID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ezsignfoldersignerassociationGetInPersonLoginUrlV1ValidateBeforeCall(Integer pkiEzsignfoldersignerassociationID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsignfoldersignerassociationID' is set
        if (pkiEzsignfoldersignerassociationID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationGetInPersonLoginUrlV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignfoldersignerassociationGetInPersonLoginUrlV1Call(pkiEzsignfoldersignerassociationID, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a Login Url to allow In-Person signing
     * This endpoint returns a Login Url that can be used in a browser or embedded in an I-Frame to allow in person signing.  The signer Login type must be configured as In-Person.
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @return EzsignfoldersignerassociationGetInPersonLoginUrlV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public EzsignfoldersignerassociationGetInPersonLoginUrlV1Response ezsignfoldersignerassociationGetInPersonLoginUrlV1(Integer pkiEzsignfoldersignerassociationID) throws ApiException {
        ApiResponse<EzsignfoldersignerassociationGetInPersonLoginUrlV1Response> localVarResp = ezsignfoldersignerassociationGetInPersonLoginUrlV1WithHttpInfo(pkiEzsignfoldersignerassociationID);
        return localVarResp.getData();
    }

    /**
     * Retrieve a Login Url to allow In-Person signing
     * This endpoint returns a Login Url that can be used in a browser or embedded in an I-Frame to allow in person signing.  The signer Login type must be configured as In-Person.
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @return ApiResponse&lt;EzsignfoldersignerassociationGetInPersonLoginUrlV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignfoldersignerassociationGetInPersonLoginUrlV1Response> ezsignfoldersignerassociationGetInPersonLoginUrlV1WithHttpInfo(Integer pkiEzsignfoldersignerassociationID) throws ApiException {
        okhttp3.Call localVarCall = ezsignfoldersignerassociationGetInPersonLoginUrlV1ValidateBeforeCall(pkiEzsignfoldersignerassociationID, null);
        Type localVarReturnType = new TypeToken<EzsignfoldersignerassociationGetInPersonLoginUrlV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a Login Url to allow In-Person signing (asynchronously)
     * This endpoint returns a Login Url that can be used in a browser or embedded in an I-Frame to allow in person signing.  The signer Login type must be configured as In-Person.
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfoldersignerassociationGetInPersonLoginUrlV1Async(Integer pkiEzsignfoldersignerassociationID, final ApiCallback<EzsignfoldersignerassociationGetInPersonLoginUrlV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignfoldersignerassociationGetInPersonLoginUrlV1ValidateBeforeCall(pkiEzsignfoldersignerassociationID, _callback);
        Type localVarReturnType = new TypeToken<EzsignfoldersignerassociationGetInPersonLoginUrlV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignfoldersignerassociationGetObjectV1
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfoldersignerassociationGetObjectV1Call(Integer pkiEzsignfoldersignerassociationID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}"
            .replaceAll("\\{" + "pkiEzsignfoldersignerassociationID" + "\\}", localVarApiClient.escapeString(pkiEzsignfoldersignerassociationID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ezsignfoldersignerassociationGetObjectV1ValidateBeforeCall(Integer pkiEzsignfoldersignerassociationID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsignfoldersignerassociationID' is set
        if (pkiEzsignfoldersignerassociationID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignfoldersignerassociationID' when calling ezsignfoldersignerassociationGetObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignfoldersignerassociationGetObjectV1Call(pkiEzsignfoldersignerassociationID, _callback);
        return localVarCall;

    }

    /**
     * Retrieve an existing Ezsignfoldersignerassociation
     * 
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @return EzsignfoldersignerassociationGetObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public EzsignfoldersignerassociationGetObjectV1Response ezsignfoldersignerassociationGetObjectV1(Integer pkiEzsignfoldersignerassociationID) throws ApiException {
        ApiResponse<EzsignfoldersignerassociationGetObjectV1Response> localVarResp = ezsignfoldersignerassociationGetObjectV1WithHttpInfo(pkiEzsignfoldersignerassociationID);
        return localVarResp.getData();
    }

    /**
     * Retrieve an existing Ezsignfoldersignerassociation
     * 
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @return ApiResponse&lt;EzsignfoldersignerassociationGetObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignfoldersignerassociationGetObjectV1Response> ezsignfoldersignerassociationGetObjectV1WithHttpInfo(Integer pkiEzsignfoldersignerassociationID) throws ApiException {
        okhttp3.Call localVarCall = ezsignfoldersignerassociationGetObjectV1ValidateBeforeCall(pkiEzsignfoldersignerassociationID, null);
        Type localVarReturnType = new TypeToken<EzsignfoldersignerassociationGetObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve an existing Ezsignfoldersignerassociation (asynchronously)
     * 
     * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfoldersignerassociationGetObjectV1Async(Integer pkiEzsignfoldersignerassociationID, final ApiCallback<EzsignfoldersignerassociationGetObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignfoldersignerassociationGetObjectV1ValidateBeforeCall(pkiEzsignfoldersignerassociationID, _callback);
        Type localVarReturnType = new TypeToken<EzsignfoldersignerassociationGetObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
