(ns main
  (:require [reagent.core :as r]
            [cljs.core.async :refer (chan put! <! go go-loop timeout)]))

(defn main-component []
  [:div
   [:h1 "TODO: Add more components here."]])

(defn mount [c]
  (r/render-component [c] (.getElementById js/document "app")))

(defn main! []
  (mount main-component)
  (print "I don't do much but I am waiting for yer"))

(defn reload! []
  (mount main-component)
  (print "App reloaded successfully after edit change"))
