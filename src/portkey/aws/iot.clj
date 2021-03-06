(ns portkey.aws.iot (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "execute-api", :region "ap-northeast-1"},
    :ssl-common-name "iot.ap-northeast-1.amazonaws.com",
    :endpoint "https://iot.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "execute-api", :region "eu-west-1"},
    :ssl-common-name "iot.eu-west-1.amazonaws.com",
    :endpoint "https://iot.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "execute-api", :region "us-east-2"},
    :ssl-common-name "iot.us-east-2.amazonaws.com",
    :endpoint "https://iot.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "execute-api", :region "ap-southeast-2"},
    :ssl-common-name "iot.ap-southeast-2.amazonaws.com",
    :endpoint "https://iot.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "execute-api", :region "cn-north-1"},
    :ssl-common-name "iot.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iot.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "execute-api", :region "ap-southeast-1"},
    :ssl-common-name "iot.ap-southeast-1.amazonaws.com",
    :endpoint "https://iot.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "execute-api", :region "ap-northeast-2"},
    :ssl-common-name "iot.ap-northeast-2.amazonaws.com",
    :endpoint "https://iot.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "execute-api", :region "eu-central-1"},
    :ssl-common-name "iot.eu-central-1.amazonaws.com",
    :endpoint "https://iot.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "execute-api", :region "eu-west-2"},
    :ssl-common-name "iot.eu-west-2.amazonaws.com",
    :endpoint "https://iot.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "execute-api", :region "us-west-2"},
    :ssl-common-name "iot.us-west-2.amazonaws.com",
    :endpoint "https://iot.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "execute-api", :region "us-east-1"},
    :ssl-common-name "iot.us-east-1.amazonaws.com",
    :endpoint "https://iot.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.iot/delete-stream-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.accept-certificate-transfer-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.accept-certificate-transfer-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot/accept-certificate-transfer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.accept-certificate-transfer-request/certificateId] :opt-un [:portkey.aws.iot.accept-certificate-transfer-request/setAsActive] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/registry-max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 1 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 250))))

(clojure.spec.alpha/def :portkey.aws.iot/stream-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.get-effective-policies-response/effective-policies (clojure.spec.alpha/and :portkey.aws.iot/effective-policies))
(clojure.spec.alpha/def :portkey.aws.iot/get-effective-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-effective-policies-response/effectivePolicies] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-policy-versions-response/policy-versions (clojure.spec.alpha/and :portkey.aws.iot/policy-versions))
(clojure.spec.alpha/def :portkey.aws.iot/list-policy-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-policy-versions-response/policyVersions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/auto-registration-status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"ENABLE" "ENABLE", :enable "ENABLE", "DISABLE" "DISABLE", :disable "DISABLE"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/thing-indexing-mode (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"OFF" "OFF", :off "OFF", "REGISTRY" "REGISTRY", :registry "REGISTRY", "REGISTRY_AND_SHADOW" "REGISTRY_AND_SHADOW", :registry-and-shadow "REGISTRY_AND_SHADOW"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.describe-event-configurations-response/event-configurations (clojure.spec.alpha/and :portkey.aws.iot/event-configurations))
(clojure.spec.alpha/def :portkey.aws.iot.describe-event-configurations-response/creation-date (clojure.spec.alpha/and :portkey.aws.iot/creation-date))
(clojure.spec.alpha/def :portkey.aws.iot.describe-event-configurations-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot/last-modified-date))
(clojure.spec.alpha/def :portkey.aws.iot/describe-event-configurations-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-event-configurations-response/eventConfigurations :portkey.aws.iot.describe-event-configurations-response/creationDate :portkey.aws.iot.describe-event-configurations-response/lastModifiedDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/skyfall-max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 1 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 250))))

(clojure.spec.alpha/def :portkey.aws.iot/thing-group-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 2028)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[\p{Graph}\x20]*" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.list-authorizers-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-authorizers-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-authorizers-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.list-authorizers-request/status (clojure.spec.alpha/and :portkey.aws.iot/authorizer-status))
(clojure.spec.alpha/def :portkey.aws.iot/list-authorizers-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-authorizers-request/pageSize :portkey.aws.iot.list-authorizers-request/marker :portkey.aws.iot.list-authorizers-request/ascendingOrder :portkey.aws.iot.list-authorizers-request/status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.deprecate-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.deprecate-thing-type-request/undo-deprecate (clojure.spec.alpha/and :portkey.aws.iot/undo-deprecate))
(clojure.spec.alpha/def :portkey.aws.iot/deprecate-thing-type-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.deprecate-thing-type-request/thingTypeName] :opt-un [:portkey.aws.iot.deprecate-thing-type-request/undoDeprecate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/unauthorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.unauthorized-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/outgoing-certificates (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/outgoing-certificate) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.detach-principal-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.detach-principal-policy-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot/detach-principal-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.detach-principal-policy-request/policyName :portkey.aws.iot.detach-principal-policy-request/principal] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/range-key-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.list-targets-for-policy-response/targets (clojure.spec.alpha/and :portkey.aws.iot/policy-targets))
(clojure.spec.alpha/def :portkey.aws.iot.list-targets-for-policy-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-targets-for-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-targets-for-policy-response/targets :portkey.aws.iot.list-targets-for-policy-response/nextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/thing-attribute-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/thing-attribute) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.test-invoke-authorizer-request/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.test-invoke-authorizer-request/token (clojure.spec.alpha/and :portkey.aws.iot/token))
(clojure.spec.alpha/def :portkey.aws.iot.test-invoke-authorizer-request/token-signature (clojure.spec.alpha/and :portkey.aws.iot/token-signature))
(clojure.spec.alpha/def :portkey.aws.iot/test-invoke-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.test-invoke-authorizer-request/authorizerName :portkey.aws.iot.test-invoke-authorizer-request/token :portkey.aws.iot.test-invoke-authorizer-request/tokenSignature] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/otaupdate-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/log-target-configurations (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/log-target-configuration) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.thing-type-properties/thing-type-description (clojure.spec.alpha/and :portkey.aws.iot/thing-type-description))
(clojure.spec.alpha/def :portkey.aws.iot.thing-type-properties/searchable-attributes (clojure.spec.alpha/and :portkey.aws.iot/searchable-attributes))
(clojure.spec.alpha/def :portkey.aws.iot/thing-type-properties (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.thing-type-properties/thingTypeDescription :portkey.aws.iot.thing-type-properties/searchableAttributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.register-certificate-request/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.register-certificate-request/ca-certificate-pem (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.register-certificate-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot/set-as-active-flag))
(clojure.spec.alpha/def :portkey.aws.iot.register-certificate-request/status (clojure.spec.alpha/and :portkey.aws.iot/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot/register-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.register-certificate-request/certificatePem] :opt-un [:portkey.aws.iot.register-certificate-request/caCertificatePem :portkey.aws.iot.register-certificate-request/setAsActive :portkey.aws.iot.register-certificate-request/status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/detach-thing-principal-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-request/attribute-payload (clojure.spec.alpha/and :portkey.aws.iot/attribute-payload))
(clojure.spec.alpha/def :portkey.aws.iot/create-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-thing-request/thingName] :opt-un [:portkey.aws.iot.create-thing-request/thingTypeName :portkey.aws.iot.create-thing-request/attributePayload] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/stream-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/token-signature (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 2560)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[A-Za-z0-9+/]+={0,2}" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.start-thing-registration-task-response/task-id (clojure.spec.alpha/and :portkey.aws.iot/task-id))
(clojure.spec.alpha/def :portkey.aws.iot/start-thing-registration-task-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.start-thing-registration-task-response/taskId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.job-execution-summary-for-job/thing-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot.job-execution-summary-for-job/job-execution-summary (clojure.spec.alpha/and :portkey.aws.iot/job-execution-summary))
(clojure.spec.alpha/def :portkey.aws.iot/job-execution-summary-for-job (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.job-execution-summary-for-job/thingArn :portkey.aws.iot.job-execution-summary-for-job/jobExecutionSummary] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.code-signing/aws-signer-job-id (clojure.spec.alpha/and :portkey.aws.iot/signing-job-id))
(clojure.spec.alpha/def :portkey.aws.iot.code-signing/custom-code-signing (clojure.spec.alpha/and :portkey.aws.iot/custom-code-signing))
(clojure.spec.alpha/def :portkey.aws.iot/code-signing (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.code-signing/awsSignerJobId :portkey.aws.iot.code-signing/customCodeSigning] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.dynamodbv2-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbv2-action/put-item (clojure.spec.alpha/and :portkey.aws.iot/put-item-input))
(clojure.spec.alpha/def :portkey.aws.iot/dynamodbv2-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.dynamodbv2-action/roleArn :portkey.aws.iot.dynamodbv2-action/putItem] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-groups-response/thing-groups (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name-and-arn-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-groups-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-thing-groups-response/thingGroups :portkey.aws.iot.list-thing-groups-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/delete-registration-code-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-payload/sql (clojure.spec.alpha/and :portkey.aws.iot/sql))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-payload/description (clojure.spec.alpha/and :portkey.aws.iot/description))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-payload/actions (clojure.spec.alpha/and :portkey.aws.iot/action-list))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-payload/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-payload/aws-iot-sql-version (clojure.spec.alpha/and :portkey.aws.iot/aws-iot-sql-version))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-payload/error-action (clojure.spec.alpha/and :portkey.aws.iot/action))
(clojure.spec.alpha/def :portkey.aws.iot/topic-rule-payload (portkey.aws/json-keys :req-un [:portkey.aws.iot.topic-rule-payload/sql :portkey.aws.iot.topic-rule-payload/actions] :opt-un [:portkey.aws.iot.topic-rule-payload/description :portkey.aws.iot.topic-rule-payload/ruleDisabled :portkey.aws.iot.topic-rule-payload/awsIotSqlVersion :portkey.aws.iot.topic-rule-payload/errorAction] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-principal-things-response/things (clojure.spec.alpha/and :portkey.aws.iot/thing-name-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-things-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-principal-things-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-principal-things-response/things :portkey.aws.iot.list-principal-things-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-summary/ota-update-id (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-id))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-summary/ota-update-arn (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-summary/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/otaupdate-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.otaupdate-summary/otaUpdateId :portkey.aws.iot.otaupdate-summary/otaUpdateArn :portkey.aws.iot.otaupdate-summary/creationDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.stream-info/stream-id (clojure.spec.alpha/and :portkey.aws.iot/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.stream-info/stream-arn (clojure.spec.alpha/and :portkey.aws.iot/stream-arn))
(clojure.spec.alpha/def :portkey.aws.iot.stream-info/stream-version (clojure.spec.alpha/and :portkey.aws.iot/stream-version))
(clojure.spec.alpha/def :portkey.aws.iot.stream-info/description (clojure.spec.alpha/and :portkey.aws.iot/stream-description))
(clojure.spec.alpha/def :portkey.aws.iot.stream-info/files (clojure.spec.alpha/and :portkey.aws.iot/stream-files))
(clojure.spec.alpha/def :portkey.aws.iot.stream-info/created-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.stream-info/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.stream-info/role-arn (clojure.spec.alpha/and :portkey.aws.iot/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot/stream-info (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.stream-info/streamId :portkey.aws.iot.stream-info/streamArn :portkey.aws.iot.stream-info/streamVersion :portkey.aws.iot.stream-info/description :portkey.aws.iot.stream-info/files :portkey.aws.iot.stream-info/createdAt :portkey.aws.iot.stream-info/lastUpdatedAt :portkey.aws.iot.stream-info/roleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/private-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.createotaupdate-response/ota-update-id (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-id))
(clojure.spec.alpha/def :portkey.aws.iot.createotaupdate-response/aws-iot-job-id (clojure.spec.alpha/and :portkey.aws.iot/aws-iot-job-id))
(clojure.spec.alpha/def :portkey.aws.iot.createotaupdate-response/ota-update-arn (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.createotaupdate-response/aws-iot-job-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-iot-job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.createotaupdate-response/ota-update-status (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-status))
(clojure.spec.alpha/def :portkey.aws.iot/createotaupdate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.createotaupdate-response/otaUpdateId :portkey.aws.iot.createotaupdate-response/awsIotJobId :portkey.aws.iot.createotaupdate-response/otaUpdateArn :portkey.aws.iot.createotaupdate-response/awsIotJobArn :portkey.aws.iot.createotaupdate-response/otaUpdateStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.listotaupdates-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.listotaupdates-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.listotaupdates-request/ota-update-status (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-status))
(clojure.spec.alpha/def :portkey.aws.iot/listotaupdates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.listotaupdates-request/maxResults :portkey.aws.iot.listotaupdates-request/nextToken :portkey.aws.iot.listotaupdates-request/otaUpdateStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.cancel-job-response/job-arn (clojure.spec.alpha/and :portkey.aws.iot/job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.cancel-job-response/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.cancel-job-response/description (clojure.spec.alpha/and :portkey.aws.iot/job-description))
(clojure.spec.alpha/def :portkey.aws.iot/cancel-job-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.cancel-job-response/jobArn :portkey.aws.iot.cancel-job-response/jobId :portkey.aws.iot.cancel-job-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.transfer-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.transfer-certificate-request/target-aws-account (clojure.spec.alpha/and :portkey.aws.iot/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.transfer-certificate-request/transfer-message (clojure.spec.alpha/and :portkey.aws.iot/message))
(clojure.spec.alpha/def :portkey.aws.iot/transfer-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.transfer-certificate-request/certificateId :portkey.aws.iot.transfer-certificate-request/targetAwsAccount] :opt-un [:portkey.aws.iot.transfer-certificate-request/transferMessage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.update-event-configurations-request/event-configurations (clojure.spec.alpha/and :portkey.aws.iot/event-configurations))
(clojure.spec.alpha/def :portkey.aws.iot/update-event-configurations-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.update-event-configurations-request/eventConfigurations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.explicit-deny/policies (clojure.spec.alpha/and :portkey.aws.iot/policies))
(clojure.spec.alpha/def :portkey.aws.iot/explicit-deny (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.explicit-deny/policies] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/deprecation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.update-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.update-certificate-request/new-status (clojure.spec.alpha/and :portkey.aws.iot/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot/update-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.update-certificate-request/certificateId :portkey.aws.iot.update-certificate-request/newStatus] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/resource-logical-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/topic-pattern (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.create-role-alias-response/role-alias (clojure.spec.alpha/and :portkey.aws.iot/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot.create-role-alias-response/role-alias-arn (clojure.spec.alpha/and :portkey.aws.iot/role-alias-arn))
(clojure.spec.alpha/def :portkey.aws.iot/create-role-alias-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-role-alias-response/roleAlias :portkey.aws.iot.create-role-alias-response/roleAliasArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/removed-things (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.iot/getv2-logging-options-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/signature-algorithm (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/index-status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"ACTIVE" "ACTIVE", :active "ACTIVE", "BUILDING" "BUILDING", :building "BUILDING", "REBUILDING" "REBUILDING", :rebuilding "REBUILDING"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/query-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/rule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/s3-file-url-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/s3-file-url) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-response/default-client-id (clojure.spec.alpha/and :portkey.aws.iot/client-id))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-response/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-response/thing-id (clojure.spec.alpha/and :portkey.aws.iot/thing-id))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-response/thing-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-response/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-response/attributes (clojure.spec.alpha/and :portkey.aws.iot/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-response/version (clojure.spec.alpha/and :portkey.aws.iot/version))
(clojure.spec.alpha/def :portkey.aws.iot/describe-thing-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-thing-response/defaultClientId :portkey.aws.iot.describe-thing-response/thingName :portkey.aws.iot.describe-thing-response/thingId :portkey.aws.iot.describe-thing-response/thingArn :portkey.aws.iot.describe-thing-response/thingTypeName :portkey.aws.iot.describe-thing-response/attributes :portkey.aws.iot.describe-thing-response/version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/job-status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "CANCELED" "CANCELED", :canceled "CANCELED", "COMPLETED" "COMPLETED", :completed "COMPLETED"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/failed-things (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.iot.code-signing-certificate-chain/stream (clojure.spec.alpha/and :portkey.aws.iot/stream))
(clojure.spec.alpha/def :portkey.aws.iot.code-signing-certificate-chain/certificate-name (clojure.spec.alpha/and :portkey.aws.iot/certificate-name))
(clojure.spec.alpha/def :portkey.aws.iot.code-signing-certificate-chain/inline-document (clojure.spec.alpha/and :portkey.aws.iot/inline-document))
(clojure.spec.alpha/def :portkey.aws.iot/code-signing-certificate-chain (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.code-signing-certificate-chain/stream :portkey.aws.iot.code-signing-certificate-chain/certificateName :portkey.aws.iot.code-signing-certificate-chain/inlineDocument] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-keys-and-certificate-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot/create-keys-and-certificate-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-keys-and-certificate-request/setAsActive] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.updatecacertificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.updatecacertificate-request/new-status (clojure.spec.alpha/and :portkey.aws.iot/cacertificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.updatecacertificate-request/new-auto-registration-status (clojure.spec.alpha/and :portkey.aws.iot/auto-registration-status))
(clojure.spec.alpha/def :portkey.aws.iot.updatecacertificate-request/registration-config (clojure.spec.alpha/and :portkey.aws.iot/registration-config))
(clojure.spec.alpha/def :portkey.aws.iot.updatecacertificate-request/remove-auto-registration (clojure.spec.alpha/and :portkey.aws.iot/remove-auto-registration))
(clojure.spec.alpha/def :portkey.aws.iot/updatecacertificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.updatecacertificate-request/certificateId] :opt-un [:portkey.aws.iot.updatecacertificate-request/newStatus :portkey.aws.iot.updatecacertificate-request/newAutoRegistrationStatus :portkey.aws.iot.updatecacertificate-request/registrationConfig :portkey.aws.iot.updatecacertificate-request/removeAutoRegistration] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.search-index-request/index-name (clojure.spec.alpha/and :portkey.aws.iot/index-name))
(clojure.spec.alpha/def :portkey.aws.iot.search-index-request/query-string (clojure.spec.alpha/and :portkey.aws.iot/query-string))
(clojure.spec.alpha/def :portkey.aws.iot.search-index-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.search-index-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/query-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.search-index-request/query-version (clojure.spec.alpha/and :portkey.aws.iot/query-version))
(clojure.spec.alpha/def :portkey.aws.iot/search-index-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.search-index-request/queryString] :opt-un [:portkey.aws.iot.search-index-request/indexName :portkey.aws.iot.search-index-request/nextToken :portkey.aws.iot.search-index-request/maxResults :portkey.aws.iot.search-index-request/queryVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/comment (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 2028)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[^\p{C}]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.certificate-state-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/certificate-state-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.certificate-state-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/certificate-signing-request (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot/missing-context-values (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/missing-context-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/parameter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.test-invoke-authorizer-response/is-authenticated (clojure.spec.alpha/and :portkey.aws.iot/is-authenticated))
(clojure.spec.alpha/def :portkey.aws.iot.test-invoke-authorizer-response/principal-id (clojure.spec.alpha/and :portkey.aws.iot/principal-id))
(clojure.spec.alpha/def :portkey.aws.iot.test-invoke-authorizer-response/policy-documents (clojure.spec.alpha/and :portkey.aws.iot/policy-documents))
(clojure.spec.alpha/def :portkey.aws.iot.test-invoke-authorizer-response/refresh-after-in-seconds (clojure.spec.alpha/and :portkey.aws.iot/seconds))
(clojure.spec.alpha/def :portkey.aws.iot.test-invoke-authorizer-response/disconnect-after-in-seconds (clojure.spec.alpha/and :portkey.aws.iot/seconds))
(clojure.spec.alpha/def :portkey.aws.iot/test-invoke-authorizer-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.test-invoke-authorizer-response/isAuthenticated :portkey.aws.iot.test-invoke-authorizer-response/principalId :portkey.aws.iot.test-invoke-authorizer-response/policyDocuments :portkey.aws.iot.test-invoke-authorizer-response/refreshAfterInSeconds :portkey.aws.iot.test-invoke-authorizer-response/disconnectAfterInSeconds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/page-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 1 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 250))))

(clojure.spec.alpha/def :portkey.aws.iot.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/invalid-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.invalid-request-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/thing-type-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 2028)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[\p{Graph}\x20]*" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.certificate-validation-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/certificate-validation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.certificate-validation-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/streams-summary (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/stream-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.thing-attribute/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.thing-attribute/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.thing-attribute/thing-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot.thing-attribute/attributes (clojure.spec.alpha/and :portkey.aws.iot/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.thing-attribute/version (clojure.spec.alpha/and :portkey.aws.iot/version))
(clojure.spec.alpha/def :portkey.aws.iot/thing-attribute (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.thing-attribute/thingName :portkey.aws.iot.thing-attribute/thingTypeName :portkey.aws.iot.thing-attribute/thingArn :portkey.aws.iot.thing-attribute/attributes :portkey.aws.iot.thing-attribute/version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/index-names-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/index-name) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.update-thing-group-response/version (clojure.spec.alpha/and :portkey.aws.iot/version))
(clojure.spec.alpha/def :portkey.aws.iot/update-thing-group-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.update-thing-group-response/version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-topic-rules-request/topic (clojure.spec.alpha/and :portkey.aws.iot/topic))
(clojure.spec.alpha/def :portkey.aws.iot.list-topic-rules-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/gemax-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-topic-rules-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-topic-rules-request/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot/list-topic-rules-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-topic-rules-request/topic :portkey.aws.iot.list-topic-rules-request/maxResults :portkey.aws.iot.list-topic-rules-request/nextToken :portkey.aws.iot.list-topic-rules-request/ruleDisabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/canned-access-control-list (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"authenticated-read" "authenticated-read", "public-read-write" "public-read-write", :bucket-owner-full-control "bucket-owner-full-control", :private "private", "bucket-owner-full-control" "bucket-owner-full-control", "private" "private", :log-delivery-write "log-delivery-write", :authenticated-read "authenticated-read", "aws-exec-read" "aws-exec-read", :aws-exec-read "aws-exec-read", :bucket-owner-read "bucket-owner-read", "bucket-owner-read" "bucket-owner-read", "public-read" "public-read", "log-delivery-write" "log-delivery-write", :public-read-write "public-read-write", :public-read "public-read"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/thing-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.list-outgoing-certificates-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-outgoing-certificates-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-outgoing-certificates-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-outgoing-certificates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-outgoing-certificates-request/pageSize :portkey.aws.iot.list-outgoing-certificates-request/marker :portkey.aws.iot.list-outgoing-certificates-request/ascendingOrder] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/thing-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/execution-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.list-principal-policies-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-policies-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-policies-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-principal-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-principal-policies-request/principal] :opt-un [:portkey.aws.iot.list-principal-policies-request/marker :portkey.aws.iot.list-principal-policies-request/pageSize :portkey.aws.iot.list-principal-policies-request/ascendingOrder] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/key-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 5120))))

(clojure.spec.alpha/def :portkey.aws.iot.get-logging-options-response/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.get-logging-options-response/log-level (clojure.spec.alpha/and :portkey.aws.iot/log-level))
(clojure.spec.alpha/def :portkey.aws.iot/get-logging-options-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-logging-options-response/roleArn :portkey.aws.iot.get-logging-options-response/logLevel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/thing-group-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.getv2-logging-options-response/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.getv2-logging-options-response/default-log-level (clojure.spec.alpha/and :portkey.aws.iot/log-level))
(clojure.spec.alpha/def :portkey.aws.iot.getv2-logging-options-response/disable-all-logs (clojure.spec.alpha/and :portkey.aws.iot/disable-all-logs))
(clojure.spec.alpha/def :portkey.aws.iot/getv2-logging-options-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.getv2-logging-options-response/roleArn :portkey.aws.iot.getv2-logging-options-response/defaultLogLevel :portkey.aws.iot.getv2-logging-options-response/disableAllLogs] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-groups-for-thing-response/thing-groups (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name-and-arn-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-groups-for-thing-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-groups-for-thing-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-thing-groups-for-thing-response/thingGroups :portkey.aws.iot.list-thing-groups-for-thing-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.,@/:#-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.outgoing-certificate/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.outgoing-certificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.outgoing-certificate/transferred-to (clojure.spec.alpha/and :portkey.aws.iot/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.outgoing-certificate/transfer-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.outgoing-certificate/transfer-message (clojure.spec.alpha/and :portkey.aws.iot/message))
(clojure.spec.alpha/def :portkey.aws.iot.outgoing-certificate/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/outgoing-certificate (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.outgoing-certificate/certificateArn :portkey.aws.iot.outgoing-certificate/certificateId :portkey.aws.iot.outgoing-certificate/transferredTo :portkey.aws.iot.outgoing-certificate/transferDate :portkey.aws.iot.outgoing-certificate/transferMessage :portkey.aws.iot.outgoing-certificate/creationDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describe-index-response/index-name (clojure.spec.alpha/and :portkey.aws.iot/index-name))
(clojure.spec.alpha/def :portkey.aws.iot.describe-index-response/index-status (clojure.spec.alpha/and :portkey.aws.iot/index-status))
(clojure.spec.alpha/def :portkey.aws.iot.describe-index-response/schema (clojure.spec.alpha/and :portkey.aws.iot/index-schema))
(clojure.spec.alpha/def :portkey.aws.iot/describe-index-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-index-response/indexName :portkey.aws.iot.describe-index-response/indexStatus :portkey.aws.iot.describe-index-response/schema] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/canceled-things (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.iot/last-modified-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-response/certificates (clojure.spec.alpha/and :portkey.aws.iot/certificates))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-certificates-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-certificates-response/certificates :portkey.aws.iot.list-certificates-response/nextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.set-default-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.set-default-policy-version-request/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot/set-default-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.set-default-policy-version-request/policyName :portkey.aws.iot.set-default-policy-version-request/policyVersionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/describe-default-authorizer-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.enable-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot/enable-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.enable-topic-rule-request/ruleName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/log-level (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"DISABLED" "DISABLED", :disabled "DISABLED", :warn "WARN", "WARN" "WARN", :debug "DEBUG", "ERROR" "ERROR", "DEBUG" "DEBUG", :info "INFO", :error "ERROR", "INFO" "INFO"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/effective-policies (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/effective-policy) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.create-stream-request/stream-id (clojure.spec.alpha/and :portkey.aws.iot/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.create-stream-request/description (clojure.spec.alpha/and :portkey.aws.iot/stream-description))
(clojure.spec.alpha/def :portkey.aws.iot.create-stream-request/files (clojure.spec.alpha/and :portkey.aws.iot/stream-files))
(clojure.spec.alpha/def :portkey.aws.iot.create-stream-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot/create-stream-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-stream-request/streamId :portkey.aws.iot.create-stream-request/files :portkey.aws.iot.create-stream-request/roleArn] :opt-un [:portkey.aws.iot.create-stream-request/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/cacertificates (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/cacertificate) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/action-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/action :min-count 0 :max-count 10) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.reject-certificate-transfer-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.reject-certificate-transfer-request/reject-reason (clojure.spec.alpha/and :portkey.aws.iot/message))
(clojure.spec.alpha/def :portkey.aws.iot/reject-certificate-transfer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.reject-certificate-transfer-request/certificateId] :opt-un [:portkey.aws.iot.reject-certificate-transfer-request/rejectReason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.registration-config/template-body (clojure.spec.alpha/and :portkey.aws.iot/template-body))
(clojure.spec.alpha/def :portkey.aws.iot.registration-config/role-arn (clojure.spec.alpha/and :portkey.aws.iot/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot/registration-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.registration-config/templateBody :portkey.aws.iot.registration-config/roleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-certificates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-certificates-request/pageSize :portkey.aws.iot.list-certificates-request/marker :portkey.aws.iot.list-certificates-request/ascendingOrder] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/additional-parameter-map (clojure.spec.alpha/map-of :portkey.aws.iot/key :portkey.aws.iot/value))

(clojure.spec.alpha/def :portkey.aws.iot/json-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/laser-max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 1 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 250))))

(clojure.spec.alpha/def :portkey.aws.iot/expires-in-sec clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot/thing-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot/describe-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-thing-request/thingName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/template-body (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.list-jobs-request/status (clojure.spec.alpha/and :portkey.aws.iot/job-status))
(clojure.spec.alpha/def :portkey.aws.iot.list-jobs-request/target-selection (clojure.spec.alpha/and :portkey.aws.iot/target-selection))
(clojure.spec.alpha/def :portkey.aws.iot.list-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/laser-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-jobs-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.list-jobs-request/thing-group-id (clojure.spec.alpha/and :portkey.aws.iot/thing-group-id))
(clojure.spec.alpha/def :portkey.aws.iot/list-jobs-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-jobs-request/status :portkey.aws.iot.list-jobs-request/targetSelection :portkey.aws.iot.list-jobs-request/maxResults :portkey.aws.iot.list-jobs-request/nextToken :portkey.aws.iot.list-jobs-request/thingGroupName :portkey.aws.iot.list-jobs-request/thingGroupId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/index-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.get-topic-rule-response/rule-arn (clojure.spec.alpha/and :portkey.aws.iot/rule-arn))
(clojure.spec.alpha/def :portkey.aws.iot.get-topic-rule-response/rule (clojure.spec.alpha/and :portkey.aws.iot/topic-rule))
(clojure.spec.alpha/def :portkey.aws.iot/get-topic-rule-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-topic-rule-response/ruleArn :portkey.aws.iot.get-topic-rule-response/rule] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/certificates (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/certificate) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/endpoint-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.attach-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.attach-policy-request/target (clojure.spec.alpha/and :portkey.aws.iot/policy-target))
(clojure.spec.alpha/def :portkey.aws.iot/attach-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.attach-policy-request/policyName :portkey.aws.iot.attach-policy-request/target] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.thing-type-metadata/deprecated (clojure.spec.alpha/and :portkey.aws.iot/boolean))
(clojure.spec.alpha/def :portkey.aws.iot.thing-type-metadata/deprecation-date (clojure.spec.alpha/and :portkey.aws.iot/deprecation-date))
(clojure.spec.alpha/def :portkey.aws.iot.thing-type-metadata/creation-date (clojure.spec.alpha/and :portkey.aws.iot/creation-date))
(clojure.spec.alpha/def :portkey.aws.iot/thing-type-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.thing-type-metadata/deprecated :portkey.aws.iot.thing-type-metadata/deprecationDate :portkey.aws.iot.thing-type-metadata/creationDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describe-job-request/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot/describe-job-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-job-request/jobId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.delete-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.delete-thing-group-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot/delete-thing-group-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-thing-group-request/thingGroupName] :opt-un [:portkey.aws.iot.delete-thing-group-request/expectedVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/certificate-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.create-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-group-request/parent-group-name (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-group-request/thing-group-properties (clojure.spec.alpha/and :portkey.aws.iot/thing-group-properties))
(clojure.spec.alpha/def :portkey.aws.iot/create-thing-group-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-thing-group-request/thingGroupName] :opt-un [:portkey.aws.iot.create-thing-group-request/parentGroupName :portkey.aws.iot.create-thing-group-request/thingGroupProperties] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.attribute-payload/attributes (clojure.spec.alpha/and :portkey.aws.iot/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.attribute-payload/merge (clojure.spec.alpha/and :portkey.aws.iot/flag))
(clojure.spec.alpha/def :portkey.aws.iot/attribute-payload (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.attribute-payload/attributes :portkey.aws.iot.attribute-payload/merge] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot/describe-thing-type-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-thing-type-request/thingTypeName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/parameters (clojure.spec.alpha/map-of :portkey.aws.iot/parameter :portkey.aws.iot/value))

(clojure.spec.alpha/def :portkey.aws.iot.list-things-in-thing-group-response/things (clojure.spec.alpha/and :portkey.aws.iot/thing-name-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-in-thing-group-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-things-in-thing-group-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-things-in-thing-group-response/things :portkey.aws.iot.list-things-in-thing-group-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/inline-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.describecacertificate-response/certificate-description (clojure.spec.alpha/and :portkey.aws.iot/cacertificate-description))
(clojure.spec.alpha/def :portkey.aws.iot.describecacertificate-response/registration-config (clojure.spec.alpha/and :portkey.aws.iot/registration-config))
(clojure.spec.alpha/def :portkey.aws.iot/describecacertificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describecacertificate-response/certificateDescription :portkey.aws.iot.describecacertificate-response/registrationConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/state-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/use-base64 clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.list-streams-response/streams (clojure.spec.alpha/and :portkey.aws.iot/streams-summary))
(clojure.spec.alpha/def :portkey.aws.iot.list-streams-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-streams-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-streams-response/streams :portkey.aws.iot.list-streams-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-job-response/job-arn (clojure.spec.alpha/and :portkey.aws.iot/job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-job-response/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.create-job-response/description (clojure.spec.alpha/and :portkey.aws.iot/job-description))
(clojure.spec.alpha/def :portkey.aws.iot/create-job-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-job-response/jobArn :portkey.aws.iot.create-job-response/jobId :portkey.aws.iot.create-job-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describe-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/describe-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-certificate-request/certificateId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/principal-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.update-role-alias-response/role-alias (clojure.spec.alpha/and :portkey.aws.iot/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot.update-role-alias-response/role-alias-arn (clojure.spec.alpha/and :portkey.aws.iot/role-alias-arn))
(clojure.spec.alpha/def :portkey.aws.iot/update-role-alias-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.update-role-alias-response/roleAlias :portkey.aws.iot.update-role-alias-response/roleAliasArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-indices-response/index-names (clojure.spec.alpha/and :portkey.aws.iot/index-names-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-indices-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-indices-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-indices-response/indexNames :portkey.aws.iot.list-indices-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.setv2-logging-options-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.setv2-logging-options-request/default-log-level (clojure.spec.alpha/and :portkey.aws.iot/log-level))
(clojure.spec.alpha/def :portkey.aws.iot.setv2-logging-options-request/disable-all-logs (clojure.spec.alpha/and :portkey.aws.iot/disable-all-logs))
(clojure.spec.alpha/def :portkey.aws.iot/setv2-logging-options-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.setv2-logging-options-request/roleArn :portkey.aws.iot.setv2-logging-options-request/defaultLogLevel :portkey.aws.iot.setv2-logging-options-request/disableAllLogs] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-types-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-types-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-types-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-types-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-thing-types-request/nextToken :portkey.aws.iot.list-thing-types-request/maxResults :portkey.aws.iot.list-thing-types-request/thingTypeName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/max-job-executions-per-min (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 1 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 1000))))

(clojure.spec.alpha/def :portkey.aws.iot/cacertificate-status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"ACTIVE" "ACTIVE", :active "ACTIVE", "INACTIVE" "INACTIVE", :inactive "INACTIVE"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 20 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iot.invalid-query-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/invalid-query-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.invalid-query-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/target-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-registration-task-response/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-registration-task-response/creation-date (clojure.spec.alpha/and :portkey.aws.iot/creation-date))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-registration-task-response/template-body (clojure.spec.alpha/and :portkey.aws.iot/template-body))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-registration-task-response/input-file-bucket (clojure.spec.alpha/and :portkey.aws.iot/registrys3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-registration-task-response/role-arn (clojure.spec.alpha/and :portkey.aws.iot/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-registration-task-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot/last-modified-date))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-registration-task-response/status (clojure.spec.alpha/and :portkey.aws.iot/status))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-registration-task-response/success-count (clojure.spec.alpha/and :portkey.aws.iot/count))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-registration-task-response/failure-count (clojure.spec.alpha/and :portkey.aws.iot/count))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-registration-task-response/percentage-progress (clojure.spec.alpha/and :portkey.aws.iot/percentage))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-registration-task-response/input-file-key (clojure.spec.alpha/and :portkey.aws.iot/registrys3-key-name))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-registration-task-response/task-id (clojure.spec.alpha/and :portkey.aws.iot/task-id))
(clojure.spec.alpha/def :portkey.aws.iot/describe-thing-registration-task-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-thing-registration-task-response/message :portkey.aws.iot.describe-thing-registration-task-response/creationDate :portkey.aws.iot.describe-thing-registration-task-response/templateBody :portkey.aws.iot.describe-thing-registration-task-response/inputFileBucket :portkey.aws.iot.describe-thing-registration-task-response/roleArn :portkey.aws.iot.describe-thing-registration-task-response/lastModifiedDate :portkey.aws.iot.describe-thing-registration-task-response/status :portkey.aws.iot.describe-thing-registration-task-response/successCount :portkey.aws.iot.describe-thing-registration-task-response/failureCount :portkey.aws.iot.describe-thing-registration-task-response/percentageProgress :portkey.aws.iot.describe-thing-registration-task-response/inputFileKey :portkey.aws.iot.describe-thing-registration-task-response/taskId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/disable-all-logs clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/registrys3-key-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 1024)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9!_.*'()-\/]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/partition-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.create-stream-response/stream-id (clojure.spec.alpha/and :portkey.aws.iot/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.create-stream-response/stream-arn (clojure.spec.alpha/and :portkey.aws.iot/stream-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-stream-response/description (clojure.spec.alpha/and :portkey.aws.iot/stream-description))
(clojure.spec.alpha/def :portkey.aws.iot.create-stream-response/stream-version (clojure.spec.alpha/and :portkey.aws.iot/stream-version))
(clojure.spec.alpha/def :portkey.aws.iot/create-stream-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-stream-response/streamId :portkey.aws.iot.create-stream-response/streamArn :portkey.aws.iot.create-stream-response/description :portkey.aws.iot.create-stream-response/streamVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.delete-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.delete-thing-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot/delete-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-thing-request/thingName] :opt-un [:portkey.aws.iot.delete-thing-request/expectedVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-role-alias-request/role-alias (clojure.spec.alpha/and :portkey.aws.iot/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot.create-role-alias-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-role-alias-request/credential-duration-seconds (clojure.spec.alpha/and :portkey.aws.iot/credential-duration-seconds))
(clojure.spec.alpha/def :portkey.aws.iot/create-role-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-role-alias-request/roleAlias :portkey.aws.iot.create-role-alias-request/roleArn] :opt-un [:portkey.aws.iot.create-role-alias-request/credentialDurationSeconds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/update-event-configurations-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-principal-policies-response/policies (clojure.spec.alpha/and :portkey.aws.iot/policies))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-policies-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-principal-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-principal-policies-response/policies :portkey.aws.iot.list-principal-policies-response/nextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.update-indexing-configuration-request/thing-indexing-configuration (clojure.spec.alpha/and :portkey.aws.iot/thing-indexing-configuration))
(clojure.spec.alpha/def :portkey.aws.iot/update-indexing-configuration-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.update-indexing-configuration-request/thingIndexingConfiguration] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/ca-certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/owned-by (clojure.spec.alpha/and :portkey.aws.iot/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/transfer-data (clojure.spec.alpha/and :portkey.aws.iot/transfer-data))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/status (clojure.spec.alpha/and :portkey.aws.iot/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/previous-owned-by (clojure.spec.alpha/and :portkey.aws.iot/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.certificate-description/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/certificate-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.certificate-description/creationDate :portkey.aws.iot.certificate-description/certificatePem :portkey.aws.iot.certificate-description/caCertificateId :portkey.aws.iot.certificate-description/lastModifiedDate :portkey.aws.iot.certificate-description/ownedBy :portkey.aws.iot.certificate-description/transferData :portkey.aws.iot.certificate-description/status :portkey.aws.iot.certificate-description/previousOwnedBy :portkey.aws.iot.certificate-description/certificateArn :portkey.aws.iot.certificate-description/certificateId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.update-stream-response/stream-id (clojure.spec.alpha/and :portkey.aws.iot/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.update-stream-response/stream-arn (clojure.spec.alpha/and :portkey.aws.iot/stream-arn))
(clojure.spec.alpha/def :portkey.aws.iot.update-stream-response/description (clojure.spec.alpha/and :portkey.aws.iot/stream-description))
(clojure.spec.alpha/def :portkey.aws.iot.update-stream-response/stream-version (clojure.spec.alpha/and :portkey.aws.iot/stream-version))
(clojure.spec.alpha/def :portkey.aws.iot/update-stream-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.update-stream-response/streamId :portkey.aws.iot.update-stream-response/streamArn :portkey.aws.iot.update-stream-response/description :portkey.aws.iot.update-stream-response/streamVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/principal-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.delete-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/delete-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.delete-conflict-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/marker (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[A-Za-z0-9+/]+={0,2}" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.update-stream-request/stream-id (clojure.spec.alpha/and :portkey.aws.iot/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.update-stream-request/description (clojure.spec.alpha/and :portkey.aws.iot/stream-description))
(clojure.spec.alpha/def :portkey.aws.iot.update-stream-request/files (clojure.spec.alpha/and :portkey.aws.iot/stream-files))
(clojure.spec.alpha/def :portkey.aws.iot.update-stream-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot/update-stream-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.update-stream-request/streamId] :opt-un [:portkey.aws.iot.update-stream-request/description :portkey.aws.iot.update-stream-request/files :portkey.aws.iot.update-stream-request/roleArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/index-schema (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-registration-tasks-response/task-ids (clojure.spec.alpha/and :portkey.aws.iot/task-id-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-registration-tasks-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-registration-tasks-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-thing-registration-tasks-response/taskIds :portkey.aws.iot.list-thing-registration-tasks-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/otaupdate-files (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/otaupdate-file :min-count 1 :max-count 10) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/thing-document-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/thing-document) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/task-id-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/task-id) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.detach-thing-principal-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.detach-thing-principal-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot/detach-thing-principal-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.detach-thing-principal-request/thingName :portkey.aws.iot.detach-thing-principal-request/principal] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/rule-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.transfer-certificate-response/transferred-certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot/transfer-certificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.transfer-certificate-response/transferredCertificateArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/count (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.iot.list-indices-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-indices-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/query-max-results))
(clojure.spec.alpha/def :portkey.aws.iot/list-indices-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-indices-request/nextToken :portkey.aws.iot.list-indices-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-groups-for-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-groups-for-thing-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-groups-for-thing-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-groups-for-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-thing-groups-for-thing-request/thingName] :opt-un [:portkey.aws.iot.list-thing-groups-for-thing-request/nextToken :portkey.aws.iot.list-thing-groups-for-thing-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/task-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.iot.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.thing-type-definition/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.thing-type-definition/thing-type-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-type-arn))
(clojure.spec.alpha/def :portkey.aws.iot.thing-type-definition/thing-type-properties (clojure.spec.alpha/and :portkey.aws.iot/thing-type-properties))
(clojure.spec.alpha/def :portkey.aws.iot.thing-type-definition/thing-type-metadata (clojure.spec.alpha/and :portkey.aws.iot/thing-type-metadata))
(clojure.spec.alpha/def :portkey.aws.iot/thing-type-definition (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.thing-type-definition/thingTypeName :portkey.aws.iot.thing-type-definition/thingTypeArn :portkey.aws.iot.thing-type-definition/thingTypeProperties :portkey.aws.iot.thing-type-definition/thingTypeMetadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/deprecate-thing-type-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/policy-names (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/policy-name) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.list-topic-rules-response/rules (clojure.spec.alpha/and :portkey.aws.iot/topic-rule-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-topic-rules-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-topic-rules-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-topic-rules-response/rules :portkey.aws.iot.list-topic-rules-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/thing-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/thing-name) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.cancel-job-request/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.cancel-job-request/comment (clojure.spec.alpha/and :portkey.aws.iot/comment))
(clojure.spec.alpha/def :portkey.aws.iot/cancel-job-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.cancel-job-request/jobId] :opt-un [:portkey.aws.iot.cancel-job-request/comment] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-certificate-from-csr-request/certificate-signing-request (clojure.spec.alpha/and :portkey.aws.iot/certificate-signing-request))
(clojure.spec.alpha/def :portkey.aws.iot.create-certificate-from-csr-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot/create-certificate-from-csr-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-certificate-from-csr-request/certificateSigningRequest] :opt-un [:portkey.aws.iot.create-certificate-from-csr-request/setAsActive] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/policy-targets (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/policy-target) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/resource-arns (clojure.spec.alpha/map-of :portkey.aws.iot/resource-logical-id :portkey.aws.iot/resource-arn))

(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-type-response/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-type-response/thing-type-id (clojure.spec.alpha/and :portkey.aws.iot/thing-type-id))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-type-response/thing-type-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-type-arn))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-type-response/thing-type-properties (clojure.spec.alpha/and :portkey.aws.iot/thing-type-properties))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-type-response/thing-type-metadata (clojure.spec.alpha/and :portkey.aws.iot/thing-type-metadata))
(clojure.spec.alpha/def :portkey.aws.iot/describe-thing-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-thing-type-response/thingTypeName :portkey.aws.iot.describe-thing-type-response/thingTypeId :portkey.aws.iot.describe-thing-type-response/thingTypeArn :portkey.aws.iot.describe-thing-type-response/thingTypeProperties :portkey.aws.iot.describe-thing-type-response/thingTypeMetadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.job-execution-summary/status (clojure.spec.alpha/and :portkey.aws.iot/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot.job-execution-summary/queued-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.job-execution-summary/started-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.job-execution-summary/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.job-execution-summary/execution-number (clojure.spec.alpha/and :portkey.aws.iot/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot/job-execution-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.job-execution-summary/status :portkey.aws.iot.job-execution-summary/queuedAt :portkey.aws.iot.job-execution-summary/startedAt :portkey.aws.iot.job-execution-summary/lastUpdatedAt :portkey.aws.iot.job-execution-summary/executionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/elasticsearch-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.delete-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot/delete-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-topic-rule-request/ruleName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/thing-group-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/thing-group-name) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/set-as-active-flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/thing-type-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/resource-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.resource-already-exists-exception/message :portkey.aws.iot/resourceId :portkey.aws.iot/resourceArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/rejected-things (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-bycaresponse/certificates (clojure.spec.alpha/and :portkey.aws.iot/certificates))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-bycaresponse/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-certificates-bycaresponse (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-certificates-bycaresponse/certificates :portkey.aws.iot.list-certificates-bycaresponse/nextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.implicit-deny/policies (clojure.spec.alpha/and :portkey.aws.iot/policies))
(clojure.spec.alpha/def :portkey.aws.iot/implicit-deny (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.implicit-deny/policies] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-principals-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-principals-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-thing-principals-request/thingName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.listcacertificates-response/certificates (clojure.spec.alpha/and :portkey.aws.iot/cacertificates))
(clojure.spec.alpha/def :portkey.aws.iot.listcacertificates-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/listcacertificates-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.listcacertificates-response/certificates :portkey.aws.iot.listcacertificates-response/nextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describe-authorizer-request/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot/describe-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-authorizer-request/authorizerName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.service-unavailable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-keys-and-certificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-keys-and-certificate-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.create-keys-and-certificate-response/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.create-keys-and-certificate-response/key-pair (clojure.spec.alpha/and :portkey.aws.iot/key-pair))
(clojure.spec.alpha/def :portkey.aws.iot/create-keys-and-certificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-keys-and-certificate-response/certificateArn :portkey.aws.iot.create-keys-and-certificate-response/certificateId :portkey.aws.iot.create-keys-and-certificate-response/certificatePem :portkey.aws.iot.create-keys-and-certificate-response/keyPair] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/aws-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/stream-files (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/stream-file :min-count 1 :max-count 10) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/delete-registration-code-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/key-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/log-target-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"DEFAULT" "DEFAULT", :default "DEFAULT", "THING_GROUP" "THING_GROUP", :thing-group "THING_GROUP"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/query-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.iot/metric-unit (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"Failed" "Failed", "Cancelled" "Cancelled", :in-progress "InProgress", "Cancelling" "Cancelling", :completed "Completed", :cancelled "Cancelled", "InProgress" "InProgress", "Completed" "Completed", :cancelling "Cancelling", :failed "Failed"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/allow-auto-registration clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/auth-results (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/auth-result) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.policy-version/version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.policy-version/is-default-version (clojure.spec.alpha/and :portkey.aws.iot/is-default-version))
(clojure.spec.alpha/def :portkey.aws.iot.policy-version/create-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/policy-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.policy-version/versionId :portkey.aws.iot.policy-version/isDefaultVersion :portkey.aws.iot.policy-version/createDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/event-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {:thing-group "THING_GROUP", "THING_TYPE" "THING_TYPE", "THING_GROUP_HIERARCHY" "THING_GROUP_HIERARCHY", "JOB_EXECUTION" "JOB_EXECUTION", :thing-group-membership "THING_GROUP_MEMBERSHIP", :job-execution "JOB_EXECUTION", "THING_TYPE_ASSOCIATION" "THING_TYPE_ASSOCIATION", "JOB" "JOB", :thing-group-hierarchy "THING_GROUP_HIERARCHY", :thing "THING", :thing-type "THING_TYPE", "THING_GROUP" "THING_GROUP", "THING_GROUP_MEMBERSHIP" "THING_GROUP_MEMBERSHIP", "THING" "THING", :job "JOB", :thing-type-association "THING_TYPE_ASSOCIATION"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/update-thing-groups-for-thing-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/role-alias (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[\w=,@-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.log-target-configuration/log-target (clojure.spec.alpha/and :portkey.aws.iot/log-target))
(clojure.spec.alpha/def :portkey.aws.iot.log-target-configuration/log-level (clojure.spec.alpha/and :portkey.aws.iot/log-level))
(clojure.spec.alpha/def :portkey.aws.iot/log-target-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.log-target-configuration/logTarget :portkey.aws.iot.log-target-configuration/logLevel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.put-item-input/table-name (clojure.spec.alpha/and :portkey.aws.iot/table-name))
(clojure.spec.alpha/def :portkey.aws.iot/put-item-input (portkey.aws/json-keys :req-un [:portkey.aws.iot.put-item-input/tableName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.search-index-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.search-index-response/things (clojure.spec.alpha/and :portkey.aws.iot/thing-document-list))
(clojure.spec.alpha/def :portkey.aws.iot/search-index-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.search-index-response/nextToken :portkey.aws.iot.search-index-response/things] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/succeeded-things (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.iot/log-target-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.deletecacertificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/deletecacertificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.deletecacertificate-request/certificateId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-file/file-name (clojure.spec.alpha/and :portkey.aws.iot/file-name))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-file/file-version (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-file-version))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-file/file-source (clojure.spec.alpha/and :portkey.aws.iot/stream))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-file/code-signing (clojure.spec.alpha/and :portkey.aws.iot/code-signing))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-file/attributes (clojure.spec.alpha/and :portkey.aws.iot/attributes-map))
(clojure.spec.alpha/def :portkey.aws.iot/otaupdate-file (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.otaupdate-file/fileName :portkey.aws.iot.otaupdate-file/fileVersion :portkey.aws.iot.otaupdate-file/fileSource :portkey.aws.iot.otaupdate-file/codeSigning :portkey.aws.iot.otaupdate-file/attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/range-key-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/hash-key-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.firehose-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.firehose-action/delivery-stream-name (clojure.spec.alpha/and :portkey.aws.iot/delivery-stream-name))
(clojure.spec.alpha/def :portkey.aws.iot.firehose-action/separator (clojure.spec.alpha/and :portkey.aws.iot/firehose-separator))
(clojure.spec.alpha/def :portkey.aws.iot/firehose-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.firehose-action/roleArn :portkey.aws.iot.firehose-action/deliveryStreamName] :opt-un [:portkey.aws.iot.firehose-action/separator] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/role-alias-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.describe-default-authorizer-response/authorizer-description (clojure.spec.alpha/and :portkey.aws.iot/authorizer-description))
(clojure.spec.alpha/def :portkey.aws.iot/describe-default-authorizer-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-default-authorizer-response/authorizerDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iot/metric-timestamp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.thing-group-properties/thing-group-description (clojure.spec.alpha/and :portkey.aws.iot/thing-group-description))
(clojure.spec.alpha/def :portkey.aws.iot.thing-group-properties/attribute-payload (clojure.spec.alpha/and :portkey.aws.iot/attribute-payload))
(clojure.spec.alpha/def :portkey.aws.iot/thing-group-properties (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.thing-group-properties/thingGroupDescription :portkey.aws.iot.thing-group-properties/attributePayload] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-role-aliases-response/role-aliases (clojure.spec.alpha/and :portkey.aws.iot/role-aliases))
(clojure.spec.alpha/def :portkey.aws.iot.list-role-aliases-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-role-aliases-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-role-aliases-response/roleAliases :portkey.aws.iot.list-role-aliases-response/nextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/topic (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.describe-index-request/index-name (clojure.spec.alpha/and :portkey.aws.iot/index-name))
(clojure.spec.alpha/def :portkey.aws.iot/describe-index-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-index-request/indexName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/job-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.iot.get-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot/get-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.get-topic-rule-request/ruleName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iot/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot/create-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-policy-request/policyName :portkey.aws.iot.create-policy-request/policyDocument] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.attach-principal-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.attach-principal-policy-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot/attach-principal-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.attach-principal-policy-request/policyName :portkey.aws.iot.attach-principal-policy-request/principal] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/recursive-without-default clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/stream-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 2028)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[^\p{C}]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/salesforce-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 40 (clojure.core/count s__15966__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.list-attached-policies-response/policies (clojure.spec.alpha/and :portkey.aws.iot/policies))
(clojure.spec.alpha/def :portkey.aws.iot.list-attached-policies-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-attached-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-attached-policies-response/policies :portkey.aws.iot.list-attached-policies-response/nextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-registration-task-reports-response/resource-links (clojure.spec.alpha/and :portkey.aws.iot/s3-file-url-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-registration-task-reports-response/report-type (clojure.spec.alpha/and :portkey.aws.iot/report-type))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-registration-task-reports-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-registration-task-reports-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-thing-registration-task-reports-response/resourceLinks :portkey.aws.iot.list-thing-registration-task-reports-response/reportType :portkey.aws.iot.list-thing-registration-task-reports-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.thing-group-metadata/parent-group-name (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.thing-group-metadata/root-to-parent-thing-groups (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name-and-arn-list))
(clojure.spec.alpha/def :portkey.aws.iot.thing-group-metadata/creation-date (clojure.spec.alpha/and :portkey.aws.iot/creation-date))
(clojure.spec.alpha/def :portkey.aws.iot/thing-group-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.thing-group-metadata/parentGroupName :portkey.aws.iot.thing-group-metadata/rootToParentThingGroups :portkey.aws.iot.thing-group-metadata/creationDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/target-selection (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"CONTINUOUS" "CONTINUOUS", :continuous "CONTINUOUS", "SNAPSHOT" "SNAPSHOT", :snapshot "SNAPSHOT"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.deleteotaupdate-request/ota-update-id (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-id))
(clojure.spec.alpha/def :portkey.aws.iot/deleteotaupdate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.deleteotaupdate-request/otaUpdateId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/remove-auto-registration clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/attributes (clojure.spec.alpha/map-of :portkey.aws.iot/attribute-name :portkey.aws.iot/attribute-value))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-registration-tasks-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-registration-tasks-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-registration-tasks-request/status (clojure.spec.alpha/and :portkey.aws.iot/status))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-registration-tasks-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-thing-registration-tasks-request/nextToken :portkey.aws.iot.list-thing-registration-tasks-request/maxResults :portkey.aws.iot.list-thing-registration-tasks-request/status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-certificate-from-csr-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-certificate-from-csr-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.create-certificate-from-csr-response/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot/create-certificate-from-csr-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-certificate-from-csr-response/certificateArn :portkey.aws.iot.create-certificate-from-csr-response/certificateId :portkey.aws.iot.create-certificate-from-csr-response/certificatePem] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.delete-stream-request/stream-id (clojure.spec.alpha/and :portkey.aws.iot/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot/delete-stream-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-stream-request/streamId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/queue-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/internal-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.internal-failure-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.register-thing-request/template-body (clojure.spec.alpha/and :portkey.aws.iot/template-body))
(clojure.spec.alpha/def :portkey.aws.iot.register-thing-request/parameters (clojure.spec.alpha/and :portkey.aws.iot/parameters))
(clojure.spec.alpha/def :portkey.aws.iot/register-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.register-thing-request/templateBody] :opt-un [:portkey.aws.iot.register-thing-request/parameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/role-aliases (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/role-alias) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.list-targets-for-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.list-targets-for-policy-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-targets-for-policy-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot/list-targets-for-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-targets-for-policy-request/policyName] :opt-un [:portkey.aws.iot.list-targets-for-policy-request/marker :portkey.aws.iot.list-targets-for-policy-request/pageSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-response/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-response/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-response/is-default-version (clojure.spec.alpha/and :portkey.aws.iot/is-default-version))
(clojure.spec.alpha/def :portkey.aws.iot/get-policy-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-policy-version-response/policyArn :portkey.aws.iot.get-policy-version-response/policyName :portkey.aws.iot.get-policy-version-response/policyDocument :portkey.aws.iot.get-policy-version-response/policyVersionId :portkey.aws.iot.get-policy-version-response/isDefaultVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-streams-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-streams-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-streams-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-streams-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-streams-request/maxResults :portkey.aws.iot.list-streams-request/nextToken :portkey.aws.iot.list-streams-request/ascendingOrder] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.stop-thing-registration-task-request/task-id (clojure.spec.alpha/and :portkey.aws.iot/task-id))
(clojure.spec.alpha/def :portkey.aws.iot/stop-thing-registration-task-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.stop-thing-registration-task-request/taskId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.authorizer-summary/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.authorizer-summary/authorizer-arn (clojure.spec.alpha/and :portkey.aws.iot/authorizer-arn))
(clojure.spec.alpha/def :portkey.aws.iot/authorizer-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.authorizer-summary/authorizerName :portkey.aws.iot.authorizer-summary/authorizerArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/signature (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.iot.versions-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/versions-limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.versions-limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/otaupdate-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.list-role-aliases-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-role-aliases-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-role-aliases-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-role-aliases-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-role-aliases-request/pageSize :portkey.aws.iot.list-role-aliases-request/marker :portkey.aws.iot.list-role-aliases-request/ascendingOrder] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describe-job-execution-request/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.describe-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.describe-job-execution-request/execution-number (clojure.spec.alpha/and :portkey.aws.iot/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot/describe-job-execution-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-job-execution-request/jobId :portkey.aws.iot.describe-job-execution-request/thingName] :opt-un [:portkey.aws.iot.describe-job-execution-request/executionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot/describe-thing-group-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-thing-group-request/thingGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/searchable-attributes (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/attribute-name) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/job-summary-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/job-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/message-format (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"RAW" "RAW", :raw "RAW", "JSON" "JSON", :json "JSON"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.thing-indexing-configuration/thing-indexing-mode (clojure.spec.alpha/and :portkey.aws.iot/thing-indexing-mode))
(clojure.spec.alpha/def :portkey.aws.iot/thing-indexing-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.thing-indexing-configuration/thingIndexingMode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.role-alias-description/role-alias (clojure.spec.alpha/and :portkey.aws.iot/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot.role-alias-description/role-arn (clojure.spec.alpha/and :portkey.aws.iot/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.role-alias-description/owner (clojure.spec.alpha/and :portkey.aws.iot/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.role-alias-description/credential-duration-seconds (clojure.spec.alpha/and :portkey.aws.iot/credential-duration-seconds))
(clojure.spec.alpha/def :portkey.aws.iot.role-alias-description/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.role-alias-description/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/role-alias-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.role-alias-description/roleAlias :portkey.aws.iot.role-alias-description/roleArn :portkey.aws.iot.role-alias-description/owner :portkey.aws.iot.role-alias-description/credentialDurationSeconds :portkey.aws.iot.role-alias-description/creationDate :portkey.aws.iot.role-alias-description/lastModifiedDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.createotaupdate-request/ota-update-id (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-id))
(clojure.spec.alpha/def :portkey.aws.iot.createotaupdate-request/description (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-description))
(clojure.spec.alpha/def :portkey.aws.iot.createotaupdate-request/targets (clojure.spec.alpha/and :portkey.aws.iot/targets))
(clojure.spec.alpha/def :portkey.aws.iot.createotaupdate-request/target-selection (clojure.spec.alpha/and :portkey.aws.iot/target-selection))
(clojure.spec.alpha/def :portkey.aws.iot.createotaupdate-request/files (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-files))
(clojure.spec.alpha/def :portkey.aws.iot.createotaupdate-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.createotaupdate-request/additional-parameters (clojure.spec.alpha/and :portkey.aws.iot/additional-parameter-map))
(clojure.spec.alpha/def :portkey.aws.iot/createotaupdate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.createotaupdate-request/otaUpdateId :portkey.aws.iot.createotaupdate-request/targets :portkey.aws.iot.createotaupdate-request/files :portkey.aws.iot.createotaupdate-request/roleArn] :opt-un [:portkey.aws.iot.createotaupdate-request/description :portkey.aws.iot.createotaupdate-request/targetSelection :portkey.aws.iot.createotaupdate-request/additionalParameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.deletev2-logging-level-request/target-type (clojure.spec.alpha/and :portkey.aws.iot/log-target-type))
(clojure.spec.alpha/def :portkey.aws.iot.deletev2-logging-level-request/target-name (clojure.spec.alpha/and :portkey.aws.iot/log-target-name))
(clojure.spec.alpha/def :portkey.aws.iot/deletev2-logging-level-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.deletev2-logging-level-request/targetType :portkey.aws.iot.deletev2-logging-level-request/targetName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 800)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.,@/:#-]*" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.listcacertificates-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.listcacertificates-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.listcacertificates-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/listcacertificates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.listcacertificates-request/pageSize :portkey.aws.iot.listcacertificates-request/marker :portkey.aws.iot.listcacertificates-request/ascendingOrder] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/remove-thing-from-thing-group-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/otaupdate-file-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/aws-iot-job-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/dynamo-key-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"STRING" "STRING", :string "STRING", "NUMBER" "NUMBER", :number "NUMBER"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/thing-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/public-key-map (clojure.spec.alpha/map-of :portkey.aws.iot/key-name :portkey.aws.iot/key-value))

(clojure.spec.alpha/def :portkey.aws.iot.delete-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.delete-certificate-request/force-delete (clojure.spec.alpha/and :portkey.aws.iot/force-delete))
(clojure.spec.alpha/def :portkey.aws.iot/delete-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-certificate-request/certificateId] :opt-un [:portkey.aws.iot.delete-certificate-request/forceDelete] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.cancel-certificate-transfer-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/cancel-certificate-transfer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.cancel-certificate-transfer-request/certificateId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.get-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot/get-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.get-policy-request/policyName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-job-request/target-selection (clojure.spec.alpha/and :portkey.aws.iot/target-selection))
(clojure.spec.alpha/def :portkey.aws.iot.create-job-request/document (clojure.spec.alpha/and :portkey.aws.iot/job-document))
(clojure.spec.alpha/def :portkey.aws.iot.create-job-request/document-source (clojure.spec.alpha/and :portkey.aws.iot/job-document-source))
(clojure.spec.alpha/def :portkey.aws.iot.create-job-request/targets (clojure.spec.alpha/and :portkey.aws.iot/job-targets))
(clojure.spec.alpha/def :portkey.aws.iot.create-job-request/presigned-url-config (clojure.spec.alpha/and :portkey.aws.iot/presigned-url-config))
(clojure.spec.alpha/def :portkey.aws.iot.create-job-request/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.create-job-request/job-executions-rollout-config (clojure.spec.alpha/and :portkey.aws.iot/job-executions-rollout-config))
(clojure.spec.alpha/def :portkey.aws.iot.create-job-request/description (clojure.spec.alpha/and :portkey.aws.iot/job-description))
(clojure.spec.alpha/def :portkey.aws.iot.create-job-request/document-parameters (clojure.spec.alpha/and :portkey.aws.iot/job-document-parameters))
(clojure.spec.alpha/def :portkey.aws.iot/create-job-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-job-request/jobId :portkey.aws.iot.create-job-request/targets] :opt-un [:portkey.aws.iot.create-job-request/targetSelection :portkey.aws.iot.create-job-request/document :portkey.aws.iot.create-job-request/documentSource :portkey.aws.iot.create-job-request/presignedUrlConfig :portkey.aws.iot.create-job-request/jobExecutionsRolloutConfig :portkey.aws.iot.create-job-request/description :portkey.aws.iot.create-job-request/documentParameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/stream-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.get-registration-code-response/registration-code (clojure.spec.alpha/and :portkey.aws.iot/registration-code))
(clojure.spec.alpha/def :portkey.aws.iot/get-registration-code-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-registration-code-response/registrationCode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/get-logging-options-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.resource-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.stream-file/file-id (clojure.spec.alpha/and :portkey.aws.iot/file-id))
(clojure.spec.alpha/def :portkey.aws.iot.stream-file/s3-location (clojure.spec.alpha/and :portkey.aws.iot/s3-location))
(clojure.spec.alpha/def :portkey.aws.iot/stream-file (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.stream-file/fileId :portkey.aws.iot.stream-file/s3Location] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.sns-action/target-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.sns-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.sns-action/message-format (clojure.spec.alpha/and :portkey.aws.iot/message-format))
(clojure.spec.alpha/def :portkey.aws.iot/sns-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.sns-action/targetArn :portkey.aws.iot.sns-action/roleArn] :opt-un [:portkey.aws.iot.sns-action/messageFormat] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-group-response/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-group-response/thing-group-id (clojure.spec.alpha/and :portkey.aws.iot/thing-group-id))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-group-response/thing-group-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-group-arn))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-group-response/version (clojure.spec.alpha/and :portkey.aws.iot/version))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-group-response/thing-group-properties (clojure.spec.alpha/and :portkey.aws.iot/thing-group-properties))
(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-group-response/thing-group-metadata (clojure.spec.alpha/and :portkey.aws.iot/thing-group-metadata))
(clojure.spec.alpha/def :portkey.aws.iot/describe-thing-group-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-thing-group-response/thingGroupName :portkey.aws.iot.describe-thing-group-response/thingGroupId :portkey.aws.iot.describe-thing-group-response/thingGroupArn :portkey.aws.iot.describe-thing-group-response/version :portkey.aws.iot.describe-thing-group-response/thingGroupProperties :portkey.aws.iot.describe-thing-group-response/thingGroupMetadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.not-configured-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/not-configured-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.not-configured-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.presigned-url-config/role-arn (clojure.spec.alpha/and :portkey.aws.iot/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.presigned-url-config/expires-in-sec (clojure.spec.alpha/and :portkey.aws.iot/expires-in-sec))
(clojure.spec.alpha/def :portkey.aws.iot/presigned-url-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.presigned-url-config/roleArn :portkey.aws.iot.presigned-url-config/expiresInSec] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/undo-deprecate clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/describe-event-configurations-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/delete-thing-type-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/deletecacertificate-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/queued-things (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.iot.describe-role-alias-request/role-alias (clojure.spec.alpha/and :portkey.aws.iot/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot/describe-role-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-role-alias-request/roleAlias] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.invalid-response-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/invalid-response-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.invalid-response-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.delete-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot/delete-thing-type-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-thing-type-request/thingTypeName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/credential-duration-seconds (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 900 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 3600))))

(clojure.spec.alpha/def :portkey.aws.iot.index-not-ready-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/index-not-ready-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.index-not-ready-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/job-execution-summary-for-job-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/job-execution-summary-for-job) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.delete-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot/delete-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-policy-request/policyName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.associate-targets-with-job-response/job-arn (clojure.spec.alpha/and :portkey.aws.iot/job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.associate-targets-with-job-response/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.associate-targets-with-job-response/description (clojure.spec.alpha/and :portkey.aws.iot/job-description))
(clojure.spec.alpha/def :portkey.aws.iot/associate-targets-with-job-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.associate-targets-with-job-response/jobArn :portkey.aws.iot.associate-targets-with-job-response/jobId :portkey.aws.iot.associate-targets-with-job-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/otaupdate-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 2028)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[^\p{C}]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.describe-job-execution-response/execution (clojure.spec.alpha/and :portkey.aws.iot/job-execution))
(clojure.spec.alpha/def :portkey.aws.iot/describe-job-execution-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-job-execution-response/execution] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/token-key-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.delete-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.delete-policy-version-request/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot/delete-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-policy-version-request/policyName :portkey.aws.iot.delete-policy-version-request/policyVersionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/policy-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.list-attached-policies-request/target (clojure.spec.alpha/and :portkey.aws.iot/policy-target))
(clojure.spec.alpha/def :portkey.aws.iot.list-attached-policies-request/recursive (clojure.spec.alpha/and :portkey.aws.iot/recursive))
(clojure.spec.alpha/def :portkey.aws.iot.list-attached-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-attached-policies-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot/list-attached-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-attached-policies-request/target] :opt-un [:portkey.aws.iot.list-attached-policies-request/recursive :portkey.aws.iot.list-attached-policies-request/marker :portkey.aws.iot.list-attached-policies-request/pageSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/authorizer-status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"ACTIVE" "ACTIVE", :active "ACTIVE", "INACTIVE" "INACTIVE", :inactive "INACTIVE"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.group-name-and-arn/group-name (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.group-name-and-arn/group-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-group-arn))
(clojure.spec.alpha/def :portkey.aws.iot/group-name-and-arn (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.group-name-and-arn/groupName :portkey.aws.iot.group-name-and-arn/groupArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/aws-account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[0-9]{12}" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iot/is-disabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.sql-parse-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/sql-parse-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.sql-parse-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.update-authorizer-response/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.update-authorizer-response/authorizer-arn (clojure.spec.alpha/and :portkey.aws.iot/authorizer-arn))
(clojure.spec.alpha/def :portkey.aws.iot/update-authorizer-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.update-authorizer-response/authorizerName :portkey.aws.iot.update-authorizer-response/authorizerArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/resources (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/resource) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/policy-documents (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/policy-document) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.get-indexing-configuration-response/thing-indexing-configuration (clojure.spec.alpha/and :portkey.aws.iot/thing-indexing-configuration))
(clojure.spec.alpha/def :portkey.aws.iot/get-indexing-configuration-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-indexing-configuration-response/thingIndexingConfiguration] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/auth-decision (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"ALLOWED" "ALLOWED", :allowed "ALLOWED", "EXPLICIT_DENY" "EXPLICIT_DENY", :explicit-deny "EXPLICIT_DENY", "IMPLICIT_DENY" "IMPLICIT_DENY", :implicit-deny "IMPLICIT_DENY"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.list-authorizers-response/authorizers (clojure.spec.alpha/and :portkey.aws.iot/authorizers))
(clojure.spec.alpha/def :portkey.aws.iot.list-authorizers-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-authorizers-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-authorizers-response/authorizers :portkey.aws.iot.list-authorizers-response/nextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.internal-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/internal-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.internal-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.log-target/target-type (clojure.spec.alpha/and :portkey.aws.iot/log-target-type))
(clojure.spec.alpha/def :portkey.aws.iot.log-target/target-name (clojure.spec.alpha/and :portkey.aws.iot/log-target-name))
(clojure.spec.alpha/def :portkey.aws.iot/log-target (portkey.aws/json-keys :req-un [:portkey.aws.iot.log-target/targetType] :opt-un [:portkey.aws.iot.log-target/targetName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.get-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-response/default-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot/get-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-policy-response/policyName :portkey.aws.iot.get-policy-response/policyArn :portkey.aws.iot.get-policy-response/policyDocument :portkey.aws.iot.get-policy-response/defaultVersionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-metric-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-metric-action/metric-namespace (clojure.spec.alpha/and :portkey.aws.iot/metric-namespace))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-metric-action/metric-name (clojure.spec.alpha/and :portkey.aws.iot/metric-name))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-metric-action/metric-value (clojure.spec.alpha/and :portkey.aws.iot/metric-value))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-metric-action/metric-unit (clojure.spec.alpha/and :portkey.aws.iot/metric-unit))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-metric-action/metric-timestamp (clojure.spec.alpha/and :portkey.aws.iot/metric-timestamp))
(clojure.spec.alpha/def :portkey.aws.iot/cloudwatch-metric-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.cloudwatch-metric-action/roleArn :portkey.aws.iot.cloudwatch-metric-action/metricNamespace :portkey.aws.iot.cloudwatch-metric-action/metricName :portkey.aws.iot.cloudwatch-metric-action/metricValue :portkey.aws.iot.cloudwatch-metric-action/metricUnit] :opt-un [:portkey.aws.iot.cloudwatch-metric-action/metricTimestamp] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.set-default-authorizer-request/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot/set-default-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.set-default-authorizer-request/authorizerName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.version-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/version-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.version-conflict-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.job-executions-rollout-config/maximum-per-minute (clojure.spec.alpha/and :portkey.aws.iot/max-job-executions-per-min))
(clojure.spec.alpha/def :portkey.aws.iot/job-executions-rollout-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.job-executions-rollout-config/maximumPerMinute] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.stream-summary/stream-id (clojure.spec.alpha/and :portkey.aws.iot/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.stream-summary/stream-arn (clojure.spec.alpha/and :portkey.aws.iot/stream-arn))
(clojure.spec.alpha/def :portkey.aws.iot.stream-summary/stream-version (clojure.spec.alpha/and :portkey.aws.iot/stream-version))
(clojure.spec.alpha/def :portkey.aws.iot.stream-summary/description (clojure.spec.alpha/and :portkey.aws.iot/stream-description))
(clojure.spec.alpha/def :portkey.aws.iot/stream-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.stream-summary/streamId :portkey.aws.iot.stream-summary/streamArn :portkey.aws.iot.stream-summary/streamVersion :portkey.aws.iot.stream-summary/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-response/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot/create-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-policy-response/policyName :portkey.aws.iot.create-policy-response/policyArn :portkey.aws.iot.create-policy-response/policyDocument :portkey.aws.iot.create-policy-response/policyVersionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.remove-thing-from-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.remove-thing-from-thing-group-request/thing-group-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-group-arn))
(clojure.spec.alpha/def :portkey.aws.iot.remove-thing-from-thing-group-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.remove-thing-from-thing-group-request/thing-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot/remove-thing-from-thing-group-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.remove-thing-from-thing-group-request/thingGroupName :portkey.aws.iot.remove-thing-from-thing-group-request/thingGroupArn :portkey.aws.iot.remove-thing-from-thing-group-request/thingName :portkey.aws.iot.remove-thing-from-thing-group-request/thingArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.error-info/code (clojure.spec.alpha/and :portkey.aws.iot/code))
(clojure.spec.alpha/def :portkey.aws.iot.error-info/message (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-error-message))
(clojure.spec.alpha/def :portkey.aws.iot/error-info (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.error-info/code :portkey.aws.iot.error-info/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/attributes-map (clojure.spec.alpha/map-of :portkey.aws.iot/key :portkey.aws.iot/value))

(clojure.spec.alpha/def :portkey.aws.iot/job-document-source (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 1350))))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-groups-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-groups-request/parent-group (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-groups-request/name-prefix-filter (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-groups-request/recursive (clojure.spec.alpha/and :portkey.aws.iot/recursive-without-default))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-groups-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-thing-groups-request/nextToken :portkey.aws.iot.list-thing-groups-request/maxResults :portkey.aws.iot.list-thing-groups-request/parentGroup :portkey.aws.iot.list-thing-groups-request/namePrefixFilter :portkey.aws.iot.list-thing-groups-request/recursive] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/remove-thing-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.authorizer-description/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.authorizer-description/authorizer-arn (clojure.spec.alpha/and :portkey.aws.iot/authorizer-arn))
(clojure.spec.alpha/def :portkey.aws.iot.authorizer-description/authorizer-function-arn (clojure.spec.alpha/and :portkey.aws.iot/authorizer-function-arn))
(clojure.spec.alpha/def :portkey.aws.iot.authorizer-description/token-key-name (clojure.spec.alpha/and :portkey.aws.iot/token-key-name))
(clojure.spec.alpha/def :portkey.aws.iot.authorizer-description/token-signing-public-keys (clojure.spec.alpha/and :portkey.aws.iot/public-key-map))
(clojure.spec.alpha/def :portkey.aws.iot.authorizer-description/status (clojure.spec.alpha/and :portkey.aws.iot/authorizer-status))
(clojure.spec.alpha/def :portkey.aws.iot.authorizer-description/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.authorizer-description/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/authorizer-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.authorizer-description/authorizerName :portkey.aws.iot.authorizer-description/authorizerArn :portkey.aws.iot.authorizer-description/authorizerFunctionArn :portkey.aws.iot.authorizer-description/tokenKeyName :portkey.aws.iot.authorizer-description/tokenSigningPublicKeys :portkey.aws.iot.authorizer-description/status :portkey.aws.iot.authorizer-description/creationDate :portkey.aws.iot.authorizer-description/lastModifiedDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/delivery-stream-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.attach-thing-principal-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.attach-thing-principal-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot/attach-thing-principal-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.attach-thing-principal-request/thingName :portkey.aws.iot.attach-thing-principal-request/principal] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.resource-registration-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/resource-registration-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.resource-registration-failure-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.sqs-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.sqs-action/queue-url (clojure.spec.alpha/and :portkey.aws.iot/queue-url))
(clojure.spec.alpha/def :portkey.aws.iot.sqs-action/use-base64 (clojure.spec.alpha/and :portkey.aws.iot/use-base64))
(clojure.spec.alpha/def :portkey.aws.iot/sqs-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.sqs-action/roleArn :portkey.aws.iot.sqs-action/queueUrl] :opt-un [:portkey.aws.iot.sqs-action/useBase64] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/s3-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.list-policy-versions-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot/list-policy-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-policy-versions-request/policyName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/cognito-identity-pool-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/parameter (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/details-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 1024)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[^\p{C}]*+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.get-policy-version-request/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot/get-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.get-policy-version-request/policyName :portkey.aws.iot.get-policy-version-request/policyVersionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.allowed/policies (clojure.spec.alpha/and :portkey.aws.iot/policies))
(clojure.spec.alpha/def :portkey.aws.iot/allowed (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.allowed/policies] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/percentage (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 0 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 100))))

(clojure.spec.alpha/def :portkey.aws.iot/job-targets (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/target-arn :min-count 1) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/missing-context-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.denied/implicit-deny (clojure.spec.alpha/and :portkey.aws.iot/implicit-deny))
(clojure.spec.alpha/def :portkey.aws.iot.denied/explicit-deny (clojure.spec.alpha/and :portkey.aws.iot/explicit-deny))
(clojure.spec.alpha/def :portkey.aws.iot/denied (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.denied/implicitDeny :portkey.aws.iot.denied/explicitDeny] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/update-thing-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/policy-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.code-signing-signature/stream (clojure.spec.alpha/and :portkey.aws.iot/stream))
(clojure.spec.alpha/def :portkey.aws.iot.code-signing-signature/inline-document (clojure.spec.alpha/and :portkey.aws.iot/signature))
(clojure.spec.alpha/def :portkey.aws.iot/code-signing-signature (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.code-signing-signature/stream :portkey.aws.iot.code-signing-signature/inlineDocument] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-principal-things-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-things-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-principal-things-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot/list-principal-things-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-principal-things-request/principal] :opt-un [:portkey.aws.iot.list-principal-things-request/nextToken :portkey.aws.iot.list-principal-things-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describe-certificate-response/certificate-description (clojure.spec.alpha/and :portkey.aws.iot/certificate-description))
(clojure.spec.alpha/def :portkey.aws.iot/describe-certificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-certificate-response/certificateDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.conflicting-resource-update-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/conflicting-resource-update-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.conflicting-resource-update-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describe-endpoint-request/endpoint-type (clojure.spec.alpha/and :portkey.aws.iot/endpoint-type))
(clojure.spec.alpha/def :portkey.aws.iot/describe-endpoint-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-endpoint-request/endpointType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-bycarequest/ca-certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-bycarequest/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-bycarequest/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-certificates-bycarequest/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-certificates-bycarequest (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-certificates-bycarequest/caCertificateId] :opt-un [:portkey.aws.iot.list-certificates-bycarequest/pageSize :portkey.aws.iot.list-certificates-bycarequest/marker :portkey.aws.iot.list-certificates-bycarequest/ascendingOrder] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/s3-file-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 65535))))

(clojure.spec.alpha/def :portkey.aws.iot/report-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"ERRORS" "ERRORS", :errors "ERRORS", "RESULTS" "RESULTS", :results "RESULTS"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.describe-role-alias-response/role-alias-description (clojure.spec.alpha/and :portkey.aws.iot/role-alias-description))
(clojure.spec.alpha/def :portkey.aws.iot/describe-role-alias-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-role-alias-response/roleAliasDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.get-job-document-response/document (clojure.spec.alpha/and :portkey.aws.iot/job-document))
(clojure.spec.alpha/def :portkey.aws.iot/get-job-document-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-job-document-response/document] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/thing-type-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/alarm-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.job-execution-status-details/details-map (clojure.spec.alpha/and :portkey.aws.iot/details-map))
(clojure.spec.alpha/def :portkey.aws.iot/job-execution-status-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.job-execution-status-details/detailsMap] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/hash-key-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/targets (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/target :min-count 1) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.republish-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.republish-action/topic (clojure.spec.alpha/and :portkey.aws.iot/topic-pattern))
(clojure.spec.alpha/def :portkey.aws.iot/republish-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.republish-action/roleArn :portkey.aws.iot.republish-action/topic] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describe-job-response/document-source (clojure.spec.alpha/and :portkey.aws.iot/job-document-source))
(clojure.spec.alpha/def :portkey.aws.iot.describe-job-response/job (clojure.spec.alpha/and :portkey.aws.iot/job))
(clojure.spec.alpha/def :portkey.aws.iot/describe-job-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-job-response/documentSource :portkey.aws.iot.describe-job-response/job] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/s3-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.listv2-logging-levels-response/log-target-configurations (clojure.spec.alpha/and :portkey.aws.iot/log-target-configurations))
(clojure.spec.alpha/def :portkey.aws.iot.listv2-logging-levels-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/listv2-logging-levels-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.listv2-logging-levels-response/logTargetConfigurations :portkey.aws.iot.listv2-logging-levels-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/authorizer-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.getotaupdate-request/ota-update-id (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-id))
(clojure.spec.alpha/def :portkey.aws.iot/getotaupdate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.getotaupdate-request/otaUpdateId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/clear-default-authorizer-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.registercacertificate-request/ca-certificate (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.registercacertificate-request/verification-certificate (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.registercacertificate-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot.registercacertificate-request/allow-auto-registration (clojure.spec.alpha/and :portkey.aws.iot/allow-auto-registration))
(clojure.spec.alpha/def :portkey.aws.iot.registercacertificate-request/registration-config (clojure.spec.alpha/and :portkey.aws.iot/registration-config))
(clojure.spec.alpha/def :portkey.aws.iot/registercacertificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.registercacertificate-request/caCertificate :portkey.aws.iot.registercacertificate-request/verificationCertificate] :opt-un [:portkey.aws.iot.registercacertificate-request/setAsActive :portkey.aws.iot.registercacertificate-request/allowAutoRegistration :portkey.aws.iot.registercacertificate-request/registrationConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-policies-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-policies-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-policies-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-policies-request/marker :portkey.aws.iot.list-policies-request/pageSize :portkey.aws.iot.list-policies-request/ascendingOrder] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/stream-version (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 0 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 65535))))

(clojure.spec.alpha/def :portkey.aws.iot/job-execution-status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"CANCELED" "CANCELED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", :rejected "REJECTED", "REMOVED" "REMOVED", :queued "QUEUED", :canceled "CANCELED", "SUCCEEDED" "SUCCEEDED", "REJECTED" "REJECTED", "QUEUED" "QUEUED", "FAILED" "FAILED", :removed "REMOVED", :failed "FAILED", :succeeded "SUCCEEDED"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.register-certificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.register-certificate-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/register-certificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.register-certificate-response/certificateArn :portkey.aws.iot.register-certificate-response/certificateId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/metric-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.job-process-details/processing-targets (clojure.spec.alpha/and :portkey.aws.iot/processing-target-name-list))
(clojure.spec.alpha/def :portkey.aws.iot.job-process-details/number-of-canceled-things (clojure.spec.alpha/and :portkey.aws.iot/canceled-things))
(clojure.spec.alpha/def :portkey.aws.iot.job-process-details/number-of-succeeded-things (clojure.spec.alpha/and :portkey.aws.iot/succeeded-things))
(clojure.spec.alpha/def :portkey.aws.iot.job-process-details/number-of-failed-things (clojure.spec.alpha/and :portkey.aws.iot/failed-things))
(clojure.spec.alpha/def :portkey.aws.iot.job-process-details/number-of-rejected-things (clojure.spec.alpha/and :portkey.aws.iot/rejected-things))
(clojure.spec.alpha/def :portkey.aws.iot.job-process-details/number-of-queued-things (clojure.spec.alpha/and :portkey.aws.iot/queued-things))
(clojure.spec.alpha/def :portkey.aws.iot.job-process-details/number-of-in-progress-things (clojure.spec.alpha/and :portkey.aws.iot/in-progress-things))
(clojure.spec.alpha/def :portkey.aws.iot.job-process-details/number-of-removed-things (clojure.spec.alpha/and :portkey.aws.iot/removed-things))
(clojure.spec.alpha/def :portkey.aws.iot/job-process-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.job-process-details/processingTargets :portkey.aws.iot.job-process-details/numberOfCanceledThings :portkey.aws.iot.job-process-details/numberOfSucceededThings :portkey.aws.iot.job-process-details/numberOfFailedThings :portkey.aws.iot.job-process-details/numberOfRejectedThings :portkey.aws.iot.job-process-details/numberOfQueuedThings :portkey.aws.iot.job-process-details/numberOfInProgressThings :portkey.aws.iot.job-process-details/numberOfRemovedThings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/client-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.transfer-already-completed-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/transfer-already-completed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.transfer-already-completed-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-authorizer-request/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-authorizer-request/authorizer-function-arn (clojure.spec.alpha/and :portkey.aws.iot/authorizer-function-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-authorizer-request/token-key-name (clojure.spec.alpha/and :portkey.aws.iot/token-key-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-authorizer-request/token-signing-public-keys (clojure.spec.alpha/and :portkey.aws.iot/public-key-map))
(clojure.spec.alpha/def :portkey.aws.iot.create-authorizer-request/status (clojure.spec.alpha/and :portkey.aws.iot/authorizer-status))
(clojure.spec.alpha/def :portkey.aws.iot/create-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-authorizer-request/authorizerName :portkey.aws.iot.create-authorizer-request/authorizerFunctionArn :portkey.aws.iot.create-authorizer-request/tokenKeyName :portkey.aws.iot.create-authorizer-request/tokenSigningPublicKeys] :opt-un [:portkey.aws.iot.create-authorizer-request/status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-principals-response/principals (clojure.spec.alpha/and :portkey.aws.iot/principals))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-principals-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-thing-principals-response/principals] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.elasticsearch-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.elasticsearch-action/endpoint (clojure.spec.alpha/and :portkey.aws.iot/elasticsearch-endpoint))
(clojure.spec.alpha/def :portkey.aws.iot.elasticsearch-action/index (clojure.spec.alpha/and :portkey.aws.iot/elasticsearch-index))
(clojure.spec.alpha/def :portkey.aws.iot.elasticsearch-action/type (clojure.spec.alpha/and :portkey.aws.iot/elasticsearch-type))
(clojure.spec.alpha/def :portkey.aws.iot.elasticsearch-action/id (clojure.spec.alpha/and :portkey.aws.iot/elasticsearch-id))
(clojure.spec.alpha/def :portkey.aws.iot/elasticsearch-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.elasticsearch-action/roleArn :portkey.aws.iot.elasticsearch-action/endpoint :portkey.aws.iot.elasticsearch-action/index :portkey.aws.iot.elasticsearch-action/type :portkey.aws.iot.elasticsearch-action/id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.s3-location/bucket (clojure.spec.alpha/and :portkey.aws.iot/s3-bucket))
(clojure.spec.alpha/def :portkey.aws.iot.s3-location/key (clojure.spec.alpha/and :portkey.aws.iot/s3-key))
(clojure.spec.alpha/def :portkey.aws.iot.s3-location/version (clojure.spec.alpha/and :portkey.aws.iot/s3-version))
(clojure.spec.alpha/def :portkey.aws.iot/s3-location (portkey.aws/json-keys :req-un [:portkey.aws.iot.s3-location/bucket :portkey.aws.iot.s3-location/key] :opt-un [:portkey.aws.iot.s3-location/version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.setv2-logging-level-request/log-target (clojure.spec.alpha/and :portkey.aws.iot/log-target))
(clojure.spec.alpha/def :portkey.aws.iot.setv2-logging-level-request/log-level (clojure.spec.alpha/and :portkey.aws.iot/log-level))
(clojure.spec.alpha/def :portkey.aws.iot/setv2-logging-level-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.setv2-logging-level-request/logTarget :portkey.aws.iot.setv2-logging-level-request/logLevel] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/elasticsearch-index (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.get-job-document-request/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot/get-job-document-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.get-job-document-request/jobId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/policies (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/policy) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.create-thing-group-response/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-group-response/thing-group-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-group-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-group-response/thing-group-id (clojure.spec.alpha/and :portkey.aws.iot/thing-group-id))
(clojure.spec.alpha/def :portkey.aws.iot/create-thing-group-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-thing-group-response/thingGroupName :portkey.aws.iot.create-thing-group-response/thingGroupArn :portkey.aws.iot.create-thing-group-response/thingGroupId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/certificate-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.custom-code-signing/signature (clojure.spec.alpha/and :portkey.aws.iot/code-signing-signature))
(clojure.spec.alpha/def :portkey.aws.iot.custom-code-signing/certificate-chain (clojure.spec.alpha/and :portkey.aws.iot/code-signing-certificate-chain))
(clojure.spec.alpha/def :portkey.aws.iot.custom-code-signing/hash-algorithm (clojure.spec.alpha/and :portkey.aws.iot/hash-algorithm))
(clojure.spec.alpha/def :portkey.aws.iot.custom-code-signing/signature-algorithm (clojure.spec.alpha/and :portkey.aws.iot/signature-algorithm))
(clojure.spec.alpha/def :portkey.aws.iot/custom-code-signing (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.custom-code-signing/signature :portkey.aws.iot.custom-code-signing/certificateChain :portkey.aws.iot.custom-code-signing/hashAlgorithm :portkey.aws.iot.custom-code-signing/signatureAlgorithm] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/set-as-active clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/table-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/stop-thing-registration-task-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/s3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.describe-stream-request/stream-id (clojure.spec.alpha/and :portkey.aws.iot/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot/describe-stream-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-stream-request/streamId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/aws-iot-sql-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.disable-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot/disable-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.disable-topic-rule-request/ruleName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/auth-infos (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/auth-info :min-count 1 :max-count 10) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.stream/stream-id (clojure.spec.alpha/and :portkey.aws.iot/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.stream/file-id (clojure.spec.alpha/and :portkey.aws.iot/file-id))
(clojure.spec.alpha/def :portkey.aws.iot/stream (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.stream/streamId :portkey.aws.iot.stream/fileId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/sql (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/details-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/registrys3-bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 3 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 256)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.list-job-executions-for-job-request/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.list-job-executions-for-job-request/status (clojure.spec.alpha/and :portkey.aws.iot/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot.list-job-executions-for-job-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/laser-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-job-executions-for-job-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-job-executions-for-job-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-job-executions-for-job-request/jobId] :opt-un [:portkey.aws.iot.list-job-executions-for-job-request/status :portkey.aws.iot.list-job-executions-for-job-request/maxResults :portkey.aws.iot.list-job-executions-for-job-request/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/range-key-value (clojure.spec.alpha/and :portkey.aws.iot/range-key-value))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/table-name (clojure.spec.alpha/and :portkey.aws.iot/table-name))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/hash-key-value (clojure.spec.alpha/and :portkey.aws.iot/hash-key-value))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/range-key-field (clojure.spec.alpha/and :portkey.aws.iot/range-key-field))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/hash-key-type (clojure.spec.alpha/and :portkey.aws.iot/dynamo-key-type))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/operation (clojure.spec.alpha/and :portkey.aws.iot/dynamo-operation))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/payload-field (clojure.spec.alpha/and :portkey.aws.iot/payload-field))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/hash-key-field (clojure.spec.alpha/and :portkey.aws.iot/hash-key-field))
(clojure.spec.alpha/def :portkey.aws.iot.dynamodbaction/range-key-type (clojure.spec.alpha/and :portkey.aws.iot/dynamo-key-type))
(clojure.spec.alpha/def :portkey.aws.iot/dynamodbaction (portkey.aws/json-keys :req-un [:portkey.aws.iot.dynamodbaction/tableName :portkey.aws.iot.dynamodbaction/roleArn :portkey.aws.iot.dynamodbaction/hashKeyField :portkey.aws.iot.dynamodbaction/hashKeyValue] :opt-un [:portkey.aws.iot.dynamodbaction/rangeKeyValue :portkey.aws.iot.dynamodbaction/rangeKeyField :portkey.aws.iot.dynamodbaction/hashKeyType :portkey.aws.iot.dynamodbaction/operation :portkey.aws.iot.dynamodbaction/payloadField :portkey.aws.iot.dynamodbaction/rangeKeyType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.update-thing-groups-for-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.update-thing-groups-for-thing-request/thing-groups-to-add (clojure.spec.alpha/and :portkey.aws.iot/thing-group-list))
(clojure.spec.alpha/def :portkey.aws.iot.update-thing-groups-for-thing-request/thing-groups-to-remove (clojure.spec.alpha/and :portkey.aws.iot/thing-group-list))
(clojure.spec.alpha/def :portkey.aws.iot/update-thing-groups-for-thing-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.update-thing-groups-for-thing-request/thingName :portkey.aws.iot.update-thing-groups-for-thing-request/thingGroupsToAdd :portkey.aws.iot.update-thing-groups-for-thing-request/thingGroupsToRemove] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/delete-thing-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-policy-principals-response/principals (clojure.spec.alpha/and :portkey.aws.iot/principals))
(clojure.spec.alpha/def :portkey.aws.iot.list-policy-principals-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-policy-principals-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-policy-principals-response/principals :portkey.aws.iot.list-policy-principals-response/nextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/topic-rule-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/topic-rule-list-item) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.update-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.update-thing-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.update-thing-request/attribute-payload (clojure.spec.alpha/and :portkey.aws.iot/attribute-payload))
(clojure.spec.alpha/def :portkey.aws.iot.update-thing-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot.update-thing-request/remove-thing-type (clojure.spec.alpha/and :portkey.aws.iot/remove-thing-type))
(clojure.spec.alpha/def :portkey.aws.iot/update-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.update-thing-request/thingName] :opt-un [:portkey.aws.iot.update-thing-request/thingTypeName :portkey.aws.iot.update-thing-request/attributePayload :portkey.aws.iot.update-thing-request/expectedVersion :portkey.aws.iot.update-thing-request/removeThingType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/policy-version-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[0-9]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-types-response/thing-types (clojure.spec.alpha/and :portkey.aws.iot/thing-type-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-types-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-types-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-thing-types-response/thingTypes :portkey.aws.iot.list-thing-types-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describecacertificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/describecacertificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describecacertificate-request/certificateId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/dynamo-operation (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/authorizers (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/authorizer-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/processing-target-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/processing-target-name) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.list-job-executions-for-thing-response/execution-summaries (clojure.spec.alpha/and :portkey.aws.iot/job-execution-summary-for-thing-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-job-executions-for-thing-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-job-executions-for-thing-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-job-executions-for-thing-response/executionSummaries :portkey.aws.iot.list-job-executions-for-thing-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-thing-response/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-response/thing-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-response/thing-id (clojure.spec.alpha/and :portkey.aws.iot/thing-id))
(clojure.spec.alpha/def :portkey.aws.iot/create-thing-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-thing-response/thingName :portkey.aws.iot.create-thing-response/thingArn :portkey.aws.iot.create-thing-response/thingId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.test-authorization-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot.test-authorization-request/cognito-identity-pool-id (clojure.spec.alpha/and :portkey.aws.iot/cognito-identity-pool-id))
(clojure.spec.alpha/def :portkey.aws.iot.test-authorization-request/auth-infos (clojure.spec.alpha/and :portkey.aws.iot/auth-infos))
(clojure.spec.alpha/def :portkey.aws.iot.test-authorization-request/client-id (clojure.spec.alpha/and :portkey.aws.iot/client-id))
(clojure.spec.alpha/def :portkey.aws.iot.test-authorization-request/policy-names-to-add (clojure.spec.alpha/and :portkey.aws.iot/policy-names))
(clojure.spec.alpha/def :portkey.aws.iot.test-authorization-request/policy-names-to-skip (clojure.spec.alpha/and :portkey.aws.iot/policy-names))
(clojure.spec.alpha/def :portkey.aws.iot/test-authorization-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.test-authorization-request/authInfos] :opt-un [:portkey.aws.iot.test-authorization-request/principal :portkey.aws.iot.test-authorization-request/cognitoIdentityPoolId :portkey.aws.iot.test-authorization-request/clientId :portkey.aws.iot.test-authorization-request/policyNamesToAdd :portkey.aws.iot.test-authorization-request/policyNamesToSkip] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/clear-default-authorizer-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/hash-algorithm (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.list-policy-principals-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.list-policy-principals-request/marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot.list-policy-principals-request/page-size (clojure.spec.alpha/and :portkey.aws.iot/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.list-policy-principals-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot/list-policy-principals-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-policy-principals-request/policyName] :opt-un [:portkey.aws.iot.list-policy-principals-request/marker :portkey.aws.iot.list-policy-principals-request/pageSize :portkey.aws.iot.list-policy-principals-request/ascendingOrder] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/certificate-status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {:inactive "INACTIVE", "REGISTER_INACTIVE" "REGISTER_INACTIVE", "REVOKED" "REVOKED", :revoked "REVOKED", :pending-activation "PENDING_ACTIVATION", :register-inactive "REGISTER_INACTIVE", :pending-transfer "PENDING_TRANSFER", :active "ACTIVE", "INACTIVE" "INACTIVE", "PENDING_ACTIVATION" "PENDING_ACTIVATION", "ACTIVE" "ACTIVE", "PENDING_TRANSFER" "PENDING_TRANSFER"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot.describe-authorizer-response/authorizer-description (clojure.spec.alpha/and :portkey.aws.iot/authorizer-description))
(clojure.spec.alpha/def :portkey.aws.iot/describe-authorizer-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-authorizer-response/authorizerDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/thing-group-name-and-arn-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/group-name-and-arn) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.create-authorizer-response/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-authorizer-response/authorizer-arn (clojure.spec.alpha/and :portkey.aws.iot/authorizer-arn))
(clojure.spec.alpha/def :portkey.aws.iot/create-authorizer-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-authorizer-response/authorizerName :portkey.aws.iot.create-authorizer-response/authorizerArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/authorizer-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[\w=,@-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.policy/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.policy/policy-arn (clojure.spec.alpha/and :portkey.aws.iot/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot/policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.policy/policyName :portkey.aws.iot.policy/policyArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/key-pair (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot/PublicKey :portkey.aws.iot/PrivateKey] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/delete-authorizer-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 1 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 250))))

(clojure.spec.alpha/def :portkey.aws.iot.detach-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.detach-policy-request/target (clojure.spec.alpha/and :portkey.aws.iot/policy-target))
(clojure.spec.alpha/def :portkey.aws.iot/detach-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.detach-policy-request/policyName :portkey.aws.iot.detach-policy-request/target] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-job-executions-for-job-response/execution-summaries (clojure.spec.alpha/and :portkey.aws.iot/job-execution-summary-for-job-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-job-executions-for-job-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-job-executions-for-job-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-job-executions-for-job-response/executionSummaries :portkey.aws.iot.list-job-executions-for-job-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.malformed-policy-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/malformed-policy-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.malformed-policy-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/set-as-default clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/resource (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.getotaupdate-response/ota-update-info (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-info))
(clojure.spec.alpha/def :portkey.aws.iot/getotaupdate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.getotaupdate-response/otaUpdateInfo] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.registercacertificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.registercacertificate-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot/registercacertificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.registercacertificate-response/certificateArn :portkey.aws.iot.registercacertificate-response/certificateId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/add-thing-to-thing-group-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/metric-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.add-thing-to-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.add-thing-to-thing-group-request/thing-group-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-group-arn))
(clojure.spec.alpha/def :portkey.aws.iot.add-thing-to-thing-group-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.add-thing-to-thing-group-request/thing-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot/add-thing-to-thing-group-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.add-thing-to-thing-group-request/thingGroupName :portkey.aws.iot.add-thing-to-thing-group-request/thingGroupArn :portkey.aws.iot.add-thing-to-thing-group-request/thingName :portkey.aws.iot.add-thing-to-thing-group-request/thingArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.logging-options-payload/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.logging-options-payload/log-level (clojure.spec.alpha/and :portkey.aws.iot/log-level))
(clojure.spec.alpha/def :portkey.aws.iot/logging-options-payload (portkey.aws/json-keys :req-un [:portkey.aws.iot.logging-options-payload/roleArn] :opt-un [:portkey.aws.iot.logging-options-payload/logLevel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/elasticsearch-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/throttling-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.throttling-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/file-id (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 0 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 255))))

(clojure.spec.alpha/def :portkey.aws.iot/processing-target-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.list-things-in-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-in-thing-group-request/recursive (clojure.spec.alpha/and :portkey.aws.iot/recursive))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-in-thing-group-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-in-thing-group-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot/list-things-in-thing-group-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-things-in-thing-group-request/thingGroupName] :opt-un [:portkey.aws.iot.list-things-in-thing-group-request/recursive :portkey.aws.iot.list-things-in-thing-group-request/nextToken :portkey.aws.iot.list-things-in-thing-group-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.salesforce-action/token (clojure.spec.alpha/and :portkey.aws.iot/salesforce-token))
(clojure.spec.alpha/def :portkey.aws.iot.salesforce-action/url (clojure.spec.alpha/and :portkey.aws.iot/salesforce-endpoint))
(clojure.spec.alpha/def :portkey.aws.iot/salesforce-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.salesforce-action/token :portkey.aws.iot.salesforce-action/url] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/event-configurations (clojure.spec.alpha/map-of :portkey.aws.iot/event-type :portkey.aws.iot/configuration))

(clojure.spec.alpha/def :portkey.aws.iot/salesforce-endpoint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 2000)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"https://ingestion-[a-zA-Z0-9]{1,12}\.[a-zA-Z0-9]+\.((sfdc-matrix\.net)|(sfdcnow\.com))/streams/\w{1,20}/\w{1,20}/event" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/metric-namespace (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.list-policies-response/policies (clojure.spec.alpha/and :portkey.aws.iot/policies))
(clojure.spec.alpha/def :portkey.aws.iot.list-policies-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-policies-response/policies :portkey.aws.iot.list-policies-response/nextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/ascending-order clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.job/target-selection (clojure.spec.alpha/and :portkey.aws.iot/target-selection))
(clojure.spec.alpha/def :portkey.aws.iot.job/created-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.job/completed-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.job/status (clojure.spec.alpha/and :portkey.aws.iot/job-status))
(clojure.spec.alpha/def :portkey.aws.iot.job/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.job/targets (clojure.spec.alpha/and :portkey.aws.iot/job-targets))
(clojure.spec.alpha/def :portkey.aws.iot.job/job-arn (clojure.spec.alpha/and :portkey.aws.iot/job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.job/presigned-url-config (clojure.spec.alpha/and :portkey.aws.iot/presigned-url-config))
(clojure.spec.alpha/def :portkey.aws.iot.job/job-process-details (clojure.spec.alpha/and :portkey.aws.iot/job-process-details))
(clojure.spec.alpha/def :portkey.aws.iot.job/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.job/comment (clojure.spec.alpha/and :portkey.aws.iot/comment))
(clojure.spec.alpha/def :portkey.aws.iot.job/job-executions-rollout-config (clojure.spec.alpha/and :portkey.aws.iot/job-executions-rollout-config))
(clojure.spec.alpha/def :portkey.aws.iot.job/description (clojure.spec.alpha/and :portkey.aws.iot/job-description))
(clojure.spec.alpha/def :portkey.aws.iot.job/document-parameters (clojure.spec.alpha/and :portkey.aws.iot/job-document-parameters))
(clojure.spec.alpha/def :portkey.aws.iot/job (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.job/targetSelection :portkey.aws.iot.job/createdAt :portkey.aws.iot.job/completedAt :portkey.aws.iot.job/status :portkey.aws.iot.job/lastUpdatedAt :portkey.aws.iot.job/targets :portkey.aws.iot.job/jobArn :portkey.aws.iot.job/presignedUrlConfig :portkey.aws.iot.job/jobProcessDetails :portkey.aws.iot.job/jobId :portkey.aws.iot.job/comment :portkey.aws.iot.job/jobExecutionsRolloutConfig :portkey.aws.iot.job/description :portkey.aws.iot.job/documentParameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/is-default-version clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.auth-info/action-type (clojure.spec.alpha/and :portkey.aws.iot/action-type))
(clojure.spec.alpha/def :portkey.aws.iot.auth-info/resources (clojure.spec.alpha/and :portkey.aws.iot/resources))
(clojure.spec.alpha/def :portkey.aws.iot/auth-info (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.auth-info/actionType :portkey.aws.iot.auth-info/resources] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/target (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.transfer-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/transfer-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.transfer-conflict-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/gemax-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 1 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.iot/code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/optional-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot/action-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"PUBLISH" "PUBLISH", :publish "PUBLISH", "SUBSCRIBE" "SUBSCRIBE", :subscribe "SUBSCRIBE", "RECEIVE" "RECEIVE", :receive "RECEIVE", "CONNECT" "CONNECT", :connect "CONNECT"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/job-execution-summary-for-thing-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/job-execution-summary-for-thing) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/thing-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/principal (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/policy-target (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/status (clojure.spec.alpha/and :portkey.aws.iot/cacertificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/owned-by (clojure.spec.alpha/and :portkey.aws.iot/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate-description/auto-registration-status (clojure.spec.alpha/and :portkey.aws.iot/auto-registration-status))
(clojure.spec.alpha/def :portkey.aws.iot/cacertificate-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.cacertificate-description/certificateArn :portkey.aws.iot.cacertificate-description/certificateId :portkey.aws.iot.cacertificate-description/status :portkey.aws.iot.cacertificate-description/certificatePem :portkey.aws.iot.cacertificate-description/ownedBy :portkey.aws.iot.cacertificate-description/creationDate :portkey.aws.iot.cacertificate-description/autoRegistrationStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.update-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.update-thing-group-request/thing-group-properties (clojure.spec.alpha/and :portkey.aws.iot/thing-group-properties))
(clojure.spec.alpha/def :portkey.aws.iot.update-thing-group-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot/update-thing-group-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.update-thing-group-request/thingGroupName :portkey.aws.iot.update-thing-group-request/thingGroupProperties] :opt-un [:portkey.aws.iot.update-thing-group-request/expectedVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.transfer-data/transfer-message (clojure.spec.alpha/and :portkey.aws.iot/message))
(clojure.spec.alpha/def :portkey.aws.iot.transfer-data/reject-reason (clojure.spec.alpha/and :portkey.aws.iot/message))
(clojure.spec.alpha/def :portkey.aws.iot.transfer-data/transfer-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.transfer-data/accept-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.transfer-data/reject-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/transfer-data (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.transfer-data/transferMessage :portkey.aws.iot.transfer-data/rejectReason :portkey.aws.iot.transfer-data/transferDate :portkey.aws.iot.transfer-data/acceptDate :portkey.aws.iot.transfer-data/rejectDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.start-thing-registration-task-request/template-body (clojure.spec.alpha/and :portkey.aws.iot/template-body))
(clojure.spec.alpha/def :portkey.aws.iot.start-thing-registration-task-request/input-file-bucket (clojure.spec.alpha/and :portkey.aws.iot/registrys3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.iot.start-thing-registration-task-request/input-file-key (clojure.spec.alpha/and :portkey.aws.iot/registrys3-key-name))
(clojure.spec.alpha/def :portkey.aws.iot.start-thing-registration-task-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot/start-thing-registration-task-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.start-thing-registration-task-request/templateBody :portkey.aws.iot.start-thing-registration-task-request/inputFileBucket :portkey.aws.iot.start-thing-registration-task-request/inputFileKey :portkey.aws.iot.start-thing-registration-task-request/roleArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.registration-code-validation-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/registration-code-validation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.registration-code-validation-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/policy-versions (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/policy-version) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-alarm-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-alarm-action/alarm-name (clojure.spec.alpha/and :portkey.aws.iot/alarm-name))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-alarm-action/state-reason (clojure.spec.alpha/and :portkey.aws.iot/state-reason))
(clojure.spec.alpha/def :portkey.aws.iot.cloudwatch-alarm-action/state-value (clojure.spec.alpha/and :portkey.aws.iot/state-value))
(clojure.spec.alpha/def :portkey.aws.iot/cloudwatch-alarm-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.cloudwatch-alarm-action/roleArn :portkey.aws.iot.cloudwatch-alarm-action/alarmName :portkey.aws.iot.cloudwatch-alarm-action/stateReason :portkey.aws.iot.cloudwatch-alarm-action/stateValue] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/signing-job-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.test-authorization-response/auth-results (clojure.spec.alpha/and :portkey.aws.iot/auth-results))
(clojure.spec.alpha/def :portkey.aws.iot/test-authorization-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.test-authorization-response/authResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.lambda-action/function-arn (clojure.spec.alpha/and :portkey.aws.iot/function-arn))
(clojure.spec.alpha/def :portkey.aws.iot/lambda-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.lambda-action/functionArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-jobs-response/jobs (clojure.spec.alpha/and :portkey.aws.iot/job-summary-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-jobs-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-jobs-response/jobs :portkey.aws.iot.list-jobs-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.set-logging-options-request/logging-options-payload (clojure.spec.alpha/and :portkey.aws.iot/logging-options-payload))
(clojure.spec.alpha/def :portkey.aws.iot/set-logging-options-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.set-logging-options-request/loggingOptionsPayload] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-thing-registration-task-reports-request/task-id (clojure.spec.alpha/and :portkey.aws.iot/task-id))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-registration-task-reports-request/report-type (clojure.spec.alpha/and :portkey.aws.iot/report-type))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-registration-task-reports-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-thing-registration-task-reports-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot/list-thing-registration-task-reports-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-thing-registration-task-reports-request/taskId :portkey.aws.iot.list-thing-registration-task-reports-request/reportType] :opt-un [:portkey.aws.iot.list-thing-registration-task-reports-request/nextToken :portkey.aws.iot.list-thing-registration-task-reports-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/certificate-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 64 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 64)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"(0x)?[a-fA-F0-9]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/otaupdates-summary (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/otaupdate-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/otaupdate-status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"CREATE_PENDING" "CREATE_PENDING", :create-pending "CREATE_PENDING", "CREATE_IN_PROGRESS" "CREATE_IN_PROGRESS", :create-in-progress "CREATE_IN_PROGRESS", "CREATE_COMPLETE" "CREATE_COMPLETE", :create-complete "CREATE_COMPLETE", "CREATE_FAILED" "CREATE_FAILED", :create-failed "CREATE_FAILED"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.iot/attach-thing-principal-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.listv2-logging-levels-request/target-type (clojure.spec.alpha/and :portkey.aws.iot/log-target-type))
(clojure.spec.alpha/def :portkey.aws.iot.listv2-logging-levels-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.listv2-logging-levels-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/skyfall-max-results))
(clojure.spec.alpha/def :portkey.aws.iot/listv2-logging-levels-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.listv2-logging-levels-request/targetType :portkey.aws.iot.listv2-logging-levels-request/nextToken :portkey.aws.iot.listv2-logging-levels-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/endpoint-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/in-progress-things (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.iot/certificate-pem (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 65536))))

(clojure.spec.alpha/def :portkey.aws.iot/file-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.job-summary/job-arn (clojure.spec.alpha/and :portkey.aws.iot/job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.job-summary/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.job-summary/thing-group-id (clojure.spec.alpha/and :portkey.aws.iot/thing-group-id))
(clojure.spec.alpha/def :portkey.aws.iot.job-summary/target-selection (clojure.spec.alpha/and :portkey.aws.iot/target-selection))
(clojure.spec.alpha/def :portkey.aws.iot.job-summary/status (clojure.spec.alpha/and :portkey.aws.iot/job-status))
(clojure.spec.alpha/def :portkey.aws.iot.job-summary/created-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.job-summary/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.job-summary/completed-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/job-summary (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.job-summary/jobArn :portkey.aws.iot.job-summary/jobId :portkey.aws.iot.job-summary/thingGroupId :portkey.aws.iot.job-summary/targetSelection :portkey.aws.iot.job-summary/status :portkey.aws.iot.job-summary/createdAt :portkey.aws.iot.job-summary/lastUpdatedAt :portkey.aws.iot.job-summary/completedAt] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.thing-document/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.thing-document/thing-id (clojure.spec.alpha/and :portkey.aws.iot/thing-id))
(clojure.spec.alpha/def :portkey.aws.iot.thing-document/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.thing-document/thing-group-names (clojure.spec.alpha/and :portkey.aws.iot/thing-group-name-list))
(clojure.spec.alpha/def :portkey.aws.iot.thing-document/attributes (clojure.spec.alpha/and :portkey.aws.iot/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.thing-document/shadow (clojure.spec.alpha/and :portkey.aws.iot/json-document))
(clojure.spec.alpha/def :portkey.aws.iot/thing-document (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.thing-document/thingName :portkey.aws.iot.thing-document/thingId :portkey.aws.iot.thing-document/thingTypeName :portkey.aws.iot.thing-document/thingGroupNames :portkey.aws.iot.thing-document/attributes :portkey.aws.iot.thing-document/shadow] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/otaupdate-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 128)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.create-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-type-request/thing-type-properties (clojure.spec.alpha/and :portkey.aws.iot/thing-type-properties))
(clojure.spec.alpha/def :portkey.aws.iot/create-thing-type-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-thing-type-request/thingTypeName] :opt-un [:portkey.aws.iot.create-thing-type-request/thingTypeProperties] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.action/dynamodb (clojure.spec.alpha/and :portkey.aws.iot/dynamodbaction))
(clojure.spec.alpha/def :portkey.aws.iot.action/sns (clojure.spec.alpha/and :portkey.aws.iot/sns-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/cloudwatch-alarm (clojure.spec.alpha/and :portkey.aws.iot/cloudwatch-alarm-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/republish (clojure.spec.alpha/and :portkey.aws.iot/republish-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/kinesis (clojure.spec.alpha/and :portkey.aws.iot/kinesis-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/s3 (clojure.spec.alpha/and :portkey.aws.iot/s3-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/salesforce (clojure.spec.alpha/and :portkey.aws.iot/salesforce-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/sqs (clojure.spec.alpha/and :portkey.aws.iot/sqs-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/elasticsearch (clojure.spec.alpha/and :portkey.aws.iot/elasticsearch-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/cloudwatch-metric (clojure.spec.alpha/and :portkey.aws.iot/cloudwatch-metric-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/firehose (clojure.spec.alpha/and :portkey.aws.iot/firehose-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/dynamodbv2 (clojure.spec.alpha/and :portkey.aws.iot/dynamodbv2-action))
(clojure.spec.alpha/def :portkey.aws.iot.action/lambda (clojure.spec.alpha/and :portkey.aws.iot/lambda-action))
(clojure.spec.alpha/def :portkey.aws.iot/action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.action/dynamoDB :portkey.aws.iot.action/sns :portkey.aws.iot.action/cloudwatchAlarm :portkey.aws.iot.action/republish :portkey.aws.iot.action/kinesis :portkey.aws.iot.action/s3 :portkey.aws.iot.action/salesforce :portkey.aws.iot.action/sqs :portkey.aws.iot.action/elasticsearch :portkey.aws.iot.action/cloudwatchMetric :portkey.aws.iot.action/firehose :portkey.aws.iot.action/dynamoDBv2 :portkey.aws.iot.action/lambda] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot/Enabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/thing-type-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/thing-type-definition) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot.create-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-topic-rule-request/topic-rule-payload (clojure.spec.alpha/and :portkey.aws.iot/topic-rule-payload))
(clojure.spec.alpha/def :portkey.aws.iot/create-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-topic-rule-request/ruleName :portkey.aws.iot.create-topic-rule-request/topicRulePayload] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/created-at-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.job-execution-summary-for-thing/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.job-execution-summary-for-thing/job-execution-summary (clojure.spec.alpha/and :portkey.aws.iot/job-execution-summary))
(clojure.spec.alpha/def :portkey.aws.iot/job-execution-summary-for-thing (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.job-execution-summary-for-thing/jobId :portkey.aws.iot.job-execution-summary-for-thing/jobExecutionSummary] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.iot.certificate/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.certificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.certificate/status (clojure.spec.alpha/and :portkey.aws.iot/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.certificate/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/certificate (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.certificate/certificateArn :portkey.aws.iot.certificate/certificateId :portkey.aws.iot.certificate/status :portkey.aws.iot.certificate/creationDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describe-stream-response/stream-info (clojure.spec.alpha/and :portkey.aws.iot/stream-info))
(clojure.spec.alpha/def :portkey.aws.iot/describe-stream-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-stream-response/streamInfo] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.update-role-alias-request/role-alias (clojure.spec.alpha/and :portkey.aws.iot/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot.update-role-alias-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.update-role-alias-request/credential-duration-seconds (clojure.spec.alpha/and :portkey.aws.iot/credential-duration-seconds))
(clojure.spec.alpha/def :portkey.aws.iot/update-role-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.update-role-alias-request/roleAlias] :opt-un [:portkey.aws.iot.update-role-alias-request/roleArn :portkey.aws.iot.update-role-alias-request/credentialDurationSeconds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/job-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 2028)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[^\p{C}]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-response/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-response/is-default-version (clojure.spec.alpha/and :portkey.aws.iot/is-default-version))
(clojure.spec.alpha/def :portkey.aws.iot/create-policy-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-policy-version-response/policyArn :portkey.aws.iot.create-policy-version-response/policyDocument :portkey.aws.iot.create-policy-version-response/policyVersionId :portkey.aws.iot.create-policy-version-response/isDefaultVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.delete-authorizer-request/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot/delete-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-authorizer-request/authorizerName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/state-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/aws-iot-job-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/elasticsearch-endpoint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"https?://.*" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-info/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-info/target-selection (clojure.spec.alpha/and :portkey.aws.iot/target-selection))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-info/ota-update-id (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-id))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-info/ota-update-status (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-status))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-info/ota-update-files (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-files))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-info/error-info (clojure.spec.alpha/and :portkey.aws.iot/error-info))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-info/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-info/ota-update-arn (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-info/targets (clojure.spec.alpha/and :portkey.aws.iot/targets))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-info/aws-iot-job-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-iot-job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-info/aws-iot-job-id (clojure.spec.alpha/and :portkey.aws.iot/aws-iot-job-id))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-info/description (clojure.spec.alpha/and :portkey.aws.iot/otaupdate-description))
(clojure.spec.alpha/def :portkey.aws.iot.otaupdate-info/additional-parameters (clojure.spec.alpha/and :portkey.aws.iot/additional-parameter-map))
(clojure.spec.alpha/def :portkey.aws.iot/otaupdate-info (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.otaupdate-info/creationDate :portkey.aws.iot.otaupdate-info/targetSelection :portkey.aws.iot.otaupdate-info/otaUpdateId :portkey.aws.iot.otaupdate-info/otaUpdateStatus :portkey.aws.iot.otaupdate-info/otaUpdateFiles :portkey.aws.iot.otaupdate-info/errorInfo :portkey.aws.iot.otaupdate-info/lastModifiedDate :portkey.aws.iot.otaupdate-info/otaUpdateArn :portkey.aws.iot.otaupdate-info/targets :portkey.aws.iot.otaupdate-info/awsIotJobArn :portkey.aws.iot.otaupdate-info/awsIotJobId :portkey.aws.iot.otaupdate-info/description :portkey.aws.iot.otaupdate-info/additionalParameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.effective-policy/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.effective-policy/policy-arn (clojure.spec.alpha/and :portkey.aws.iot/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.effective-policy/policy-document (clojure.spec.alpha/and :portkey.aws.iot/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot/effective-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.effective-policy/policyName :portkey.aws.iot.effective-policy/policyArn :portkey.aws.iot.effective-policy/policyDocument] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-things-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-request/attribute-name (clojure.spec.alpha/and :portkey.aws.iot/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-request/attribute-value (clojure.spec.alpha/and :portkey.aws.iot/attribute-value))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot/list-things-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-things-request/nextToken :portkey.aws.iot.list-things-request/maxResults :portkey.aws.iot.list-things-request/attributeName :portkey.aws.iot.list-things-request/attributeValue :portkey.aws.iot.list-things-request/thingTypeName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/details-map (clojure.spec.alpha/map-of :portkey.aws.iot/details-key :portkey.aws.iot/details-value))

(clojure.spec.alpha/def :portkey.aws.iot.describe-endpoint-response/endpoint-address (clojure.spec.alpha/and :portkey.aws.iot/endpoint-address))
(clojure.spec.alpha/def :portkey.aws.iot/describe-endpoint-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.describe-endpoint-response/endpointAddress] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.update-authorizer-request/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.update-authorizer-request/authorizer-function-arn (clojure.spec.alpha/and :portkey.aws.iot/authorizer-function-arn))
(clojure.spec.alpha/def :portkey.aws.iot.update-authorizer-request/token-key-name (clojure.spec.alpha/and :portkey.aws.iot/token-key-name))
(clojure.spec.alpha/def :portkey.aws.iot.update-authorizer-request/token-signing-public-keys (clojure.spec.alpha/and :portkey.aws.iot/public-key-map))
(clojure.spec.alpha/def :portkey.aws.iot.update-authorizer-request/status (clojure.spec.alpha/and :portkey.aws.iot/authorizer-status))
(clojure.spec.alpha/def :portkey.aws.iot/update-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.update-authorizer-request/authorizerName] :opt-un [:portkey.aws.iot.update-authorizer-request/authorizerFunctionArn :portkey.aws.iot.update-authorizer-request/tokenKeyName :portkey.aws.iot.update-authorizer-request/tokenSigningPublicKeys :portkey.aws.iot.update-authorizer-request/status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.describe-thing-registration-task-request/task-id (clojure.spec.alpha/and :portkey.aws.iot/task-id))
(clojure.spec.alpha/def :portkey.aws.iot/describe-thing-registration-task-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.describe-thing-registration-task-request/taskId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/force-delete clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/job-document-parameters (clojure.spec.alpha/map-of :portkey.aws.iot/parameter-key :portkey.aws.iot/parameter-value))

(clojure.spec.alpha/def :portkey.aws.iot/get-indexing-configuration-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/recursive clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/delete-thing-group-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-job-executions-for-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.list-job-executions-for-thing-request/status (clojure.spec.alpha/and :portkey.aws.iot/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot.list-job-executions-for-thing-request/max-results (clojure.spec.alpha/and :portkey.aws.iot/laser-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.list-job-executions-for-thing-request/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-job-executions-for-thing-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.list-job-executions-for-thing-request/thingName] :opt-un [:portkey.aws.iot.list-job-executions-for-thing-request/status :portkey.aws.iot.list-job-executions-for-thing-request/maxResults :portkey.aws.iot.list-job-executions-for-thing-request/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.replace-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.replace-topic-rule-request/topic-rule-payload (clojure.spec.alpha/and :portkey.aws.iot/topic-rule-payload))
(clojure.spec.alpha/def :portkey.aws.iot/replace-topic-rule-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.replace-topic-rule-request/ruleName :portkey.aws.iot.replace-topic-rule-request/topicRulePayload] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.s3-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.s3-action/bucket-name (clojure.spec.alpha/and :portkey.aws.iot/bucket-name))
(clojure.spec.alpha/def :portkey.aws.iot.s3-action/key (clojure.spec.alpha/and :portkey.aws.iot/key))
(clojure.spec.alpha/def :portkey.aws.iot.s3-action/canned-acl (clojure.spec.alpha/and :portkey.aws.iot/canned-access-control-list))
(clojure.spec.alpha/def :portkey.aws.iot/s3-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.s3-action/roleArn :portkey.aws.iot.s3-action/bucketName :portkey.aws.iot.s3-action/key] :opt-un [:portkey.aws.iot.s3-action/cannedAcl] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.job-execution/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.job-execution/status (clojure.spec.alpha/and :portkey.aws.iot/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot.job-execution/status-details (clojure.spec.alpha/and :portkey.aws.iot/job-execution-status-details))
(clojure.spec.alpha/def :portkey.aws.iot.job-execution/thing-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot.job-execution/queued-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.job-execution/started-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.job-execution/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.job-execution/execution-number (clojure.spec.alpha/and :portkey.aws.iot/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot/job-execution (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.job-execution/jobId :portkey.aws.iot.job-execution/status :portkey.aws.iot.job-execution/statusDetails :portkey.aws.iot.job-execution/thingArn :portkey.aws.iot.job-execution/queuedAt :portkey.aws.iot.job-execution/startedAt :portkey.aws.iot.job-execution/lastUpdatedAt :portkey.aws.iot.job-execution/executionNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.set-default-authorizer-response/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.set-default-authorizer-response/authorizer-arn (clojure.spec.alpha/and :portkey.aws.iot/authorizer-arn))
(clojure.spec.alpha/def :portkey.aws.iot/set-default-authorizer-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.set-default-authorizer-response/authorizerName :portkey.aws.iot.set-default-authorizer-response/authorizerArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/get-registration-code-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.kinesis-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.kinesis-action/stream-name (clojure.spec.alpha/and :portkey.aws.iot/stream-name))
(clojure.spec.alpha/def :portkey.aws.iot.kinesis-action/partition-key (clojure.spec.alpha/and :portkey.aws.iot/partition-key))
(clojure.spec.alpha/def :portkey.aws.iot/kinesis-action (portkey.aws/json-keys :req-un [:portkey.aws.iot.kinesis-action/roleArn :portkey.aws.iot.kinesis-action/streamName] :opt-un [:portkey.aws.iot.kinesis-action/partitionKey] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.cacertificate/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iot/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate/status (clojure.spec.alpha/and :portkey.aws.iot/cacertificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.cacertificate/creation-date (clojure.spec.alpha/and :portkey.aws.iot/date-type))
(clojure.spec.alpha/def :portkey.aws.iot/cacertificate (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.cacertificate/certificateArn :portkey.aws.iot.cacertificate/certificateId :portkey.aws.iot.cacertificate/status :portkey.aws.iot.cacertificate/creationDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/query-max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 1 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 500))))

(clojure.spec.alpha/def :portkey.aws.iot/update-indexing-configuration-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/public-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot/job-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.list-things-response/things (clojure.spec.alpha/and :portkey.aws.iot/thing-attribute-list))
(clojure.spec.alpha/def :portkey.aws.iot.list-things-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/list-things-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-things-response/things :portkey.aws.iot.list-things-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-request/policy-document (clojure.spec.alpha/and :portkey.aws.iot/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.create-policy-version-request/set-as-default (clojure.spec.alpha/and :portkey.aws.iot/set-as-default))
(clojure.spec.alpha/def :portkey.aws.iot/create-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.create-policy-version-request/policyName :portkey.aws.iot.create-policy-version-request/policyDocument] :opt-un [:portkey.aws.iot.create-policy-version-request/setAsDefault] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.create-thing-type-response/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-type-response/thing-type-arn (clojure.spec.alpha/and :portkey.aws.iot/thing-type-arn))
(clojure.spec.alpha/def :portkey.aws.iot.create-thing-type-response/thing-type-id (clojure.spec.alpha/and :portkey.aws.iot/thing-type-id))
(clojure.spec.alpha/def :portkey.aws.iot/create-thing-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.create-thing-type-response/thingTypeName :portkey.aws.iot.create-thing-type-response/thingTypeArn :portkey.aws.iot.create-thing-type-response/thingTypeId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.certificate-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot/error-message))
(clojure.spec.alpha/def :portkey.aws.iot/certificate-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.certificate-conflict-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.list-outgoing-certificates-response/outgoing-certificates (clojure.spec.alpha/and :portkey.aws.iot/outgoing-certificates))
(clojure.spec.alpha/def :portkey.aws.iot.list-outgoing-certificates-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot/marker))
(clojure.spec.alpha/def :portkey.aws.iot/list-outgoing-certificates-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.list-outgoing-certificates-response/outgoingCertificates :portkey.aws.iot.list-outgoing-certificates-response/nextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/thing-group-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/thing-group-name) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/payload-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot/authorizer-function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-list-item/rule-arn (clojure.spec.alpha/and :portkey.aws.iot/rule-arn))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-list-item/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-list-item/topic-pattern (clojure.spec.alpha/and :portkey.aws.iot/topic-pattern))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-list-item/created-at (clojure.spec.alpha/and :portkey.aws.iot/created-at-date))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule-list-item/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot/topic-rule-list-item (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.topic-rule-list-item/ruleArn :portkey.aws.iot.topic-rule-list-item/ruleName :portkey.aws.iot.topic-rule-list-item/topicPattern :portkey.aws.iot.topic-rule-list-item/createdAt :portkey.aws.iot.topic-rule-list-item/ruleDisabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 1024)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[^\p{C}]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/delete-role-alias-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/is-authenticated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot/firehose-separator (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"([\n\t])|(\r\n)|(,)" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.delete-role-alias-request/role-alias (clojure.spec.alpha/and :portkey.aws.iot/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot/delete-role-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.delete-role-alias-request/roleAlias] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/seconds (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.iot/deleteotaupdate-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.auth-result/auth-info (clojure.spec.alpha/and :portkey.aws.iot/auth-info))
(clojure.spec.alpha/def :portkey.aws.iot.auth-result/allowed (clojure.spec.alpha/and :portkey.aws.iot/allowed))
(clojure.spec.alpha/def :portkey.aws.iot.auth-result/denied (clojure.spec.alpha/and :portkey.aws.iot/denied))
(clojure.spec.alpha/def :portkey.aws.iot.auth-result/auth-decision (clojure.spec.alpha/and :portkey.aws.iot/auth-decision))
(clojure.spec.alpha/def :portkey.aws.iot.auth-result/missing-context-values (clojure.spec.alpha/and :portkey.aws.iot/missing-context-values))
(clojure.spec.alpha/def :portkey.aws.iot/auth-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.auth-result/authInfo :portkey.aws.iot.auth-result/allowed :portkey.aws.iot.auth-result/denied :portkey.aws.iot.auth-result/authDecision :portkey.aws.iot.auth-result/missingContextValues] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.associate-targets-with-job-request/targets (clojure.spec.alpha/and :portkey.aws.iot/job-targets))
(clojure.spec.alpha/def :portkey.aws.iot.associate-targets-with-job-request/job-id (clojure.spec.alpha/and :portkey.aws.iot/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.associate-targets-with-job-request/comment (clojure.spec.alpha/and :portkey.aws.iot/comment))
(clojure.spec.alpha/def :portkey.aws.iot/associate-targets-with-job-request (portkey.aws/json-keys :req-un [:portkey.aws.iot.associate-targets-with-job-request/targets :portkey.aws.iot.associate-targets-with-job-request/jobId] :opt-un [:portkey.aws.iot.associate-targets-with-job-request/comment] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.register-thing-response/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.register-thing-response/resource-arns (clojure.spec.alpha/and :portkey.aws.iot/resource-arns))
(clojure.spec.alpha/def :portkey.aws.iot/register-thing-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.register-thing-response/certificatePem :portkey.aws.iot.register-thing-response/resourceArns] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.get-effective-policies-request/principal (clojure.spec.alpha/and :portkey.aws.iot/principal))
(clojure.spec.alpha/def :portkey.aws.iot.get-effective-policies-request/cognito-identity-pool-id (clojure.spec.alpha/and :portkey.aws.iot/cognito-identity-pool-id))
(clojure.spec.alpha/def :portkey.aws.iot.get-effective-policies-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot/get-effective-policies-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.get-effective-policies-request/principal :portkey.aws.iot.get-effective-policies-request/cognitoIdentityPoolId :portkey.aws.iot.get-effective-policies-request/thingName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot.listotaupdates-response/ota-updates (clojure.spec.alpha/and :portkey.aws.iot/otaupdates-summary))
(clojure.spec.alpha/def :portkey.aws.iot.listotaupdates-response/next-token (clojure.spec.alpha/and :portkey.aws.iot/next-token))
(clojure.spec.alpha/def :portkey.aws.iot/listotaupdates-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.listotaupdates-response/otaUpdates :portkey.aws.iot.listotaupdates-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/principals (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.iot/principal-arn) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.iot/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/rule-name (clojure.spec.alpha/and :portkey.aws.iot/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/sql (clojure.spec.alpha/and :portkey.aws.iot/sql))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/description (clojure.spec.alpha/and :portkey.aws.iot/description))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/created-at (clojure.spec.alpha/and :portkey.aws.iot/created-at-date))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/actions (clojure.spec.alpha/and :portkey.aws.iot/action-list))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/aws-iot-sql-version (clojure.spec.alpha/and :portkey.aws.iot/aws-iot-sql-version))
(clojure.spec.alpha/def :portkey.aws.iot.topic-rule/error-action (clojure.spec.alpha/and :portkey.aws.iot/action))
(clojure.spec.alpha/def :portkey.aws.iot/topic-rule (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iot.topic-rule/ruleName :portkey.aws.iot.topic-rule/sql :portkey.aws.iot.topic-rule/description :portkey.aws.iot.topic-rule/createdAt :portkey.aws.iot.topic-rule/actions :portkey.aws.iot.topic-rule/ruleDisabled :portkey.aws.iot.topic-rule/awsIotSqlVersion :portkey.aws.iot.topic-rule/errorAction] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iot/registration-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 64 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 64)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"(0x)?[a-fA-F0-9]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 64)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__15968__auto__))))

(clojure.core/defn update-role-alias "Updates a role alias." ([update-role-alias-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/role-aliases/{roleAlias}" update-role-alias-request :portkey.aws.iot/update-role-alias-request {:payload nil, :move {}, :headers {}, :uri {"roleAlias" "roleAlias"}, :querystring {}} nil :portkey.aws.iot/update-role-alias-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef update-role-alias :args (clojure.spec.alpha/tuple :portkey.aws.iot/update-role-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/update-role-alias-response))

(clojure.core/defn getotaupdate "Gets an OTA update." ([getotaupdate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/otaUpdates/{otaUpdateId}" getotaupdate-request :portkey.aws.iot/getotaupdate-request {:payload nil, :move {}, :headers {}, :uri {"otaUpdateId" "otaUpdateId"}, :querystring {}} nil :portkey.aws.iot/getotaupdate-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef getotaupdate :args (clojure.spec.alpha/tuple :portkey.aws.iot/getotaupdate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/getotaupdate-response))

(clojure.core/defn list-indices "Lists the search indices." ([] (list-indices {})) ([list-indices-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/indices" list-indices-request :portkey.aws.iot/list-indices-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iot/list-indices-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-indices :args (clojure.spec.alpha/? :portkey.aws.iot/list-indices-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-indices-response))

(clojure.core/defn list-policy-versions "Lists the versions of the specified policy and identifies the default version." ([list-policy-versions-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/policies/{policyName}/version" list-policy-versions-request :portkey.aws.iot/list-policy-versions-request {:payload nil, :move {}, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil :portkey.aws.iot/list-policy-versions-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-policy-versions :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-policy-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-policy-versions-response))

(clojure.core/defn delete-policy-version "Deletes the specified version of the specified policy. You cannot delete the\ndefault version of a policy using this API. To delete the default version of a\npolicy, use DeletePolicy. To find out which version of a policy is marked as the\ndefault version, use ListPolicyVersions." ([delete-policy-version-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/policies/{policyName}/version/{policyVersionId}" delete-policy-version-request :portkey.aws.iot/delete-policy-version-request {:payload nil, :move {}, :headers {}, :uri {"policyName" "policyName", "policyVersionId" "policyVersionId"}, :querystring {}} nil nil {"DeleteConflictException" :portkey.aws.iot/delete-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn create-role-alias "Creates a role alias." ([create-role-alias-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/role-aliases/{roleAlias}" create-role-alias-request :portkey.aws.iot/create-role-alias-request {:payload nil, :move {}, :headers {}, :uri {"roleAlias" "roleAlias"}, :querystring {}} nil :portkey.aws.iot/create-role-alias-response {"ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef create-role-alias :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-role-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-role-alias-response))

(clojure.core/defn update-authorizer "Updates an authorizer." ([update-authorizer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/authorizer/{authorizerName}" update-authorizer-request :portkey.aws.iot/update-authorizer-request {:payload nil, :move {}, :headers {}, :uri {"authorizerName" "authorizerName"}, :querystring {}} nil :portkey.aws.iot/update-authorizer-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef update-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.iot/update-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/update-authorizer-response))

(clojure.core/defn attach-principal-policy "Attaches the specified policy to the specified principal (certificate or other\ncredential).\n Note: This API is deprecated. Please use AttachPolicy instead." ([attach-principal-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/principal-policies/{policyName}" attach-principal-policy-request :portkey.aws.iot/attach-principal-policy-request {:payload nil, :move {}, :headers {"principal" ["x-amzn-iot-principal" nil]}, :uri {"policyName" "policyName"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception})))
(clojure.spec.alpha/fdef attach-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot/attach-principal-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-authorizers "Lists the authorizers registered in your account." ([] (list-authorizers {})) ([list-authorizers-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/authorizers/" list-authorizers-request :portkey.aws.iot/list-authorizers-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder", "status" "status"}} nil :portkey.aws.iot/list-authorizers-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-authorizers :args (clojure.spec.alpha/? :portkey.aws.iot/list-authorizers-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-authorizers-response))

(clojure.core/defn detach-policy "Detaches a policy from the specified target." ([detach-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/target-policies/{policyName}" detach-policy-request :portkey.aws.iot/detach-policy-request {:payload nil, :move {}, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil nil {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception})))
(clojure.spec.alpha/fdef detach-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot/detach-policy-request) :ret clojure.core/true?)

(clojure.core/defn search-index "The query search index." ([search-index-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/indices/search" search-index-request :portkey.aws.iot/search-index-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/search-index-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidQueryException" :portkey.aws.iot/invalid-query-exception, "IndexNotReadyException" :portkey.aws.iot/index-not-ready-exception})))
(clojure.spec.alpha/fdef search-index :args (clojure.spec.alpha/tuple :portkey.aws.iot/search-index-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/search-index-response))

(clojure.core/defn list-certificates-byca "List the device certificates signed by the specified CA certificate." ([list-certificates-bycarequest] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/certificates-by-ca/{caCertificateId}" list-certificates-bycarequest :portkey.aws.iot/list-certificates-bycarequest {:payload nil, :move {}, :headers {}, :uri {"caCertificateId" "caCertificateId"}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-certificates-bycaresponse {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-certificates-byca :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-certificates-bycarequest) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-certificates-bycaresponse))

(clojure.core/defn delete-stream "Deletes a stream." ([delete-stream-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/streams/{streamId}" delete-stream-request :portkey.aws.iot/delete-stream-request {:payload nil, :move {}, :headers {}, :uri {"streamId" "streamId"}, :querystring {}} nil :portkey.aws.iot/delete-stream-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "DeleteConflictException" :portkey.aws.iot/delete-conflict-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-stream :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/delete-stream-response))

(clojure.core/defn get-policy-version "Gets information about the specified policy version." ([get-policy-version-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/policies/{policyName}/version/{policyVersionId}" get-policy-version-request :portkey.aws.iot/get-policy-version-request {:payload nil, :move {}, :headers {}, :uri {"policyName" "policyName", "policyVersionId" "policyVersionId"}, :querystring {}} nil :portkey.aws.iot/get-policy-version-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef get-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot/get-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/get-policy-version-response))

(clojure.core/defn cancel-certificate-transfer "Cancels a pending transfer for the specified certificate.\n Note Only the transfer source account can use this operation to cancel a\ntransfer. (Transfer destinations can use RejectCertificateTransfer instead.)\nAfter transfer, AWS IoT returns the certificate to the source account in the\nINACTIVE state. After the destination account has accepted the transfer, the\ntransfer cannot be cancelled.\n After a certificate transfer is cancelled, the status of the certificate\nchanges from PENDING_TRANSFER to INACTIVE." ([cancel-certificate-transfer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/cancel-certificate-transfer/{certificateId}" cancel-certificate-transfer-request :portkey.aws.iot/cancel-certificate-transfer-request {:payload nil, :move {}, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "TransferAlreadyCompletedException" :portkey.aws.iot/transfer-already-completed-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef cancel-certificate-transfer :args (clojure.spec.alpha/tuple :portkey.aws.iot/cancel-certificate-transfer-request) :ret clojure.core/true?)

(clojure.core/defn get-job-document "Gets a job document." ([get-job-document-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/jobs/{jobId}/job-document" get-job-document-request :portkey.aws.iot/get-job-document-request {:payload nil, :move {}, :headers {}, :uri {"jobId" "jobId"}, :querystring {}} nil :portkey.aws.iot/get-job-document-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-job-document :args (clojure.spec.alpha/tuple :portkey.aws.iot/get-job-document-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/get-job-document-response))

(clojure.core/defn setv2-logging-options "Sets the logging options for the V2 logging service." ([] (setv2-logging-options {})) ([setv2-logging-options-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/v2LoggingOptions" setv2-logging-options-request :portkey.aws.iot/setv2-logging-options-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef setv2-logging-options :args (clojure.spec.alpha/? :portkey.aws.iot/setv2-logging-options-request) :ret clojure.core/true?)

(clojure.core/defn update-indexing-configuration "Updates the search configuration." ([] (update-indexing-configuration {})) ([update-indexing-configuration-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/indexing/config" update-indexing-configuration-request :portkey.aws.iot/update-indexing-configuration-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/update-indexing-configuration-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef update-indexing-configuration :args (clojure.spec.alpha/? :portkey.aws.iot/update-indexing-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/update-indexing-configuration-response))

(clojure.core/defn create-authorizer "Creates an authorizer." ([create-authorizer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/authorizer/{authorizerName}" create-authorizer-request :portkey.aws.iot/create-authorizer-request {:payload nil, :move {}, :headers {}, :uri {"authorizerName" "authorizerName"}, :querystring {}} nil :portkey.aws.iot/create-authorizer-response {"ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef create-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-authorizer-response))

(clojure.core/defn listcacertificates "Lists the CA certificates registered for your AWS account.\n The results are paginated with a default page size of 25. You can use the\nreturned marker to retrieve additional results." ([] (listcacertificates {})) ([listcacertificates-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/cacertificates" listcacertificates-request :portkey.aws.iot/listcacertificates-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/listcacertificates-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef listcacertificates :args (clojure.spec.alpha/? :portkey.aws.iot/listcacertificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/listcacertificates-response))

(clojure.core/defn createotaupdate "Creates an AWS IoT OTAUpdate on a target group of things or groups." ([createotaupdate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/otaUpdates/{otaUpdateId}" createotaupdate-request :portkey.aws.iot/createotaupdate-request {:payload nil, :move {}, :headers {}, :uri {"otaUpdateId" "otaUpdateId"}, :querystring {}} nil :portkey.aws.iot/createotaupdate-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef createotaupdate :args (clojure.spec.alpha/tuple :portkey.aws.iot/createotaupdate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/createotaupdate-response))

(clojure.core/defn listv2-logging-levels "Lists logging levels." ([] (listv2-logging-levels {})) ([listv2-logging-levels-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/v2LoggingLevel" listv2-logging-levels-request :portkey.aws.iot/listv2-logging-levels-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"targetType" "targetType", "nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iot/listv2-logging-levels-response {"InternalException" :portkey.aws.iot/internal-exception, "NotConfiguredException" :portkey.aws.iot/not-configured-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef listv2-logging-levels :args (clojure.spec.alpha/? :portkey.aws.iot/listv2-logging-levels-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/listv2-logging-levels-response))

(clojure.core/defn create-thing "Creates a thing record in the thing registry." ([create-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/things/{thingName}" create-thing-request :portkey.aws.iot/create-thing-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot/create-thing-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef create-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-thing-response))

(clojure.core/defn update-event-configurations "Updates the event configurations." ([] (update-event-configurations {})) ([update-event-configurations-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/event-configurations" update-event-configurations-request :portkey.aws.iot/update-event-configurations-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/update-event-configurations-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception})))
(clojure.spec.alpha/fdef update-event-configurations :args (clojure.spec.alpha/? :portkey.aws.iot/update-event-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/update-event-configurations-response))

(clojure.core/defn create-topic-rule "Creates a rule. Creating rules is an administrator-level action. Any user who\nhas permission to create rules will be able to access data processed by the\nrule." ([create-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/rules/{ruleName}" create-topic-rule-request :portkey.aws.iot/create-topic-rule-request {:payload "topicRulePayload", :move {}, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"SqlParseException" :portkey.aws.iot/sql-parse-exception, "InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef create-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn accept-certificate-transfer "Accepts a pending certificate transfer. The default state of the certificate is\nINACTIVE.\n To check for pending certificate transfers, call ListCertificates to enumerate\nyour certificates." ([accept-certificate-transfer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/accept-certificate-transfer/{certificateId}" accept-certificate-transfer-request :portkey.aws.iot/accept-certificate-transfer-request {:payload nil, :move {}, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {"setAsActive" "setAsActive"}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "TransferAlreadyCompletedException" :portkey.aws.iot/transfer-already-completed-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef accept-certificate-transfer :args (clojure.spec.alpha/tuple :portkey.aws.iot/accept-certificate-transfer-request) :ret clojure.core/true?)

(clojure.core/defn get-registration-code "Gets a registration code used to register a CA certificate with AWS IoT." ([] (get-registration-code {})) ([get-registration-code-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/registrationcode" get-registration-code-request :portkey.aws.iot/get-registration-code-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/get-registration-code-response {"ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception})))
(clojure.spec.alpha/fdef get-registration-code :args (clojure.spec.alpha/? :portkey.aws.iot/get-registration-code-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/get-registration-code-response))

(clojure.core/defn list-policies "Lists your policies." ([] (list-policies {})) ([list-policies-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/policies" list-policies-request :portkey.aws.iot/list-policies-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"marker" "marker", "pageSize" "pageSize", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-policies-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-policies :args (clojure.spec.alpha/? :portkey.aws.iot/list-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-policies-response))

(clojure.core/defn list-thing-registration-task-reports "Information about the thing registration tasks." ([list-thing-registration-task-reports-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/thing-registration-tasks/{taskId}/reports" list-thing-registration-task-reports-request :portkey.aws.iot/list-thing-registration-task-reports-request {:payload nil, :move {}, :headers {}, :uri {"taskId" "taskId"}, :querystring {"reportType" "reportType", "nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iot/list-thing-registration-task-reports-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-thing-registration-task-reports :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-thing-registration-task-reports-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-thing-registration-task-reports-response))

(clojure.core/defn setv2-logging-level "Sets the logging level." ([setv2-logging-level-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/v2LoggingLevel" setv2-logging-level-request :portkey.aws.iot/setv2-logging-level-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot/internal-exception, "NotConfiguredException" :portkey.aws.iot/not-configured-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef setv2-logging-level :args (clojure.spec.alpha/tuple :portkey.aws.iot/setv2-logging-level-request) :ret clojure.core/true?)

(clojure.core/defn delete-registration-code "Deletes a CA certificate registration code." ([] (delete-registration-code {})) ([delete-registration-code-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/registrationcode" delete-registration-code-request :portkey.aws.iot/delete-registration-code-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/delete-registration-code-response {"ThrottlingException" :portkey.aws.iot/throttling-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-registration-code :args (clojure.spec.alpha/? :portkey.aws.iot/delete-registration-code-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/delete-registration-code-response))

(clojure.core/defn describecacertificate "Describes a registered CA certificate." ([describecacertificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/cacertificate/{caCertificateId}" describecacertificate-request :portkey.aws.iot/describecacertificate-request {:payload nil, :move {}, :headers {}, :uri {"caCertificateId" "certificateId"}, :querystring {}} nil :portkey.aws.iot/describecacertificate-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef describecacertificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/describecacertificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describecacertificate-response))

(clojure.core/defn detach-thing-principal "Detaches the specified principal from the specified thing." ([detach-thing-principal-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/things/{thingName}/principals" detach-thing-principal-request :portkey.aws.iot/detach-thing-principal-request {:payload nil, :move {}, :headers {"principal" ["x-amzn-principal" nil]}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot/detach-thing-principal-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef detach-thing-principal :args (clojure.spec.alpha/tuple :portkey.aws.iot/detach-thing-principal-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/detach-thing-principal-response))

(clojure.core/defn list-thing-registration-tasks "List bulk thing provisioning tasks." ([] (list-thing-registration-tasks {})) ([list-thing-registration-tasks-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/thing-registration-tasks" list-thing-registration-tasks-request :portkey.aws.iot/list-thing-registration-tasks-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "status" "status"}} nil :portkey.aws.iot/list-thing-registration-tasks-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-thing-registration-tasks :args (clojure.spec.alpha/? :portkey.aws.iot/list-thing-registration-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-thing-registration-tasks-response))

(clojure.core/defn associate-targets-with-job "Associates a group with a continuous job. The following criteria must be met:\n * The job must have been created with the targetSelection field set to\n\"CONTINUOUS\".\n * The job status must currently be \"IN_PROGRESS\".\n * The total number of targets associated with a job must not exceed 100." ([associate-targets-with-job-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/jobs/{jobId}/targets" associate-targets-with-job-request :portkey.aws.iot/associate-targets-with-job-request {:payload nil, :move {}, :headers {}, :uri {"jobId" "jobId"}, :querystring {}} nil :portkey.aws.iot/associate-targets-with-job-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef associate-targets-with-job :args (clojure.spec.alpha/tuple :portkey.aws.iot/associate-targets-with-job-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/associate-targets-with-job-response))

(clojure.core/defn get-indexing-configuration "Gets the search configuration." ([] (get-indexing-configuration {})) ([get-indexing-configuration-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/indexing/config" get-indexing-configuration-request :portkey.aws.iot/get-indexing-configuration-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/get-indexing-configuration-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef get-indexing-configuration :args (clojure.spec.alpha/? :portkey.aws.iot/get-indexing-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/get-indexing-configuration-response))

(clojure.core/defn list-outgoing-certificates "Lists certificates that are being transferred but not yet accepted." ([] (list-outgoing-certificates {})) ([list-outgoing-certificates-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/certificates-out-going" list-outgoing-certificates-request :portkey.aws.iot/list-outgoing-certificates-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-outgoing-certificates-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-outgoing-certificates :args (clojure.spec.alpha/? :portkey.aws.iot/list-outgoing-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-outgoing-certificates-response))

(clojure.core/defn start-thing-registration-task "Creates a bulk thing provisioning task." ([start-thing-registration-task-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/thing-registration-tasks" start-thing-registration-task-request :portkey.aws.iot/start-thing-registration-task-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/start-thing-registration-task-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef start-thing-registration-task :args (clojure.spec.alpha/tuple :portkey.aws.iot/start-thing-registration-task-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/start-thing-registration-task-response))

(clojure.core/defn list-streams "Lists all of the streams in your AWS account." ([] (list-streams {})) ([list-streams-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/streams" list-streams-request :portkey.aws.iot/list-streams-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"maxResults" "maxResults", "nextToken" "nextToken", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-streams-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-streams :args (clojure.spec.alpha/? :portkey.aws.iot/list-streams-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-streams-response))

(clojure.core/defn list-thing-groups-for-thing "List the thing groups to which the specified thing belongs." ([list-thing-groups-for-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/things/{thingName}/thing-groups" list-thing-groups-for-thing-request :portkey.aws.iot/list-thing-groups-for-thing-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iot/list-thing-groups-for-thing-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef list-thing-groups-for-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-thing-groups-for-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-thing-groups-for-thing-response))

(clojure.core/defn deletev2-logging-level "Deletes a logging level." ([deletev2-logging-level-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/v2LoggingLevel" deletev2-logging-level-request :portkey.aws.iot/deletev2-logging-level-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"targetType" "targetType", "targetName" "targetName"}} nil nil {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef deletev2-logging-level :args (clojure.spec.alpha/tuple :portkey.aws.iot/deletev2-logging-level-request) :ret clojure.core/true?)

(clojure.core/defn deletecacertificate "Deletes a registered CA certificate." ([deletecacertificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/cacertificate/{caCertificateId}" deletecacertificate-request :portkey.aws.iot/deletecacertificate-request {:payload nil, :move {}, :headers {}, :uri {"caCertificateId" "certificateId"}, :querystring {}} nil :portkey.aws.iot/deletecacertificate-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "CertificateStateException" :portkey.aws.iot/certificate-state-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef deletecacertificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/deletecacertificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/deletecacertificate-response))

(clojure.core/defn list-principal-things "Lists the things associated with the specified principal." ([list-principal-things-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/principals/things" list-principal-things-request :portkey.aws.iot/list-principal-things-request {:payload nil, :move {}, :headers {"principal" ["x-amzn-principal" nil]}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iot/list-principal-things-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef list-principal-things :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-principal-things-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-principal-things-response))

(clojure.core/defn test-invoke-authorizer "Invoke the specified custom authorizer for testing purposes." ([test-invoke-authorizer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/authorizer/{authorizerName}/test" test-invoke-authorizer-request :portkey.aws.iot/test-invoke-authorizer-request {:payload nil, :move {}, :headers {}, :uri {"authorizerName" "authorizerName"}, :querystring {}} nil :portkey.aws.iot/test-invoke-authorizer-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "InvalidResponseException" :portkey.aws.iot/invalid-response-exception})))
(clojure.spec.alpha/fdef test-invoke-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.iot/test-invoke-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/test-invoke-authorizer-response))

(clojure.core/defn delete-role-alias "Deletes a role alias" ([delete-role-alias-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/role-aliases/{roleAlias}" delete-role-alias-request :portkey.aws.iot/delete-role-alias-request {:payload nil, :move {}, :headers {}, :uri {"roleAlias" "roleAlias"}, :querystring {}} nil :portkey.aws.iot/delete-role-alias-response {"DeleteConflictException" :portkey.aws.iot/delete-conflict-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef delete-role-alias :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-role-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/delete-role-alias-response))

(clojure.core/defn create-policy-version "Creates a new version of the specified AWS IoT policy. To update a policy,\ncreate a new policy version. A managed policy can have up to five versions. If\nthe policy has five versions, you must use DeletePolicyVersion to delete an\nexisting version before you create a new one.\n Optionally, you can set the new version as the policy's default version. The\ndefault version is the operative version (that is, the version that is in effect\nfor the certificates to which the policy is attached)." ([create-policy-version-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/policies/{policyName}/version" create-policy-version-request :portkey.aws.iot/create-policy-version-request {:payload nil, :move {}, :headers {}, :uri {"policyName" "policyName"}, :querystring {"setAsDefault" "setAsDefault"}} nil :portkey.aws.iot/create-policy-version-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "MalformedPolicyException" :portkey.aws.iot/malformed-policy-exception, "VersionsLimitExceededException" :portkey.aws.iot/versions-limit-exceeded-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef create-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-policy-version-response))

(clojure.core/defn list-role-aliases "Lists the role aliases registered in your account." ([] (list-role-aliases {})) ([list-role-aliases-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/role-aliases" list-role-aliases-request :portkey.aws.iot/list-role-aliases-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-role-aliases-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-role-aliases :args (clojure.spec.alpha/? :portkey.aws.iot/list-role-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-role-aliases-response))

(clojure.core/defn describe-job "Describes a job." ([describe-job-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/jobs/{jobId}" describe-job-request :portkey.aws.iot/describe-job-request {:payload nil, :move {}, :headers {}, :uri {"jobId" "jobId"}, :querystring {}} nil :portkey.aws.iot/describe-job-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef describe-job :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-job-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-job-response))

(clojure.core/defn describe-endpoint "Returns a unique endpoint specific to the AWS account making the call." ([] (describe-endpoint {})) ([describe-endpoint-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/endpoint" describe-endpoint-request :portkey.aws.iot/describe-endpoint-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"endpointType" "endpointType"}} nil :portkey.aws.iot/describe-endpoint-response {"InternalFailureException" :portkey.aws.iot/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception})))
(clojure.spec.alpha/fdef describe-endpoint :args (clojure.spec.alpha/? :portkey.aws.iot/describe-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-endpoint-response))

(clojure.core/defn listotaupdates "Lists OTA updates." ([] (listotaupdates {})) ([listotaupdates-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/otaUpdates" listotaupdates-request :portkey.aws.iot/listotaupdates-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"maxResults" "maxResults", "nextToken" "nextToken", "otaUpdateStatus" "otaUpdateStatus"}} nil :portkey.aws.iot/listotaupdates-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef listotaupdates :args (clojure.spec.alpha/? :portkey.aws.iot/listotaupdates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/listotaupdates-response))

(clojure.core/defn register-certificate "Registers a device certificate with AWS IoT. If you have more than one CA\ncertificate that has the same subject field, you must specify the CA certificate\nthat was used to sign the device certificate being registered." ([register-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/certificate/register" register-certificate-request :portkey.aws.iot/register-certificate-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"setAsActive" "setAsActive"}} nil :portkey.aws.iot/register-certificate-response {"UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "CertificateStateException" :portkey.aws.iot/certificate-state-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "CertificateValidationException" :portkey.aws.iot/certificate-validation-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "CertificateConflictException" :portkey.aws.iot/certificate-conflict-exception})))
(clojure.spec.alpha/fdef register-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/register-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/register-certificate-response))

(clojure.core/defn list-job-executions-for-job "Lists the job executions for a job." ([list-job-executions-for-job-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/jobs/{jobId}/things" list-job-executions-for-job-request :portkey.aws.iot/list-job-executions-for-job-request {:payload nil, :move {}, :headers {}, :uri {"jobId" "jobId"}, :querystring {"status" "status", "maxResults" "maxResults", "nextToken" "nextToken"}} nil :portkey.aws.iot/list-job-executions-for-job-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef list-job-executions-for-job :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-job-executions-for-job-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-job-executions-for-job-response))

(clojure.core/defn describe-thing-group "Describe a thing group." ([describe-thing-group-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/thing-groups/{thingGroupName}" describe-thing-group-request :portkey.aws.iot/describe-thing-group-request {:payload nil, :move {}, :headers {}, :uri {"thingGroupName" "thingGroupName"}, :querystring {}} nil :portkey.aws.iot/describe-thing-group-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef describe-thing-group :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-thing-group-response))

(clojure.core/defn list-job-executions-for-thing "Lists the job executions for the specified thing." ([list-job-executions-for-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/things/{thingName}/jobs" list-job-executions-for-thing-request :portkey.aws.iot/list-job-executions-for-thing-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {"status" "status", "maxResults" "maxResults", "nextToken" "nextToken"}} nil :portkey.aws.iot/list-job-executions-for-thing-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef list-job-executions-for-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-job-executions-for-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-job-executions-for-thing-response))

(clojure.core/defn register-thing "Provisions a thing." ([register-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/things" register-thing-request :portkey.aws.iot/register-thing-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/register-thing-response {"InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "ConflictingResourceUpdateException" :portkey.aws.iot/conflicting-resource-update-exception, "ResourceRegistrationFailureException" :portkey.aws.iot/resource-registration-failure-exception})))
(clojure.spec.alpha/fdef register-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot/register-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/register-thing-response))

(clojure.core/defn deleteotaupdate "Delete an OTA update." ([deleteotaupdate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/otaUpdates/{otaUpdateId}" deleteotaupdate-request :portkey.aws.iot/deleteotaupdate-request {:payload nil, :move {}, :headers {}, :uri {"otaUpdateId" "otaUpdateId"}, :querystring {}} nil :portkey.aws.iot/deleteotaupdate-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef deleteotaupdate :args (clojure.spec.alpha/tuple :portkey.aws.iot/deleteotaupdate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/deleteotaupdate-response))

(clojure.core/defn update-stream "Updates an existing stream. The stream version will be incremented by one." ([update-stream-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/streams/{streamId}" update-stream-request :portkey.aws.iot/update-stream-request {:payload nil, :move {}, :headers {}, :uri {"streamId" "streamId"}, :querystring {}} nil :portkey.aws.iot/update-stream-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef update-stream :args (clojure.spec.alpha/tuple :portkey.aws.iot/update-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/update-stream-response))

(clojure.core/defn update-thing-group "Update a thing group." ([update-thing-group-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/thing-groups/{thingGroupName}" update-thing-group-request :portkey.aws.iot/update-thing-group-request {:payload nil, :move {}, :headers {}, :uri {"thingGroupName" "thingGroupName"}, :querystring {}} nil :portkey.aws.iot/update-thing-group-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "VersionConflictException" :portkey.aws.iot/version-conflict-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef update-thing-group :args (clojure.spec.alpha/tuple :portkey.aws.iot/update-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/update-thing-group-response))

(clojure.core/defn describe-index "Describes a search index." ([describe-index-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/indices/{indexName}" describe-index-request :portkey.aws.iot/describe-index-request {:payload nil, :move {}, :headers {}, :uri {"indexName" "indexName"}, :querystring {}} nil :portkey.aws.iot/describe-index-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef describe-index :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-index-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-index-response))

(clojure.core/defn get-policy "Gets information about the specified policy with the policy document of the\ndefault version." ([get-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/policies/{policyName}" get-policy-request :portkey.aws.iot/get-policy-request {:payload nil, :move {}, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil :portkey.aws.iot/get-policy-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/get-policy-response))

(clojure.core/defn enable-topic-rule "Enables the rule." ([enable-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/rules/{ruleName}/enable" enable-topic-rule-request :portkey.aws.iot/enable-topic-rule-request {:payload nil, :move {}, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception})))
(clojure.spec.alpha/fdef enable-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot/enable-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn deprecate-thing-type "Deprecates a thing type. You can not associate new things with deprecated thing\ntype." ([deprecate-thing-type-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/thing-types/{thingTypeName}/deprecate" deprecate-thing-type-request :portkey.aws.iot/deprecate-thing-type-request {:payload nil, :move {}, :headers {}, :uri {"thingTypeName" "thingTypeName"}, :querystring {}} nil :portkey.aws.iot/deprecate-thing-type-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef deprecate-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot/deprecate-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/deprecate-thing-type-response))

(clojure.core/defn delete-thing-type "Deletes the specified thing type . You cannot delete a thing type if it has\nthings associated with it. To delete a thing type, first mark it as deprecated\nby calling DeprecateThingType, then remove any associated things by calling\nUpdateThing to change the thing type on any associated thing, and finally use\nDeleteThingType to delete the thing type." ([delete-thing-type-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/thing-types/{thingTypeName}" delete-thing-type-request :portkey.aws.iot/delete-thing-type-request {:payload nil, :move {}, :headers {}, :uri {"thingTypeName" "thingTypeName"}, :querystring {}} nil :portkey.aws.iot/delete-thing-type-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/delete-thing-type-response))

(clojure.core/defn list-thing-groups "List the thing groups in your account." ([] (list-thing-groups {})) ([list-thing-groups-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/thing-groups" list-thing-groups-request :portkey.aws.iot/list-thing-groups-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "parentGroup" "parentGroup", "namePrefixFilter" "namePrefixFilter", "recursive" "recursive"}} nil :portkey.aws.iot/list-thing-groups-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef list-thing-groups :args (clojure.spec.alpha/? :portkey.aws.iot/list-thing-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-thing-groups-response))

(clojure.core/defn list-targets-for-policy "List targets for the specified policy." ([list-targets-for-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/policy-targets/{policyName}" list-targets-for-policy-request :portkey.aws.iot/list-targets-for-policy-request {:payload nil, :move {}, :headers {}, :uri {"policyName" "policyName"}, :querystring {"marker" "marker", "pageSize" "pageSize"}} nil :portkey.aws.iot/list-targets-for-policy-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception})))
(clojure.spec.alpha/fdef list-targets-for-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-targets-for-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-targets-for-policy-response))

(clojure.core/defn replace-topic-rule "Replaces the rule. You must specify all parameters for the new rule. Creating\nrules is an administrator-level action. Any user who has permission to create\nrules will be able to access data processed by the rule." ([replace-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/rules/{ruleName}" replace-topic-rule-request :portkey.aws.iot/replace-topic-rule-request {:payload "topicRulePayload", :move {}, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"SqlParseException" :portkey.aws.iot/sql-parse-exception, "InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception})))
(clojure.spec.alpha/fdef replace-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot/replace-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn get-topic-rule "Gets information about the rule." ([get-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/rules/{ruleName}" get-topic-rule-request :portkey.aws.iot/get-topic-rule-request {:payload nil, :move {}, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil :portkey.aws.iot/get-topic-rule-response {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception})))
(clojure.spec.alpha/fdef get-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot/get-topic-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/get-topic-rule-response))

(clojure.core/defn reject-certificate-transfer "Rejects a pending certificate transfer. After AWS IoT rejects a certificate\ntransfer, the certificate status changes from PENDING_TRANSFER to INACTIVE.\n To check for pending certificate transfers, call ListCertificates to enumerate\nyour certificates.\n This operation can only be called by the transfer destination. After it is\ncalled, the certificate will be returned to the source's account in the INACTIVE\nstate." ([reject-certificate-transfer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/reject-certificate-transfer/{certificateId}" reject-certificate-transfer-request :portkey.aws.iot/reject-certificate-transfer-request {:payload nil, :move {}, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "TransferAlreadyCompletedException" :portkey.aws.iot/transfer-already-completed-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef reject-certificate-transfer :args (clojure.spec.alpha/tuple :portkey.aws.iot/reject-certificate-transfer-request) :ret clojure.core/true?)

(clojure.core/defn remove-thing-from-thing-group "Remove the specified thing from the specified group." ([] (remove-thing-from-thing-group {})) ([remove-thing-from-thing-group-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/thing-groups/removeThingFromThingGroup" remove-thing-from-thing-group-request :portkey.aws.iot/remove-thing-from-thing-group-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/remove-thing-from-thing-group-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef remove-thing-from-thing-group :args (clojure.spec.alpha/? :portkey.aws.iot/remove-thing-from-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/remove-thing-from-thing-group-response))

(clojure.core/defn delete-authorizer "Deletes an authorizer." ([delete-authorizer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/authorizer/{authorizerName}" delete-authorizer-request :portkey.aws.iot/delete-authorizer-request {:payload nil, :move {}, :headers {}, :uri {"authorizerName" "authorizerName"}, :querystring {}} nil :portkey.aws.iot/delete-authorizer-response {"DeleteConflictException" :portkey.aws.iot/delete-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/delete-authorizer-response))

(clojure.core/defn delete-thing "Deletes the specified thing." ([delete-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/things/{thingName}" delete-thing-request :portkey.aws.iot/delete-thing-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {"expectedVersion" "expectedVersion"}} nil :portkey.aws.iot/delete-thing-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "VersionConflictException" :portkey.aws.iot/version-conflict-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/delete-thing-response))

(clojure.core/defn getv2-logging-options "Gets the fine grained logging options." ([] (getv2-logging-options {})) ([getv2-logging-options-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/v2LoggingOptions" getv2-logging-options-request :portkey.aws.iot/getv2-logging-options-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/getv2-logging-options-response {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef getv2-logging-options :args (clojure.spec.alpha/? :portkey.aws.iot/getv2-logging-options-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/getv2-logging-options-response))

(clojure.core/defn list-certificates "Lists the certificates registered in your AWS account.\n The results are paginated with a default page size of 25. You can use the\nreturned marker to retrieve additional results." ([] (list-certificates {})) ([list-certificates-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/certificates" list-certificates-request :portkey.aws.iot/list-certificates-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"pageSize" "pageSize", "marker" "marker", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-certificates-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-certificates :args (clojure.spec.alpha/? :portkey.aws.iot/list-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-certificates-response))

(clojure.core/defn list-thing-types "Lists the existing thing types." ([] (list-thing-types {})) ([list-thing-types-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/thing-types" list-thing-types-request :portkey.aws.iot/list-thing-types-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "thingTypeName" "thingTypeName"}} nil :portkey.aws.iot/list-thing-types-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-thing-types :args (clojure.spec.alpha/? :portkey.aws.iot/list-thing-types-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-thing-types-response))

(clojure.core/defn describe-thing "Gets information about the specified thing." ([describe-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/things/{thingName}" describe-thing-request :portkey.aws.iot/describe-thing-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot/describe-thing-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef describe-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-thing-response))

(clojure.core/defn list-policy-principals "Lists the principals associated with the specified policy.\n Note: This API is deprecated. Please use ListTargetsForPolicy instead." ([list-policy-principals-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/policy-principals" list-policy-principals-request :portkey.aws.iot/list-policy-principals-request {:payload nil, :move {}, :headers {"policyName" ["x-amzn-iot-policy" nil]}, :uri {}, :querystring {"marker" "marker", "pageSize" "pageSize", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-policy-principals-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-policy-principals :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-policy-principals-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-policy-principals-response))

(clojure.core/defn set-default-policy-version "Sets the specified version of the specified policy as the policy's default\n(operative) version. This action affects all certificates to which the policy is\nattached. To list the principals the policy is attached to, use the\nListPrincipalPolicy API." ([set-default-policy-version-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/policies/{policyName}/version/{policyVersionId}" set-default-policy-version-request :portkey.aws.iot/set-default-policy-version-request {:payload nil, :move {}, :headers {}, :uri {"policyName" "policyName", "policyVersionId" "policyVersionId"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef set-default-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot/set-default-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn create-policy "Creates an AWS IoT policy.\n The created policy is the default version for the policy. This operation\ncreates a policy version with a version identifier of 1 and sets 1 as the\npolicy's default version." ([create-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/policies/{policyName}" create-policy-request :portkey.aws.iot/create-policy-request {:payload nil, :move {}, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil :portkey.aws.iot/create-policy-response {"ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "MalformedPolicyException" :portkey.aws.iot/malformed-policy-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef create-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-policy-response))

(clojure.core/defn describe-thing-type "Gets information about the specified thing type." ([describe-thing-type-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/thing-types/{thingTypeName}" describe-thing-type-request :portkey.aws.iot/describe-thing-type-request {:payload nil, :move {}, :headers {}, :uri {"thingTypeName" "thingTypeName"}, :querystring {}} nil :portkey.aws.iot/describe-thing-type-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef describe-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-thing-type-response))

(clojure.core/defn attach-thing-principal "Attaches the specified principal to the specified thing." ([attach-thing-principal-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/things/{thingName}/principals" attach-thing-principal-request :portkey.aws.iot/attach-thing-principal-request {:payload nil, :move {}, :headers {"principal" ["x-amzn-principal" nil]}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot/attach-thing-principal-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef attach-thing-principal :args (clojure.spec.alpha/tuple :portkey.aws.iot/attach-thing-principal-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/attach-thing-principal-response))

(clojure.core/defn delete-thing-group "Deletes a thing group." ([delete-thing-group-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/thing-groups/{thingGroupName}" delete-thing-group-request :portkey.aws.iot/delete-thing-group-request {:payload nil, :move {}, :headers {}, :uri {"thingGroupName" "thingGroupName"}, :querystring {"expectedVersion" "expectedVersion"}} nil :portkey.aws.iot/delete-thing-group-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "VersionConflictException" :portkey.aws.iot/version-conflict-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-thing-group :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/delete-thing-group-response))

(clojure.core/defn list-attached-policies "Lists the policies attached to the specified thing group." ([list-attached-policies-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/attached-policies/{target}" list-attached-policies-request :portkey.aws.iot/list-attached-policies-request {:payload nil, :move {}, :headers {}, :uri {"target" "target"}, :querystring {"recursive" "recursive", "marker" "marker", "pageSize" "pageSize"}} nil :portkey.aws.iot/list-attached-policies-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception})))
(clojure.spec.alpha/fdef list-attached-policies :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-attached-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-attached-policies-response))

(clojure.core/defn create-keys-and-certificate "Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued\npublic key.\n Note This is the only time AWS IoT issues the private key for this certificate,\nso it is important to keep it in a secure location." ([] (create-keys-and-certificate {})) ([create-keys-and-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/keys-and-certificate" create-keys-and-certificate-request :portkey.aws.iot/create-keys-and-certificate-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"setAsActive" "setAsActive"}} nil :portkey.aws.iot/create-keys-and-certificate-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef create-keys-and-certificate :args (clojure.spec.alpha/? :portkey.aws.iot/create-keys-and-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-keys-and-certificate-response))

(clojure.core/defn create-job "Creates a job." ([create-job-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/jobs/{jobId}" create-job-request :portkey.aws.iot/create-job-request {:payload nil, :move {}, :headers {}, :uri {"jobId" "jobId"}, :querystring {}} nil :portkey.aws.iot/create-job-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-job-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-job-response))

(clojure.core/defn describe-authorizer "Describes an authorizer." ([describe-authorizer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/authorizer/{authorizerName}" describe-authorizer-request :portkey.aws.iot/describe-authorizer-request {:payload nil, :move {}, :headers {}, :uri {"authorizerName" "authorizerName"}, :querystring {}} nil :portkey.aws.iot/describe-authorizer-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef describe-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-authorizer-response))

(clojure.core/defn registercacertificate "Registers a CA certificate with AWS IoT. This CA certificate can then be used to\nsign device certificates, which can be then registered with AWS IoT. You can\nregister up to 10 CA certificates per AWS account that have the same subject\nfield. This enables you to have up to 10 certificate authorities sign your\ndevice certificates. If you have more than one CA certificate registered, make\nsure you pass the CA certificate when you register your device certificates with\nthe RegisterCertificate API." ([registercacertificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/cacertificate" registercacertificate-request :portkey.aws.iot/registercacertificate-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"setAsActive" "setAsActive", "allowAutoRegistration" "allowAutoRegistration"}} nil :portkey.aws.iot/registercacertificate-response {"UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "CertificateValidationException" :portkey.aws.iot/certificate-validation-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "RegistrationCodeValidationException" :portkey.aws.iot/registration-code-validation-exception})))
(clojure.spec.alpha/fdef registercacertificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/registercacertificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/registercacertificate-response))

(clojure.core/defn describe-event-configurations "Describes event configurations." ([] (describe-event-configurations {})) ([describe-event-configurations-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/event-configurations" describe-event-configurations-request :portkey.aws.iot/describe-event-configurations-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/describe-event-configurations-response {"InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception})))
(clojure.spec.alpha/fdef describe-event-configurations :args (clojure.spec.alpha/? :portkey.aws.iot/describe-event-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-event-configurations-response))

(clojure.core/defn disable-topic-rule "Disables the rule." ([disable-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/rules/{ruleName}/disable" disable-topic-rule-request :portkey.aws.iot/disable-topic-rule-request {:payload nil, :move {}, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception})))
(clojure.spec.alpha/fdef disable-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot/disable-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn describe-thing-registration-task "Describes a bulk thing provisioning task." ([describe-thing-registration-task-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/thing-registration-tasks/{taskId}" describe-thing-registration-task-request :portkey.aws.iot/describe-thing-registration-task-request {:payload nil, :move {}, :headers {}, :uri {"taskId" "taskId"}, :querystring {}} nil :portkey.aws.iot/describe-thing-registration-task-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef describe-thing-registration-task :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-thing-registration-task-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-thing-registration-task-response))

(clojure.core/defn list-topic-rules "Lists the rules for the specific topic." ([] (list-topic-rules {})) ([list-topic-rules-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/rules" list-topic-rules-request :portkey.aws.iot/list-topic-rules-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"topic" "topic", "maxResults" "maxResults", "nextToken" "nextToken", "ruleDisabled" "ruleDisabled"}} nil :portkey.aws.iot/list-topic-rules-response {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef list-topic-rules :args (clojure.spec.alpha/? :portkey.aws.iot/list-topic-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-topic-rules-response))

(clojure.core/defn detach-principal-policy "Removes the specified policy from the specified certificate.\n Note: This API is deprecated. Please use DetachPolicy instead." ([detach-principal-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/principal-policies/{policyName}" detach-principal-policy-request :portkey.aws.iot/detach-principal-policy-request {:payload nil, :move {}, :headers {"principal" ["x-amzn-iot-principal" nil]}, :uri {"policyName" "policyName"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef detach-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot/detach-principal-policy-request) :ret clojure.core/true?)

(clojure.core/defn create-stream "Creates a stream for delivering one or more large files in chunks over MQTT. A\nstream transports data bytes in chunks or blocks packaged as MQTT messages from\na source like S3. You can have one or more files associated with a stream. The\ntotal size of a file associated with the stream cannot exceed more than 2 MB.\nThe stream will be created with version 0. If a stream is created with the same\nstreamID as a stream that existed and was deleted within last 90 days, we will\nresurrect that old stream by incrementing the version by 1." ([create-stream-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/streams/{streamId}" create-stream-request :portkey.aws.iot/create-stream-request {:payload nil, :move {}, :headers {}, :uri {"streamId" "streamId"}, :querystring {}} nil :portkey.aws.iot/create-stream-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef create-stream :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-stream-response))

(clojure.core/defn updatecacertificate "Updates a registered CA certificate." ([updatecacertificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/cacertificate/{caCertificateId}" updatecacertificate-request :portkey.aws.iot/updatecacertificate-request {:payload nil, :move {}, :headers {}, :uri {"caCertificateId" "certificateId"}, :querystring {"newStatus" "newStatus", "newAutoRegistrationStatus" "newAutoRegistrationStatus"}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef updatecacertificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/updatecacertificate-request) :ret clojure.core/true?)

(clojure.core/defn delete-topic-rule "Deletes the rule." ([delete-topic-rule-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/rules/{ruleName}" delete-topic-rule-request :portkey.aws.iot/delete-topic-rule-request {:payload nil, :move {}, :headers {}, :uri {"ruleName" "ruleName"}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception})))
(clojure.spec.alpha/fdef delete-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn describe-stream "Gets information about a stream." ([describe-stream-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/streams/{streamId}" describe-stream-request :portkey.aws.iot/describe-stream-request {:payload nil, :move {}, :headers {}, :uri {"streamId" "streamId"}, :querystring {}} nil :portkey.aws.iot/describe-stream-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef describe-stream :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-stream-response))

(clojure.core/defn describe-certificate "Gets information about the specified certificate." ([describe-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/certificates/{certificateId}" describe-certificate-request :portkey.aws.iot/describe-certificate-request {:payload nil, :move {}, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {}} nil :portkey.aws.iot/describe-certificate-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef describe-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-certificate-response))

(clojure.core/defn set-logging-options "Sets the logging options." ([set-logging-options-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/loggingOptions" set-logging-options-request :portkey.aws.iot/set-logging-options-request {:payload "loggingOptionsPayload", :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef set-logging-options :args (clojure.spec.alpha/tuple :portkey.aws.iot/set-logging-options-request) :ret clojure.core/true?)

(clojure.core/defn test-authorization "Test custom authorization." ([test-authorization-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/test-authorization" test-authorization-request :portkey.aws.iot/test-authorization-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"clientId" "clientId"}} nil :portkey.aws.iot/test-authorization-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception})))
(clojure.spec.alpha/fdef test-authorization :args (clojure.spec.alpha/tuple :portkey.aws.iot/test-authorization-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/test-authorization-response))

(clojure.core/defn describe-default-authorizer "Describes the default authorizer." ([] (describe-default-authorizer {})) ([describe-default-authorizer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/default-authorizer" describe-default-authorizer-request :portkey.aws.iot/describe-default-authorizer-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/describe-default-authorizer-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef describe-default-authorizer :args (clojure.spec.alpha/? :portkey.aws.iot/describe-default-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-default-authorizer-response))

(clojure.core/defn attach-policy "Attaches a policy to the specified target." ([attach-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/target-policies/{policyName}" attach-policy-request :portkey.aws.iot/attach-policy-request {:payload nil, :move {}, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception})))
(clojure.spec.alpha/fdef attach-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot/attach-policy-request) :ret clojure.core/true?)

(clojure.core/defn describe-job-execution "Describes a job execution." ([describe-job-execution-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/things/{thingName}/jobs/{jobId}" describe-job-execution-request :portkey.aws.iot/describe-job-execution-request {:payload nil, :move {}, :headers {}, :uri {"jobId" "jobId", "thingName" "thingName"}, :querystring {"executionNumber" "executionNumber"}} nil :portkey.aws.iot/describe-job-execution-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef describe-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-job-execution-response))

(clojure.core/defn update-thing-groups-for-thing "Updates the groups to which the thing belongs." ([] (update-thing-groups-for-thing {})) ([update-thing-groups-for-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/thing-groups/updateThingGroupsForThing" update-thing-groups-for-thing-request :portkey.aws.iot/update-thing-groups-for-thing-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/update-thing-groups-for-thing-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef update-thing-groups-for-thing :args (clojure.spec.alpha/? :portkey.aws.iot/update-thing-groups-for-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/update-thing-groups-for-thing-response))

(clojure.core/defn list-thing-principals "Lists the principals associated with the specified thing." ([list-thing-principals-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/things/{thingName}/principals" list-thing-principals-request :portkey.aws.iot/list-thing-principals-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot/list-thing-principals-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef list-thing-principals :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-thing-principals-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-thing-principals-response))

(clojure.core/defn stop-thing-registration-task "Cancels a bulk thing provisioning task." ([stop-thing-registration-task-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/thing-registration-tasks/{taskId}/cancel" stop-thing-registration-task-request :portkey.aws.iot/stop-thing-registration-task-request {:payload nil, :move {}, :headers {}, :uri {"taskId" "taskId"}, :querystring {}} nil :portkey.aws.iot/stop-thing-registration-task-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef stop-thing-registration-task :args (clojure.spec.alpha/tuple :portkey.aws.iot/stop-thing-registration-task-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/stop-thing-registration-task-response))

(clojure.core/defn list-principal-policies "Lists the policies attached to the specified principal. If you use an Cognito\nidentity, the ID must be in AmazonCognito Identity format\n(http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax).\n Note: This API is deprecated. Please use ListAttachedPolicies instead." ([list-principal-policies-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/principal-policies" list-principal-policies-request :portkey.aws.iot/list-principal-policies-request {:payload nil, :move {}, :headers {"principal" ["x-amzn-iot-principal" nil]}, :uri {}, :querystring {"marker" "marker", "pageSize" "pageSize", "isAscendingOrder" "ascendingOrder"}} nil :portkey.aws.iot/list-principal-policies-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-principal-policies :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-principal-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-principal-policies-response))

(clojure.core/defn describe-role-alias "Describes a role alias." ([describe-role-alias-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/role-aliases/{roleAlias}" describe-role-alias-request :portkey.aws.iot/describe-role-alias-request {:payload nil, :move {}, :headers {}, :uri {"roleAlias" "roleAlias"}, :querystring {}} nil :portkey.aws.iot/describe-role-alias-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef describe-role-alias :args (clojure.spec.alpha/tuple :portkey.aws.iot/describe-role-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/describe-role-alias-response))

(clojure.core/defn transfer-certificate "Transfers the specified certificate to the specified AWS account.\n You can cancel the transfer until it is acknowledged by the recipient.\n No notification is sent to the transfer destination's account. It is up to the\ncaller to notify the transfer target.\n The certificate being transferred must not be in the ACTIVE state. You can use\nthe UpdateCertificate API to deactivate it.\n The certificate must not have any policies attached to it. You can use the\nDetachPrincipalPolicy API to detach them." ([transfer-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/transfer-certificate/{certificateId}" transfer-certificate-request :portkey.aws.iot/transfer-certificate-request {:payload nil, :move {}, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {"targetAwsAccount" "targetAwsAccount"}} nil :portkey.aws.iot/transfer-certificate-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "CertificateStateException" :portkey.aws.iot/certificate-state-exception, "TransferConflictException" :portkey.aws.iot/transfer-conflict-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef transfer-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/transfer-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/transfer-certificate-response))

(clojure.core/defn delete-policy "Deletes the specified policy.\n A policy cannot be deleted if it has non-default versions or it is attached to\nany certificate.\n To delete a policy, use the DeletePolicyVersion API to delete all non-default\nversions of the policy; use the DetachPrincipalPolicy API to detach the policy\nfrom any certificate; and then use the DeletePolicy API to delete the policy.\n When a policy is deleted using DeletePolicy, its default version is deleted\nwith it." ([delete-policy-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/policies/{policyName}" delete-policy-request :portkey.aws.iot/delete-policy-request {:payload nil, :move {}, :headers {}, :uri {"policyName" "policyName"}, :querystring {}} nil nil {"DeleteConflictException" :portkey.aws.iot/delete-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-thing "Updates the data for a thing." ([update-thing-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PATCH" "/things/{thingName}" update-thing-request :portkey.aws.iot/update-thing-request {:payload nil, :move {}, :headers {}, :uri {"thingName" "thingName"}, :querystring {}} nil :portkey.aws.iot/update-thing-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "VersionConflictException" :portkey.aws.iot/version-conflict-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef update-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot/update-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/update-thing-response))

(clojure.core/defn delete-certificate "Deletes the specified certificate.\n A certificate cannot be deleted if it has a policy attached to it or if its\nstatus is set to ACTIVE. To delete a certificate, first use the\nDetachPrincipalPolicy API to detach all policies. Next, use the\nUpdateCertificate API to set the certificate to the INACTIVE status." ([delete-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/certificates/{certificateId}" delete-certificate-request :portkey.aws.iot/delete-certificate-request {:payload nil, :move {}, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {"forceDelete" "forceDelete"}} nil nil {"CertificateStateException" :portkey.aws.iot/certificate-state-exception, "DeleteConflictException" :portkey.aws.iot/delete-conflict-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef delete-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/delete-certificate-request) :ret clojure.core/true?)

(clojure.core/defn get-logging-options "Gets the logging options." ([] (get-logging-options {})) ([get-logging-options-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/loggingOptions" get-logging-options-request :portkey.aws.iot/get-logging-options-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/get-logging-options-response {"InternalException" :portkey.aws.iot/internal-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-logging-options :args (clojure.spec.alpha/? :portkey.aws.iot/get-logging-options-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/get-logging-options-response))

(clojure.core/defn create-thing-group "Create a thing group." ([create-thing-group-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/thing-groups/{thingGroupName}" create-thing-group-request :portkey.aws.iot/create-thing-group-request {:payload nil, :move {}, :headers {}, :uri {"thingGroupName" "thingGroupName"}, :querystring {}} nil :portkey.aws.iot/create-thing-group-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef create-thing-group :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-thing-group-response))

(clojure.core/defn clear-default-authorizer "Clears the default authorizer." ([] (clear-default-authorizer {})) ([clear-default-authorizer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "DELETE" "/default-authorizer" clear-default-authorizer-request :portkey.aws.iot/clear-default-authorizer-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/clear-default-authorizer-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef clear-default-authorizer :args (clojure.spec.alpha/? :portkey.aws.iot/clear-default-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/clear-default-authorizer-response))

(clojure.core/defn add-thing-to-thing-group "Adds a thing to a thing group." ([] (add-thing-to-thing-group {})) ([add-thing-to-thing-group-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/thing-groups/addThingToThingGroup" add-thing-to-thing-group-request :portkey.aws.iot/add-thing-to-thing-group-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/add-thing-to-thing-group-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef add-thing-to-thing-group :args (clojure.spec.alpha/? :portkey.aws.iot/add-thing-to-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/add-thing-to-thing-group-response))

(clojure.core/defn get-effective-policies "Gets effective policies." ([] (get-effective-policies {})) ([get-effective-policies-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/effective-policies" get-effective-policies-request :portkey.aws.iot/get-effective-policies-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"thingName" "thingName"}} nil :portkey.aws.iot/get-effective-policies-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "LimitExceededException" :portkey.aws.iot/limit-exceeded-exception})))
(clojure.spec.alpha/fdef get-effective-policies :args (clojure.spec.alpha/? :portkey.aws.iot/get-effective-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/get-effective-policies-response))

(clojure.core/defn list-things-in-thing-group "Lists the things in the specified group." ([list-things-in-thing-group-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/thing-groups/{thingGroupName}/things" list-things-in-thing-group-request :portkey.aws.iot/list-things-in-thing-group-request {:payload nil, :move {}, :headers {}, :uri {"thingGroupName" "thingGroupName"}, :querystring {"recursive" "recursive", "nextToken" "nextToken", "maxResults" "maxResults"}} nil :portkey.aws.iot/list-things-in-thing-group-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception})))
(clojure.spec.alpha/fdef list-things-in-thing-group :args (clojure.spec.alpha/tuple :portkey.aws.iot/list-things-in-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-things-in-thing-group-response))

(clojure.core/defn create-thing-type "Creates a new thing type." ([create-thing-type-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/thing-types/{thingTypeName}" create-thing-type-request :portkey.aws.iot/create-thing-type-request {:payload nil, :move {}, :headers {}, :uri {"thingTypeName" "thingTypeName"}, :querystring {}} nil :portkey.aws.iot/create-thing-type-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception, "ResourceAlreadyExistsException" :portkey.aws.iot/resource-already-exists-exception})))
(clojure.spec.alpha/fdef create-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-thing-type-response))

(clojure.core/defn set-default-authorizer "Sets the default authorizer. This will be used if a websocket connection is made\nwithout specifying an authorizer." ([set-default-authorizer-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/default-authorizer" set-default-authorizer-request :portkey.aws.iot/set-default-authorizer-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iot/set-default-authorizer-response {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef set-default-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.iot/set-default-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/set-default-authorizer-response))

(clojure.core/defn update-certificate "Updates the status of the specified certificate. This operation is idempotent.\n Moving a certificate from the ACTIVE state (including REVOKED) will not\ndisconnect currently connected devices, but these devices will be unable to\nreconnect.\n The ACTIVE state is required to authenticate devices connecting to AWS IoT\nusing a certificate." ([update-certificate-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/certificates/{certificateId}" update-certificate-request :portkey.aws.iot/update-certificate-request {:payload nil, :move {}, :headers {}, :uri {"certificateId" "certificateId"}, :querystring {"newStatus" "newStatus"}} nil nil {"ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "CertificateStateException" :portkey.aws.iot/certificate-state-exception, "InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef update-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot/update-certificate-request) :ret clojure.core/true?)

(clojure.core/defn create-certificate-from-csr "Creates an X.509 certificate using the specified certificate signing request.\n Note: The CSR must include a public key that is either an RSA key with a length\nof at least 2048 bits or an ECC key from NIST P-256 or NIST P-384 curves.\n Note: Reusing the same certificate signing request (CSR) results in a distinct\ncertificate.\n You can create multiple certificates in a batch by creating a directory,\ncopying multiple .csr files into that directory, and then specifying that\ndirectory on the command line. The following commands show how to create a batch\nof certificates given a batch of CSRs.\n Assuming a set of CSRs are located inside of the directory my-csr-directory:\n On Linux and OS X, the command is:\n $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr\n--certificate-signing-request file://my-csr-directory/{}\n This command lists all of the CSRs in my-csr-directory and pipes each CSR file\nname to the aws iot create-certificate-from-csr AWS CLI command to create a\ncertificate for the corresponding CSR.\n The aws iot create-certificate-from-csr part of the command can also be run in\nparallel to speed up the certificate creation process:\n $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr\n--certificate-signing-request file://my-csr-directory/{}\n On Windows PowerShell, the command to create certificates for all CSRs in\nmy-csr-directory is:\n > ls -Name my-csr-directory | %{aws iot create-certificate-from-csr\n--certificate-signing-request file://my-csr-directory/$_}\n On a Windows command prompt, the command to create certificates for all CSRs in\nmy-csr-directory is:\n > forfiles /p my-csr-directory /c \"cmd /c aws iot create-certificate-from-csr\n--certificate-signing-request file://@path\"" ([create-certificate-from-csr-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "POST" "/certificates" create-certificate-from-csr-request :portkey.aws.iot/create-certificate-from-csr-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"setAsActive" "setAsActive"}} nil :portkey.aws.iot/create-certificate-from-csr-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef create-certificate-from-csr :args (clojure.spec.alpha/tuple :portkey.aws.iot/create-certificate-from-csr-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/create-certificate-from-csr-response))

(clojure.core/defn list-jobs "Lists jobs." ([] (list-jobs {})) ([list-jobs-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/jobs" list-jobs-request :portkey.aws.iot/list-jobs-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"status" "status", "targetSelection" "targetSelection", "maxResults" "maxResults", "nextToken" "nextToken", "thingGroupName" "thingGroupName", "thingGroupId" "thingGroupId"}} nil :portkey.aws.iot/list-jobs-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.iot/list-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-jobs-response))

(clojure.core/defn list-things "Lists your things. Use the attributeName and attributeValue parameters to filter\nyour things. For example, calling ListThings with attributeName=Color and\nattributeValue=Red retrieves all things in the registry that contain an\nattribute Color with the value Red." ([] (list-things {})) ([list-things-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "GET" "/things" list-things-request :portkey.aws.iot/list-things-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "attributeName" "attributeName", "attributeValue" "attributeValue", "thingTypeName" "thingTypeName"}} nil :portkey.aws.iot/list-things-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "UnauthorizedException" :portkey.aws.iot/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot/internal-failure-exception})))
(clojure.spec.alpha/fdef list-things :args (clojure.spec.alpha/? :portkey.aws.iot/list-things-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/list-things-response))

(clojure.core/defn cancel-job "Cancels a job." ([cancel-job-request] (portkey.aws/-rest-json-call portkey.aws.iot/endpoints "PUT" "/jobs/{jobId}/cancel" cancel-job-request :portkey.aws.iot/cancel-job-request {:payload nil, :move {}, :headers {}, :uri {"jobId" "jobId"}, :querystring {}} nil :portkey.aws.iot/cancel-job-response {"InvalidRequestException" :portkey.aws.iot/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot/service-unavailable-exception})))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.iot/cancel-job-request) :ret (clojure.spec.alpha/and :portkey.aws.iot/cancel-job-response))
