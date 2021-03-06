

# ActivesessionGetCurrentV1ResponseMPayload

Payload for the /1/object/activesession/getCurrent API Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sCustomerCode** | **String** | The customer code specific to the client in which the API request is being made | 
**eActivesessionSessiontype** | [**EActivesessionSessiontypeEnum**](#EActivesessionSessiontypeEnum) | The type of session used for the API request call | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sCompanyNameX** | **String** | The name of the active Company in the current language | 
**sDepartmentNameX** | **String** | The name of the active Department in the current language | 
**aRegisteredModules** | **List&lt;String&gt;** | An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key. | 
**aPermissions** | **List&lt;Integer&gt;** | An array of permissions granted to the user or api key | 
**fkiUserID** | **Integer** | The unique ID of the User | 
**fkiApikeyID** | **Integer** | The unique ID of the Apikey | 



## Enum: EActivesessionSessiontypeEnum

Name | Value
---- | -----
NORMAL | &quot;Normal&quot;



