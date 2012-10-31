(ns maurinst.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "maurinst"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))

(defpartial site-layout [& content]
  (html5
    [:head
      [:title "my site"]]
    [:body
      [:div#wrapper
        content]]))
