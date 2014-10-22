(ns zendown.core-test
  (:import (java.io File))
  (:require [clojure.test :refer :all]
            [clojure.java.io :as io]
            [clojure.string :as str]
            [clojure.edn :as edn]
            [zendown.core :as zen]))

(defn check-poem [content]
  (is (= "Sappho" (:author content)))
  (is (contains? content :title))
  (is (contains? content :content)))

(defn check-story [content]
  (is (= "Ernest Hemingway" (:author content)))
  (is (contains? content :title))
  (is (contains? content :content)))

(deftest test-content
  (testing "read plaintext"
    (let [content (zen/read :str "---
                               title: You May Forget
                               author: Sappho
                               ---
                               A nice poem ")]
      (check-poem content))
    (let [content (zen/read :resource "poem.txt")]
      (check-poem content))
    (let [content (zen/read :url "https://s3.amazonaws.com/poetroid-public-domain/Sappho-You-May-Forget.txt")]
      (check-poem content))
    (let [content (zen/read :file "resources/poem.txt")]
      (check-poem content)))
  (testing "generate-uri"
    (let [uri (zen/generate-uri (zen/read :resource "poem.txt"))]
      (is (= uri "sappho-you-may-forget"))))
  (testing "read markdown"
    (let [content (zen/read :resource "story.txt")]
      (check-story content))))

;; REPL

;(zen/read :resource "poem.txt")
