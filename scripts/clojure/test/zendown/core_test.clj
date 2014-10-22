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
  (testing "readany plaintext"
    (let [content (zen/readany :str "---
                               title: You May Forget
                               author: Sappho
                               ---
                               A nice poem ")]
      (check-poem content))
    (let [content (zen/readany :resource "poem.txt")]
      (check-poem content))
    (let [content (zen/readany :url "https://s3.amazonaws.com/poetroid-public-domain/Sappho-You-May-Forget.txt")]
      (check-poem content))
    (let [content (zen/readany :file "resources/poem.txt")]
      (check-poem content)))
  (testing "generate-uri"
    (let [uri (zen/generate-uri (zen/readany :resource "poem.txt"))]
      (is (= uri "sappho-you-may-forget"))))
  (testing "readany markdown"
    (let [content (zen/readany :resource "story.txt")]
      (check-story content))))

;; REPL

;(zen/readany :resource "poem.txt")
