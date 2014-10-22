(defproject facjure/zendown "0.3.0"
  :description "Parser for Zendown, a markup for poems and stories."
  :url "https://github.com/facjure/zendown"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/facjure/zendown"}
  :warn-on-reflection false
  :min-lein-version "2.3.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.3.1"]
                 [clj-yaml "0.4.0"]
                 [markdown-clj "0.9.55" :exclusions [org.clojure/clojure]]]

  :uberjar-name "zendown.jar"
  :main zendown.core
  :profiles {:uberjar {:aot :all}})
