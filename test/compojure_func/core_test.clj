(ns compojure-func.core-test
  (:require [clojure.test :refer :all]
            [compojure-func.web :as web]
            [compojure-func.core :as f]))

(def app web/app)

(deftest assert-response-test
  (testing "Response codes"
    (f/with-app app
      (f/assert-response :get "/" 200)
      (f/assert-response :get "/foobar" 404))))
