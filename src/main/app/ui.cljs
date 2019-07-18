(ns app.ui
  (:require
    [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]))

(defsc Person [this {:person/keys [name age weight]}]
  (dom/div
    (dom/p "Name: " name)
    (dom/p "Age: " age)
    (dom/p "Weight: " weight)))

(def ui-person (comp/factory Person))

(defsc Root [this props]
  (dom/div
    (ui-person {:person/name "Alex" :person/age "46" :person/weight "195 lbs"})))