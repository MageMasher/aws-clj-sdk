(ns portkey.aws.es (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "es", :region "ap-northeast-1"},
    :ssl-common-name "es.ap-northeast-1.amazonaws.com",
    :endpoint "https://es.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "es", :region "eu-west-1"},
    :ssl-common-name "es.eu-west-1.amazonaws.com",
    :endpoint "https://es.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "es", :region "us-east-2"},
    :ssl-common-name "es.us-east-2.amazonaws.com",
    :endpoint "https://es.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "es", :region "ap-southeast-2"},
    :ssl-common-name "es.ap-southeast-2.amazonaws.com",
    :endpoint "https://es.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credential-scope {:service "es", :region "sa-east-1"},
    :ssl-common-name "es.sa-east-1.amazonaws.com",
    :endpoint "https://es.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "es", :region "ap-southeast-1"},
    :ssl-common-name "es.ap-southeast-1.amazonaws.com",
    :endpoint "https://es.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope {:service "es", :region "ap-northeast-2"},
    :ssl-common-name "es.ap-northeast-2.amazonaws.com",
    :endpoint "https://es.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credential-scope {:service "es", :region "ca-central-1"},
    :ssl-common-name "es.ca-central-1.amazonaws.com",
    :endpoint "https://es.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "es", :region "eu-central-1"},
    :ssl-common-name "es.eu-central-1.amazonaws.com",
    :endpoint "https://es.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "es", :region "eu-west-2"},
    :ssl-common-name "es.eu-west-2.amazonaws.com",
    :endpoint "https://es.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "es", :region "us-west-2"},
    :ssl-common-name "es.us-west-2.amazonaws.com",
    :endpoint "https://es.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "es", :region "us-east-1"},
    :ssl-common-name "es.us-east-1.amazonaws.com",
    :endpoint "https://es.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "es", :region "us-west-1"},
    :ssl-common-name "es.us-west-1.amazonaws.com",
    :endpoint "https://es.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "es", :region "ap-south-1"},
    :ssl-common-name "es.ap-south-1.amazonaws.com",
    :endpoint "https://es.ap-south-1.amazonaws.com"}})

(clojure.spec.alpha/def :portkey.aws.es/maximum-instance-count (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.es.snapshot-options/automated-snapshot-start-hour (clojure.spec.alpha/and :portkey.aws.es/integer-class))
(clojure.spec.alpha/def :portkey.aws.es/snapshot-options (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.snapshot-options/AutomatedSnapshotStartHour]))

(clojure.spec.alpha/def :portkey.aws.es.delete-elasticsearch-domain-response/domain-status (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-domain-status))
(clojure.spec.alpha/def :portkey.aws.es/delete-elasticsearch-domain-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.delete-elasticsearch-domain-response/DomainStatus]))

(clojure.spec.alpha/def :portkey.aws.es/string-list (clojure.spec.alpha/coll-of :portkey.aws.es/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es/storage-type-list (clojure.spec.alpha/coll-of :portkey.aws.es/storage-type :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.ebsoptions/ebsenabled (clojure.spec.alpha/and :portkey.aws.es/boolean))
(clojure.spec.alpha/def :portkey.aws.es.ebsoptions/volume-size (clojure.spec.alpha/and :portkey.aws.es/integer-class))
(clojure.spec.alpha/def :portkey.aws.es.ebsoptions/iops (clojure.spec.alpha/and :portkey.aws.es/integer-class))
(clojure.spec.alpha/def :portkey.aws.es/ebsoptions (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.ebsoptions/EBSEnabled :portkey.aws.es/VolumeType :portkey.aws.es.ebsoptions/VolumeSize :portkey.aws.es.ebsoptions/Iops]))

(clojure.spec.alpha/def :portkey.aws.es/update-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-domain-config/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-version-status))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-domain-config/elasticsearch-cluster-config (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-cluster-config-status))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-domain-config/ebsoptions (clojure.spec.alpha/and :portkey.aws.es/ebsoptions-status))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-domain-config/access-policies (clojure.spec.alpha/and :portkey.aws.es/access-policies-status))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-domain-config/snapshot-options (clojure.spec.alpha/and :portkey.aws.es/snapshot-options-status))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-domain-config/advanced-options (clojure.spec.alpha/and :portkey.aws.es/advanced-options-status))
(clojure.spec.alpha/def :portkey.aws.es/elasticsearch-domain-config (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.elasticsearch-domain-config/ElasticsearchVersion :portkey.aws.es.elasticsearch-domain-config/ElasticsearchClusterConfig :portkey.aws.es.elasticsearch-domain-config/EBSOptions :portkey.aws.es.elasticsearch-domain-config/AccessPolicies :portkey.aws.es.elasticsearch-domain-config/SnapshotOptions :portkey.aws.es.elasticsearch-domain-config/AdvancedOptions]))

(clojure.spec.alpha/def :portkey.aws.es/storage-type-limit-list (clojure.spec.alpha/coll-of :portkey.aws.es/storage-type-limit :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.advanced-options-status/options (clojure.spec.alpha/and :portkey.aws.es/advanced-options))
(clojure.spec.alpha/def :portkey.aws.es.advanced-options-status/status (clojure.spec.alpha/and :portkey.aws.es/option-status))
(clojure.spec.alpha/def :portkey.aws.es/advanced-options-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.advanced-options-status/Options :portkey.aws.es.advanced-options-status/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/validation-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/storage-sub-type-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.describe-elasticsearch-domain-response/domain-status (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-domain-status))
(clojure.spec.alpha/def :portkey.aws.es/describe-elasticsearch-domain-response (portkey.awsgen/json-keys :req-un [:portkey.aws.es.describe-elasticsearch-domain-response/DomainStatus] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/instance-role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.update-elasticsearch-domain-config-request/access-policies (clojure.spec.alpha/and :portkey.aws.es/policy-document))
(clojure.spec.alpha/def :portkey.aws.es/update-elasticsearch-domain-config-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es/DomainName] :opt-un [:portkey.aws.es/ElasticsearchClusterConfig :portkey.aws.es/EBSOptions :portkey.aws.es/SnapshotOptions :portkey.aws.es/AdvancedOptions :portkey.aws.es.update-elasticsearch-domain-config-request/AccessPolicies]))

(clojure.spec.alpha/def :portkey.aws.es/limit-value-list (clojure.spec.alpha/coll-of :portkey.aws.es/limit-value :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es/list-tags-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es/TagList]))

(clojure.spec.alpha/def :portkey.aws.es/additional-limit-list (clojure.spec.alpha/coll-of :portkey.aws.es/additional-limit :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.list-elasticsearch-versions-response/elasticsearch-versions (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-version-list))
(clojure.spec.alpha/def :portkey.aws.es/list-elasticsearch-versions-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.list-elasticsearch-versions-response/ElasticsearchVersions :portkey.aws.es/NextToken]))

(clojure.spec.alpha/def :portkey.aws.es/elasticsearch-domain-status-list (clojure.spec.alpha/coll-of :portkey.aws.es/elasticsearch-domain-status :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 1 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.es/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es/limit-exceeded-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/domain-info-list (clojure.spec.alpha/coll-of :portkey.aws.es/domain-info :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es/resource-already-exists-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.list-elasticsearch-instance-types-request/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es/list-elasticsearch-instance-types-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.list-elasticsearch-instance-types-request/ElasticsearchVersion] :opt-un [:portkey.aws.es/DomainName :portkey.aws.es/MaxResults :portkey.aws.es/NextToken]))

(clojure.spec.alpha/def :portkey.aws.es/invalid-type-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.update-elasticsearch-domain-config-response/domain-config (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-domain-config))
(clojure.spec.alpha/def :portkey.aws.es/update-elasticsearch-domain-config-response (portkey.awsgen/json-keys :req-un [:portkey.aws.es.update-elasticsearch-domain-config-response/DomainConfig] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/service-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-cluster-config-status/options (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-cluster-config))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-cluster-config-status/status (clojure.spec.alpha/and :portkey.aws.es/option-status))
(clojure.spec.alpha/def :portkey.aws.es/elasticsearch-cluster-config-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.elasticsearch-cluster-config-status/Options :portkey.aws.es.elasticsearch-cluster-config-status/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/storage-type-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es/delete-elasticsearch-domain-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es/DomainName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.remove-tags-request/tag-keys (clojure.spec.alpha/and :portkey.aws.es/string-list))
(clojure.spec.alpha/def :portkey.aws.es/remove-tags-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es/ARN :portkey.aws.es.remove-tags-request/TagKeys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-domain-status/created (clojure.spec.alpha/and :portkey.aws.es/boolean))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-domain-status/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-domain-status/access-policies (clojure.spec.alpha/and :portkey.aws.es/policy-document))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-domain-status/deleted (clojure.spec.alpha/and :portkey.aws.es/boolean))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-domain-status/processing (clojure.spec.alpha/and :portkey.aws.es/boolean))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-domain-status/endpoint (clojure.spec.alpha/and :portkey.aws.es/service-url))
(clojure.spec.alpha/def :portkey.aws.es/elasticsearch-domain-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es/DomainId :portkey.aws.es/DomainName :portkey.aws.es/ARN :portkey.aws.es/ElasticsearchClusterConfig] :opt-un [:portkey.aws.es/SnapshotOptions :portkey.aws.es/EBSOptions :portkey.aws.es.elasticsearch-domain-status/Created :portkey.aws.es.elasticsearch-domain-status/ElasticsearchVersion :portkey.aws.es.elasticsearch-domain-status/AccessPolicies :portkey.aws.es.elasticsearch-domain-status/Deleted :portkey.aws.es/AdvancedOptions :portkey.aws.es.elasticsearch-domain-status/Processing :portkey.aws.es.elasticsearch-domain-status/Endpoint]))

(clojure.spec.alpha/def :portkey.aws.es/disabled-operation-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.list-domain-names-response/domain-names (clojure.spec.alpha/and :portkey.aws.es/domain-info-list))
(clojure.spec.alpha/def :portkey.aws.es/list-domain-names-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.list-domain-names-response/DomainNames]))

(clojure.spec.alpha/def :portkey.aws.es/domain-name-list (clojure.spec.alpha/coll-of :portkey.aws.es/domain-name :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es/add-tags-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es/ARN :portkey.aws.es/TagList] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/elasticsearch-instance-type-list (clojure.spec.alpha/coll-of :portkey.aws.es/espartition-instance-type :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.limits/storage-types (clojure.spec.alpha/and :portkey.aws.es/storage-type-list))
(clojure.spec.alpha/def :portkey.aws.es.limits/additional-limits (clojure.spec.alpha/and :portkey.aws.es/additional-limit-list))
(clojure.spec.alpha/def :portkey.aws.es/limits (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.limits/StorageTypes :portkey.aws.es/InstanceLimits :portkey.aws.es.limits/AdditionalLimits]))

(clojure.spec.alpha/def :portkey.aws.es/tag-list (clojure.spec.alpha/coll-of :portkey.aws.es/tag :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.ebsoptions-status/options (clojure.spec.alpha/and :portkey.aws.es/ebsoptions))
(clojure.spec.alpha/def :portkey.aws.es.ebsoptions-status/status (clojure.spec.alpha/and :portkey.aws.es/option-status))
(clojure.spec.alpha/def :portkey.aws.es/ebsoptions-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.ebsoptions-status/Options :portkey.aws.es.ebsoptions-status/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-cluster-config/instance-type (clojure.spec.alpha/and :portkey.aws.es/espartition-instance-type))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-cluster-config/instance-count (clojure.spec.alpha/and :portkey.aws.es/integer-class))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-cluster-config/dedicated-master-enabled (clojure.spec.alpha/and :portkey.aws.es/boolean))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-cluster-config/zone-awareness-enabled (clojure.spec.alpha/and :portkey.aws.es/boolean))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-cluster-config/dedicated-master-type (clojure.spec.alpha/and :portkey.aws.es/espartition-instance-type))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-cluster-config/dedicated-master-count (clojure.spec.alpha/and :portkey.aws.es/integer-class))
(clojure.spec.alpha/def :portkey.aws.es/elasticsearch-cluster-config (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.elasticsearch-cluster-config/InstanceType :portkey.aws.es.elasticsearch-cluster-config/InstanceCount :portkey.aws.es.elasticsearch-cluster-config/DedicatedMasterEnabled :portkey.aws.es.elasticsearch-cluster-config/ZoneAwarenessEnabled :portkey.aws.es.elasticsearch-cluster-config/DedicatedMasterType :portkey.aws.es.elasticsearch-cluster-config/DedicatedMasterCount]))

(clojure.spec.alpha/def :portkey.aws.es.list-elasticsearch-instance-types-response/elasticsearch-instance-types (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-instance-type-list))
(clojure.spec.alpha/def :portkey.aws.es/list-elasticsearch-instance-types-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.list-elasticsearch-instance-types-response/ElasticsearchInstanceTypes :portkey.aws.es/NextToken]))

(clojure.spec.alpha/def :portkey.aws.es/resource-not-found-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/elasticsearch-version-list (clojure.spec.alpha/coll-of :portkey.aws.es/elasticsearch-version-string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es/list-elasticsearch-versions-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es/MaxResults :portkey.aws.es/NextToken]))

(clojure.spec.alpha/def :portkey.aws.es/espartition-instance-type (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {:r3.8xlarge.elasticsearch "r3.8xlarge.elasticsearch", :c4.4xlarge.elasticsearch "c4.4xlarge.elasticsearch", "m4.2xlarge.elasticsearch" "m4.2xlarge.elasticsearch", "d2.4xlarge.elasticsearch" "d2.4xlarge.elasticsearch", "t2.micro.elasticsearch" "t2.micro.elasticsearch", :m3.medium.elasticsearch "m3.medium.elasticsearch", "r3.2xlarge.elasticsearch" "r3.2xlarge.elasticsearch", "c4.large.elasticsearch" "c4.large.elasticsearch", :r3.4xlarge.elasticsearch "r3.4xlarge.elasticsearch", "r4.2xlarge.elasticsearch" "r4.2xlarge.elasticsearch", "m4.xlarge.elasticsearch" "m4.xlarge.elasticsearch", :c4.large.elasticsearch "c4.large.elasticsearch", :r4.16xlarge.elasticsearch "r4.16xlarge.elasticsearch", "m3.xlarge.elasticsearch" "m3.xlarge.elasticsearch", "i2.2xlarge.elasticsearch" "i2.2xlarge.elasticsearch", :m3.xlarge.elasticsearch "m3.xlarge.elasticsearch", :r3.xlarge.elasticsearch "r3.xlarge.elasticsearch", "r4.8xlarge.elasticsearch" "r4.8xlarge.elasticsearch", "r4.large.elasticsearch" "r4.large.elasticsearch", :d2.2xlarge.elasticsearch "d2.2xlarge.elasticsearch", "r3.xlarge.elasticsearch" "r3.xlarge.elasticsearch", :c4.8xlarge.elasticsearch "c4.8xlarge.elasticsearch", "r3.4xlarge.elasticsearch" "r3.4xlarge.elasticsearch", "r4.16xlarge.elasticsearch" "r4.16xlarge.elasticsearch", "m3.medium.elasticsearch" "m3.medium.elasticsearch", "t2.medium.elasticsearch" "t2.medium.elasticsearch", :d2.xlarge.elasticsearch "d2.xlarge.elasticsearch", "c4.xlarge.elasticsearch" "c4.xlarge.elasticsearch", :m4.2xlarge.elasticsearch "m4.2xlarge.elasticsearch", :i2.2xlarge.elasticsearch "i2.2xlarge.elasticsearch", :t2.small.elasticsearch "t2.small.elasticsearch", :r4.large.elasticsearch "r4.large.elasticsearch", "r4.4xlarge.elasticsearch" "r4.4xlarge.elasticsearch", "d2.2xlarge.elasticsearch" "d2.2xlarge.elasticsearch", "m4.large.elasticsearch" "m4.large.elasticsearch", :d2.4xlarge.elasticsearch "d2.4xlarge.elasticsearch", :r4.xlarge.elasticsearch "r4.xlarge.elasticsearch", :d2.8xlarge.elasticsearch "d2.8xlarge.elasticsearch", "t2.small.elasticsearch" "t2.small.elasticsearch", "m4.4xlarge.elasticsearch" "m4.4xlarge.elasticsearch", :m4.10xlarge.elasticsearch "m4.10xlarge.elasticsearch", :r3.large.elasticsearch "r3.large.elasticsearch", "d2.8xlarge.elasticsearch" "d2.8xlarge.elasticsearch", "c4.2xlarge.elasticsearch" "c4.2xlarge.elasticsearch", "r3.large.elasticsearch" "r3.large.elasticsearch", "m3.2xlarge.elasticsearch" "m3.2xlarge.elasticsearch", "m4.10xlarge.elasticsearch" "m4.10xlarge.elasticsearch", :c4.xlarge.elasticsearch "c4.xlarge.elasticsearch", "d2.xlarge.elasticsearch" "d2.xlarge.elasticsearch", :m4.xlarge.elasticsearch "m4.xlarge.elasticsearch", :m3.large.elasticsearch "m3.large.elasticsearch", :i2.xlarge.elasticsearch "i2.xlarge.elasticsearch", :r4.8xlarge.elasticsearch "r4.8xlarge.elasticsearch", "m3.large.elasticsearch" "m3.large.elasticsearch", "i2.xlarge.elasticsearch" "i2.xlarge.elasticsearch", :t2.medium.elasticsearch "t2.medium.elasticsearch", :t2.micro.elasticsearch "t2.micro.elasticsearch", "r4.xlarge.elasticsearch" "r4.xlarge.elasticsearch", :r3.2xlarge.elasticsearch "r3.2xlarge.elasticsearch", :m3.2xlarge.elasticsearch "m3.2xlarge.elasticsearch", :r4.2xlarge.elasticsearch "r4.2xlarge.elasticsearch", :m4.large.elasticsearch "m4.large.elasticsearch", :r4.4xlarge.elasticsearch "r4.4xlarge.elasticsearch", :c4.2xlarge.elasticsearch "c4.2xlarge.elasticsearch", "c4.4xlarge.elasticsearch" "c4.4xlarge.elasticsearch", :m4.4xlarge.elasticsearch "m4.4xlarge.elasticsearch", "c4.8xlarge.elasticsearch" "c4.8xlarge.elasticsearch", "r3.8xlarge.elasticsearch" "r3.8xlarge.elasticsearch"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.es.option-status/creation-date (clojure.spec.alpha/and :portkey.aws.es/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.es.option-status/update-date (clojure.spec.alpha/and :portkey.aws.es/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.es.option-status/update-version (clojure.spec.alpha/and :portkey.aws.es/uint-value))
(clojure.spec.alpha/def :portkey.aws.es.option-status/state (clojure.spec.alpha/and :portkey.aws.es/option-state))
(clojure.spec.alpha/def :portkey.aws.es.option-status/pending-deletion (clojure.spec.alpha/and :portkey.aws.es/boolean))
(clojure.spec.alpha/def :portkey.aws.es/option-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.option-status/CreationDate :portkey.aws.es.option-status/UpdateDate :portkey.aws.es.option-status/State] :opt-un [:portkey.aws.es.option-status/UpdateVersion :portkey.aws.es.option-status/PendingDeletion]))

(clojure.spec.alpha/def :portkey.aws.es/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 0 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.es/policy-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.additional-limit/limit-values (clojure.spec.alpha/and :portkey.aws.es/limit-value-list))
(clojure.spec.alpha/def :portkey.aws.es/additional-limit (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es/LimitName :portkey.aws.es.additional-limit/LimitValues]))

(clojure.spec.alpha/def :portkey.aws.es.snapshot-options-status/options (clojure.spec.alpha/and :portkey.aws.es/snapshot-options))
(clojure.spec.alpha/def :portkey.aws.es.snapshot-options-status/status (clojure.spec.alpha/and :portkey.aws.es/option-status))
(clojure.spec.alpha/def :portkey.aws.es/snapshot-options-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.snapshot-options-status/Options :portkey.aws.es.snapshot-options-status/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/internal-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/instance-limits (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es/InstanceCountLimits]))

(clojure.spec.alpha/def :portkey.aws.es.describe-elasticsearch-domains-response/domain-status-list (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-domain-status-list))
(clojure.spec.alpha/def :portkey.aws.es/describe-elasticsearch-domains-response (portkey.awsgen/json-keys :req-un [:portkey.aws.es.describe-elasticsearch-domains-response/DomainStatusList] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es/limits-by-role (clojure.spec.alpha/map-of :portkey.aws.es/instance-role :portkey.aws.es/limits))

(clojure.spec.alpha/def :portkey.aws.es.base-exception/message (clojure.spec.alpha/and :portkey.aws.es/error-message))
(clojure.spec.alpha/def :portkey.aws.es/base-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.base-exception/message]))

(clojure.spec.alpha/def :portkey.aws.es/describe-elasticsearch-domain-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es/DomainName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.create-elasticsearch-domain-request/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.create-elasticsearch-domain-request/access-policies (clojure.spec.alpha/and :portkey.aws.es/policy-document))
(clojure.spec.alpha/def :portkey.aws.es/create-elasticsearch-domain-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es/DomainName] :opt-un [:portkey.aws.es.create-elasticsearch-domain-request/ElasticsearchVersion :portkey.aws.es/ElasticsearchClusterConfig :portkey.aws.es/EBSOptions :portkey.aws.es.create-elasticsearch-domain-request/AccessPolicies :portkey.aws.es/SnapshotOptions :portkey.aws.es/AdvancedOptions]))

(clojure.spec.alpha/def :portkey.aws.es/domain-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 1 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.es/minimum-instance-count (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.es/integer-class (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.es/advanced-options (clojure.spec.alpha/map-of :portkey.aws.es/string :portkey.aws.es/string))

(clojure.spec.alpha/def :portkey.aws.es.storage-type/storage-type-limits (clojure.spec.alpha/and :portkey.aws.es/storage-type-limit-list))
(clojure.spec.alpha/def :portkey.aws.es/storage-type (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es/StorageTypeName :portkey.aws.es/StorageSubTypeName :portkey.aws.es.storage-type/StorageTypeLimits]))

(clojure.spec.alpha/def :portkey.aws.es/describe-elasticsearch-instance-type-limits-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es/LimitsByRole]))

(clojure.spec.alpha/def :portkey.aws.es/volume-type (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {"standard" "standard", :standard "standard", "gp2" "gp2", :gp2 "gp2", "io1" "io1", :io1 "io1"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.es/describe-elasticsearch-domain-config-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es/DomainName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__56644__56645__auto__] (clojure.core/<= p1__56644__56645__auto__ 100))))

(clojure.spec.alpha/def :portkey.aws.es.tag/key (clojure.spec.alpha/and :portkey.aws.es/tag-key))
(clojure.spec.alpha/def :portkey.aws.es.tag/value (clojure.spec.alpha/and :portkey.aws.es/tag-value))
(clojure.spec.alpha/def :portkey.aws.es/tag (portkey.awsgen/json-keys :req-un [:portkey.aws.es.tag/Key :portkey.aws.es.tag/Value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.access-policies-status/options (clojure.spec.alpha/and :portkey.aws.es/policy-document))
(clojure.spec.alpha/def :portkey.aws.es.access-policies-status/status (clojure.spec.alpha/and :portkey.aws.es/option-status))
(clojure.spec.alpha/def :portkey.aws.es/access-policies-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.access-policies-status/Options :portkey.aws.es.access-policies-status/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.create-elasticsearch-domain-response/domain-status (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-domain-status))
(clojure.spec.alpha/def :portkey.aws.es/create-elasticsearch-domain-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.create-elasticsearch-domain-response/DomainStatus]))

(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-version-status/options (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.elasticsearch-version-status/status (clojure.spec.alpha/and :portkey.aws.es/option-status))
(clojure.spec.alpha/def :portkey.aws.es/elasticsearch-version-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.elasticsearch-version-status/Options :portkey.aws.es.elasticsearch-version-status/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 3 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 28)) (clojure.core/fn [s__56603__auto__] (clojure.core/re-matches #"[a-z][a-z0-9\-]+" s__56603__auto__))))

(clojure.spec.alpha/def :portkey.aws.es.describe-elasticsearch-domains-request/domain-names (clojure.spec.alpha/and :portkey.aws.es/domain-name-list))
(clojure.spec.alpha/def :portkey.aws.es/describe-elasticsearch-domains-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.describe-elasticsearch-domains-request/DomainNames] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es/domain-info (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es/DomainName]))

(clojure.spec.alpha/def :portkey.aws.es/elasticsearch-version-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es/instance-count-limits (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es/MinimumInstanceCount :portkey.aws.es/MaximumInstanceCount]))

(clojure.spec.alpha/def :portkey.aws.es/option-state (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {"RequiresIndexDocuments" "RequiresIndexDocuments", :requires-index-documents "RequiresIndexDocuments", "Processing" "Processing", :processing "Processing", "Active" "Active", :active "Active"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.es/uint-value (clojure.spec.alpha/and clojure.core/int? (fn* [p1__56642__56643__auto__] (clojure.core/<= 0 p1__56642__56643__auto__))))

(clojure.spec.alpha/def :portkey.aws.es/limit-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.describe-elasticsearch-domain-config-response/domain-config (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-domain-config))
(clojure.spec.alpha/def :portkey.aws.es/describe-elasticsearch-domain-config-response (portkey.awsgen/json-keys :req-un [:portkey.aws.es.describe-elasticsearch-domain-config-response/DomainConfig] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.describe-elasticsearch-instance-type-limits-request/instance-type (clojure.spec.alpha/and :portkey.aws.es/espartition-instance-type))
(clojure.spec.alpha/def :portkey.aws.es.describe-elasticsearch-instance-type-limits-request/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es/describe-elasticsearch-instance-type-limits-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.describe-elasticsearch-instance-type-limits-request/InstanceType :portkey.aws.es.describe-elasticsearch-instance-type-limits-request/ElasticsearchVersion] :opt-un [:portkey.aws.es/DomainName]))

(clojure.spec.alpha/def :portkey.aws.es/limit-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.es.storage-type-limit/limit-values (clojure.spec.alpha/and :portkey.aws.es/limit-value-list))
(clojure.spec.alpha/def :portkey.aws.es/storage-type-limit (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es/LimitName :portkey.aws.es.storage-type-limit/LimitValues]))

(clojure.spec.alpha/def :portkey.aws.es/list-tags-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es/ARN] :opt-un []))

(clojure.core/defn remove-tags ([input__56767__auto__] (remove-tags input__56767__auto__ portkey.aws/*http-client*)) ([input58006 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.es/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/tags-removal"), :body (clojure.spec.alpha/unform :portkey.aws.es/RemoveTagsRequest input58006)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58005] (clojure.core/let [errors__56772__auto__ {"BaseException" :portkey.aws.es/base-exception, "ValidationException" :portkey.aws.es/validation-exception, "InternalException" :portkey.aws.es/internal-exception}] (if (clojure.core/= nil (:status response58005)) true (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58005 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58005)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58005})))))))))))

(clojure.core/defn list-domain-names ([input__56767__auto__] (list-domain-names input__56767__auto__ portkey.aws/*http-client*)) ([input58008 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.es/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/domain"), :body nil} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58007] (clojure.core/let [errors__56772__auto__ {"BaseException" :portkey.aws.es/base-exception, "ValidationException" :portkey.aws.es/validation-exception}] (if (clojure.core/= nil (:status response58007)) (clojure.spec.alpha/unform :portkey.aws.es/list-domain-names-response (:body response58007)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58007 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58007)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58007})))))))))))

(clojure.core/defn update-elasticsearch-domain-config ([input__56767__auto__] (update-elasticsearch-domain-config input__56767__auto__ portkey.aws/*http-client*)) ([input58010 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.es/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/domain/{DomainName}/config"), :body (clojure.spec.alpha/unform :portkey.aws.es/UpdateElasticsearchDomainConfigRequest input58010)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"DomainName" "DomainName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58009] (clojure.core/let [errors__56772__auto__ {"BaseException" :portkey.aws.es/base-exception, "InternalException" :portkey.aws.es/internal-exception, "InvalidTypeException" :portkey.aws.es/invalid-type-exception, "LimitExceededException" :portkey.aws.es/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.es/resource-not-found-exception, "ValidationException" :portkey.aws.es/validation-exception}] (if (clojure.core/= nil (:status response58009)) (clojure.spec.alpha/unform :portkey.aws.es/update-elasticsearch-domain-config-response (:body response58009)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58009 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58009)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58009})))))))))))

(clojure.core/defn describe-elasticsearch-domain-config ([input__56767__auto__] (describe-elasticsearch-domain-config input__56767__auto__ portkey.aws/*http-client*)) ([input58012 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.es/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/domain/{DomainName}/config"), :body (clojure.spec.alpha/unform :portkey.aws.es/DescribeElasticsearchDomainConfigRequest input58012)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"DomainName" "DomainName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58011] (clojure.core/let [errors__56772__auto__ {"BaseException" :portkey.aws.es/base-exception, "InternalException" :portkey.aws.es/internal-exception, "ResourceNotFoundException" :portkey.aws.es/resource-not-found-exception, "ValidationException" :portkey.aws.es/validation-exception}] (if (clojure.core/= nil (:status response58011)) (clojure.spec.alpha/unform :portkey.aws.es/describe-elasticsearch-domain-config-response (:body response58011)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58011 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58011)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58011})))))))))))

(clojure.core/defn list-tags ([input__56767__auto__] (list-tags input__56767__auto__ portkey.aws/*http-client*)) ([input58014 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.es/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/tags/"), :body (clojure.spec.alpha/unform :portkey.aws.es/ListTagsRequest input58014)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"arn" "ARN"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58013] (clojure.core/let [errors__56772__auto__ {"BaseException" :portkey.aws.es/base-exception, "ResourceNotFoundException" :portkey.aws.es/resource-not-found-exception, "ValidationException" :portkey.aws.es/validation-exception, "InternalException" :portkey.aws.es/internal-exception}] (if (clojure.core/= nil (:status response58013)) (clojure.spec.alpha/unform :portkey.aws.es/list-tags-response (:body response58013)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58013 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58013)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58013})))))))))))

(clojure.core/defn describe-elasticsearch-domain ([input__56767__auto__] (describe-elasticsearch-domain input__56767__auto__ portkey.aws/*http-client*)) ([input58016 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.es/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/domain/{DomainName}"), :body (clojure.spec.alpha/unform :portkey.aws.es/DescribeElasticsearchDomainRequest input58016)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"DomainName" "DomainName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58015] (clojure.core/let [errors__56772__auto__ {"BaseException" :portkey.aws.es/base-exception, "InternalException" :portkey.aws.es/internal-exception, "ResourceNotFoundException" :portkey.aws.es/resource-not-found-exception, "ValidationException" :portkey.aws.es/validation-exception}] (if (clojure.core/= nil (:status response58015)) (clojure.spec.alpha/unform :portkey.aws.es/describe-elasticsearch-domain-response (:body response58015)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58015 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58015)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58015})))))))))))

(clojure.core/defn describe-elasticsearch-instance-type-limits ([input__56767__auto__] (describe-elasticsearch-instance-type-limits input__56767__auto__ portkey.aws/*http-client*)) ([input58018 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.es/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/instanceTypeLimits/{ElasticsearchVersion}/{InstanceType}"), :body (clojure.spec.alpha/unform :portkey.aws.es/DescribeElasticsearchInstanceTypeLimitsRequest input58018)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"InstanceType" "InstanceType", "ElasticsearchVersion" "ElasticsearchVersion"}) (portkey.awsgen/params-to-querystring {"domainName" "DomainName"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58017] (clojure.core/let [errors__56772__auto__ {"BaseException" :portkey.aws.es/base-exception, "InternalException" :portkey.aws.es/internal-exception, "InvalidTypeException" :portkey.aws.es/invalid-type-exception, "LimitExceededException" :portkey.aws.es/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.es/resource-not-found-exception, "ValidationException" :portkey.aws.es/validation-exception}] (if (clojure.core/= nil (:status response58017)) (clojure.spec.alpha/unform :portkey.aws.es/describe-elasticsearch-instance-type-limits-response (:body response58017)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58017 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58017)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58017})))))))))))

(clojure.core/defn list-elasticsearch-versions ([input__56767__auto__] (list-elasticsearch-versions input__56767__auto__ portkey.aws/*http-client*)) ([input58020 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.es/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/versions"), :body (clojure.spec.alpha/unform :portkey.aws.es/ListElasticsearchVersionsRequest input58020)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58019] (clojure.core/let [errors__56772__auto__ {"BaseException" :portkey.aws.es/base-exception, "InternalException" :portkey.aws.es/internal-exception, "ResourceNotFoundException" :portkey.aws.es/resource-not-found-exception, "ValidationException" :portkey.aws.es/validation-exception}] (if (clojure.core/= nil (:status response58019)) (clojure.spec.alpha/unform :portkey.aws.es/list-elasticsearch-versions-response (:body response58019)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58019 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58019)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58019})))))))))))

(clojure.core/defn describe-elasticsearch-domains ([input__56767__auto__] (describe-elasticsearch-domains input__56767__auto__ portkey.aws/*http-client*)) ([input58022 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.es/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/domain-info"), :body (clojure.spec.alpha/unform :portkey.aws.es/DescribeElasticsearchDomainsRequest input58022)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58021] (clojure.core/let [errors__56772__auto__ {"BaseException" :portkey.aws.es/base-exception, "InternalException" :portkey.aws.es/internal-exception, "ValidationException" :portkey.aws.es/validation-exception}] (if (clojure.core/= nil (:status response58021)) (clojure.spec.alpha/unform :portkey.aws.es/describe-elasticsearch-domains-response (:body response58021)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58021 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58021)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58021})))))))))))

(clojure.core/defn delete-elasticsearch-domain ([input__56767__auto__] (delete-elasticsearch-domain input__56767__auto__ portkey.aws/*http-client*)) ([input58024 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.es/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "DELETE", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/domain/{DomainName}"), :body (clojure.spec.alpha/unform :portkey.aws.es/DeleteElasticsearchDomainRequest input58024)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"DomainName" "DomainName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58023] (clojure.core/let [errors__56772__auto__ {"BaseException" :portkey.aws.es/base-exception, "InternalException" :portkey.aws.es/internal-exception, "ResourceNotFoundException" :portkey.aws.es/resource-not-found-exception, "ValidationException" :portkey.aws.es/validation-exception}] (if (clojure.core/= nil (:status response58023)) (clojure.spec.alpha/unform :portkey.aws.es/delete-elasticsearch-domain-response (:body response58023)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58023 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58023)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58023})))))))))))

(clojure.core/defn add-tags ([input__56767__auto__] (add-tags input__56767__auto__ portkey.aws/*http-client*)) ([input58026 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.es/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/tags"), :body (clojure.spec.alpha/unform :portkey.aws.es/AddTagsRequest input58026)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58025] (clojure.core/let [errors__56772__auto__ {"BaseException" :portkey.aws.es/base-exception, "LimitExceededException" :portkey.aws.es/limit-exceeded-exception, "ValidationException" :portkey.aws.es/validation-exception, "InternalException" :portkey.aws.es/internal-exception}] (if (clojure.core/= nil (:status response58025)) true (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58025 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58025)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58025})))))))))))

(clojure.core/defn list-elasticsearch-instance-types ([input__56767__auto__] (list-elasticsearch-instance-types input__56767__auto__ portkey.aws/*http-client*)) ([input58028 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.es/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/instanceTypes/{ElasticsearchVersion}"), :body (clojure.spec.alpha/unform :portkey.aws.es/ListElasticsearchInstanceTypesRequest input58028)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"ElasticsearchVersion" "ElasticsearchVersion"}) (portkey.awsgen/params-to-querystring {"domainName" "DomainName", "maxResults" "MaxResults", "nextToken" "NextToken"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58027] (clojure.core/let [errors__56772__auto__ {"BaseException" :portkey.aws.es/base-exception, "InternalException" :portkey.aws.es/internal-exception, "ResourceNotFoundException" :portkey.aws.es/resource-not-found-exception, "ValidationException" :portkey.aws.es/validation-exception}] (if (clojure.core/= nil (:status response58027)) (clojure.spec.alpha/unform :portkey.aws.es/list-elasticsearch-instance-types-response (:body response58027)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58027 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58027)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58027})))))))))))

(clojure.core/defn create-elasticsearch-domain ([input__56767__auto__] (create-elasticsearch-domain input__56767__auto__ portkey.aws/*http-client*)) ([input58030 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.es/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/domain"), :body (clojure.spec.alpha/unform :portkey.aws.es/CreateElasticsearchDomainRequest input58030)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58029] (clojure.core/let [errors__56772__auto__ {"BaseException" :portkey.aws.es/base-exception, "DisabledOperationException" :portkey.aws.es/disabled-operation-exception, "InternalException" :portkey.aws.es/internal-exception, "InvalidTypeException" :portkey.aws.es/invalid-type-exception, "LimitExceededException" :portkey.aws.es/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.es/resource-already-exists-exception, "ValidationException" :portkey.aws.es/validation-exception}] (if (clojure.core/= nil (:status response58029)) (clojure.spec.alpha/unform :portkey.aws.es/create-elasticsearch-domain-response (:body response58029)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58029 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58029)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58029})))))))))))