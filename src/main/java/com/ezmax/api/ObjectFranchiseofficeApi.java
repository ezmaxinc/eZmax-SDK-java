/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.29
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


import com.ezmax.api.model.CommonGetAutocompleteV1Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectFranchiseofficeApi {
    private ApiClient localVarApiClient;

    public ObjectFranchiseofficeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectFranchiseofficeApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for franchiseofficeGetAutocompleteV1
     * @param sSelector The type of Franchiseoffices to return (required)
     * @param sQuery Allow to filter on the option value (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call franchiseofficeGetAutocompleteV1Call(String sSelector, String sQuery, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/object/franchiseoffice/getAutocomplete/{sSelector}"
            .replaceAll("\\{" + "sSelector" + "\\}", localVarApiClient.escapeString(sSelector.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (sQuery != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sQuery", sQuery));
        }

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
    private okhttp3.Call franchiseofficeGetAutocompleteV1ValidateBeforeCall(String sSelector, String sQuery, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'sSelector' is set
        if (sSelector == null) {
            throw new ApiException("Missing the required parameter 'sSelector' when calling franchiseofficeGetAutocompleteV1(Async)");
        }
        

        okhttp3.Call localVarCall = franchiseofficeGetAutocompleteV1Call(sSelector, sQuery, _callback);
        return localVarCall;

    }

    /**
     * Retrieve Franchiseoffices and IDs
     * Get the list of Franchiseoffices to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Franchiseoffices to return (required)
     * @param sQuery Allow to filter on the option value (optional)
     * @return CommonGetAutocompleteV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public CommonGetAutocompleteV1Response franchiseofficeGetAutocompleteV1(String sSelector, String sQuery) throws ApiException {
        ApiResponse<CommonGetAutocompleteV1Response> localVarResp = franchiseofficeGetAutocompleteV1WithHttpInfo(sSelector, sQuery);
        return localVarResp.getData();
    }

    /**
     * Retrieve Franchiseoffices and IDs
     * Get the list of Franchiseoffices to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Franchiseoffices to return (required)
     * @param sQuery Allow to filter on the option value (optional)
     * @return ApiResponse&lt;CommonGetAutocompleteV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonGetAutocompleteV1Response> franchiseofficeGetAutocompleteV1WithHttpInfo(String sSelector, String sQuery) throws ApiException {
        okhttp3.Call localVarCall = franchiseofficeGetAutocompleteV1ValidateBeforeCall(sSelector, sQuery, null);
        Type localVarReturnType = new TypeToken<CommonGetAutocompleteV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve Franchiseoffices and IDs (asynchronously)
     * Get the list of Franchiseoffices to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Franchiseoffices to return (required)
     * @param sQuery Allow to filter on the option value (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call franchiseofficeGetAutocompleteV1Async(String sSelector, String sQuery, final ApiCallback<CommonGetAutocompleteV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = franchiseofficeGetAutocompleteV1ValidateBeforeCall(sSelector, sQuery, _callback);
        Type localVarReturnType = new TypeToken<CommonGetAutocompleteV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
