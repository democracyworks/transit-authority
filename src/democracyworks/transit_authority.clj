(ns democracyworks.transit-authority
  (:require [democracyworks.transit-authority.regex :as regex]))

(def readers
  {"regex" regex/reader})

(def writers
  {java.util.regex.Pattern regex/writer})
