(ns {{name}}.core
  (:use 
    compojure.core
    [compojure.handler :only [site]]
    [ring.middleware.cookies :only [wrap-cookies]]
    [ring.middleware.params :only [wrap-params]]
    [ring.middleware.keyword-params :only [wrap-keyword-params]]
    [ring.util.response :only [status response]]
    org.httpkit.server)
  (:require 
    [compojure.route :as route]
    [clojure.java.io :as io])
  (:gen-class))



(defroutes all-routes
  (GET "/" [] "Hello world!"))


(defn -main [port] 
  (run-server (site #'all-routes wrap-cookies wrap-keyword-params wrap-params)  {:port (Integer. port)})
  (println (str "Server started on " port " port")))
