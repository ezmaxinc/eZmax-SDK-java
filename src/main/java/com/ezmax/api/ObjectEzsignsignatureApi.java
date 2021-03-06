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
import com.ezmax.api.model.EzsignsignatureCreateObjectV1Request;
import com.ezmax.api.model.EzsignsignatureCreateObjectV1Response;
import com.ezmax.api.model.EzsignsignatureDeleteObjectV1Response;
import com.ezmax.api.model.EzsignsignatureGetObjectV1Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectEzsignsignatureApi {
    private ApiClient localVarApiClient;

    public ObjectEzsignsignatureApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectEzsignsignatureApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for ezsignsignatureCreateObjectV1
     * @param ezsignsignatureCreateObjectV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignsignatureCreateObjectV1Call(List<EzsignsignatureCreateObjectV1Request> ezsignsignatureCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = ezsignsignatureCreateObjectV1Request;

        // create path and map variables
        String localVarPath = "/1/object/ezsignsignature";

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
    private okhttp3.Call ezsignsignatureCreateObjectV1ValidateBeforeCall(List<EzsignsignatureCreateObjectV1Request> ezsignsignatureCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ezsignsignatureCreateObjectV1Request' is set
        if (ezsignsignatureCreateObjectV1Request == null) {
            throw new ApiException("Missing the required parameter 'ezsignsignatureCreateObjectV1Request' when calling ezsignsignatureCreateObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignsignatureCreateObjectV1Call(ezsignsignatureCreateObjectV1Request, _callback);
        return localVarCall;

    }

    /**
     * Create a new Ezsignsignature
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param ezsignsignatureCreateObjectV1Request  (required)
     * @return EzsignsignatureCreateObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public EzsignsignatureCreateObjectV1Response ezsignsignatureCreateObjectV1(List<EzsignsignatureCreateObjectV1Request> ezsignsignatureCreateObjectV1Request) throws ApiException {
        ApiResponse<EzsignsignatureCreateObjectV1Response> localVarResp = ezsignsignatureCreateObjectV1WithHttpInfo(ezsignsignatureCreateObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Create a new Ezsignsignature
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param ezsignsignatureCreateObjectV1Request  (required)
     * @return ApiResponse&lt;EzsignsignatureCreateObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignsignatureCreateObjectV1Response> ezsignsignatureCreateObjectV1WithHttpInfo(List<EzsignsignatureCreateObjectV1Request> ezsignsignatureCreateObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = ezsignsignatureCreateObjectV1ValidateBeforeCall(ezsignsignatureCreateObjectV1Request, null);
        Type localVarReturnType = new TypeToken<EzsignsignatureCreateObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Ezsignsignature (asynchronously)
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param ezsignsignatureCreateObjectV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignsignatureCreateObjectV1Async(List<EzsignsignatureCreateObjectV1Request> ezsignsignatureCreateObjectV1Request, final ApiCallback<EzsignsignatureCreateObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignsignatureCreateObjectV1ValidateBeforeCall(ezsignsignatureCreateObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<EzsignsignatureCreateObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignsignatureDeleteObjectV1
     * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature (required)
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
    public okhttp3.Call ezsignsignatureDeleteObjectV1Call(Integer pkiEzsignsignatureID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/object/ezsignsignature/{pkiEzsignsignatureID}"
            .replaceAll("\\{" + "pkiEzsignsignatureID" + "\\}", localVarApiClient.escapeString(pkiEzsignsignatureID.toString()));

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
    private okhttp3.Call ezsignsignatureDeleteObjectV1ValidateBeforeCall(Integer pkiEzsignsignatureID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsignsignatureID' is set
        if (pkiEzsignsignatureID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureDeleteObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignsignatureDeleteObjectV1Call(pkiEzsignsignatureID, _callback);
        return localVarCall;

    }

    /**
     * Delete an existing Ezsignsignature
     * 
     * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature (required)
     * @return EzsignsignatureDeleteObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public EzsignsignatureDeleteObjectV1Response ezsignsignatureDeleteObjectV1(Integer pkiEzsignsignatureID) throws ApiException {
        ApiResponse<EzsignsignatureDeleteObjectV1Response> localVarResp = ezsignsignatureDeleteObjectV1WithHttpInfo(pkiEzsignsignatureID);
        return localVarResp.getData();
    }

    /**
     * Delete an existing Ezsignsignature
     * 
     * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature (required)
     * @return ApiResponse&lt;EzsignsignatureDeleteObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignsignatureDeleteObjectV1Response> ezsignsignatureDeleteObjectV1WithHttpInfo(Integer pkiEzsignsignatureID) throws ApiException {
        okhttp3.Call localVarCall = ezsignsignatureDeleteObjectV1ValidateBeforeCall(pkiEzsignsignatureID, null);
        Type localVarReturnType = new TypeToken<EzsignsignatureDeleteObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete an existing Ezsignsignature (asynchronously)
     * 
     * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature (required)
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
    public okhttp3.Call ezsignsignatureDeleteObjectV1Async(Integer pkiEzsignsignatureID, final ApiCallback<EzsignsignatureDeleteObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignsignatureDeleteObjectV1ValidateBeforeCall(pkiEzsignsignatureID, _callback);
        Type localVarReturnType = new TypeToken<EzsignsignatureDeleteObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignsignatureGetChildrenV1
     * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignsignatureGetChildrenV1Call(Integer pkiEzsignsignatureID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/object/ezsignsignature/{pkiEzsignsignatureID}/getChildren"
            .replaceAll("\\{" + "pkiEzsignsignatureID" + "\\}", localVarApiClient.escapeString(pkiEzsignsignatureID.toString()));

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
    private okhttp3.Call ezsignsignatureGetChildrenV1ValidateBeforeCall(Integer pkiEzsignsignatureID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsignsignatureID' is set
        if (pkiEzsignsignatureID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureGetChildrenV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignsignatureGetChildrenV1Call(pkiEzsignsignatureID, _callback);
        return localVarCall;

    }

    /**
     * Retrieve an existing Ezsignsignature&#39;s children IDs
     * 
     * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public void ezsignsignatureGetChildrenV1(Integer pkiEzsignsignatureID) throws ApiException {
        ezsignsignatureGetChildrenV1WithHttpInfo(pkiEzsignsignatureID);
    }

    /**
     * Retrieve an existing Ezsignsignature&#39;s children IDs
     * 
     * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> ezsignsignatureGetChildrenV1WithHttpInfo(Integer pkiEzsignsignatureID) throws ApiException {
        okhttp3.Call localVarCall = ezsignsignatureGetChildrenV1ValidateBeforeCall(pkiEzsignsignatureID, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Retrieve an existing Ezsignsignature&#39;s children IDs (asynchronously)
     * 
     * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ezsignsignatureGetChildrenV1Async(Integer pkiEzsignsignatureID, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignsignatureGetChildrenV1ValidateBeforeCall(pkiEzsignsignatureID, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for ezsignsignatureGetObjectV1
     * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature (required)
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
    public okhttp3.Call ezsignsignatureGetObjectV1Call(Integer pkiEzsignsignatureID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/object/ezsignsignature/{pkiEzsignsignatureID}"
            .replaceAll("\\{" + "pkiEzsignsignatureID" + "\\}", localVarApiClient.escapeString(pkiEzsignsignatureID.toString()));

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
    private okhttp3.Call ezsignsignatureGetObjectV1ValidateBeforeCall(Integer pkiEzsignsignatureID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pkiEzsignsignatureID' is set
        if (pkiEzsignsignatureID == null) {
            throw new ApiException("Missing the required parameter 'pkiEzsignsignatureID' when calling ezsignsignatureGetObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = ezsignsignatureGetObjectV1Call(pkiEzsignsignatureID, _callback);
        return localVarCall;

    }

    /**
     * Retrieve an existing Ezsignsignature
     * 
     * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature (required)
     * @return EzsignsignatureGetObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public EzsignsignatureGetObjectV1Response ezsignsignatureGetObjectV1(Integer pkiEzsignsignatureID) throws ApiException {
        ApiResponse<EzsignsignatureGetObjectV1Response> localVarResp = ezsignsignatureGetObjectV1WithHttpInfo(pkiEzsignsignatureID);
        return localVarResp.getData();
    }

    /**
     * Retrieve an existing Ezsignsignature
     * 
     * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature (required)
     * @return ApiResponse&lt;EzsignsignatureGetObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EzsignsignatureGetObjectV1Response> ezsignsignatureGetObjectV1WithHttpInfo(Integer pkiEzsignsignatureID) throws ApiException {
        okhttp3.Call localVarCall = ezsignsignatureGetObjectV1ValidateBeforeCall(pkiEzsignsignatureID, null);
        Type localVarReturnType = new TypeToken<EzsignsignatureGetObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve an existing Ezsignsignature (asynchronously)
     * 
     * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature (required)
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
    public okhttp3.Call ezsignsignatureGetObjectV1Async(Integer pkiEzsignsignatureID, final ApiCallback<EzsignsignatureGetObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = ezsignsignatureGetObjectV1ValidateBeforeCall(pkiEzsignsignatureID, _callback);
        Type localVarReturnType = new TypeToken<EzsignsignatureGetObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
