;;NN
(def suffix_tags
  (set {
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
  })
)



  ;;V
(def circumfix_tags
  (set
    {
      ;; V
      {:pos "V" {:lemma "ver" :position "A"}{:lemma "en" :position "E"} }
      {:pos "V"{:lemma "be" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "V"{:lemma "be" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "V"{:lemma "an" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "V"{:lemma "an" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "V"{:lemma "ent" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "V"{:lemma "durch" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "V"{:lemma "auf" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "V"{:lemma "hinter" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "V"{:lemma "über" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "V"{:lemma "unter" :position "A" }{ :lemma "en" :position "E"} }
      {:pos "V"{:lemma "er":position "A" }{ :lemma "en" :position "E"} }

      ;; ADJ
      {:pos "ADJ"{:lemma "ent" :position "A" }{ :lemma "er" :position "E"} }
    	{:pos "ADJ"{:lemma "ent" :position "A" }{ :lemma "es" :position "E"} }
    	{:pos "ADJ"{:lemma "ent" :position "A" }{ :lemma "e" :position "E"} }
    	{:pos "ADJ"{:lemma "ver" :position "A" }{ :lemma "en" :position "E"} }
    	{:pos "ADJ"{:lemma "ver" :position "A" }{ :lemma "er" :position "E"} }
    	{:pos "ADJ"{:lemma "ver" :position "A" }{ :lemma "es" :position "E"} }
    }
  )
)
