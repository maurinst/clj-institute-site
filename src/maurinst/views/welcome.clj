(ns maurinst.views.welcome
  (:require [maurinst.views.common :as common]
            [noir.content.getting-started]
            [hiccup.core])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to the Mauritius Institute"]))

(defpage "/my-page" []
  (html
    [:h1 "This is my first page!"]))

(defpage "/my-page-2 []
  (common/site-layout
    [:h1 "Welcome to my site!"]
    [:p "Hope you like it..."]))
