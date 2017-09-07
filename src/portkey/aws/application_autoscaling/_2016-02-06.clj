(ns portkey.aws.application-autoscaling.-2016-02-06 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "application-autoscaling", "region" "ap-northeast-1"},
    :sslCommonName "autoscaling.ap-northeast-1.amazonaws.com",
    :endpoint "https://autoscaling.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope
    {"service" "application-autoscaling", "region" "eu-west-1"},
    :sslCommonName "autoscaling.eu-west-1.amazonaws.com",
    :endpoint "https://autoscaling.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope
    {"service" "application-autoscaling", "region" "us-east-2"},
    :sslCommonName "autoscaling.us-east-2.amazonaws.com",
    :endpoint "https://autoscaling.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "application-autoscaling", "region" "ap-southeast-2"},
    :sslCommonName "autoscaling.ap-southeast-2.amazonaws.com",
    :endpoint "https://autoscaling.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credentialScope
    {"service" "application-autoscaling", "region" "cn-north-1"},
    :sslCommonName "autoscaling.cn-north-1.amazonaws.com",
    :endpoint "https://autoscaling.cn-north-1.amazonaws.com"},
   "sa-east-1"
   {:credentialScope
    {"service" "application-autoscaling", "region" "sa-east-1"},
    :sslCommonName "autoscaling.sa-east-1.amazonaws.com",
    :endpoint "https://autoscaling.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "application-autoscaling", "region" "ap-southeast-1"},
    :sslCommonName "autoscaling.ap-southeast-1.amazonaws.com",
    :endpoint "https://autoscaling.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "application-autoscaling", "region" "ap-northeast-2"},
    :sslCommonName "autoscaling.ap-northeast-2.amazonaws.com",
    :endpoint "https://autoscaling.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope
    {"service" "application-autoscaling", "region" "ca-central-1"},
    :sslCommonName "autoscaling.ca-central-1.amazonaws.com",
    :endpoint "https://autoscaling.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope
    {"service" "application-autoscaling", "region" "eu-central-1"},
    :sslCommonName "autoscaling.eu-central-1.amazonaws.com",
    :endpoint "https://autoscaling.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope
    {"service" "application-autoscaling", "region" "eu-west-2"},
    :sslCommonName "autoscaling.eu-west-2.amazonaws.com",
    :endpoint "https://autoscaling.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope
    {"service" "application-autoscaling", "region" "us-west-2"},
    :sslCommonName "autoscaling.us-west-2.amazonaws.com",
    :endpoint "https://autoscaling.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope
    {"service" "application-autoscaling", "region" "us-east-1"},
    :sslCommonName "autoscaling.us-east-1.amazonaws.com",
    :endpoint "https://autoscaling.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope
    {"service" "application-autoscaling", "region" "us-west-1"},
    :sslCommonName "autoscaling.us-west-1.amazonaws.com",
    :endpoint "https://autoscaling.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope
    {"service" "application-autoscaling", "region" "ap-south-1"},
    :sslCommonName "autoscaling.ap-south-1.amazonaws.com",
    :endpoint "https://autoscaling.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
