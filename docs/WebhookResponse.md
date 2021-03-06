

# WebhookResponse

A webhook object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiWebhookID** | **Integer** | The Webhook ID. This value is visible in the admin interface. | 
**eWebhookModule** | [**EWebhookModuleEnum**](#EWebhookModuleEnum) | The Module generating the Event. | 
**eWebhookEzsignevent** | [**EWebhookEzsigneventEnum**](#EWebhookEzsigneventEnum) | This Ezsign Event. This property will be set only if the Module is \&quot;Ezsign\&quot;. |  [optional]
**pksCustomerCode** | **String** | The customer code assigned to your account | 
**sWebhookUrl** | **String** | The url being called | 
**sWebhookEmailfailed** | **String** | The email that will receive the webhook in case all attempts fail. | 
**eWebhookManagementevent** | [**EWebhookManagementeventEnum**](#EWebhookManagementeventEnum) | This Management Event. This property will be set only if the Module is \&quot;Management\&quot;. |  [optional]



## Enum: EWebhookModuleEnum

Name | Value
---- | -----
EZSIGN | &quot;Ezsign&quot;
MANAGEMENT | &quot;Management&quot;



## Enum: EWebhookEzsigneventEnum

Name | Value
---- | -----
DOCUMENTCOMPLETED | &quot;DocumentCompleted&quot;
FOLDERCOMPLETED | &quot;FolderCompleted&quot;



## Enum: EWebhookManagementeventEnum

Name | Value
---- | -----
USERCREATED | &quot;UserCreated&quot;



