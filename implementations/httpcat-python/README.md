# httpcat-py - Simple, stupid http.cat client made in Python

Show HTTP status code as cute images of cats (or dogs!), with colors!

## Experience summary

Well, that went as expected, I'm using Python for 8 years now at work.

I used `poetry` (it plays nicer with `nix` than `rye` unfortunately) to manage the project.
Then I used the `typer` library for CLI stuff, `httpx` as a HTTP client to do async calls, and `ascii-magic` for the image to ASCII stuff.

I wrote some tests using `pytest`, setup the format/lint with `ruff` and typecheck with `mypy` and that's it.

## Packages and versions

- Python 3.12.3

- For CLI parsing: `typer`
- For HTTP calls: `httpx`
- To convert an image to ASCII: `ascii-magic`

- To lint and format code: `ruff`
- To check types: `mypy`
- To run tests: `pytest`

## How-tos

### Build

```sh
$ pip install .
```

### Usage

```sh
$ httpcat-py 200
```

```
                                                                                                   
         "//"/""/""/""""""+^=///////"|)\"+///////////""""""""""|""""""////")\\\)""////////         
        .Itzo1j7[jeej7jLLLelr1?I![1tTypdES3Cwy256g4EdSgVVhggS6FFyffCJCypg4PYbXgfL7ooeat1?*`        
        .*znaL#o7LtujzLzuunL7o11teo7nJFpVbObbkAAU88$$8888$$8kYZGGZZGbYYZXgdS65fJ#TuLjz7o1{.        
        .}njjw#o#jLCjTLujtoLj7oo7jLuTC2phGYYkkkbYbZkbGGGbkAAkkkYkbP4gmF3ff2222yyfwCJ#TuLo*.        
        .}zao7[t7[jjojejt[e7zoo7jLuTJ3dbOAYPXXXVEXXP44Vh4XXXXZbZZGPdpn7zu5qm66FF52yfwC#Tj*.        
        .*{cii%%%%%%%%xcxxrssvc***??nPYbkZg2fCT3EXXdpwujLnnCpdg4gmmg46eI12VhgSqm6F523yfwn}.        
        `riv){}}?I![1[1tao77z7oacvx!4&kYdtv=>rFZ&AObEpT7{>)")}z65322phgyTy4dVhgSqm6F553y#}.        
        `ri>I1I1zzLn#J#TCfy225wI<>%CbYYYbmJn5VA$8&OkGggmwe?cx*eFpffff3qPg65V4VhgSqm6pF23CI.        
        `r>cti)!uunTTTIrs{{**Iov)\iJhVPk&U@HH&Z4gSgg66SGAOObXEh5CTT#CJCy52yyhgdhSqm6pF52wI.        
        `r<1s"xTCwfy33332323yft|)\>jp3S4h4bOk5Lj7e1?*z3g444dhS6y##JJ#####JJLTSPZGXgEh6F5wI.        
        `lre{s1zjLnuoo7zjLTJw3%"||)cww322hXPX6IsI*>x*1zJ3fJT##JCJJJ#T###TTTujj3ZkbZPdmF5fI.        
        .{]e7LLuTJwwJ###TTTTJo||)\<%Jyw2ghhm5yj*xl}1aaenffw#TJwwwCJJ#JJTT#Tj77jwdPPGZPdS2I.        
        .*[1ezjzuuTCy35p6mqS6c/"|\<v7p233fwnz[?{crI?]t7jLun#JCwJJwwwwCJT#TLz7zjLyd44PbYkP].        
        .*azLuTTJJCCf2F6qghdu||<iv%l*LfywJTL7[?{ccr}?tzjLu#JJCCwCJJJCCCJ#L777juT#5VXYGXEh!.        
        .*eLuLJy25p6mmSSghdh{))iiiv\|\lLywCJTLza!?!1toLuTTTT#####JJJJ#Tnj7oo7uT###ySg4dhg!.        
        .*7TCwf2p66mqSghd4gw))>\|\\|||"<[FywCJ##nunnT#JJ##TTnnnTT#JJ#nL7eoo7jnJCJTLJ64GGE!.        
        .{}lrrls}wmmqSVd4gEI<\|||\\||)|)jbd3wwCJJJCCCCJ#TTTTTTT#TTnuzeeooo7zjnCwCTuzn5dPd!.        
        .*e7zLLjjFSSgV4XGb5>\|||||))))|<ybd2wwwwCJJ#TTTTTnnnunnLj7eaeeeeo77jL#wffJTjzufgq?.        
        `sxllll{*}?17LTw3F]\<<\\\\\\\\)>fXh5wJJJJ#J#TujLuLjjzz7ooattaeeoo7zLT#CwJJTnnu#y3?.        
        .{?!???!!!!???IIsrllcx%%vvviiiicfEg5fC#TTTTTnLzz7zjz7oeetattae777jju##JJJCJJ####TI.        
        .ITJTnLjjoaatttte1![[!][!!]???I!Thg62fJTuLLjz7eaaaaeeat11ttteo77zjLT#######J##TunI.        
        .I3FFFFp6pF5ywCTne![ttaooeet]??o6PS6F2fJnLj7oettat1tt11111ttaeozjLnT######wwwJ##nI.        
        .?pghVhVhhhggghgq5w#TuoonTo))]eykAV3wy3w#uj7eat1111t1[[[[1ttaozjunTTT#####Cffw#Tj}.        
        `ss!tj#C2pgdEgf7ot[7ILI!7e]%ii)ok&bgfnn##nL7at[!][11[]]]][1teo7jLuuLLLLuuTJCwwwCu}.        
        `r^/|>ivls}!1!r}]r{tIez#32qEghweTEPh5#jot[1t1!II?!!?III???![1teeoooo77zjLn#JCCJJu?.        
         /^^^^^^^=====+////+/+|\<<<\\<><"|<}1s"+vc%++xlv+//+++//////////////"""""""||""""/         
                                          ^||g/ru'z*I7'Tr                                          
                                           .\c`fo tf5! u#                                          
                                          |7[*)=]/!="]"[^                                          
                                          .``` `/\"   `                                            
                                               :xlr'                                                                                                                                                  
```

```sh
$ httpcat-py 200 --dog
```

```
                                                                               +;';;: '",;^':^==;   
   "\<<>>)))>\)\\<\)|||)))|||||)\\\<>>>>>>>>>>>>><<<<<<>>>>))>)>>>>>))>>><>>))i%))ic>\<)>iv<>))>)   
  `5EY$HDD@&PqhgGGES2wypghgp55mVgZZbO&$KKKKKHHK@@@@@$UU@DDBBBBBBBBDBBBDK$KHBD$Gmg4dg2wJ#JCfFSggqf`  
  `54GYObghhq6gdPZPgVmF6h4EV65mVXZZGZO@DBBBDHK@KHDBDHK@KHDHK@KDDBBBWWBBDDDDH@&PSdEEVFfCnLTJCy23yf`  
  .qXVmF55352wJwpdGYkkYbPX4VSmmSVXbkO&$KHHK@U8&&UKHDDHHHKKK@$$@KKHDDBBBBDK@U88YXgXGPh2wTjjj7a[[1L`  
  .SZPEdgm2Fqq6fT#3mVXZbG4m66mmqdGO8UU$@K@@U&kbbkA8$@@@@$$@KKK@@@KK@KKHHHK$&YZX44gEqyy322yJTLe]Ie-  
  `pXZkOOYGXEdhqmSmFf3gPGggF5FpF6gEZk&@HDDDHKHHHHHHHHK@@U&A&&&&&$@@U8&A&8888&kkZXXgVS6ppF2wwJuo[o-  
  `fpmSdXZkObgq6VEEh5m4ZbPhyy6ghSp6hGUHKKK@@@@@@@KKHDDBBDH@@@@U8$KHK$kXVhVdEXGPdmmqS6yJnj77junLa7-  
  `3Fywy6gdddVSmF52fFdEXEhS6mdgg4gPO@$UUUU$U88UUU@@K@@KHDDH$&$D@8$KK$Y4qF25qEPGXh5fC#L7a1touT#njL`  
  `#TLjLJyyyy2FFmggqFy2FmEXXPPbYO@8AAOA8AYA8UU888U8AYZA8@BDKbgYBK8AOkG4gmF335666pywJnjoejJyyCnjez`  
  `wwLnujz7jLjjjwSEXh2CCphEVqVb8$ZgXkk&kV2dYA88&&88APm1I]TkDKbSGHBK8kGEgmF22yfyFqqFwjetaufffJLza7-  
  `Jf6dgd6pp3Tzez34bYGSy64PG4qG&bggYkPj)%rwGO&8&&8UUOEor%ILY$Ughk@HDKAbGPE44EEdghhq5Cu7oa7Tww#j1z`  
  `TyVPZPXYAOPm5w#3qhgFC#pXZk&bXEhdYXj|ir1gOA88UU$@KK@UkPZbk&&PSg8$8UH@U8AAAOkbEqF523wwfw2pm6fo*a-  
  `uyhgggFFmSVVPGX4m2Ju#w26EOPhhgVmVm3pdPZYO&ZVhSShXkUKK@$8&88bpgO8AAU@$AYYkkkbP4S55yCwfJnTJJL1{1-  
  `u3SVg5wjo7#6EbkbgqJ7toThYZdmq44SdgE4GbPYk#i<rrc>%7d8@@$88U8b5gk&GZZZOEEXXgdhgmF2yfCTuo]![tt]{1-  
  `#2pmm66FfTjwdPGE6y7]{sjGXXhF6E454PXgXgXkbo\=':;/vehk&8$8OOkG33bbgShgPXbYYbXEhmF23ffCTjt!III}Io-  
  `J36ShVhVd4hVYA&Y6L[}?tfmmSq23hhfmmdVdggXXmzv"++<%[y4ZY&AYkXE25Sg2VGbY&&&&kbGEhS6FyJnje1!}{*}Ie-  
  `CypF52JT5hXGGG4Swu7tum4mwJTLJ6g6#jpd6mm53Jz}lv>c%{72gXPywggmX8CZYdh4GOA&AYZP4gF2fCTL71!I}I!?Ie-  
  `TLTCy2532yJJJJT#CJutzw2hbXm#LzmAmjnwt[Lujts)/=;,^+<}jIcr6EdE&@$KK4L7LJphddhqp5fCCwJTuj777juujL`  
  `Leo7zLySh6J7eeozLjatee#gA8UUF#GkbqLju!)=+\>\<><)vs!zLvrFZgdG8$U@K&3zLT36SS65JuLLLLj77ozLTwyyw#`  
  `Loe}*?eu#Tn#Tj[}*{s{}IfGOA&AAAAAbgw77nt):={[[eztLf3F3ewXgdXk&&8$@@Ef56gdXGX46fn7ett111a7LJCJJJ`  
  -oI*r*?!aTwfyfJ7[?*{{Ie6PYkOOOOOkgm2Jz7Lz}\+?f5g6g4muaygdgEbAOO&U$KbywC5gEXgE4dS2#Lzatuw3yCTunJ`  
  -1r{[o7jwmhgyT32wzeao7fdXZYkOOkYGS5ff#zee7el>*Ly3yu*}m4q6hPYkkO&U$@&FwCwy22FmgSpfTLj77TyF3Tzt1z`  
  -t{I[tt1tL#LtCg4E3z]!!fEgGYkOkYGdF2fCCn7e1aLz*iixlILpFf5S4PbkkA88U$@Gg6yJ#ymVdgpyJ#njzjTJJj1}r1-  
  -o!]!}}}?]!?ILqgXgJ{>[dZPbkkkbGPq2yw#Tuj7a11teoo77uJCCfpVEPZYkA888U@O2njLu#yF5235qqF#o7u#T7?rlt-  
  -a*{r*1eo1!}{IeLTuzt1pZbGPGZZGX45ffwJTLz7ettozjjjjTw3yyFSdgGbkA&888$$VJf23ffww#nC5mm2TLooa!{lse-  
  -[xiil[7Le[]!111[1aeuVPX4dEXPEdg2fwCJTujze1oju#unJfFmq6pSdgPbYOA&&8U@Y66qm53yfJ#T#CyywTe?{cxl{o-  
  -eIri\isI][tozj7oetef4EgEdhSm2C52wwwJ#nLzeojT#wCw2pqhddddEEEPbkOOAA8$Xy32yCTujzoeeataeoe!{lxv%1-  
  -7[!l{7n7?*}?]]!!![7qPXXgEdS5Jtu5wJJJ#nL7o7u##JyFmmSgSSShV4XGbkAA&8@$6uL7t[[[]][at]?!]]?*slcx%1-  
  `!I}r]zuL}vv%%%%%xl!wF523fw#Le!]Luj777zz7eaojzoLTJJCwfwCfy5Fppp6mqgVmz!}sl{I??![t1]][[]?}**{{s?`  
   ...................        ............. ``   `    `                 .........................   
                                          .CS62)pmhz"q6Ve                                           
                                          `Ie8b1QfYHjQuU@-                                          
                                           !BGirQp&$eQfK8`                                          
                                          -7ue1:!uu%_1uui                                           
                                                                                                    
                                               ="\c%'                                               
                                               `,';'-                                                                                    
```

> Note: Colors are visible in the terminal if it's compatible.

## Source material

- https://http.cat
- https://http.dog