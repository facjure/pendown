(ns zenup.core-test
  (:import (java.io File))
  (:require [clojure.test :refer :all]
            [clojure.java.io :as io]
            [clojure.string :as str]
            [clojure.edn :as edn]
            [zenup.core :refer :all]))

(defn verify [data]
  (is (= "Sappho" (:author data)))
      (is (contains? data :title))
      (is (contains? data :content)))

(deftest test-data
  (testing "read-zenup"
    (let [data (read-zenup :resource "poem.txt")]
      verify data)
    (let [data (read-zenup :url "https://s3.amazonaws.com/poetroid-public-domain/Sappho-You+May+Forget")]
      verify data)
    (let [data (read-zenup :file "poem.txt")]
      verify data))
  (testing "generate-uri"
    (let [uri (generate-uri (read-zenup :resource "data/poem.txt"))]
      (is (= uri "sappho-you-may-forget")))))


;; REPL

(read-zenup :resource "poem.txt")

;(read-zenup :url "https://s3.amazonaws.com/poetroid-public-domain/Sappho-You+May+Forget")
