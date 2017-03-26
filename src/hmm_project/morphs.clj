(ns viterbi.lexicon)
(def lexicon
	(hash-map
		(apply str "über") (hash-map "VVPP" 0.012267357177536818 "NN" 0.0005068709168731696 "ADJD" 0.011575142285802184 "VVFIN" 0.01119718309859155 "TRUNC" 0.006546644844517185 "PTKVZ" 0.030977734753146177 "ADV" 0.02042116439568218 "PROP" 0.11936453413482181 "PWAV" 0.1232876712328767 "VVIZU" 0.0017301038062283738 "APPO" 0.18840579710144928 "APPR" 0.11697382057405488 "APPRART" 0.013228809407153356 "ADJA" 0.0030384362181597206 "VVINF" 0.0114681342091248)
		(apply str "vor") (hash-map "VVPP" 0.01369153584722447 "PTKVZ" 0.2536302032913843 "ADJD" 0.010652207352714967 "VVFIN" 0.009788732394366197 "TRUNC" 0.0016366612111292963 "NN" 0.001896072689044079 "XY" 0.125 "ADV" 0.022084586798796674 "NE" 0.0003278688524590164 "PROP" 0.017174753112924 "PWAV" 0.0136986301369863 "FM" 0.001607717041800643 "KOUS" 0.09254709254709255 "VVIZU" 0.03200692041522491 "APPR" 0.10088766728247646 "APPRART" 0.007839294463498285 "ADJA" 0.003939838962880438 "VVINF" 0.007207527072607847)
		(apply str "keit") (hash-map "NN" 0.020265450176466172 "ADJD" 0.00030764497769573913 "ADV" 0.00014156786409485046 "ADJA" 2.0256241454398136e-05 "TRUNC" 0.0032733224222585926)
		(apply str "eln") (hash-map "PIS" 0.0009013068949977468 "NN" 0.0031632499812270032 "ADJD" 0.0018074142439624672 "VVIZU" 0.010668973471741637 "VVFIN" 0.0062676056338028165 "NE" 0.000546448087431694 "ADJA" 0.002562414543981364 "VVINF" 0.012710811290608913)
		(apply str "ieren") (hash-map "VVPP" 3.236769703835572e-05 "NN" 0.0009480363445220395 "ADJD" 0.0016535917551145978 "VVIZU" 0.006055363321799308 "VVFIN" 0.016514084507042254 "CARD" 0.0013531799729364006 "NE" 0.0001092896174863388 "ADJA" 0.003078948701068517 "VVINF" 0.03781288833658796)
		(apply str "heiten") (hash-map "NN" 0.0013188030337163024 "ADJA" 1.0128120727199068e-05)
		(apply str "lich") (hash-map "VVPP" 0.0047256837675999355 "NN" 0.007063340091612225 "ADJD" 0.13882479618520227 "VVFIN" 0.0036619718309859155 "PIDAT" 0.034623217922606926 "TRUNC" 0.0016366612111292963 "ADV" 0.09998230401698814 "NE" 0.002568306010928962 "PIS" 0.00405588102748986 "VVIZU" 0.0005767012687427913 "PIAT" 0.013286440015631106 "APPR" 0.006037939890956608 "ADJA" 0.0445637311996759 "VVINF" 0.002485354162968223)
		(apply str "ge") (hash-map "VVPP" 0.4391972811134488 "NN" 0.10204062476533754 "ADV" 0.121182091665192 "VVFIN" 0.14556338028169014 "TRUNC" 0.0425531914893617 "XY" 0.125 "VMFIN" 0.015437392795883362 "NE" 0.07737704918032787 "APZR" 0.2857142857142857 "ITJ" 0.07142857142857142 "FM" 0.08681672025723473 "KOUS" 0.021294021294021293 "VVIMP" 0.2926829268292683 "PIAT" 0.24697147323173113 "VAPP" 0.28646748681898065 "VMPP" 1.0 "ADJA" 0.13626373626373625 "VVINF" 0.11230250310669271 "PIDAT" 0.05819028222286878 "PTKVZ" 0.03823814133591481 "ADJD" 0.113213351792032 "KON" 0.0005366135556839759 "PDAT" 0.01568951279933939 "PROP" 0.1592958351223701 "PWAV" 0.1232876712328767 "PIS" 0.12438035150968905 "VMINF" 0.002962962962962963 "VVIZU" 0.10697808535178778 "PPOSS" 0.16666666666666666 "APPR" 0.12476907132879737 "PDS" 0.13023255813953488 "APPO" 0.40942028985507245)
		(apply str "en") (hash-map "VVPP" 0.2666450882019744 "NN" 0.29396166554028685 "VMFIN" 0.9631217838765008 "VVFIN" 0.4859859154929577 "TRUNC" 0.29296235679214405 "PRELAT" 1.0 "PTKVZ" 0.12003872216844143 "XY" 0.25 "ADV" 0.18839143514422227 "NE" 0.30688524590163935 "APZR" 0.7142857142857143 "FM" 0.2829581993569132 "KOUS" 0.7411957411957412 "VVIMP" 0.21951219512195122 "PRELS" 0.9400544959128065 "PIAT" 0.3110590074247753 "VAPP" 0.6770650263620387 "CARD" 0.3721244925575101 "PPOSS" 0.3333333333333333 "ADJA" 0.33337722185648455 "VVINF" 0.563642819101722 "KON" 0.03331131841822835 "VAFIN" 0.5612463634971674 "ADJD" 0.16605137671127518 "PIDAT" 0.43584521384928715 "VAINF" 0.8251417769376181 "KOKOM" 1.0 "PWAT" 0.13881748071979436 "PDAT" 0.8340214698596201 "ART" 1.0 "PROP" 0.18505796479175612 "PWAV" 0.1232876712328767 "PPOSAT" 0.6778746367787464 "VMINF" 0.997037037037037 "VVIZU" 0.5135524798154556 "PPER" 0.43791946308724833 "APPR" 0.18960933627720453 "PWS" 0.4262295081967213 "PDS" 0.5782945736434109 "APPO" 0.19927536231884058 "PIS" 0.4465975664713835)
		(apply str "isch") (hash-map "VVPP" 0.0011652370933808059 "NN" 0.0041910715626642635 "ADJD" 0.05268420243039532 "VVFIN" 0.002852112676056338 "TRUNC" 0.006546644844517185 "PTKVZ" 0.001936108422071636 "ADV" 0.01082994160325606 "NE" 0.006721311475409836 "PROP" 0.0072992700729927005 "VVIZU" 0.0028835063437139563 "APPR" 0.03793989095660794 "ADJA" 0.09712867777383906 "VVINF" 0.0004970708325936446)
		(apply str "haft") (hash-map "VVPP" 0.0023628418837999677 "NN" 0.013192723586393331 "ADJD" 0.008306414397784956 "VVFIN" 0.0003873239436619718 "TRUNC" 0.029459901800327332 "PTKVZ" 0.000484027105517909 "NE" 0.0004918032786885246 "ADV" 0.0002123517961422757 "ADJA" 0.005165341570871525 "VVINF" 0.0004260607136516954)
		(apply str "mäßig") (hash-map "NN" 0.0001783434707516708 "ADJD" 0.0051145977541916625 "ADJA" 0.0006279434850863422 "TRUNC" 0.0016366612111292963)
		(apply str "ern") (hash-map "VVPP" 0.01482440524356692 "NN" 0.04488623563865735 "ADJD" 0.02768804799261652 "VVFIN" 0.03669014084507042 "KON" 0.06934698258069842 "VAINF" 0.000630119722747322 "TRUNC" 0.02618657937806874 "ADV" 0.07694213413555123 "NE" 0.054754098360655735 "PROP" 0.0034349506225848005 "VAFIN" 0.0001531159087429184 "FM" 0.01607717041800643 "KOUS" 0.016926016926016925 "VVIZU" 0.031141868512110725 "VVIMP" 0.04878048780487805 "APPRART" 0.002939735423811857 "PTKVZ" 0.002904162633107454 "ADJA" 0.019506760520585406 "VVINF" 0.06745961299485177 "PIS" 0.0009013068949977468)
		(apply str "erich") (hash-map "VVPP" 0.003819388250525975 "NN" 0.004646316738004055 "ADJD" 0.001192124288570989 "VVFIN" 0.005880281690140845 "NE" 0.000546448087431694 "ADJA" 0.0005165341570871524 "VVINF" 0.0009941416651872892)
		(apply str "inner") (hash-map "VVPP" 0.0002589415763068458 "NN" 0.0005538034091762409 "ADJD" 0.00042301184433164127 "VVFIN" 0.004577464788732394 "FM" 0.008038585209003215 "APPR" 0.007299598972649033 "VVIMP" 0.024390243902439025 "ADJA" 0.0008507621410847217 "VVINF" 0.00138469731936801 "NE" 0.000273224043715847)
		(apply str "sam") (hash-map "VVPP" 0.004984625343906781 "PTKVZ" 0.05808325266214908 "ADJD" 0.014651592062759575 "VVFIN" 0.004119718309859155 "TRUNC" 0.004909983633387889 "NN" 0.0042192310580461065 "ADV" 0.012670323836489117 "NE" 0.0018579234972677596 "FM" 0.001607717041800643 "VVIZU" 0.010668973471741637 "APPR" 0.001441896093362772 "ADJA" 0.005155213450144326 "VVINF" 0.0026273744008521215)
		(apply str "außer") (hash-map "KOUS" 0.001365001365001365 "KON" 4.12779658218443e-05 "APPR" 0.006578650925967647 "ADV" 0.0003893116262608388 "ADJA" 0.0004051248290879627 "ADJD" 0.0007691124442393477 "PROP" 0.029626449119793903)
		(apply str "ab") (hash-map "VVPP" 0.024728920537303772 "NN" 0.00999662086055418 "ADJD" 0.011536686663590217 "VVIZU" 0.056228373702422146 "VVFIN" 0.0277112676056338 "KON" 0.037934450590274914 "VAINF" 0.17422810333963454 "PTKVZ" 0.18731848983543078 "ADV" 0.052557069545213234 "NE" 0.03218579234972677 "PROP" 0.24345212537569771 "VAFIN" 0.2506507426121574 "FM" 0.03215434083601286 "TRUNC" 0.01309328968903437 "VVIMP" 0.024390243902439025 "VAIMP" 1.0 "VAPP" 0.03602811950790861 "APPR" 0.005767584373451088 "ADJA" 0.007008659543221755 "VVINF" 0.012355760695899165)
		(apply str "chen") (hash-map "VVPP" 0.014015212817608027 "NN" 0.017449500638281896 "ADJD" 0.010652207352714967 "PDAT" 0.0008257638315441783 "VVFIN" 0.02795774647887324 "PIDAT" 0.044515565900494616 "TRUNC" 0.01800327332242226 "PWAT" 0.12596401028277635 "ADV" 0.010086710316758096 "NE" 0.014808743169398907 "PROP" 0.0072992700729927005 "PIS" 0.041910770617395225 "PWS" 0.03278688524590164 "VVIZU" 0.027393310265282585 "APPO" 0.0036231884057971015 "PIAT" 0.016803438843298164 "APPR" 0.03821024647411346 "PTKVZ" 0.001936108422071636 "ADJA" 0.08283789942776118 "VVINF" 0.043032132078821235)
		(apply str "tum") (hash-map "VVPP" 0.0001294707881534229 "NN" 0.0013234962829466097 "ADJD" 0.0006152899553914783 "VVFIN" 0.0006690140845070422 "TRUNC" 0.0032733224222585926 "FM" 0.00482315112540193 "NE" 0.0009289617486338798 "ADJA" 0.0002835873803615739 "ITJ" 0.07142857142857142 "VVINF" 7.101011894194923e-05)
		(apply str "ling") (hash-map "VVPP" 6.473539407671144e-05 "NN" 0.0029051212735601113 "ADJD" 3.845562221196739e-05 "VVFIN" 0.004471830985915493 "TRUNC" 0.0016366612111292963 "FM" 0.014469453376205787 "ADJA" 0.00018230617308958322 "ADV" 3.5391966023712616e-05 "NE" 0.0060655737704918035 "ITJ" 0.14285714285714285 "VVINF" 0.0012426770814841115)
		(apply str "rig") (hash-map "VVPP" 0.0005178831526136916 "NN" 0.0024686490951415486 "ADJD" 0.008806337486540533 "VVFIN" 0.0005985915492957747 "PPOSS" 0.16666666666666666 "PTKVZ" 0.014036786060019362 "NE" 0.0037704918032786887 "ADV" 0.0029021412139444347 "ADJA" 0.009257102344659948 "FM" 0.00482315112540193 "VVINF" 0.0005325758920646192)
		(apply str "los") (hash-map "VVPP" 0.009386632141123159 "NN" 0.001999324172110836 "ADJD" 0.02018920166128288 "VVFIN" 0.0013028169014084507 "TRUNC" 0.0032733224222585926 "PTKVZ" 0.02032913843175218 "ADV" 0.00017695983011856308 "NE" 0.004808743169398907 "FM" 0.012861736334405145 "VVIZU" 0.0031718569780853517 "ADJA" 0.004881754190509951 "VVINF" 0.0009586366057163146)
		(apply str "unter") (hash-map "VVPP" 0.010033986081890274 "NN" 0.0009057971014492754 "ADJD" 0.00338409475465313 "VVFIN" 0.008697183098591549 "TRUNC" 0.0032733224222585926 "PTKVZ" 0.018393030009680542 "ADV" 0.004282427888869227 "NE" 0.0003825136612021858 "PROP" 0.0420781451266638 "PWAV" 0.0136986301369863 "VVIZU" 0.004901960784313725 "APPR" 0.053800747983598435 "APPRART" 0.008329250367466928 "ADJA" 0.0021269053527118043 "VVINF" 0.006071365169536659)
		(apply str "tümer") (hash-map "NN" 0.00024874220920627767)
		(apply str "ler") (hash-map "VVPP" 0.001844958731186276 "NN" 0.011559472854246453 "ADJD" 0.0065374557760344565 "VVFIN" 0.0019014084507042253 "PIDAT" 0.09310445155659004 "TRUNC" 0.006546644844517185 "ADV" 0.0227216421872235 "NE" 0.04349726775956284 "PIS" 0.0067598017124831005 "FM" 0.006430868167202572 "VVIZU" 0.0002883506343713956 "PIAT" 0.012504884720593983 "ADJA" 0.006350331695953816 "VVINF" 0.002591869341381147)
		(apply str "ung") (hash-map "VVPP" 0.004822786858715003 "NN" 0.10947942479537433 "ADJD" 0.014267035840639902 "VVFIN" 0.00045774647887323943 "KON" 0.0013208949062990176 "TRUNC" 0.1276595744680851 "XY" 0.125 "ADV" 0.0020527340293753317 "NE" 0.004426229508196721 "FM" 0.011254019292604502 "APPO" 0.010869565217391304 "APPR" 0.00045059252917586625 "ADJA" 0.007778396718488885 "VVINF" 0.0003195455352387715)
		(apply str "nisse") (hash-map "NN" 0.0023184651197717203)
		(apply str "un") (hash-map "VVPP" 0.02851594109079139 "NN" 0.14098520687842608 "VVFIN" 0.01612676056338028 "PTKVZ" 0.026137463697967087 "XY" 0.25 "ADV" 0.0653689612457972 "NE" 0.04562841530054645 "ITJ" 0.07142857142857142 "FM" 0.1045016077170418 "VVIMP" 0.024390243902439025 "KOUI" 1.0 "CARD" 0.2665764546684709 "ADJA" 0.027983997569251025 "VVINF" 0.016793893129770993 "TRUNC" 0.18003273322422259 "ADJD" 0.07110444546992771 "PIS" 0.0027039206849932404 "KON" 0.8570131263931313 "PROP" 0.0420781451266638 "PWAV" 0.0136986301369863 "PPOSAT" 0.30303030303030304 "VVIZU" 0.03835063437139562 "PPER" 0.5620805369127517 "APPR" 0.06101022845041229 "APPRART" 0.008329250367466928 "APPO" 0.010869565217391304 "PRF" 1.0)
		(apply str "heit") (hash-map "VVPP" 0.001974429519339699 "NN" 0.010780393482015468 "ADJD" 0.0014613136440547608 "VVFIN" 0.0015845070422535212 "TRUNC" 0.01309328968903437 "NE" 0.0001092896174863388 "ADV" 0.00014156786409485046 "ADJA" 0.0009014027447207171 "FM" 0.001607717041800643 "VVINF" 0.0005680809515355938)
		(apply str "igen") (hash-map "NN" 0.0032805812119846814 "ADJD" 0.0034994616212890325 "ADV" 0.01461688196779331 "VVFIN" 0.007112676056338028 "PIDAT" 0.030258946755891768 "TRUNC" 0.0016366612111292963 "PDAT" 0.01486374896779521 "NE" 0.0006557377049180328 "PIS" 0.013970256872465074 "VVIZU" 0.006343713956170703 "PPOSS" 0.16666666666666666 "PIAT" 0.04689331770222743 "ADJA" 0.03165037727249709 "PDS" 0.09767441860465116 "VVINF" 0.016261317237706373)
		(apply str "erz") (hash-map "VVPP" 0.004531477585369801 "NN" 0.0027784035443418186 "ADJD" 0.0053068758652515 "VVFIN" 0.0101056338028169 "TRUNC" 0.0016366612111292963 "ADV" 0.009838966554592108 "NE" 0.005081967213114754 "PROP" 0.0021468441391155 "VVIZU" 0.026816608996539794 "VVIMP" 0.024390243902439025 "CARD" 0.05277401894451962 "ADJA" 0.0024104927330733782 "VVINF" 0.00553878927747204)
		(apply str "ober") (hash-map "VVPP" 0.00019420618223013432 "NN" 0.0011592325598858602 "ADJD" 0.00030764497769573913 "VVFIN" 0.0005633802816901409 "PWAV" 0.0136986301369863 "APPR" 9.011850583517325e-05 "ADJA" 0.0006785840887223376 "NE" 0.003825136612021858 "VVINF" 0.0003550505947097461)
		(apply str "erlei") (hash-map "PIS" 0.002253267237494367 "NN" 0.0003566869415033416 "ADJD" 0.00023073373327180433 "VVIZU" 0.0002883506343713956 "VVFIN" 0.001056338028169014 "PIAT" 0.03360687768659633 "ADJA" 2.0256241454398136e-05 "VVPP" 0.00029130927334520147 "ADV" 3.5391966023712616e-05 "NE" 0.0001092896174863388 "VVINF" 0.0004970708325936446)
		(apply str "isieren") (hash-map "NN" 9.386498460614252e-06 "ADJD" 0.00011536686663590217 "VVIZU" 0.0011534025374855825 "VVFIN" 0.0010915492957746479 "ADJA" 0.0001924342938167823 "VVINF" 0.003515000887626487)
		(apply str "bar") (hash-map "VVPP" 0.0008739278200356045 "NN" 0.00200871067057145 "ADJD" 0.02226580526072912 "VVFIN" 0.0009507042253521126 "TRUNC" 0.0016366612111292963 "FM" 0.003215434083601286 "ADJA" 0.004101888894515623 "ADV" 0.007538488763050788 "NE" 0.004699453551912569 "VVINF" 0.0002485354162968223)
		(apply str "miss") (hash-map "VVPP" 0.00038841236446026864 "NN" 0.0015534654952316588 "ADJD" 0.00019227811105983694 "VVFIN" 0.00017605633802816902 "FM" 0.011254019292604502 "NE" 5.46448087431694e-05 "ADJA" 7.089684509039348e-05 "VVINF" 0.0002130303568258477)
		(apply str "ig") (hash-map "VVPP" 0.02722123320925716 "NN" 0.023381767665390102 "ADJD" 0.15013074911552068 "ADV" 0.03659529286851885 "VVFIN" 0.044753521126760565 "KON" 0.0004953355898621316 "TRUNC" 0.027823240589198037 "PDAT" 0.01568951279933939 "NE" 0.03633879781420765 "PIS" 0.170797656602073 "FM" 0.09807073954983923 "VVIZU" 0.008938869665513265 "VVIMP" 0.07317073170731707 "PPOSS" 0.16666666666666666 "PIAT" 0.22196170379054317 "CARD" 0.2354533152909337 "PTKVZ" 0.015004840271055178 "ADJA" 0.06998531422494556 "PDS" 0.13023255813953488 "VVINF" 0.018356115746493876 "PIDAT" 0.06400931044515566)
		(apply str "zwischen") (hash-map "VVPP" 9.710309111506716e-05 "PTKVZ" 0.001936108422071636 "VVIZU" 0.0002883506343713956 "VVFIN" 0.00010563380281690141 "NN" 4.693249230307126e-06 "APPR" 0.03555175055197585 "ADV" 0.009626614758449831 "ADJA" 2.0256241454398136e-05 "PROP" 0.0072992700729927005)
		(apply str "gang") (hash-map "VVPP" 0.006538274801747856 "NN" 0.002642299316662912 "ADJD" 0.00034610059990770653 "TRUNC" 0.0016366612111292963 "ADJA" 0.003717020306882058 "ADV" 0.00014156786409485046 "NE" 0.00726775956284153)
		(apply str "gänge") (hash-map "NN" 0.000891717353758354 "ADJA" 3.0384362181597206e-05 "VVINF" 3.550505947097461e-05 "TRUNC" 0.0016366612111292963)
		(apply str "schaften") (hash-map "VVFIN" 3.5211267605633805e-05 "NN" 0.0014689870090861304 "NE" 0.0001092896174863388 "VVINF" 0.00014202023788389845)
		(apply str "schaft") (hash-map "VVPP" 0.0002589415763068458 "NN" 0.012676466171059548 "ADJD" 0.0023073373327180432 "VVFIN" 0.0002464788732394366 "TRUNC" 0.027823240589198037 "NE" 0.0004371584699453552 "ADJA" 0.003413176685066086 "VVINF" 0.00014202023788389845)
		(apply str "binnen") (hash-map "APPR" 0.0009011850583517325 "NN" 4.693249230307126e-06 "ADJA" 1.0128120727199068e-05)
		(apply str "keiten") (hash-map "NN" 0.0019242321844259217)
		(apply str "erchen") (hash-map "NN" 0.00019242321844259216)
		(apply str "fach") (hash-map "VVPP" 0.0004855154555753358 "NN" 0.0002862882030487347 "ADJD" 0.005652976465159206 "VVFIN" 0.00028169014084507044 "FM" 0.001607717041800643 "ADV" 0.008741815607857016 "ADJA" 0.0012862713323542818 "VVINF" 0.0002130303568258477)
		(apply str "wider") (hash-map "VVPP" 0.00035604466742191295 "NN" 6.101223999399264e-05 "ADJD" 0.0008075680664513152 "VVFIN" 0.002112676056338028 "PTKVZ" 0.00484027105517909 "APPR" 0.0004956517820934529 "ADV" 7.078393204742523e-05 "ADJA" 0.0002532030181799767 "VVINF" 0.0005680809515355938)
		(apply str "grund") (hash-map "VVPP" 6.473539407671144e-05 "NN" 0.0008447848614552828 "ADJD" 0.001999692355022304 "VVFIN" 3.5211267605633805e-05 "PTKVZ" 0.004356243949661181 "APPR" 0.0052268733384400485 "ADV" 0.0007786232525216776 "ADJA" 0.0006887122094495367)
		(apply str "ungen") (hash-map "VVPP" 0.004466742191293089 "NN" 0.019589622287301944 "ADJD" 0.0006922011998154131 "NE" 0.0001639344262295082 "ADV" 0.00010617589807113785 "ADJA" 0.0017217805236238416)
		(apply str "ur") (hash-map "VVPP" 0.014241786696876518 "NN" 0.022663700533153114 "ADV" 0.11261723588745355 "VVFIN" 0.010950704225352112 "PTKVZ" 0.16505324298160698 "VMFIN" 0.02144082332761578 "NE" 0.09251366120218579 "ITJ" 0.21428571428571427 "FM" 0.16720257234726688 "VAPP" 0.0004393673110720562 "ADJA" 0.016113840076973716 "VVINF" 0.010118941949227765 "TRUNC" 0.03764320785597381 "ADJD" 0.021035225349946163 "PTKZU" 1.0 "PROP" 0.0446543580936024 "PWAV" 0.0547945205479452 "VAFIN" 0.18794977798193233 "VVIZU" 0.05132641291810842 "APPR" 0.07155409363312756 "APPRART" 0.9593336599706026 "PPOSAT" 0.0186799501867995 "APPO" 0.0036231884057971015)
		(apply str "el") (hash-map "VVPP" 0.07480174785564007 "NN" 0.06731527371029511 "VVFIN" 0.09119718309859155 "PTKVZ" 0.000968054211035818 "XY" 0.125 "ADV" 0.06228986020173421 "NE" 0.18475409836065573 "ITJ" 0.42857142857142855 "FM" 0.11254019292604502 "KOUS" 0.000546000546000546 "VVIMP" 0.24390243902439024 "PRELS" 0.05994550408719346 "PIAT" 0.08675263774912075 "CARD" 0.07171853856562922 "ADJA" 0.03597508482301109 "VVINF" 0.03415586721107758 "TRUNC" 0.09819967266775777 "ADJD" 0.07168127980310722 "PIDAT" 0.15216758801280186 "PWAT" 0.7352185089974294 "PDAT" 0.11890999174236168 "PIS" 0.1793600721045516 "VVIZU" 0.04411764705882353 "APPR" 0.0022079033929617445 "PWS" 0.5409836065573771 "PPOSAT" 0.00041511000415110004 "PDS" 0.06356589147286822)
		(apply str "aller") (hash-map "PIS" 0.005407841369986481 "NN" 0.0001595704738304423 "ADJD" 0.00023073373327180433 "VVFIN" 3.5211267605633805e-05 "PIDAT" 0.08728542333430317 "PIAT" 0.01016021883548261 "NE" 0.0017486338797814208 "ADV" 0.0154308971863387 "ADJA" 0.00034435610472476833 "VVINF" 7.101011894194923e-05)
		(apply str "nis") (hash-map "VVPP" 0.001974429519339699 "NN" 0.016205789592250507 "ADJD" 0.006998923242578065 "VVFIN" 0.0011619718309859154 "TRUNC" 0.006546644844517185 "ADV" 0.00035391966023712616 "NE" 0.006174863387978142 "FM" 0.00482315112540193 "VVIZU" 0.0002883506343713956 "VVIMP" 0.024390243902439025 "ADJA" 0.019962525953309364 "VVINF" 0.0007456062488904669)
		(apply str "nach") (hash-map "VVPP" 0.0025894157630684577 "NN" 0.0007227603814672974 "ADJD" 0.002076603599446239 "VVFIN" 0.0017253521126760563 "PTKVZ" 0.03339787028073572 "ADV" 0.006795257476552822 "NE" 5.46448087431694e-05 "PROP" 0.0897380850150279 "PWAV" 0.5205479452054794 "KOUS" 0.12612612612612611 "VVIZU" 0.01384083044982699 "APPO" 0.17391304347826086 "APPR" 0.13319515162438605 "ADJA" 0.001022940193447106 "VVINF" 0.0026983845197940705)
		(apply str "land") (hash-map "VVPP" 0.0006149862437287587 "NN" 0.0023653976120747914 "ADJD" 0.0006152899553914783 "VVFIN" 0.0013380281690140844 "TRUNC" 0.006546644844517185 "ADJA" 0.0005266622778143515 "ADV" 0.0008494071845691028 "NE" 0.046939890710382515 "FM" 0.011254019292604502 "VVINF" 0.0005680809515355938)
	)
 )