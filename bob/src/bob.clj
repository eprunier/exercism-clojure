(ns bob
  (:require [clojure.string :as str]))

(defn response-for [input]
  (cond
    (str/blank? (str/trim input)) "Fine. Be that way!"
    (and 
      (= input (str/upper-case input)) 
      (not (= input (str/lower-case input)))) "Whoa, chill out!"
    (str/ends-with? input "?") "Sure."
    :else "Whatever."))
