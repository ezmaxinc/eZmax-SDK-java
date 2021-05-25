/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.43
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.CommonResponseError;
import com.ezmax.api.model.SsprResetPasswordRequestV1Request;
import com.ezmax.api.model.SsprResetPasswordV1Request;
import com.ezmax.api.model.SsprSendUsernamesV1Request;
import com.ezmax.api.model.SsprUnlockAccountRequestV1Request;
import com.ezmax.api.model.SsprUnlockAccountV1Request;
import com.ezmax.api.model.SsprValidateTokenV1Request;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModuleSsprApi
 */
@Ignore
public class ModuleSsprApiTest {

    private final ModuleSsprApi api = new ModuleSsprApi();

    
    /**
     * Reset Password Request
     *
     * This endpoint sends an email with a link to reset the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ssprResetPasswordRequestV1Test() throws ApiException {
        SsprResetPasswordRequestV1Request ssprResetPasswordRequestV1Request = null;
        api.ssprResetPasswordRequestV1(ssprResetPasswordRequestV1Request);

        // TODO: test validations
    }
    
    /**
     * Reset Password
     *
     * This endpoint resets the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ssprResetPasswordV1Test() throws ApiException {
        SsprResetPasswordV1Request ssprResetPasswordV1Request = null;
        api.ssprResetPasswordV1(ssprResetPasswordV1Request);

        // TODO: test validations
    }
    
    /**
     * Send username(s)
     *
     * This endpoint returns an email with the username(s) matching the email address provided in case of forgotten username
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ssprSendUsernamesV1Test() throws ApiException {
        SsprSendUsernamesV1Request ssprSendUsernamesV1Request = null;
        api.ssprSendUsernamesV1(ssprSendUsernamesV1Request);

        // TODO: test validations
    }
    
    /**
     * Unlock Account Request
     *
     * This endpoint sends an email with a link to unlock the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ssprUnlockAccountRequestV1Test() throws ApiException {
        SsprUnlockAccountRequestV1Request ssprUnlockAccountRequestV1Request = null;
        api.ssprUnlockAccountRequestV1(ssprUnlockAccountRequestV1Request);

        // TODO: test validations
    }
    
    /**
     * Unlock Account
     *
     * This endpoint unlocks the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ssprUnlockAccountV1Test() throws ApiException {
        SsprUnlockAccountV1Request ssprUnlockAccountV1Request = null;
        api.ssprUnlockAccountV1(ssprUnlockAccountV1Request);

        // TODO: test validations
    }
    
    /**
     * Validate Token
     *
     * This endpoint validates if a Token is valid and not expired.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ssprValidateTokenV1Test() throws ApiException {
        SsprValidateTokenV1Request ssprValidateTokenV1Request = null;
        api.ssprValidateTokenV1(ssprValidateTokenV1Request);

        // TODO: test validations
    }
    
}
