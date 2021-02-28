/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.31
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
import com.ezmax.api.model.SsprResetPasswordRequestV1Request;
import com.ezmax.api.model.SsprResetPasswordV1Request;
import com.ezmax.api.model.SsprSendUsernamesV1Request;
import com.ezmax.api.model.SsprUnlockAccountRequestV1Request;
import com.ezmax.api.model.SsprUnlockAccountV1Request;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModuleSsprApi {
    private ApiClient localVarApiClient;

    public ModuleSsprApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ModuleSsprApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for ssprResetPasswordRequestV1
     * @param ssprResetPasswordRequestV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The request was accepted.  Do not misinterpret as \&quot;the account exists\&quot;. It only means an email will be sent if (and only if) an account exists. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ssprResetPasswordRequestV1Call(SsprResetPasswordRequestV1Request ssprResetPasswordRequestV1Request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = ssprResetPasswordRequestV1Request;

        // create path and map variables
        String localVarPath = "/1/module/sspr/resetPasswordRequest/";

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
    private okhttp3.Call ssprResetPasswordRequestV1ValidateBeforeCall(SsprResetPasswordRequestV1Request ssprResetPasswordRequestV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ssprResetPasswordRequestV1Request' is set
        if (ssprResetPasswordRequestV1Request == null) {
            throw new ApiException("Missing the required parameter 'ssprResetPasswordRequestV1Request' when calling ssprResetPasswordRequestV1(Async)");
        }
        

        okhttp3.Call localVarCall = ssprResetPasswordRequestV1Call(ssprResetPasswordRequestV1Request, _callback);
        return localVarCall;

    }

    /**
     * Reset Password Request
     * This endpoint sends an email with a link to reset the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     * @param ssprResetPasswordRequestV1Request  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The request was accepted.  Do not misinterpret as \&quot;the account exists\&quot;. It only means an email will be sent if (and only if) an account exists. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public void ssprResetPasswordRequestV1(SsprResetPasswordRequestV1Request ssprResetPasswordRequestV1Request) throws ApiException {
        ssprResetPasswordRequestV1WithHttpInfo(ssprResetPasswordRequestV1Request);
    }

    /**
     * Reset Password Request
     * This endpoint sends an email with a link to reset the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     * @param ssprResetPasswordRequestV1Request  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The request was accepted.  Do not misinterpret as \&quot;the account exists\&quot;. It only means an email will be sent if (and only if) an account exists. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> ssprResetPasswordRequestV1WithHttpInfo(SsprResetPasswordRequestV1Request ssprResetPasswordRequestV1Request) throws ApiException {
        okhttp3.Call localVarCall = ssprResetPasswordRequestV1ValidateBeforeCall(ssprResetPasswordRequestV1Request, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Reset Password Request (asynchronously)
     * This endpoint sends an email with a link to reset the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     * @param ssprResetPasswordRequestV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The request was accepted.  Do not misinterpret as \&quot;the account exists\&quot;. It only means an email will be sent if (and only if) an account exists. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ssprResetPasswordRequestV1Async(SsprResetPasswordRequestV1Request ssprResetPasswordRequestV1Request, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = ssprResetPasswordRequestV1ValidateBeforeCall(ssprResetPasswordRequestV1Request, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for ssprResetPasswordV1
     * @param ssprResetPasswordV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The password was reset Successfully </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ssprResetPasswordV1Call(SsprResetPasswordV1Request ssprResetPasswordV1Request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = ssprResetPasswordV1Request;

        // create path and map variables
        String localVarPath = "/1/module/sspr/resetPassword";

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
    private okhttp3.Call ssprResetPasswordV1ValidateBeforeCall(SsprResetPasswordV1Request ssprResetPasswordV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ssprResetPasswordV1Request' is set
        if (ssprResetPasswordV1Request == null) {
            throw new ApiException("Missing the required parameter 'ssprResetPasswordV1Request' when calling ssprResetPasswordV1(Async)");
        }
        

        okhttp3.Call localVarCall = ssprResetPasswordV1Call(ssprResetPasswordV1Request, _callback);
        return localVarCall;

    }

    /**
     * Reset Password
     * This endpoint resets the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     * @param ssprResetPasswordV1Request  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The password was reset Successfully </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public void ssprResetPasswordV1(SsprResetPasswordV1Request ssprResetPasswordV1Request) throws ApiException {
        ssprResetPasswordV1WithHttpInfo(ssprResetPasswordV1Request);
    }

    /**
     * Reset Password
     * This endpoint resets the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     * @param ssprResetPasswordV1Request  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The password was reset Successfully </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> ssprResetPasswordV1WithHttpInfo(SsprResetPasswordV1Request ssprResetPasswordV1Request) throws ApiException {
        okhttp3.Call localVarCall = ssprResetPasswordV1ValidateBeforeCall(ssprResetPasswordV1Request, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Reset Password (asynchronously)
     * This endpoint resets the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     * @param ssprResetPasswordV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The password was reset Successfully </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ssprResetPasswordV1Async(SsprResetPasswordV1Request ssprResetPasswordV1Request, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = ssprResetPasswordV1ValidateBeforeCall(ssprResetPasswordV1Request, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for ssprSendUsernamesV1
     * @param ssprSendUsernamesV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The request was accepted.  Do not misinterpret as \&quot;the email address has an account attached to it\&quot;. It only means an email will be sent if (and only if) an account exists for that email address. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ssprSendUsernamesV1Call(SsprSendUsernamesV1Request ssprSendUsernamesV1Request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = ssprSendUsernamesV1Request;

        // create path and map variables
        String localVarPath = "/1/module/sspr/sendUsernames";

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
    private okhttp3.Call ssprSendUsernamesV1ValidateBeforeCall(SsprSendUsernamesV1Request ssprSendUsernamesV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ssprSendUsernamesV1Request' is set
        if (ssprSendUsernamesV1Request == null) {
            throw new ApiException("Missing the required parameter 'ssprSendUsernamesV1Request' when calling ssprSendUsernamesV1(Async)");
        }
        

        okhttp3.Call localVarCall = ssprSendUsernamesV1Call(ssprSendUsernamesV1Request, _callback);
        return localVarCall;

    }

    /**
     * Send username(s)
     * This endpoint returns an email with the username(s) matching the email address provided in case of forgotten username
     * @param ssprSendUsernamesV1Request  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The request was accepted.  Do not misinterpret as \&quot;the email address has an account attached to it\&quot;. It only means an email will be sent if (and only if) an account exists for that email address. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public void ssprSendUsernamesV1(SsprSendUsernamesV1Request ssprSendUsernamesV1Request) throws ApiException {
        ssprSendUsernamesV1WithHttpInfo(ssprSendUsernamesV1Request);
    }

    /**
     * Send username(s)
     * This endpoint returns an email with the username(s) matching the email address provided in case of forgotten username
     * @param ssprSendUsernamesV1Request  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The request was accepted.  Do not misinterpret as \&quot;the email address has an account attached to it\&quot;. It only means an email will be sent if (and only if) an account exists for that email address. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> ssprSendUsernamesV1WithHttpInfo(SsprSendUsernamesV1Request ssprSendUsernamesV1Request) throws ApiException {
        okhttp3.Call localVarCall = ssprSendUsernamesV1ValidateBeforeCall(ssprSendUsernamesV1Request, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Send username(s) (asynchronously)
     * This endpoint returns an email with the username(s) matching the email address provided in case of forgotten username
     * @param ssprSendUsernamesV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The request was accepted.  Do not misinterpret as \&quot;the email address has an account attached to it\&quot;. It only means an email will be sent if (and only if) an account exists for that email address. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ssprSendUsernamesV1Async(SsprSendUsernamesV1Request ssprSendUsernamesV1Request, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = ssprSendUsernamesV1ValidateBeforeCall(ssprSendUsernamesV1Request, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for ssprUnlockAccountRequestV1
     * @param ssprUnlockAccountRequestV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The request was accepted.  Do not misinterpret as \&quot;the account exists\&quot;. It only means an email will be sent if (and only if) an account exists. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ssprUnlockAccountRequestV1Call(SsprUnlockAccountRequestV1Request ssprUnlockAccountRequestV1Request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = ssprUnlockAccountRequestV1Request;

        // create path and map variables
        String localVarPath = "/1/module/sspr/unlockAccountRequest";

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
    private okhttp3.Call ssprUnlockAccountRequestV1ValidateBeforeCall(SsprUnlockAccountRequestV1Request ssprUnlockAccountRequestV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ssprUnlockAccountRequestV1Request' is set
        if (ssprUnlockAccountRequestV1Request == null) {
            throw new ApiException("Missing the required parameter 'ssprUnlockAccountRequestV1Request' when calling ssprUnlockAccountRequestV1(Async)");
        }
        

        okhttp3.Call localVarCall = ssprUnlockAccountRequestV1Call(ssprUnlockAccountRequestV1Request, _callback);
        return localVarCall;

    }

    /**
     * Unlock Account Request
     * This endpoint sends an email with a link to unlock the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     * @param ssprUnlockAccountRequestV1Request  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The request was accepted.  Do not misinterpret as \&quot;the account exists\&quot;. It only means an email will be sent if (and only if) an account exists. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public void ssprUnlockAccountRequestV1(SsprUnlockAccountRequestV1Request ssprUnlockAccountRequestV1Request) throws ApiException {
        ssprUnlockAccountRequestV1WithHttpInfo(ssprUnlockAccountRequestV1Request);
    }

    /**
     * Unlock Account Request
     * This endpoint sends an email with a link to unlock the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     * @param ssprUnlockAccountRequestV1Request  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The request was accepted.  Do not misinterpret as \&quot;the account exists\&quot;. It only means an email will be sent if (and only if) an account exists. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> ssprUnlockAccountRequestV1WithHttpInfo(SsprUnlockAccountRequestV1Request ssprUnlockAccountRequestV1Request) throws ApiException {
        okhttp3.Call localVarCall = ssprUnlockAccountRequestV1ValidateBeforeCall(ssprUnlockAccountRequestV1Request, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Unlock Account Request (asynchronously)
     * This endpoint sends an email with a link to unlock the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     * @param ssprUnlockAccountRequestV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The request was accepted.  Do not misinterpret as \&quot;the account exists\&quot;. It only means an email will be sent if (and only if) an account exists. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ssprUnlockAccountRequestV1Async(SsprUnlockAccountRequestV1Request ssprUnlockAccountRequestV1Request, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = ssprUnlockAccountRequestV1ValidateBeforeCall(ssprUnlockAccountRequestV1Request, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for ssprUnlockAccountV1
     * @param ssprUnlockAccountV1Request  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The account was unlocked Successfully </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ssprUnlockAccountV1Call(SsprUnlockAccountV1Request ssprUnlockAccountV1Request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = ssprUnlockAccountV1Request;

        // create path and map variables
        String localVarPath = "/1/module/sspr/unlockAccount";

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
    private okhttp3.Call ssprUnlockAccountV1ValidateBeforeCall(SsprUnlockAccountV1Request ssprUnlockAccountV1Request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ssprUnlockAccountV1Request' is set
        if (ssprUnlockAccountV1Request == null) {
            throw new ApiException("Missing the required parameter 'ssprUnlockAccountV1Request' when calling ssprUnlockAccountV1(Async)");
        }
        

        okhttp3.Call localVarCall = ssprUnlockAccountV1Call(ssprUnlockAccountV1Request, _callback);
        return localVarCall;

    }

    /**
     * Unlock Account
     * This endpoint unlocks the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     * @param ssprUnlockAccountV1Request  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The account was unlocked Successfully </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public void ssprUnlockAccountV1(SsprUnlockAccountV1Request ssprUnlockAccountV1Request) throws ApiException {
        ssprUnlockAccountV1WithHttpInfo(ssprUnlockAccountV1Request);
    }

    /**
     * Unlock Account
     * This endpoint unlocks the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     * @param ssprUnlockAccountV1Request  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The account was unlocked Successfully </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> ssprUnlockAccountV1WithHttpInfo(SsprUnlockAccountV1Request ssprUnlockAccountV1Request) throws ApiException {
        okhttp3.Call localVarCall = ssprUnlockAccountV1ValidateBeforeCall(ssprUnlockAccountV1Request, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Unlock Account (asynchronously)
     * This endpoint unlocks the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     * @param ssprUnlockAccountV1Request  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The account was unlocked Successfully </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not allowed to call this function </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The element you are trying to work on does not exist </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The syntax of the request is valid but the request cannot be completed. Look for detail in body. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ssprUnlockAccountV1Async(SsprUnlockAccountV1Request ssprUnlockAccountV1Request, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = ssprUnlockAccountV1ValidateBeforeCall(ssprUnlockAccountV1Request, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
