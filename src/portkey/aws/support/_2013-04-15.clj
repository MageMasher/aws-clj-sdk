(ns portkey.aws.support.-2013-04-15 (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credentialScope {"service" "support", "region" "us-east-1"},
    :sslCommonName "support.us-east-1.amazonaws.com",
    :endpoint "https://support.us-east-1.amazonaws.com"}})

(comment TODO support "json")
