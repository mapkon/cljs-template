(ns main
  (:require [reagent.core :as r]
            [cljs.core.async :refer (chan put! <! go go-loop timeout)]))

(defn main-component []
  [:div
   [:h1 "This is a comment"]])

(defn mount [c]
  (r/render-component [c] (.getElementById js/document "app")))

(defn reload! []
  (mount main-component)
  (print "App reloaded successfully after edit change"))

(defn main! []
  (mount main-component)
  (print "Hello Main"))
