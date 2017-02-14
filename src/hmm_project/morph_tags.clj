;;NN
(def suffix_tags
  (set [
				{:lemma "keit" :pos "NN" :position "E"}
				{:lemma "heit" :pos "NN" :position "E"}
				{:lemma "tum" :pos "NN" :position "E"}
				{:lemma "ung" :pos "NN" :position "E"}
				{:lemma "schaft" :pos "NN" :position "E"}
				{:lemma "gang" :pos "NN" :position "E"}
				{:lemma "keit" :pos "NN" :position "E"}
				{:lemma "nis" :pos "NN" :position "E"}
				{:lemma "chen" :pos "NN" :position "E"}
				{:lemma "ling" :pos "NN" :position "E"}
				{:lemma "erich" :pos "NN" :position "E"}
				{:lemma "erchen" :pos "NN" :position "E"}
				{:lemma "ler" :pos "NN" :position "E"}
				{:lemma "el" :pos "NN" :position "E"}
				{:lemma "land" :pos "NN" :position "E"}
				{:lemma "heiten" :pos "NN" :position "E"}
				{:lemma "tümer" :pos "NN" :position "E"}
				{:lemma "ungen" :pos "NN" :position "E"}
				{:lemma "schaften" :pos "NN" :position "E"}
				{:lemma "gänge" :pos "NN" :position "E"}
				{:lemma "keiten" :pos "NN" :position "E"}
				{:lemma "nisse" :pos "NN" :position "E"}

        {:lemma "eln" :position "E" :pos "V"}
        {:lemma "igen" :position "E" :pos "V"}
        {:lemma "ern" :position "E" :pos "V"}
        {:lemma "ieren" :position "E" :pos "V"}
        {:lemma "isieren" :position "E" :pos "V"}

        {:lemma "bar" :position "E" :pos "ADJ"}
        {:lemma "en" :position "E" :pos "ADJ"}
        {:lemma "rig" :position "E" :pos "ADJ"}
        {:lemma "ern" :position "E" :pos "ADJ"}
        {:lemma "haft" :position "E" :pos "ADJ"} ;;Abgrenzung zu "schaft"
        {:lemma "ig" :position "E" :pos "ADJ"}
        {:lemma "isch" :position "E" :pos "ADJ"}
        {:lemma "lich" :position "E" :pos "ADJ"}
        {:lemma "los" :position "E" :pos "ADJ"}
        {:lemma "mäßig" :position "E" :pos "ADJ"}
        {:lemma "sam" :position "E" :pos "ADJ"}
        ;;Kardinalzahlen
        {:lemma "erlei" :position "E" :pos "ADJ"}
        {:lemma "fach" :position "E" :pos "ADJ"}
  ])
)

(def praefix_tags
  (set [
        {:lemma "ab" :position "A" :pos "ADJ"}
        {:lemma "aller" :position "A" :pos "ADJ"}
        {:lemma "außer" :position "A" :pos "ADJ"}
        {:lemma "binnen" :position "A" :pos "ADJ"}
        {:lemma "erz" :position "A" :pos "ADJ"}
        {:lemma "ge" :position "A" :pos "ADJ"}
        {:lemma "grund" :position "A" :pos "ADJ"}
        {:lemma "inner" :position "A" :pos "ADJ"}
        {:lemma "miss" :position "A" :pos "ADJ"}
        {:lemma "nach" :position "A" :pos "ADJ"}
        {:lemma "ober" :position "A" :pos "ADJ"}
        {:lemma "über" :position "A" :pos "ADJ"}
        {:lemma "un" :position "A" :pos "ADJ"}
        {:lemma "unter" :position "A" :pos "ADJ"}
        {:lemma "ur" :position "A" :pos "ADJ"}
        {:lemma "vor" :position "A" :pos "ADJ"}
        {:lemma "wider" :position "A" :pos "ADJ"}
        {:lemma "zwischen" :position "A" :pos "ADJ"}
  ])
)


(def circumfix_tags
  (set
    [
      ;; V
      {:pos "VVFIN"{:lemma "be" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "VVFIN"{:lemma "be" :position "A" }{ :lemma "ern" :position "E"} }
      {:pos "VVFIN"{:lemma "en" :position "A" }{ :lemma "ieren" :position "E"} }
      {:pos "VVFIN"{:lemma "ent" :position "A"}{:lemma "ren" :position "E"} }
      {:pos "VVFIN"{:lemma "ent" :position "A"}{:lemma "ern" :position "E"} }
      {:pos "VVFIN"{:lemma "in" :position "A" }{ :lemma "ieren" :position "E"} }
      {:pos "VVFIN"{:lemma "ver" :position "A"}{:lemma "en" :position "E"} }
      {:pos "VVFIN"{:lemma "ver" :position "A"}{:lemma "eln" :position "E"} }
      {:pos "VVFIN"{:lemma "ver" :position "A"}{:lemma "ern" :position "E"} }
      {:pos "VVFIN"{:lemma "an" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "VVFIN"{:lemma "durch" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "VVFIN"{:lemma "auf" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "VVFIN"{:lemma "hinter" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "VVFIN"{:lemma "über" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "VVFIN"{:lemma "unter" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "VVFIN"{:lemma "er" :position "A" }{ :lemma "en" :position "E"} }

      {:pos "ADJ"{:lemma "ent" :position "A" }{ :lemma "er" :position "E"} }
    	{:pos "ADJ"{:lemma "ent" :position "A" }{ :lemma "es" :position "E"} }
    	{:pos "ADJ"{:lemma "ent" :position "A" }{ :lemma "e" :position "E"} }
    	{:pos "ADJ"{:lemma "ver" :position "A" }{ :lemma "en" :position "E"} }
    	{:pos "ADJ"{:lemma "ver" :position "A" }{ :lemma "er" :position "E"} }
    	{:pos "ADJ"{:lemma "ver" :position "A" }{ :lemma "es" :position "E"} }
      { :pos "ADJ" {:lemma "ent" :position "A" }{ :lemma "er" :position "E"} }
    	{:pos "ADJ"{:lemma "ent" :position "A" }{ :lemma "es" :position "E"} }
    	{:pos "ADJ"{:lemma "ent" :position "A" }{ :lemma "e" :position "E"} }
    	{:pos "ADJ"{:lemma "ver" :position "A" }{ :lemma "en" :position "E"} }
    	{:pos "ADJ"{:lemma "ver" :position "A" }{ :lemma "er" :position "E"}}
    	{:pos "ADJ"{:lemma "ver" :position "A" }{ :lemma "es" :position "E"} }
    ]
  )
)


(defn find-in-praefix
  [token]
  (doseq [item praefix_tags]
    (when (== (compare (get item :lemma ) token) 0)
      (print (get item :pos))
    )
  )
)


(defn find-in-suffix
  [token]
  (doseq [item suffix_tags]
    (when (== (compare (get item :lemma ) token) 0)
      (print (get item :pos))
    )
  )
)


(find-in-suffix "heit")
