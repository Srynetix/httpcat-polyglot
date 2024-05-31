# httpcat-go - Simple, stupid http.cat client made in Go

Show HTTP status code as cute images of cats (or dogs!), with colors!

## Prerequisites

- nix
- nix-direnv
- devenv
- ...or just a recent version of Go.

## Build

```sh
go build
```

## Usage

```sh
$ httpcat 200
```

```
         ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,..,,,,,,,,,,,,,,,         
         ii11i11i11i1111111::ii;iiii1ffCCf111tttttfffffffffffffffttttt11tfLCGGGCf11111iiii;         
         ;1t11t1it11t1ttttt1i1iiiiiitfLLC00CCCGG0008800000000GGCCLLLLLCG00800GCfttt111111i;         
         ;1t1tt11tit11t1ttttt11i1111ttfLLCG0G00000G0000000000GGGG000000GCCLLfffftttttt111i;         
         ;tt1tt1t11t11t1ti1t1111111tttfLLCGGGGGGGGGG0GGGGG00000GGGGGCCLLffffffffffftttttt1;         
         ;t1tft1fttftfttt111t111ttttttfCG000GG0GCGGGGCGGGG00GG000GGCLfttttfLLLLfffffftttt1;         
         ;1ii;;;i;iiiiiii;i11ii1111ttfC000GCCCLLLCCGCCLLfLLLCCCGGGGGGL111tLLLLLLLLffffftt1;         
         ;;;::;:::::::::;;;;;::;;;iiiC0GG0GLffttLCGCLft11tttfCGCCLLLCGfii1LCCCLLLLLfffffft;         
         ;:;:;;;iiiiiiiiii111111i:;;t00GGfi,,:1LG00GCLt11;::,;tLLffffLCf11LCCCCLLLLLLfffft;         
         ;:::111111tttfffffffLft;::iG00GGt;,,;t800000GCL1:,,.,,iLfffffLGGCLCCCCCLLLLLLLfft;         
         ;::i1;itttttfttffffLLL1:::1GGGG0GCCG0000000GGCLCLt1ii1fLffffffLCCffCCCCLLLLLLLfft;         
         ;::1:,;tttttti:::::;;ii,,:iCCGG0088880GCCCCCLLC00000GGLftttttttffffLCCCCLLLLLLfft;         
         ;,i1,,tffffffttttt111t;,,,1CfLGGG000GLft111i1LCGGGGGGCLfttttttttttf1fGCCCCCLLLfft;         
         ;:1;,;ttffffLLLLCCCCCt,,,,;fffCLfCG0Cii11i;;;1fLLLLfffffttttttttttt1tfG00GGGCLLLf;         
         ;;1;;111ttt1iiii11ttfi,,,,,1ffffLGGCGt:;i:,;i1tffftttttttttttttttttt11fGGGGGCLLLf;         
         ;i1ttttttfftttt11111t:,,:::1ftfLCCCLLfi;:;ii111fffftttffftttttttttt111tLGGGGGCLLt;         
         ;i111tttfffLLLLLLLLCt,:::,:iLffLfLft11i;;ii1111ttttttttttfftttttttt1111tLCCGG0GGC;         
         ;i11tt1ttttffLLLCCCCi,,,:::iLLffftt1ii;;:;;;i111ttttttfttttffftttt11111tfCCCGGG0G;         
         ;1tttttffffffLLLCCCL:,::;:;i1fffftt11ii;;;;ii111ttttttttttttttttt11111tttLCGGGGGC;         
         ;itttfffLLLLLLCCCCGt,::::;;::;tffftt11ii;;iii11ttttttttttttttttt11111ttttfLCGGCLL;         
         ;tftttfLLLLLCCCCCCCi,::::::::,;tffftttt111111tttttttttttttttttt111111ttttttLCCCGC;         
         ;1ffLLLLLLLCCCCCCGL:::::::::::,:fLfftttttttttttttttttttttttttt1111111tffttttLGGGC;         
         ;::::;iitLLCCCCCCGt::::::::::::;CGLfftttttfffttttttttttttttt111111111tffttt1tLGGC;         
         ;ftt1i;:tCLLCCCGGGi::::::::::::iGGLfffffftttttttttttttttt111111111111tffftt11tLGL;         
         ;;i1tffLLCCCCGGG0C;::::::::::::1GCLftffftttttttttttttt1111ii11111111ttffftt11tfLL;         
         ;;;:::::;;i11tffCt:;;::::::::::1GCLfttttttttt11tt111111111i11111111tttfftttttttff;         
         ;i1iii1iiiiii;;;:::::::;;;;;;;;1CCLffttttttttt111111111111iii111111tttttffttttttt;         
         ;11iiii1111111111iiii;i;;;;;;;;1CCLfftttttttt111111111iiiii1111111ttttttttttttttt;         
         ;fLfffftt11111111ii1i11111111ii1LCLLfftttt1111i1iii11iiiiii1111111ttttttttttttttt;         
         ;fLLLLLLLLLffftt1ii11i1111111i1tGCLLffttt11111i11iiiiiiiiiii11111tttttttttffftttt;         
         ;LCCLLLLLLLLLLCCLtt1ttfffti;;;iC0CffLfftt11111iiiiiiiiiiiiii1111ttttttttttffffttt;         
         ;fCCCCGGGGCCCCCLLLfft1i1tt:,iffG0GLttffft1111iiiiiiiiiiiiiii1111ttttttttttfffftt1;         
         ;:ii1ttfLCCG0L11ii1;1ii11i;,,.:C0GCLt1tttt11iiiiiiiiiiiiiiii11111t111111tttttffft;         
         ;.,,:::;ii111;;1i:ti1ttfffGGGfi1G0GCLt1111111iiiiiiiiiiiiiiii1111111111ttttffffft;         
         ;,,,,::::::;::;;;;;i;itffffffLfi1ft1iii;;;;i;;;;;;;;;;;;;;;;;iiiiiiiiiiii1111111i;         
          .............. .   .             :11. .;;, .;;. ........ .                                
                                          .;,tL L:,L.L,,L                                           
                                             i;,0  G1G  0,                                          
                                           .;: .G..G:G .G.                                          
                                          .tt11 ;;;; ;;;;                                           
                                                 .                                                  
                                                ;it;                                                
                                                .,,.                                                
```

```sh
$ httpcat 200 --dog
```

```
                                                                              .,..... .,.....,,,.   
                                                                               ....,. .,.,,......   
   1ttffLLLLf1i11111iiiiiiiiiii111ttffffffffLfffffffffffLLLLLLLLLLLLLLLffffLLLLt1111iiiiiiiiiiiii   
   fLG88880GLttfffft1i11ttt111tfLLLLCG08888888000888800888@@88@88888@@88088880LtfLff11111111ttttt   
   ffCCCCfttttttfffftt11tttt111tfLLLLC00088000G00088000000000000888888880000GGLtffff11iiiiii1111t   
   fLtt111111ii1tffLLfffffftt1tttfLLCC00880000GG008880000000000008888888800000GLLLLLf11iiiii;;;;1   
   fLtt111i1111ii1tffLLLLftttt1ttLCGGGG0000GGGCLCGG00000000000000000888800GGCCftfLLf111111iii;;;1   
   fLLLLLfttttt1iii11tfLft111111tLCCGGG000000GGGGGG000GGGG00000000000000000GGCLLLLft11ttttt11i;;i   
   fLLCCCCLLfttttfft11tLLLf1111111tLLCG088888888888888000GGGGGGG0000GGGGGGGGGCCLLLLfftttttt11ii;i   
   ttttffLCCLft1fLLf11fLCCf111ttt11tfG8888888888888888888800000GG0000GLffLfLLLLfttfftt1iiiiiiii;i   
   tt111ttfLLft11tt11ftffft11fLffttL088000000000088888888880880000800Cftt1tfLLLLf1111i;;;;;iiii;1   
   t1iii11111ttt11111ttftfLfffLLLG88000000000000000000088880GC88GG00GCffttttfLLff11iii;;;;iiiiii1   
   1iiiiiii11111tfft1ii1tfLLLLCG08GG0G00GCG00000000GGCGG08880fC880GCCCLftt111111111iii;;i1111ii;1   
   t1iii;;;;;;;;1tfft1i1tfLftfC00GLCGG00CfCG00000000GLi;;10880LC8880GLLft111111tfft1i;;;i111iii;i   
   t11fff111i;;;i1fLCLt1fLLLf1C0GLLGGGf;;ifG00000000GL;:,:1000CL08880CLLfffffLffffftii;;;;iiiii;1   
   11tLLLLCCCf1iiitLLLf1ifCCCG0GCLC0Gf. ,:fGG000000000GLfLLG00GLG00088GGCCCCCCCftttt111111tft1i;i   
   11tfftfLCCCftt111111ii1fLG0CCCCLGLi;11fGG000000088888000000GLC000G880GGGG0GGCfttt111ttffffti;i   
   11tfft111tffLCCLftiii1ttL0CLLCCLLfLCG0GGG0GLLffLCG088000000GLLG0G0000CCCCGGCCLftt11111i111i;:i   
   11ttt1i;;;itLCGCLf1;;i1fGGCLLCCLCCCLGGCG0f::;;;::1C08000000GfLG0GGGGGLLCCLffttt1111iii;;;ii;:i   
   11tt1111i;i1fLLft1i;::iGGCCfLCCLCGCCGCCGGi.....,,iC00000G00GffGGLLLCCLCCCCfftt111111ii;;;;;;;1   
   t1ttffffft11LCCLt1;:::1CCCLffCCfCCCCLCCGGfi:...,;tLG00000GCGftGCffLLLCGGGCLLffttt111iii;;:;;;1   
   t1tffftffLLLCGGCti;:;itfffLftLLfffLLCCCCCLt::,,::itCCG0GCGCCfLfLfLCLCGGGGCCLLfftt1iii;;;;:;;;i   
   t1tt11iitfLCCCLf1ii;1fLfttt1tLLL11fCfffttt1i;;:;;;1fLCGttCCfG81GGffLLCGGGLLLfftt11iii;;;;;;;:i   
   1i11111111111111111;itfLGCti1tL0fitt;itt1i;:,,...,,;t1;:fCLC08088L1i1tffffttttt111111iiiiiiii1   
   1;ii11tffti;;ii111i;ii1L0000t;C0Gfi11:::::,..,,.,,:ii,:tCCLC00088G1ii;1ttttt1111111iii1111tt1t   
   1i;;;;1fft1ii;;;i;;;iitG0000CC0GGL1i1i,. .;;;;;;i1tfL;iCGCLG000080f1tfffLLft1iiiiiiiiii11ttttt   
   1;;:::;iiii111;:::::::tG00000000GLtii11:..;11tttfLLLf1fCLLCG000008CttffLLCCLt1ii;;;;iiii11t11t   
   i:::::;;i11tt1i;::::;ifGG0000000Cfftii11;,.1ffCLLCCfitCLLLGGGG0008Gt111fLLLfftt11iiii1tftt111t   
  .i::;iii1ffft1ttiii;iitCGGG0000GGLftt1iii1i,.tCGGGC1:fCLfLCGGGG000801iii1tt1tttt11iiiitfff11ii1   
  .i::;iii1tft1tfff1ii1itCCGGG00GGCffttt1iii1ti,,;;;::tCLffLCGGGG00000Lftt11tfffft11iiii11tt1i;;i   
   i::;;;;:;i;;tLCCf1;:;fCCGG000GGLffttt11ii;i1i;:;;1fft1fLCCGGG000008Cfft11tfLLffttt1iii1111i;:i   
   1;;;:::;;;;:ifCCL1:,iCGGGGGGGGGLtttt111iiiiiiii1111tttfLCCGGGG000080t1i111tfttttfff1ii1t1i;::1   
   i::::;;;;;:::i1t1ii;fGGGGGGGGGCftttt11iiiiiii11111ttttfLCCGGG0000008L1ttttttt1i1tfft1111ii;::1   
   i:,,:ii1i;;:;;;;iiiiLGGCCGGGGCLftttt111iiiii11111tfffffLLCGGG0000008GffLffttt1111tftt1i;;:::;1   
  .i:,,,;iii;;iiiiiiii1CCCCLCCCLLLftttt1111ii111t1ttffLLLLLCCCGGG000008Gffffftt1111111111i;:::::i   
   1;:,,,::;;iii1iiiiifCCCCCLLff1fftttt1111i111ttttffLLCCCCCCCCGG0G0000C1ttt11iiiiiii;iiii;;::::i   
   1;;::i1i;;;;;;;;;;ifCCCCCLLfti1ft11111iiii1111tffffLfffLLLCCGGGGGG00f11i;;;;;;;i;;;;;;;;:::::i   
   1ii;1tfti::::::::;iLGGCCCLLft11ffttttttt11ttttffLLLLCCLCCGGGGGGG0080t1i;;;iiii111iii1iii;;;;;1   
   ,,,,,,,,,,,,,,,,,,,:::::::,,,,,,:,,,,,,,,,,,,,,,:::,,:,,::::::::::::,,,,,,,,,,,,,,,,,,,,,,,,,,   
                                            ..   .    .                                             
                                           C0CC:GG0f,0G0f                                           
                                           tiG@1@tG81@108                                           
                                            C8,;@tG81@108                                           
                                           G@Ct:8G8G;@C8C                                           
                                           ::;; ,;;. ,;;                                            
                                                                                                    
                                               .,,:;.                                               
                                               ,,,::.                                               
```

> Note: Colors are visible in the terminal if it's compatible.

## Source material

- https://http.cat
- https://http.dog