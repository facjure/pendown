(ns zendown.core
  (:refer-clojure :exclude [name parents])
  (:import (java.io File))
  (:require [clojure.pprint :as pp]
            [clojure.string :as str]
            [clojure.java.io :as io]
            [clojure.tools.cli :refer [parse-opts]]
            [clj-yaml.core :as yaml]
            [markdown.core :as md])
  (:gen-class))


(defn fetch [io-type file]
  "Api neutralizer for io.
   Usage:
       fetch :resource 'poem.txt'"
  (cond
   (= io-type :str) (str file)
   (= io-type :resource) (slurp (io/resource file))
   (= io-type :url) (slurp (io/as-url file))
   (= io-type :file) (slurp (io/as-file file))
   :else nil))

(defn- sanitize [s]
  (-> (str/triml s)
      (str/lower-case)
      (str/replace #"[\!\"\#\$\%\&\'\(\)\*\+\,\-\.\/\:\;\<\=\>\?\@\ \\\^\_\`\{\|\}\~]+" " ")
      (str/replace " " "-")
      (str/replace #"-+" "-")
      (str/replace #"-$" "")))

(defn generate-uri [{author :author title :title poem :content}]
  "Generates a content's unique uri, a suffix for the host url.
   Expects a content in clj ds."
  (let [first-line (first (str/split-lines poem))
        uri (cond
             (= title nil) first-line
             :else title)]
    (sanitize (str author "-" uri))))

(defn readany
  "Process a zendown poem into clj ds: map of metadata :content :tags.
   io-type can be :resource :url :file."
  [io-type file]
  (let [poem (fetch io-type file)
        [_ yml raw] (str/split poem #"---")
        metadata (yaml/parse-string yml)
        tags (into #{} (:tags metadata))
        content (if (= (:content_type metadata) "markdown") (md/md-to-html-string raw)
                  (str/triml raw))]
    (assoc metadata :content content :tags tags)))


;; Standalone app, pass filename as args

(defn exit [status msg]
  (println msg)
  (System/exit status))

(defn -main [& args]
  (let [usage "Usage: zendown -f filename"
        cli-opts [["-f" "--file pathToFile" "full path to gile"
                   :parse-fn #(read :file %)]
                  ["-h" "--help"]]
        {:keys [options arguments errors summary]} (parse-opts args cli-opts)]
    (cond
     (:help options) (exit 0 usage)
     (not= (count arguments) 1) (exit 1 usage)
     errors (exit 1 usage))
    (case (first arguments)
      "file" (read :file options)
      (exit 1 usage))))
