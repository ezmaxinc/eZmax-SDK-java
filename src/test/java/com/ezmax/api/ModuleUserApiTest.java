/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.45
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api;

import eZmaxAPI.ApiException;
import com.ezmax.api.model.UserCreateEzsignuserV1Request;
import com.ezmax.api.model.UserCreateEzsignuserV1Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModuleUserApi
 */
@Ignore
public class ModuleUserApiTest {

    private final ModuleUserApi api = new ModuleUserApi();

    
    /**
     * Create a new User of type Ezsignuser
     *
     * The endpoint allows to initiate the creation or a user of type Ezsignuser.  The user will be created only once the email verification process will be completed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCreateEzsignuserV1Test() throws ApiException {
        List<UserCreateEzsignuserV1Request> userCreateEzsignuserV1Request = null;
        UserCreateEzsignuserV1Response response = api.userCreateEzsignuserV1(userCreateEzsignuserV1Request);

        // TODO: test validations
    }
    
}
