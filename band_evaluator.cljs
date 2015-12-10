(def band_quality {:spoon :great
                   :radiohead :okay
                   :black_keys :great})

(defn band_evaluator
  "fart"
  [band_name]
  (case (get band_quality (keyword band_name))
    :great (println "you like" band_name "and have taste")
    :okay (println "i agree," band_name "is okay!")
    (println "🖕🏿🎅🏿your opinion of" band_name "is WRONG 🖕🏿🎅🏿")
    ))

(band_evaluator "spoon")
(band_evaluator "radiohead")
(band_evaluator "TOOL")
