/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.41
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
import com.ezmax.api.model.EzsignfolderCreateObjectV1Request;
import com.ezmax.api.model.EzsignfolderCreateObjectV1Response;
import com.ezmax.api.model.EzsignfolderDeleteObjectV1Response;
import com.ezmax.api.model.EzsignfolderGetObjectV1Response;
import com.ezmax.api.model.EzsignfolderSendV1Request;
import com.ezmax.api.model.EzsignfolderSendV1Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectEzsignfolderApi {
    private ApiClient localVarApiClient;

    public ObjectEzsignfolderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectEzsignfolderApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for ezsignfolderCreateObjectV1
     * @param ezsignfolderCreateObjectV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfolderCreateObjectV1Call(List<EzsignfolderCreateObjectV1Request> ezsignfolderCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = ezsignfolderCreateObjectV1Request;

        // create path and map variables
        String localVarPath = "/1/object/ezsignfolder";

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
    private okhttp3.Call ezsignfolderCreateObjectV1ValidateBeforeCall(List<EzsignfolderCreateObjectV1Request> ezsignfolderCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ezsignfolderCreateObjectV1Request' is set
        if (ezsignfolderCreateObjectV1Request == null) {
            throw new ApiException("Missing the required parameter 'ezsignfolderCreateObjectV1Request' when calling ezsignfolderCreateObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignfolderCreateObjectV1Call(ezsignfolderCreateObjectV1Request, _callback);
        return localVarCall;

    }

    /**
     * Create a new Ezsignfolder
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param ezsignfolderCreateObjectV1Request  (required)
     * @return EzsignfolderCreateObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public EzsignfolderCreateObjectV1Response ezsignfolderCreateObjectV1(List<EzsignfolderCreateObjectV1Request> ezsignfolderCreateObjectV1Request) throws ApiException {
        ApiResponse<EzsignfolderCreateObjectV1Response> localVarResp = ezsignfolderCreateObjectV1WithHttpInfo(ezsignfolderCreateObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Create a new Ezsignfolder
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param ezsignfolderCreateObjectV1Request  (required)
     * @return ApiResponse&lt;EzsignfolderCreateObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignfolderCreateObjectV1Response> ezsignfolderCreateObjectV1WithHttpInfo(List<EzsignfolderCreateObjectV1Request> ezsignfolderCreateObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = ezsignfolderCreateObjectV1ValidateBeforeCall(ezsignfolderCreateObjectV1Request, null);
        Type localVarReturnType = new TypeToken<EzsignfolderCreateObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Ezsignfolder (asynchronously)
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param ezsignfolderCreateObjectV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfolderCreateObjectV1Async(List<EzsignfolderCreateObjectV1Request> ezsignfolderCreateObjectV1Request, final ApiCallback<EzsignfolderCreateObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignfolderCreateObjectV1ValidateBeforeCall(ezsignfolderCreateObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<EzsignfolderCreateObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignfolderDeleteObjectV1
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
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
    public okhttp3.Call ezsignfolderDeleteObjectV1Call(Integer pkiEzsignfolderID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/object/ezsignfolder/{pkiEzsignfolderID}"
            .replaceAll("\\{" + "pkiEzsignfolderID" + "\\}", localVarApiClient.escapeString(pkiEzsignfolderID.toString()));

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
    private okhttp3.Call ezsignfolderDeleteObjectV1ValidateBeforeCall(Integer pkiEzsignfolderID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsignfolderID' is set
        if (pkiEzsignfolderID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderDeleteObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignfolderDeleteObjectV1Call(pkiEzsignfolderID, _callback);
        return localVarCall;

    }

    /**
     * Delete an existing Ezsignfolder
     * 
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
     * @return EzsignfolderDeleteObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public EzsignfolderDeleteObjectV1Response ezsignfolderDeleteObjectV1(Integer pkiEzsignfolderID) throws ApiException {
        ApiResponse<EzsignfolderDeleteObjectV1Response> localVarResp = ezsignfolderDeleteObjectV1WithHttpInfo(pkiEzsignfolderID);
        return localVarResp.getData();
    }

    /**
     * Delete an existing Ezsignfolder
     * 
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
     * @return ApiResponse&lt;EzsignfolderDeleteObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignfolderDeleteObjectV1Response> ezsignfolderDeleteObjectV1WithHttpInfo(Integer pkiEzsignfolderID) throws ApiException {
        okhttp3.Call localVarCall = ezsignfolderDeleteObjectV1ValidateBeforeCall(pkiEzsignfolderID, null);
        Type localVarReturnType = new TypeToken<EzsignfolderDeleteObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete an existing Ezsignfolder (asynchronously)
     * 
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
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
    public okhttp3.Call ezsignfolderDeleteObjectV1Async(Integer pkiEzsignfolderID, final ApiCallback<EzsignfolderDeleteObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignfolderDeleteObjectV1ValidateBeforeCall(pkiEzsignfolderID, _callback);
        Type localVarReturnType = new TypeToken<EzsignfolderDeleteObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignfolderGetChildrenV1
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfolderGetChildrenV1Call(Integer pkiEzsignfolderID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/object/ezsignfolder/{pkiEzsignfolderID}/getChildren"
            .replaceAll("\\{" + "pkiEzsignfolderID" + "\\}", localVarApiClient.escapeString(pkiEzsignfolderID.toString()));

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
    private okhttp3.Call ezsignfolderGetChildrenV1ValidateBeforeCall(Integer pkiEzsignfolderID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsignfolderID' is set
        if (pkiEzsignfolderID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderGetChildrenV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignfolderGetChildrenV1Call(pkiEzsignfolderID, _callback);
        return localVarCall;

    }

    /**
     * Retrieve an existing Ezsignfolder&#39;s children IDs
     * 
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public void ezsignfolderGetChildrenV1(Integer pkiEzsignfolderID) throws ApiException {
        ezsignfolderGetChildrenV1WithHttpInfo(pkiEzsignfolderID);
    }

    /**
     * Retrieve an existing Ezsignfolder&#39;s children IDs
     * 
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> ezsignfolderGetChildrenV1WithHttpInfo(Integer pkiEzsignfolderID) throws ApiException {
        okhttp3.Call localVarCall = ezsignfolderGetChildrenV1ValidateBeforeCall(pkiEzsignfolderID, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Retrieve an existing Ezsignfolder&#39;s children IDs (asynchronously)
     * 
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignfolderGetChildrenV1Async(Integer pkiEzsignfolderID, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignfolderGetChildrenV1ValidateBeforeCall(pkiEzsignfolderID, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignfolderGetObjectV1
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
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
    public okhttp3.Call ezsignfolderGetObjectV1Call(Integer pkiEzsignfolderID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/object/ezsignfolder/{pkiEzsignfolderID}"
            .replaceAll("\\{" + "pkiEzsignfolderID" + "\\}", localVarApiClient.escapeString(pkiEzsignfolderID.toString()));

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
    private okhttp3.Call ezsignfolderGetObjectV1ValidateBeforeCall(Integer pkiEzsignfolderID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsignfolderID' is set
        if (pkiEzsignfolderID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderGetObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignfolderGetObjectV1Call(pkiEzsignfolderID, _callback);
        return localVarCall;

    }

    /**
     * Retrieve an existing Ezsignfolder
     * 
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
     * @return EzsignfolderGetObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public EzsignfolderGetObjectV1Response ezsignfolderGetObjectV1(Integer pkiEzsignfolderID) throws ApiException {
        ApiResponse<EzsignfolderGetObjectV1Response> localVarResp = ezsignfolderGetObjectV1WithHttpInfo(pkiEzsignfolderID);
        return localVarResp.getData();
    }

    /**
     * Retrieve an existing Ezsignfolder
     * 
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
     * @return ApiResponse&lt;EzsignfolderGetObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignfolderGetObjectV1Response> ezsignfolderGetObjectV1WithHttpInfo(Integer pkiEzsignfolderID) throws ApiException {
        okhttp3.Call localVarCall = ezsignfolderGetObjectV1ValidateBeforeCall(pkiEzsignfolderID, null);
        Type localVarReturnType = new TypeToken<EzsignfolderGetObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve an existing Ezsignfolder (asynchronously)
     * 
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
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
    public okhttp3.Call ezsignfolderGetObjectV1Async(Integer pkiEzsignfolderID, final ApiCallback<EzsignfolderGetObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignfolderGetObjectV1ValidateBeforeCall(pkiEzsignfolderID, _callback);
        Type localVarReturnType = new TypeToken<EzsignfolderGetObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignfolderSendV1
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
     * @param ezsignfolderSendV1Request  (required)
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
    public okhttp3.Call ezsignfolderSendV1Call(Integer pkiEzsignfolderID, EzsignfolderSendV1Request ezsignfolderSendV1Request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = ezsignfolderSendV1Request;

        // create path and map variables
        String localVarPath = "/1/object/ezsignfolder/{pkiEzsignfolderID}/send"
            .replaceAll("\\{" + "pkiEzsignfolderID" + "\\}", localVarApiClient.escapeString(pkiEzsignfolderID.toString()));

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
    private okhttp3.Call ezsignfolderSendV1ValidateBeforeCall(Integer pkiEzsignfolderID, EzsignfolderSendV1Request ezsignfolderSendV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsignfolderID' is set
        if (pkiEzsignfolderID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignfolderID' when calling ezsignfolderSendV1(Async)");
        }
        
        // verify the required parameter 'ezsignfolderSendV1Request' is set
        if (ezsignfolderSendV1Request == null) {
            throw new ApiException("Missing the required parameter 'ezsignfolderSendV1Request' when calling ezsignfolderSendV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignfolderSendV1Call(pkiEzsignfolderID, ezsignfolderSendV1Request, _callback);
        return localVarCall;

    }

    /**
     * Send the Ezsignfolder to the signatories for signature
     * 
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
     * @param ezsignfolderSendV1Request  (required)
     * @return EzsignfolderSendV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public EzsignfolderSendV1Response ezsignfolderSendV1(Integer pkiEzsignfolderID, EzsignfolderSendV1Request ezsignfolderSendV1Request) throws ApiException {
        ApiResponse<EzsignfolderSendV1Response> localVarResp = ezsignfolderSendV1WithHttpInfo(pkiEzsignfolderID, ezsignfolderSendV1Request);
        return localVarResp.getData();
    }

    /**
     * Send the Ezsignfolder to the signatories for signature
     * 
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
     * @param ezsignfolderSendV1Request  (required)
     * @return ApiResponse&lt;EzsignfolderSendV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignfolderSendV1Response> ezsignfolderSendV1WithHttpInfo(Integer pkiEzsignfolderID, EzsignfolderSendV1Request ezsignfolderSendV1Request) throws ApiException {
        okhttp3.Call localVarCall = ezsignfolderSendV1ValidateBeforeCall(pkiEzsignfolderID, ezsignfolderSendV1Request, null);
        Type localVarReturnType = new TypeToken<EzsignfolderSendV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send the Ezsignfolder to the signatories for signature (asynchronously)
     * 
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (required)
     * @param ezsignfolderSendV1Request  (required)
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
    public okhttp3.Call ezsignfolderSendV1Async(Integer pkiEzsignfolderID, EzsignfolderSendV1Request ezsignfolderSendV1Request, final ApiCallback<EzsignfolderSendV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignfolderSendV1ValidateBeforeCall(pkiEzsignfolderID, ezsignfolderSendV1Request, _callback);
        Type localVarReturnType = new TypeToken<EzsignfolderSendV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
