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


import com.ezmax.api.model.UserCreateEzsignuserV1Request;
import com.ezmax.api.model.UserCreateEzsignuserV1Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModuleUserApi {
    private ApiClient localVarApiClient;

    public ModuleUserApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ModuleUserApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for userCreateEzsignuserV1
     * @param userCreateEzsignuserV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userCreateEzsignuserV1Call(List<UserCreateEzsignuserV1Request> userCreateEzsignuserV1Request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = userCreateEzsignuserV1Request;

        // create path and map variables
        String localVarPath = "/1/module/user/createezsignuser";

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
    private okhttp3.Call userCreateEzsignuserV1ValidateBeforeCall(List<UserCreateEzsignuserV1Request> userCreateEzsignuserV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userCreateEzsignuserV1Request' is set
        if (userCreateEzsignuserV1Request == null) {
            throw new ApiException("Missing the required parameter 'userCreateEzsignuserV1Request' when calling userCreateEzsignuserV1(Async)");
        }
        

        okhttp3.Call localVarCall = userCreateEzsignuserV1Call(userCreateEzsignuserV1Request, _callback);
        return localVarCall;

    }

    /**
     * Create a new User of type Ezsignuser
     * The endpoint allows to initiate the creation or a user of type Ezsignuser.  The user will be created only once the email verification process will be completed
     * @param userCreateEzsignuserV1Request  (required)
     * @return UserCreateEzsignuserV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public UserCreateEzsignuserV1Response userCreateEzsignuserV1(List<UserCreateEzsignuserV1Request> userCreateEzsignuserV1Request) throws ApiException {
        ApiResponse<UserCreateEzsignuserV1Response> localVarResp = userCreateEzsignuserV1WithHttpInfo(userCreateEzsignuserV1Request);
        return localVarResp.getData();
    }

    /**
     * Create a new User of type Ezsignuser
     * The endpoint allows to initiate the creation or a user of type Ezsignuser.  The user will be created only once the email verification process will be completed
     * @param userCreateEzsignuserV1Request  (required)
     * @return ApiResponse&lt;UserCreateEzsignuserV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserCreateEzsignuserV1Response> userCreateEzsignuserV1WithHttpInfo(List<UserCreateEzsignuserV1Request> userCreateEzsignuserV1Request) throws ApiException {
        okhttp3.Call localVarCall = userCreateEzsignuserV1ValidateBeforeCall(userCreateEzsignuserV1Request, null);
        Type localVarReturnType = new TypeToken<UserCreateEzsignuserV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new User of type Ezsignuser (asynchronously)
     * The endpoint allows to initiate the creation or a user of type Ezsignuser.  The user will be created only once the email verification process will be completed
     * @param userCreateEzsignuserV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userCreateEzsignuserV1Async(List<UserCreateEzsignuserV1Request> userCreateEzsignuserV1Request, final ApiCallback<UserCreateEzsignuserV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = userCreateEzsignuserV1ValidateBeforeCall(userCreateEzsignuserV1Request, _callback);
        Type localVarReturnType = new TypeToken<UserCreateEzsignuserV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
