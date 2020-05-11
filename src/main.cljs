(ns main
  (:require [reagent.dom :as rdom]
            [cljs.core.async :refer (chan put! <! go go-loop timeout)]))

(defn main-component []
  [:div
   [:h1 "TODO: Add more components here."]])

(defn mount [comp]
  (rdom/render [comp]
  (.getElementById js/document "app")))

(defn main! []
  (mount main-component)
  (print "I don't do much but I am waiting for yer"))

(defn reload! []
  (mount main-component)
  (print "App reloaded successfully mutation"))
