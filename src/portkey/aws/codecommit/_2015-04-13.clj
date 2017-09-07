(ns portkey.aws.codecommit.-2015-04-13 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope
    {"service" "codecommit", "region" "ap-northeast-1"},
    :sslCommonName "codecommit.ap-northeast-1.amazonaws.com",
    :endpoint "https://codecommit.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "codecommit", "region" "eu-west-1"},
    :sslCommonName "codecommit.eu-west-1.amazonaws.com",
    :endpoint "https://codecommit.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "codecommit", "region" "us-east-2"},
    :sslCommonName "codecommit.us-east-2.amazonaws.com",
    :endpoint "https://codecommit.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope
    {"service" "codecommit", "region" "ap-southeast-2"},
    :sslCommonName "codecommit.ap-southeast-2.amazonaws.com",
    :endpoint "https://codecommit.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "codecommit", "region" "sa-east-1"},
    :sslCommonName "codecommit.sa-east-1.amazonaws.com",
    :endpoint "https://codecommit.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope
    {"service" "codecommit", "region" "ap-southeast-1"},
    :sslCommonName "codecommit.ap-southeast-1.amazonaws.com",
    :endpoint "https://codecommit.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope
    {"service" "codecommit", "region" "ap-northeast-2"},
    :sslCommonName "codecommit.ap-northeast-2.amazonaws.com",
    :endpoint "https://codecommit.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "codecommit", "region" "ca-central-1"},
    :sslCommonName "codecommit.ca-central-1.amazonaws.com",
    :endpoint "https://codecommit.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "codecommit", "region" "eu-central-1"},
    :sslCommonName "codecommit.eu-central-1.amazonaws.com",
    :endpoint "https://codecommit.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "codecommit", "region" "eu-west-2"},
    :sslCommonName "codecommit.eu-west-2.amazonaws.com",
    :endpoint "https://codecommit.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "codecommit", "region" "us-west-2"},
    :sslCommonName "codecommit.us-west-2.amazonaws.com",
    :endpoint "https://codecommit.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "codecommit", "region" "us-east-1"},
    :sslCommonName "codecommit.us-east-1.amazonaws.com",
    :endpoint "https://codecommit.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "codecommit", "region" "us-west-1"},
    :sslCommonName "codecommit.us-west-1.amazonaws.com",
    :endpoint "https://codecommit.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "codecommit", "region" "ap-south-1"},
    :sslCommonName "codecommit.ap-south-1.amazonaws.com",
    :endpoint "https://codecommit.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
