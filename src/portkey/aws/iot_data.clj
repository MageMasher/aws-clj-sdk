(ns portkey.aws.iot-data (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.iot-data.method-not-allowed-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/method-not-allowed-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.method-not-allowed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/unauthorized-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/invalid-request-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data.get-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data/get-thing-shadow-request (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.get-thing-shadow-request/thingName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data/json-document (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.awsgen/base64-encode portkey.awsgen/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.iot-data.delete-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data/delete-thing-shadow-request (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.delete-thing-shadow-request/thingName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data.get-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data/get-thing-shadow-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.get-thing-shadow-response/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/service-unavailable-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data/payload (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.awsgen/base64-encode portkey.awsgen/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.iot-data/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data/topic (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data.request-entity-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/request-entity-too-large-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.request-entity-too-large-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/internal-failure-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/resource-not-found-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/conflict-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data/qos (clojure.spec.alpha/and clojure.core/int? (fn* [p1__44539__44540__auto__] (clojure.core/<= 0 p1__44539__44540__auto__)) (fn* [p1__44541__44542__auto__] (clojure.core/<= p1__44541__44542__auto__ 1))))

(clojure.spec.alpha/def :portkey.aws.iot-data/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 128)) (clojure.core/fn [s__44500__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__44500__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-data.publish-request/topic (clojure.spec.alpha/and :portkey.aws.iot-data/topic))
(clojure.spec.alpha/def :portkey.aws.iot-data.publish-request/qos (clojure.spec.alpha/and :portkey.aws.iot-data/qos))
(clojure.spec.alpha/def :portkey.aws.iot-data.publish-request/payload (clojure.spec.alpha/and :portkey.aws.iot-data/payload))
(clojure.spec.alpha/def :portkey.aws.iot-data/publish-request (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.publish-request/topic] :opt-un [:portkey.aws.iot-data.publish-request/qos :portkey.aws.iot-data.publish-request/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/throttling-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.update-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data/update-thing-shadow-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.update-thing-shadow-response/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.unsupported-document-encoding-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/unsupported-document-encoding-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.unsupported-document-encoding-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.delete-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data/delete-thing-shadow-response (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.delete-thing-shadow-response/payload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data.update-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data.update-thing-shadow-request/payload (clojure.spec.alpha/and :portkey.aws.iot-data/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data/update-thing-shadow-request (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.update-thing-shadow-request/thingName :portkey.aws.iot-data.update-thing-shadow-request/payload] :opt-un []))

(clojure.core/defn delete-thing-shadow ([input__47307__auto__] (delete-thing-shadow input__47307__auto__ portkey.aws/*http-client*)) ([input48601 http-client__47308__auto__] (clojure.core/-> {:method "DELETE", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/things/{thingName}/shadow"), :body (clojure.spec.alpha/unform :portkey.aws.iot-data/DeleteThingShadowRequest input48601)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"thingName" "thingName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48600] (clojure.core/let [errors__47310__auto__ {"ResourceNotFoundException" :portkey.aws.iot-data/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot-data/invalid-request-exception, "ThrottlingException" :portkey.aws.iot-data/throttling-exception, "UnauthorizedException" :portkey.aws.iot-data/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot-data/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot-data/internal-failure-exception, "MethodNotAllowedException" :portkey.aws.iot-data/method-not-allowed-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data/unsupported-document-encoding-exception}] (if (clojure.core/= nil (:status response48600)) (clojure.spec.alpha/unform :portkey.aws.iot-data/delete-thing-shadow-response (:body response48600)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48600 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48600)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48600}))))))))))

(clojure.core/defn get-thing-shadow ([input__47307__auto__] (get-thing-shadow input__47307__auto__ portkey.aws/*http-client*)) ([input48603 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/things/{thingName}/shadow"), :body (clojure.spec.alpha/unform :portkey.aws.iot-data/GetThingShadowRequest input48603)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"thingName" "thingName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48602] (clojure.core/let [errors__47310__auto__ {"InvalidRequestException" :portkey.aws.iot-data/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-data/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-data/throttling-exception, "UnauthorizedException" :portkey.aws.iot-data/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot-data/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot-data/internal-failure-exception, "MethodNotAllowedException" :portkey.aws.iot-data/method-not-allowed-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data/unsupported-document-encoding-exception}] (if (clojure.core/= nil (:status response48602)) (clojure.spec.alpha/unform :portkey.aws.iot-data/get-thing-shadow-response (:body response48602)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48602 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48602)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48602}))))))))))

(clojure.core/defn publish ([input__47307__auto__] (publish input__47307__auto__ portkey.aws/*http-client*)) ([input48605 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/topics/{topic}"), :body (clojure.spec.alpha/unform :portkey.aws.iot-data/PublishRequest input48605)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"topic" "topic"}) (portkey.awsgen/params-to-querystring {"qos" "qos"}) (portkey.awsgen/params-to-payload "payload") (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48604] (clojure.core/let [errors__47310__auto__ {"InternalFailureException" :portkey.aws.iot-data/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot-data/invalid-request-exception, "UnauthorizedException" :portkey.aws.iot-data/unauthorized-exception, "MethodNotAllowedException" :portkey.aws.iot-data/method-not-allowed-exception}] (if (clojure.core/= nil (:status response48604)) true (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48604 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48604)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48604}))))))))))

(clojure.core/defn update-thing-shadow ([input__47307__auto__] (update-thing-shadow input__47307__auto__ portkey.aws/*http-client*)) ([input48607 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/things/{thingName}/shadow"), :body (clojure.spec.alpha/unform :portkey.aws.iot-data/UpdateThingShadowRequest input48607)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"thingName" "thingName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload "payload") (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48606] (clojure.core/let [errors__47310__auto__ {"MethodNotAllowedException" :portkey.aws.iot-data/method-not-allowed-exception, "UnauthorizedException" :portkey.aws.iot-data/unauthorized-exception, "InvalidRequestException" :portkey.aws.iot-data/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot-data/service-unavailable-exception, "RequestEntityTooLargeException" :portkey.aws.iot-data/request-entity-too-large-exception, "InternalFailureException" :portkey.aws.iot-data/internal-failure-exception, "ConflictException" :portkey.aws.iot-data/conflict-exception, "ThrottlingException" :portkey.aws.iot-data/throttling-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data/unsupported-document-encoding-exception}] (if (clojure.core/= nil (:status response48606)) (clojure.spec.alpha/unform :portkey.aws.iot-data/update-thing-shadow-response (:body response48606)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48606 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48606)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48606}))))))))))
