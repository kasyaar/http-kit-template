(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  
  :main {{name}}.core
  :aot [{{name}}.core]
  :uberjar-name "{{name}}.jar"
  :plugins []
  :dependencies [
                 [http-kit "2.1.16"]
                 [ring "1.2.1"]
                 [compojure "1.1.6"]
                 [org.clojure/clojure "1.5.1"]]
  :min-lein-version "2.0.0")
