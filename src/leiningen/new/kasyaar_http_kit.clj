(ns leiningen.new.kasyaar-http-kit
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "kasyaar-http-kit"))

(defn kasyaar-http-kit
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' kasyaar-http-kit project.")
    (->files data
             ["Procfile" (render "Procfile" data)]
             ["project.clj" (render "project.clj" data)]
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)])))
