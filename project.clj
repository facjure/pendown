(defproject facjure/pendown "0.4.0"
  :description "A markup for poems and stories."
  :url "https://github.com/facjure/pendown"
  :license {:name "Eclipse Public License" :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git" :url "https://github.com/facjure/pendown"}
  :warn-on-reflection false
  :min-lein-version "2.3.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.3.3"]
                 [clj-yaml "0.4.0"]
                 [markdown-clj "0.9.85" :exclusions [org.clojure/clojure]]]
  :uberjar-name "pendown.jar"
  :main pendown.core
  :profiles {:uberjar {:aot :all}})
