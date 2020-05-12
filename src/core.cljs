(ns core
  (:require [reagent.dom :as rdom]))

(defn home-component []
  [:div
   [:h1 "TODO: Add more components here."]])

(defn mount [comp]
  (rdom/render [comp]
  (.getElementById js/document "app")))

(defn main! []
  (mount home-component)
  (print "I don't do much but I am waiting for yer"))

(defn reload! []
  (mount home-component)
  (print "App reloaded successfully mutation"))
