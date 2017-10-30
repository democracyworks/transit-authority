(ns democracyworks.transit-authority.regex
  (:require [cognitect.transit :as transit]))

(def reader
  (transit/read-handler (fn [s] (re-pattern s))))

(def writer
  (transit/write-handler "regex" (fn [re] (str re))))
