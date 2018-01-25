/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.api;

import com.google.gson.reflect.TypeToken;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiClient;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.Configuration;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiException;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.Pair;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiResponse;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ProgressResponseBody;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ProgressRequestBody;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiCallback;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.Subscription;


import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriptionIndividualApi {
    private ApiClient apiClient;

    public SubscriptionIndividualApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SubscriptionIndividualApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for subscriptionsBlockSubscriptionPost
     * @param subscriptionId Subscription Id  (required)
     * @param blockState Subscription block state.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call subscriptionsBlockSubscriptionPostCall(String subscriptionId, String blockState, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/subscriptions/block-subscription";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (subscriptionId != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionId", subscriptionId));
        if (blockState != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "blockState", blockState));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifMatch != null)
            localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));
        if (ifUnmodifiedSince != null)
            localVarHeaderParams.put("If-Unmodified-Since", apiClient.parameterToString(ifUnmodifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call subscriptionsBlockSubscriptionPostValidateBeforeCall(String subscriptionId, String blockState, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling subscriptionsBlockSubscriptionPost(Async)");
        }

        // verify the required parameter 'blockState' is set
        if (blockState == null) {
            throw new ApiException("Missing the required parameter 'blockState' when calling subscriptionsBlockSubscriptionPost(Async)");
        }


        com.squareup.okhttp.Call call = subscriptionsBlockSubscriptionPostCall(subscriptionId, blockState, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        return call;





    }

    /**
     * Block a subscription
     * This operation can be used to block a subscription. Along with the request, &#x60;blockState&#x60; must be specified as a query parameter.  1. &#x60;BLOCKED&#x60; : Subscription is completely blocked for both Production and Sandbox environments. 2. &#x60;PROD_ONLY_BLOCKED&#x60; : Subscription is blocked for Production environment only.
     * @param subscriptionId Subscription Id  (required)
     * @param blockState Subscription block state.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void subscriptionsBlockSubscriptionPost(String subscriptionId, String blockState, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        subscriptionsBlockSubscriptionPostWithHttpInfo(subscriptionId, blockState, ifMatch, ifUnmodifiedSince);
    }

    /**
     * Block a subscription
     * This operation can be used to block a subscription. Along with the request, &#x60;blockState&#x60; must be specified as a query parameter.  1. &#x60;BLOCKED&#x60; : Subscription is completely blocked for both Production and Sandbox environments. 2. &#x60;PROD_ONLY_BLOCKED&#x60; : Subscription is blocked for Production environment only.
     * @param subscriptionId Subscription Id  (required)
     * @param blockState Subscription block state.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> subscriptionsBlockSubscriptionPostWithHttpInfo(String subscriptionId, String blockState, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = subscriptionsBlockSubscriptionPostValidateBeforeCall(subscriptionId, blockState, ifMatch, ifUnmodifiedSince, null, null);
        return apiClient.execute(call);
    }

    /**
     * Block a subscription (asynchronously)
     * This operation can be used to block a subscription. Along with the request, &#x60;blockState&#x60; must be specified as a query parameter.  1. &#x60;BLOCKED&#x60; : Subscription is completely blocked for both Production and Sandbox environments. 2. &#x60;PROD_ONLY_BLOCKED&#x60; : Subscription is blocked for Production environment only.
     * @param subscriptionId Subscription Id  (required)
     * @param blockState Subscription block state.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscriptionsBlockSubscriptionPostAsync(String subscriptionId, String blockState, String ifMatch, String ifUnmodifiedSince, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = subscriptionsBlockSubscriptionPostValidateBeforeCall(subscriptionId, blockState, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for subscriptionsSubscriptionIdGet
     * @param subscriptionId Subscription Id  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call subscriptionsSubscriptionIdGetCall(String subscriptionId, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/subscriptions/{subscriptionId}"
                .replaceAll("\\{" + "subscriptionId" + "\\}", apiClient.escapeString(subscriptionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        if (ifModifiedSince != null)
            localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call subscriptionsSubscriptionIdGetValidateBeforeCall(String subscriptionId, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling subscriptionsSubscriptionIdGet(Async)");
        }


        com.squareup.okhttp.Call call = subscriptionsSubscriptionIdGetCall(subscriptionId, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        return call;





    }

    /**
     * Get details of a subscription
     * This operation can be used to get details of a single subscription.
     * @param subscriptionId Subscription Id  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @return Subscription
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Subscription subscriptionsSubscriptionIdGet(String subscriptionId, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        ApiResponse<Subscription> resp = subscriptionsSubscriptionIdGetWithHttpInfo(subscriptionId, ifNoneMatch, ifModifiedSince);
        return resp.getData();
    }

    /**
     * Get details of a subscription
     * This operation can be used to get details of a single subscription.
     * @param subscriptionId Subscription Id  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @return ApiResponse&lt;Subscription&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Subscription> subscriptionsSubscriptionIdGetWithHttpInfo(String subscriptionId, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = subscriptionsSubscriptionIdGetValidateBeforeCall(subscriptionId, ifNoneMatch, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<Subscription>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get details of a subscription (asynchronously)
     * This operation can be used to get details of a single subscription.
     * @param subscriptionId Subscription Id  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscriptionsSubscriptionIdGetAsync(String subscriptionId, String ifNoneMatch, String ifModifiedSince, final ApiCallback<Subscription> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = subscriptionsSubscriptionIdGetValidateBeforeCall(subscriptionId, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Subscription>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for subscriptionsUnblockSubscriptionPost
     * @param subscriptionId Subscription Id  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call subscriptionsUnblockSubscriptionPostCall(String subscriptionId, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/subscriptions/unblock-subscription";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (subscriptionId != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionId", subscriptionId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifMatch != null)
            localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));
        if (ifUnmodifiedSince != null)
            localVarHeaderParams.put("If-Unmodified-Since", apiClient.parameterToString(ifUnmodifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call subscriptionsUnblockSubscriptionPostValidateBeforeCall(String subscriptionId, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling subscriptionsUnblockSubscriptionPost(Async)");
        }


        com.squareup.okhttp.Call call = subscriptionsUnblockSubscriptionPostCall(subscriptionId, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        return call;





    }

    /**
     * Unblock a Subscription
     * This operation can be used to unblock a subscription specifying the subscription Id. The subscription will be fully unblocked after performing this operation.
     * @param subscriptionId Subscription Id  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void subscriptionsUnblockSubscriptionPost(String subscriptionId, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        subscriptionsUnblockSubscriptionPostWithHttpInfo(subscriptionId, ifMatch, ifUnmodifiedSince);
    }

    /**
     * Unblock a Subscription
     * This operation can be used to unblock a subscription specifying the subscription Id. The subscription will be fully unblocked after performing this operation.
     * @param subscriptionId Subscription Id  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> subscriptionsUnblockSubscriptionPostWithHttpInfo(String subscriptionId, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = subscriptionsUnblockSubscriptionPostValidateBeforeCall(subscriptionId, ifMatch, ifUnmodifiedSince, null, null);
        return apiClient.execute(call);
    }

    /**
     * Unblock a Subscription (asynchronously)
     * This operation can be used to unblock a subscription specifying the subscription Id. The subscription will be fully unblocked after performing this operation.
     * @param subscriptionId Subscription Id  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscriptionsUnblockSubscriptionPostAsync(String subscriptionId, String ifMatch, String ifUnmodifiedSince, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = subscriptionsUnblockSubscriptionPostValidateBeforeCall(subscriptionId, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}