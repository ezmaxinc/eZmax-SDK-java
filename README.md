# ezmax-java

eZmax API Definition
- API version: 1.0.27
  - Build date: 2021-02-03T23:04:18.053Z[GMT]

This API expose all the functionnalities for the eZmax and eZsign application.

We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.

You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.

If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.

  For more information, please visit [https://www.ezmax.ca/en/contact](https://www.ezmax.ca/en/contact)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.ezmax</groupId>
  <artifactId>ezmax-java</artifactId>
  <version>1.0.27</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ezmax:ezmax-java:1.0.27"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ezmax-java-1.0.27.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ModuleUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ModuleUserApi apiInstance = new ModuleUserApi(defaultClient);
    List<UserCreateEzsignuserV1Request> userCreateEzsignuserV1Request = Arrays.asList(); // List<UserCreateEzsignuserV1Request> | 
    try {
      UserCreateEzsignuserV1Response result = apiInstance.userCreateEzsignuserV1(userCreateEzsignuserV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModuleUserApi#userCreateEzsignuserV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ModuleUserApi* | [**userCreateEzsignuserV1**](docs/ModuleUserApi.md#userCreateEzsignuserV1) | **POST** /1/module/user/createezsignuser | Create a new User of type Ezsignuser
*ObjectActivesessionApi* | [**activesessionGetCurrentV1**](docs/ObjectActivesessionApi.md#activesessionGetCurrentV1) | **GET** /1/object/activesession/getCurrent | Get Current Activesession
*ObjectApikeyApi* | [**apikeyCreateObjectV1**](docs/ObjectApikeyApi.md#apikeyCreateObjectV1) | **POST** /1/object/apikey | Create a new Apikey
*ObjectEzsigndocumentApi* | [**ezsigndocumentApplyEzsigntemplateV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsign Template to the Ezsigndocument.
*ObjectEzsigndocumentApi* | [**ezsigndocumentCreateObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentDeleteObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentDeleteObjectV1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentEditObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentEditObjectV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Modify an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetDownloadUrlV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetDownloadUrlV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetObjectGetChildrenV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectGetChildrenV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getChildren | Retrieve an existing Ezsigndocument&#39;s children IDs
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
*ObjectEzsignfolderApi* | [**ezsignfolderCreateObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV1) | **POST** /1/object/ezsignfolder | Create a new Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderDeleteObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderDeleteObjectV1) | **DELETE** /1/object/ezsignfolder/{pkiEzsignfolderID} | Delete an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderEditObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderEditObjectV1) | **PUT** /1/object/ezsignfolder/{pkiEzsignfolderID} | Modify an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderGetObjectGetChildrenV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetObjectGetChildrenV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getChildren | Retrieve an existing Ezsignfolder&#39;s children IDs
*ObjectEzsignfolderApi* | [**ezsignfolderGetObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetObjectV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderSendV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderSendV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationCreateObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateObjectV1) | **POST** /1/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationDeleteObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationDeleteObjectV1) | **DELETE** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Delete an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationEditObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationEditObjectV1) | **PUT** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Modify an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetInPersonLoginUrlV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetInPersonLoginUrlV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl | Retrieve a Login Url to allow In-Person signing
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetObjectGetChildrenV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetObjectGetChildrenV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getChildren | Retrieve an existing Ezsignfoldersignerassociation&#39;s children IDs
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetObjectV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation
*ObjectEzsignsignatureApi* | [**ezsignsignatureCreateObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureDeleteObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureDeleteObjectV1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureEditObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureEditObjectV1) | **PUT** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Modify an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureGetObjectGetChildrenV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureGetObjectGetChildrenV1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID}/getChildren | Retrieve an existing Ezsignsignature&#39;s children IDs
*ObjectEzsignsignatureApi* | [**ezsignsignatureGetObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureGetObjectV1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature
*ObjectFranchisebrokerApi* | [**franchisebrokerGetAutocompleteV1**](docs/ObjectFranchisebrokerApi.md#franchisebrokerGetAutocompleteV1) | **GET** /1/object/franchisebroker/getAutocomplete/{sSelector} | Retrieve Franchisebrokers and IDs
*ObjectFranchiseofficeApi* | [**franchiseofficeGetAutocompleteV1**](docs/ObjectFranchiseofficeApi.md#franchiseofficeGetAutocompleteV1) | **GET** /1/object/franchiseoffice/getAutocomplete/{sSelector} | Retrieve Franchiseoffices and IDs
*ObjectFranchisereferalincomeApi* | [**franchisereferalincomeCreateObjectV1**](docs/ObjectFranchisereferalincomeApi.md#franchisereferalincomeCreateObjectV1) | **POST** /1/object/franchisereferalincome | Create a new Franchisereferalincome
*ObjectPeriodApi* | [**periodGetAutocompleteV1**](docs/ObjectPeriodApi.md#periodGetAutocompleteV1) | **GET** /1/object/period/getAutocomplete/{sSelector} | Retrieve Periods and IDs


## Documentation for Models

 - [ActivesessionGetCurrentV1Response](docs/ActivesessionGetCurrentV1Response.md)
 - [ActivesessionGetCurrentV1ResponseMPayload](docs/ActivesessionGetCurrentV1ResponseMPayload.md)
 - [AddressRequest](docs/AddressRequest.md)
 - [ApikeyCreateObjectV1Request](docs/ApikeyCreateObjectV1Request.md)
 - [ApikeyCreateObjectV1Response](docs/ApikeyCreateObjectV1Response.md)
 - [ApikeyCreateObjectV1ResponseMPayload](docs/ApikeyCreateObjectV1ResponseMPayload.md)
 - [ApikeyRequest](docs/ApikeyRequest.md)
 - [ApikeyRequestCompound](docs/ApikeyRequestCompound.md)
 - [ApikeyResponse](docs/ApikeyResponse.md)
 - [AttemptResponse](docs/AttemptResponse.md)
 - [CommonAudit](docs/CommonAudit.md)
 - [CommonGetAutocompleteV1Response](docs/CommonGetAutocompleteV1Response.md)
 - [CommonGetAutocompleteV1ResponseMPayload](docs/CommonGetAutocompleteV1ResponseMPayload.md)
 - [CommonResponse](docs/CommonResponse.md)
 - [CommonResponseError](docs/CommonResponseError.md)
 - [CommonResponseObjDebug](docs/CommonResponseObjDebug.md)
 - [CommonResponseObjDebugPayload](docs/CommonResponseObjDebugPayload.md)
 - [CommonResponseObjSQLQuery](docs/CommonResponseObjSQLQuery.md)
 - [CommonWebhook](docs/CommonWebhook.md)
 - [ContactRequest](docs/ContactRequest.md)
 - [ContactRequestCompound](docs/ContactRequestCompound.md)
 - [ContactRequestCompoundAllOf](docs/ContactRequestCompoundAllOf.md)
 - [ContactinformationsRequest](docs/ContactinformationsRequest.md)
 - [ContactinformationsRequestCompound](docs/ContactinformationsRequestCompound.md)
 - [EmailRequest](docs/EmailRequest.md)
 - [EzsigndocumentApplyEzsigntemplateV1Request](docs/EzsigndocumentApplyEzsigntemplateV1Request.md)
 - [EzsigndocumentApplyEzsigntemplateV1Response](docs/EzsigndocumentApplyEzsigntemplateV1Response.md)
 - [EzsigndocumentCreateObjectV1Request](docs/EzsigndocumentCreateObjectV1Request.md)
 - [EzsigndocumentCreateObjectV1Response](docs/EzsigndocumentCreateObjectV1Response.md)
 - [EzsigndocumentCreateObjectV1ResponseMPayload](docs/EzsigndocumentCreateObjectV1ResponseMPayload.md)
 - [EzsigndocumentDeleteObjectV1Response](docs/EzsigndocumentDeleteObjectV1Response.md)
 - [EzsigndocumentEditObjectV1Request](docs/EzsigndocumentEditObjectV1Request.md)
 - [EzsigndocumentEditObjectV1Response](docs/EzsigndocumentEditObjectV1Response.md)
 - [EzsigndocumentGetDownloadUrlV1Response](docs/EzsigndocumentGetDownloadUrlV1Response.md)
 - [EzsigndocumentGetDownloadUrlV1ResponseMPayload](docs/EzsigndocumentGetDownloadUrlV1ResponseMPayload.md)
 - [EzsigndocumentGetObjectV1Response](docs/EzsigndocumentGetObjectV1Response.md)
 - [EzsigndocumentGetObjectV1ResponseMPayload](docs/EzsigndocumentGetObjectV1ResponseMPayload.md)
 - [EzsigndocumentRequest](docs/EzsigndocumentRequest.md)
 - [EzsigndocumentRequestCompound](docs/EzsigndocumentRequestCompound.md)
 - [EzsigndocumentResponse](docs/EzsigndocumentResponse.md)
 - [EzsigndocumentResponseAllOf](docs/EzsigndocumentResponseAllOf.md)
 - [EzsigndocumentResponseCompound](docs/EzsigndocumentResponseCompound.md)
 - [EzsignfolderCreateObjectV1Request](docs/EzsignfolderCreateObjectV1Request.md)
 - [EzsignfolderCreateObjectV1Response](docs/EzsignfolderCreateObjectV1Response.md)
 - [EzsignfolderCreateObjectV1ResponseMPayload](docs/EzsignfolderCreateObjectV1ResponseMPayload.md)
 - [EzsignfolderDeleteObjectV1Response](docs/EzsignfolderDeleteObjectV1Response.md)
 - [EzsignfolderEditObjectV1Request](docs/EzsignfolderEditObjectV1Request.md)
 - [EzsignfolderEditObjectV1Response](docs/EzsignfolderEditObjectV1Response.md)
 - [EzsignfolderGetObjectV1Response](docs/EzsignfolderGetObjectV1Response.md)
 - [EzsignfolderGetObjectV1ResponseMPayload](docs/EzsignfolderGetObjectV1ResponseMPayload.md)
 - [EzsignfolderRequest](docs/EzsignfolderRequest.md)
 - [EzsignfolderRequestCompound](docs/EzsignfolderRequestCompound.md)
 - [EzsignfolderResponse](docs/EzsignfolderResponse.md)
 - [EzsignfolderResponseAllOf](docs/EzsignfolderResponseAllOf.md)
 - [EzsignfolderResponseCompound](docs/EzsignfolderResponseCompound.md)
 - [EzsignfolderSendV1Request](docs/EzsignfolderSendV1Request.md)
 - [EzsignfolderSendV1Response](docs/EzsignfolderSendV1Response.md)
 - [EzsignfoldersignerassociationCreateObjectV1Request](docs/EzsignfoldersignerassociationCreateObjectV1Request.md)
 - [EzsignfoldersignerassociationCreateObjectV1Response](docs/EzsignfoldersignerassociationCreateObjectV1Response.md)
 - [EzsignfoldersignerassociationCreateObjectV1ResponseMPayload](docs/EzsignfoldersignerassociationCreateObjectV1ResponseMPayload.md)
 - [EzsignfoldersignerassociationDeleteObjectV1Response](docs/EzsignfoldersignerassociationDeleteObjectV1Response.md)
 - [EzsignfoldersignerassociationEditObjectV1Request](docs/EzsignfoldersignerassociationEditObjectV1Request.md)
 - [EzsignfoldersignerassociationEditObjectV1Response](docs/EzsignfoldersignerassociationEditObjectV1Response.md)
 - [EzsignfoldersignerassociationGetInPersonLoginUrlV1Response](docs/EzsignfoldersignerassociationGetInPersonLoginUrlV1Response.md)
 - [EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload](docs/EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload.md)
 - [EzsignfoldersignerassociationGetObjectV1Response](docs/EzsignfoldersignerassociationGetObjectV1Response.md)
 - [EzsignfoldersignerassociationRequest](docs/EzsignfoldersignerassociationRequest.md)
 - [EzsignfoldersignerassociationRequestCompound](docs/EzsignfoldersignerassociationRequestCompound.md)
 - [EzsignsignatureCreateObjectV1Request](docs/EzsignsignatureCreateObjectV1Request.md)
 - [EzsignsignatureCreateObjectV1Response](docs/EzsignsignatureCreateObjectV1Response.md)
 - [EzsignsignatureCreateObjectV1ResponseMPayload](docs/EzsignsignatureCreateObjectV1ResponseMPayload.md)
 - [EzsignsignatureDeleteObjectV1Response](docs/EzsignsignatureDeleteObjectV1Response.md)
 - [EzsignsignatureEditObjectV1Request](docs/EzsignsignatureEditObjectV1Request.md)
 - [EzsignsignatureEditObjectV1Response](docs/EzsignsignatureEditObjectV1Response.md)
 - [EzsignsignatureGetObjectV1Response](docs/EzsignsignatureGetObjectV1Response.md)
 - [EzsignsignatureRequest](docs/EzsignsignatureRequest.md)
 - [EzsignsignatureRequestCompound](docs/EzsignsignatureRequestCompound.md)
 - [EzsignsignerRequest](docs/EzsignsignerRequest.md)
 - [EzsignsignerRequestCompound](docs/EzsignsignerRequestCompound.md)
 - [EzsignsignerRequestCompoundContact](docs/EzsignsignerRequestCompoundContact.md)
 - [FieldEEzsigndocumentStep](docs/FieldEEzsigndocumentStep.md)
 - [FieldEEzsignfolderSendreminderfrequency](docs/FieldEEzsignfolderSendreminderfrequency.md)
 - [FieldEEzsignfolderStep](docs/FieldEEzsignfolderStep.md)
 - [FieldEPhoneType](docs/FieldEPhoneType.md)
 - [FieldEUserType](docs/FieldEUserType.md)
 - [FranchisereferalincomeCreateObjectV1Request](docs/FranchisereferalincomeCreateObjectV1Request.md)
 - [FranchisereferalincomeCreateObjectV1Response](docs/FranchisereferalincomeCreateObjectV1Response.md)
 - [FranchisereferalincomeCreateObjectV1ResponseMPayload](docs/FranchisereferalincomeCreateObjectV1ResponseMPayload.md)
 - [FranchisereferalincomeRequest](docs/FranchisereferalincomeRequest.md)
 - [FranchisereferalincomeRequestCompound](docs/FranchisereferalincomeRequestCompound.md)
 - [MultilingualApikeyDescription](docs/MultilingualApikeyDescription.md)
 - [PhoneRequest](docs/PhoneRequest.md)
 - [UserCreateEzsignuserV1Request](docs/UserCreateEzsignuserV1Request.md)
 - [UserCreateEzsignuserV1Response](docs/UserCreateEzsignuserV1Response.md)
 - [UserCreateEzsignuserV1ResponseMPayload](docs/UserCreateEzsignuserV1ResponseMPayload.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserResponseAllOf](docs/UserResponseAllOf.md)
 - [WebhookEzsignDocumentCompleted](docs/WebhookEzsignDocumentCompleted.md)
 - [WebhookEzsignDocumentCompletedAllOf](docs/WebhookEzsignDocumentCompletedAllOf.md)
 - [WebhookEzsignFolderCompleted](docs/WebhookEzsignFolderCompleted.md)
 - [WebhookEzsignFolderCompletedAllOf](docs/WebhookEzsignFolderCompletedAllOf.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WebhookUserUserCreated](docs/WebhookUserUserCreated.md)
 - [WebhookUserUserCreatedAllOf](docs/WebhookUserUserCreatedAllOf.md)
 - [WebsiteRequest](docs/WebsiteRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support-api@ezmax.ca

