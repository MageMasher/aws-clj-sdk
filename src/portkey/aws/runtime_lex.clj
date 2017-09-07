(ns portkey.aws.runtime-lex (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.runtime-lex.unsupported-media-type-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/unsupported-media-type-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.unsupported-media-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 80))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/string-map (clojure.spec.alpha/map-of :portkey.aws.runtime-lex/string :portkey.aws.runtime-lex/string))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/bad-request-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.button/text (clojure.spec.alpha/and :portkey.aws.runtime-lex/button-text-string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.button/value (clojure.spec.alpha/and :portkey.aws.runtime-lex/button-value-string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/button (portkey.awsgen/json-keys :req-un [:portkey.aws.runtime-lex.button/text :portkey.aws.runtime-lex.button/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/bot-name (clojure.spec.alpha/and :portkey.aws.runtime-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/bot-alias (clojure.spec.alpha/and :portkey.aws.runtime-lex/bot-alias))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/user-id (clojure.spec.alpha/and :portkey.aws.runtime-lex/user-id))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-request/input-text (clojure.spec.alpha/and :portkey.aws.runtime-lex/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/post-text-request (portkey.awsgen/json-keys :req-un [:portkey.aws.runtime-lex.post-text-request/botName :portkey.aws.runtime-lex.post-text-request/botAlias :portkey.aws.runtime-lex.post-text-request/userId :portkey.aws.runtime-lex.post-text-request/inputText] :opt-un [:portkey.aws.runtime-lex.post-text-request/sessionAttributes]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/title (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/sub-title (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/attachment-link-url (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-url-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/image-url (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-url-with-length))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.generic-attachment/buttons (clojure.spec.alpha/and :portkey.aws.runtime-lex/list-of-buttons))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/generic-attachment (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.generic-attachment/title :portkey.aws.runtime-lex.generic-attachment/subTitle :portkey.aws.runtime-lex.generic-attachment/attachmentLinkUrl :portkey.aws.runtime-lex.generic-attachment/imageUrl :portkey.aws.runtime-lex.generic-attachment/buttons]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/bot-alias (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 2 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 100)) (clojure.core/fn [s__44500__auto__] (clojure.core/re-matches #"[0-9a-zA-Z._:-]+" s__44500__auto__))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/string-url-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/intent-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/limit-exceeded-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.limit-exceeded-exception/retryAfterSeconds :portkey.aws.runtime-lex.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/bot-name (clojure.spec.alpha/and :portkey.aws.runtime-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/bot-alias (clojure.spec.alpha/and :portkey.aws.runtime-lex/bot-alias))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/user-id (clojure.spec.alpha/and :portkey.aws.runtime-lex/user-id))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex/http-content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/accept (clojure.spec.alpha/and :portkey.aws.runtime-lex/accept))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-request/input-stream (clojure.spec.alpha/and :portkey.aws.runtime-lex/blob-stream))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/post-content-request (portkey.awsgen/json-keys :req-un [:portkey.aws.runtime-lex.post-content-request/botName :portkey.aws.runtime-lex.post-content-request/botAlias :portkey.aws.runtime-lex.post-content-request/userId :portkey.aws.runtime-lex.post-content-request/contentType :portkey.aws.runtime-lex.post-content-request/inputStream] :opt-un [:portkey.aws.runtime-lex.post-content-request/sessionAttributes :portkey.aws.runtime-lex.post-content-request/accept]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.response-card/version (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.response-card/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex/content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.response-card/generic-attachments (clojure.spec.alpha/and :portkey.aws.runtime-lex/generic-attachment-list))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/response-card (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.response-card/version :portkey.aws.runtime-lex.response-card/contentType :portkey.aws.runtime-lex.response-card/genericAttachments]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.loop-detected-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/loop-detected-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.loop-detected-exception/Message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/dialog-state (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"Fulfilled" "Fulfilled", "Failed" "Failed", "ConfirmIntent" "ConfirmIntent", "ReadyForFulfillment" "ReadyForFulfillment", :elicit-slot "ElicitSlot", :elicit-intent "ElicitIntent", "ElicitSlot" "ElicitSlot", "ElicitIntent" "ElicitIntent", :fulfilled "Fulfilled", :confirm-intent "ConfirmIntent", :ready-for-fulfillment "ReadyForFulfillment", :failed "Failed"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/content-type (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"application/vnd.amazonaws.card.generic" "application/vnd.amazonaws.card.generic", :application/vnd.amazonaws.card.generic "application/vnd.amazonaws.card.generic"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/internal-failure-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/conflict-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/not-found-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/bot-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/blob-stream (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.awsgen/base64-encode portkey.awsgen/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.dependency-failed-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/dependency-failed-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.dependency-failed-exception/Message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.request-timeout-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/request-timeout-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.request-timeout-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/button-text-string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/http-content-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/button-value-string-with-length (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.not-acceptable-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/not-acceptable-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.not-acceptable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.bad-gateway-exception/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/error-message))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/bad-gateway-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.bad-gateway-exception/Message]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/intent-name (clojure.spec.alpha/and :portkey.aws.runtime-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/slots (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/string-map))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/dialog-state (clojure.spec.alpha/and :portkey.aws.runtime-lex/dialog-state))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/slot-to-elicit (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-text-response/response-card (clojure.spec.alpha/and :portkey.aws.runtime-lex/response-card))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/post-text-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.post-text-response/intentName :portkey.aws.runtime-lex.post-text-response/slots :portkey.aws.runtime-lex.post-text-response/sessionAttributes :portkey.aws.runtime-lex.post-text-response/message :portkey.aws.runtime-lex.post-text-response/dialogState :portkey.aws.runtime-lex.post-text-response/slotToElicit :portkey.aws.runtime-lex.post-text-response/responseCard]))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/generic-attachment-list (clojure.spec.alpha/coll-of :portkey.aws.runtime-lex/generic-attachment :max-count 10))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/accept (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.runtime-lex/list-of-buttons (clojure.spec.alpha/coll-of :portkey.aws.runtime-lex/button :max-count 5))

(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/message (clojure.spec.alpha/and :portkey.aws.runtime-lex/text))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/slot-to-elicit (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/slots (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/audio-stream (clojure.spec.alpha/and :portkey.aws.runtime-lex/blob-stream))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/intent-name (clojure.spec.alpha/and :portkey.aws.runtime-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/input-transcript (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/content-type (clojure.spec.alpha/and :portkey.aws.runtime-lex/http-content-type))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/dialog-state (clojure.spec.alpha/and :portkey.aws.runtime-lex/dialog-state))
(clojure.spec.alpha/def :portkey.aws.runtime-lex.post-content-response/session-attributes (clojure.spec.alpha/and :portkey.aws.runtime-lex/string))
(clojure.spec.alpha/def :portkey.aws.runtime-lex/post-content-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.runtime-lex.post-content-response/message :portkey.aws.runtime-lex.post-content-response/slotToElicit :portkey.aws.runtime-lex.post-content-response/slots :portkey.aws.runtime-lex.post-content-response/audioStream :portkey.aws.runtime-lex.post-content-response/intentName :portkey.aws.runtime-lex.post-content-response/inputTranscript :portkey.aws.runtime-lex.post-content-response/contentType :portkey.aws.runtime-lex.post-content-response/dialogState :portkey.aws.runtime-lex.post-content-response/sessionAttributes]))

(clojure.core/defn post-content ([input__47307__auto__] (post-content input__47307__auto__ portkey.aws/*http-client*)) ([input48357 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/bot/{botName}/alias/{botAlias}/user/{userId}/content"), :body (clojure.spec.alpha/unform :portkey.aws.runtime-lex/PostContentRequest input48357)} (portkey.awsgen/params-to-header {"sessionAttributes" ["x-amz-lex-session-attributes" true], "contentType" ["Content-Type" nil], "accept" ["Accept" nil]}) (portkey.awsgen/params-to-uri {"botName" "botName", "botAlias" "botAlias", "userId" "userId"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload "inputStream") (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48356] (clojure.core/let [errors__47310__auto__ {"UnsupportedMediaTypeException" :portkey.aws.runtime-lex/unsupported-media-type-exception, "BadRequestException" :portkey.aws.runtime-lex/bad-request-exception, "LimitExceededException" :portkey.aws.runtime-lex/limit-exceeded-exception, "LoopDetectedException" :portkey.aws.runtime-lex/loop-detected-exception, "InternalFailureException" :portkey.aws.runtime-lex/internal-failure-exception, "ConflictException" :portkey.aws.runtime-lex/conflict-exception, "NotFoundException" :portkey.aws.runtime-lex/not-found-exception, "DependencyFailedException" :portkey.aws.runtime-lex/dependency-failed-exception, "RequestTimeoutException" :portkey.aws.runtime-lex/request-timeout-exception, "NotAcceptableException" :portkey.aws.runtime-lex/not-acceptable-exception, "BadGatewayException" :portkey.aws.runtime-lex/bad-gateway-exception}] (if (clojure.core/= nil (:status response48356)) (clojure.spec.alpha/unform :portkey.aws.runtime-lex/post-content-response (:body response48356)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48356 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48356)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48356}))))))))))

(clojure.core/defn post-text ([input__47307__auto__] (post-text input__47307__auto__ portkey.aws/*http-client*)) ([input48359 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/bot/{botName}/alias/{botAlias}/user/{userId}/text"), :body (clojure.spec.alpha/unform :portkey.aws.runtime-lex/PostTextRequest input48359)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"botName" "botName", "botAlias" "botAlias", "userId" "userId"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48358] (clojure.core/let [errors__47310__auto__ {"NotFoundException" :portkey.aws.runtime-lex/not-found-exception, "BadRequestException" :portkey.aws.runtime-lex/bad-request-exception, "LimitExceededException" :portkey.aws.runtime-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.runtime-lex/internal-failure-exception, "ConflictException" :portkey.aws.runtime-lex/conflict-exception, "DependencyFailedException" :portkey.aws.runtime-lex/dependency-failed-exception, "BadGatewayException" :portkey.aws.runtime-lex/bad-gateway-exception, "LoopDetectedException" :portkey.aws.runtime-lex/loop-detected-exception}] (if (clojure.core/= nil (:status response48358)) (clojure.spec.alpha/unform :portkey.aws.runtime-lex/post-text-response (:body response48358)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48358 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48358)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48358}))))))))))
