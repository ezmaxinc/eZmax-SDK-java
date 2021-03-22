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


import com.ezmax.api.model.FranchisereferalincomeCreateObjectV1Request;
import com.ezmax.api.model.FranchisereferalincomeCreateObjectV1Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectFranchisereferalincomeApi {
    private ApiClient localVarApiClient;

    public ObjectFranchisereferalincomeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectFranchisereferalincomeApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for franchisereferalincomeCreateObjectV1
     * @param franchisereferalincomeCreateObjectV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call franchisereferalincomeCreateObjectV1Call(List<FranchisereferalincomeCreateObjectV1Request> franchisereferalincomeCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = franchisereferalincomeCreateObjectV1Request;

        // create path and map variables
        String localVarPath = "/1/object/franchisereferalincome";

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
    private okhttp3.Call franchisereferalincomeCreateObjectV1ValidateBeforeCall(List<FranchisereferalincomeCreateObjectV1Request> franchisereferalincomeCreateObjectV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'franchisereferalincomeCreateObjectV1Request' is set
        if (franchisereferalincomeCreateObjectV1Request == null) {
            throw new ApiException("Missing the required parameter 'franchisereferalincomeCreateObjectV1Request' when calling franchisereferalincomeCreateObjectV1(Async)");
        }
        

        okhttp3.Call localVarCall = franchisereferalincomeCreateObjectV1Call(franchisereferalincomeCreateObjectV1Request, _callback);
        return localVarCall;

    }

    /**
     * Create a new Franchisereferalincome
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param franchisereferalincomeCreateObjectV1Request  (required)
     * @return FranchisereferalincomeCreateObjectV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public FranchisereferalincomeCreateObjectV1Response franchisereferalincomeCreateObjectV1(List<FranchisereferalincomeCreateObjectV1Request> franchisereferalincomeCreateObjectV1Request) throws ApiException {
        ApiResponse<FranchisereferalincomeCreateObjectV1Response> localVarResp = franchisereferalincomeCreateObjectV1WithHttpInfo(franchisereferalincomeCreateObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Create a new Franchisereferalincome
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param franchisereferalincomeCreateObjectV1Request  (required)
     * @return ApiResponse&lt;FranchisereferalincomeCreateObjectV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FranchisereferalincomeCreateObjectV1Response> franchisereferalincomeCreateObjectV1WithHttpInfo(List<FranchisereferalincomeCreateObjectV1Request> franchisereferalincomeCreateObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = franchisereferalincomeCreateObjectV1ValidateBeforeCall(franchisereferalincomeCreateObjectV1Request, null);
        Type localVarReturnType = new TypeToken<FranchisereferalincomeCreateObjectV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Franchisereferalincome (asynchronously)
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param franchisereferalincomeCreateObjectV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call franchisereferalincomeCreateObjectV1Async(List<FranchisereferalincomeCreateObjectV1Request> franchisereferalincomeCreateObjectV1Request, final ApiCallback<FranchisereferalincomeCreateObjectV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = franchisereferalincomeCreateObjectV1ValidateBeforeCall(franchisereferalincomeCreateObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<FranchisereferalincomeCreateObjectV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
