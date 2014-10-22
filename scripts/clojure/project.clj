(defproject zendown "0.3.0"
  :description "Parser for Zendown, a markup for poems and stories."
  :min-lein-version "2.0.0"
  :url "https://github.com/priyatam/zendown"
  :warn-on-reflection false
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [environ "1.0.0"]
                 [clj-yaml "0.4.0"]
                 [markdown-clj "0.9.55" :exclusions [org.clojure/clojure]]]
  :plugins [[lein-environ "1.0.0"]]
  :uberjar-name "zendown.jar"
  :main zendown.core
  :profiles {:uberjar {:aot :all}})
