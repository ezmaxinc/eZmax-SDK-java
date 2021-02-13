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

public class ObjectFranchisebrokerApi {
    private ApiClient localVarApiClient;

    public ObjectFranchisebrokerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectFranchisebrokerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for franchisebrokerGetAutocompleteV1
     * @param sSelector The type of Franchisebrokers to return (required)
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
    public okhttp3.Call franchisebrokerGetAutocompleteV1Call(String sSelector, String sQuery, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/object/franchisebroker/getAutocomplete/{sSelector}"
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
    private okhttp3.Call franchisebrokerGetAutocompleteV1ValidateBeforeCall(String sSelector, String sQuery, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'sSelector' is set
        if (sSelector == null) {
            throw new ApiException("Missing the required parameter 'sSelector' when calling franchisebrokerGetAutocompleteV1(Async)");
        }
        

        okhttp3.Call localVarCall = franchisebrokerGetAutocompleteV1Call(sSelector, sQuery, _callback);
        return localVarCall;

    }

    /**
     * Retrieve Franchisebrokers and IDs
     * Get the list of Franchisebrokers to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Franchisebrokers to return (required)
     * @param sQuery Allow to filter on the option value (optional)
     * @return CommonGetAutocompleteV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public CommonGetAutocompleteV1Response franchisebrokerGetAutocompleteV1(String sSelector, String sQuery) throws ApiException {
        ApiResponse<CommonGetAutocompleteV1Response> localVarResp = franchisebrokerGetAutocompleteV1WithHttpInfo(sSelector, sQuery);
        return localVarResp.getData();
    }

    /**
     * Retrieve Franchisebrokers and IDs
     * Get the list of Franchisebrokers to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Franchisebrokers to return (required)
     * @param sQuery Allow to filter on the option value (optional)
     * @return ApiResponse&lt;CommonGetAutocompleteV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommonGetAutocompleteV1Response> franchisebrokerGetAutocompleteV1WithHttpInfo(String sSelector, String sQuery) throws ApiException {
        okhttp3.Call localVarCall = franchisebrokerGetAutocompleteV1ValidateBeforeCall(sSelector, sQuery, null);
        Type localVarReturnType = new TypeToken<CommonGetAutocompleteV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve Franchisebrokers and IDs (asynchronously)
     * Get the list of Franchisebrokers to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Franchisebrokers to return (required)
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
    public okhttp3.Call franchisebrokerGetAutocompleteV1Async(String sSelector, String sQuery, final ApiCallback<CommonGetAutocompleteV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = franchisebrokerGetAutocompleteV1ValidateBeforeCall(sSelector, sQuery, _callback);
        Type localVarReturnType = new TypeToken<CommonGetAutocompleteV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
