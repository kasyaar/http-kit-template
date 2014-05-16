(ns {{name}}.core
  (:use 
    compojure.core
    [compojure.handler :only [site]]
    [ring.util.response :only [status response]]
    org.httpkit.server)
  (:require 
    [compojure.route :as route]
    [clojure.java.io :as io])
  (:gen-class))



(defroutes all-routes
  (GET "/" [] "Hello world!"))


(defn -main [port] 
  (run-server (site #'all-routes)  {:port (Integer. port)})
  (println (str "Server started on " port " port")))
