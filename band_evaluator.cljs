(def band_quality {:spoon :great
                   :radiohead :okay
                   :black_keys :great})

(defn band_evaluator
  "fart"
  [band_name]
  (case (get band_quality (-> band_name
                              .toLowerCase
                              keyword))
    :great (println "you like" band_name "and have taste")
    :okay (println "i agree," band_name "is okay!")
    (println "🖕🏿🎅🏿your opinion of" band_name "is WRONG 🖕🏿🎅🏿")
    ))

(defn cond_evaluator
  "fart"
  [band_name]
  (let [quality (get
                  band_quality
                  (-> band_name
                      .toLowerCase
                      keyword))]
  (cond
    (= quality :great)
    (println "you like" band_name "and have taste")
    (= quality :okay)
    (println "i agree," band_name "is okay!")
    :else
    (println "🖕🏿🎅🏿your opinion of" band_name "is WRONG 🖕🏿🎅🏿")
    )))

(defn condp_evaluator
  "fart"
  [band_name]
  (condp = (get band_quality (-> band_name
                              .toLowerCase
                              keyword))
    :great (println "you like" band_name "and have taste")
    :okay (println "i agree," band_name "is okay!")
    (println "🖕🏿🎅🏿your opinion of" band_name "is WRONG 🖕🏿🎅🏿")
    ))

(band_evaluator "spoon")
(condp_evaluator "radiohead")
(cond_evaluator "GWAR")

(def band_quality (assoc band_quality :gwar :great))

(band_evaluator "GWAR")

(let [{spoon :spoon decemberists :decemberists} band_quality]
  (println spoon decemberists))
