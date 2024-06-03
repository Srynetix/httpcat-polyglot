# httpcat-node - Simple, stupid http.cat client made in Node

Show HTTP status code as cute images of cats (or dogs!), with colors!

## Prerequisites

- nix
- nix-direnv
- devenv
- ...or just a recent version of Node.

## Build

```sh
$ npm run build
```

## Usage

```sh
$ node ./dist/index.js 100
```

```
......................................................................................................................................................
......................................................................................................................................................
......................................................................................................................................................
......................................................................................................................................................
..............11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111..............
..............ffLLCCGGGG0088888888GGffffff0088@@@@@@@@@@@@@@888888@@@@@@@@@@@@@@88GGffttffffLLLLfffftt111111ttttttttffLLCCfffffffftttttt..............
..............ffLLCCGGGG888800888800LLffffGG88@@@@@@888888888800888888888888888800GGffCC0000000000GGCCLLffttttttttttttffffttfffffftttttt..............
..............LLLLCCCCGG00GGGG008800LLffffLL00888888888800GGCCGG008888880000000000008888000088888888888888GGffttttttttttffttttfffftttttt..............
..............LLLLLLCCGGGGGGCCCCGGGGLLffLLLL00888888888800CCffLLGG000000GGGGGG0088880000000088888888888888888800ffttttffffffffLLLLfftttt..............
..............ffLLLLCCGGCCGGCCLLffLLLLLLGGGG00888888888800CCttLLGG000000000088888800000000888888888888888888888888LLffffffffLLLLLLfftttt..............
..............LLGGGGCCCCCCGGGGCCLLffffLLCCGG00888888888800LLttffGG0000008888008888888888888888888888000088888888@@88CCCCLLfffffftttttttt..............
..............CCGGCCGGGGGGGGGGCCffffffffffCC000088888800GGLLttffCC000000888888888888888888@@88888888008888888888888888CCfftttttttt1111tt..............
..............LLCCCCCCGGCCCCGGCCffffffffffffGG0088000000CCffttffCCGG00888888888888888888008800000000888888888888888888CCtttttttttttt11tt..............
..............LLCCCCCCCCLLCCGGCCLLffffffffffCCGG0000GGGGLLttttffCCGG888888888888880000000000000000008888@@888888888888GGttttttfftttttttt..............
..............LLCCCCCCLLLLLLCCCCLLffffffffffLLGGGGCCGGCCLLttttttLL00880088@@@@888888000000000088000088888888888888888800ttttttfftttttttt..............
..............ffCCCCLLLLLLLLCCCCffffLLLLffffLLCCCCLLCCCCCCffttttLL000000@@@@888888888800GG00008888000088@@88888800888888CCfffffftttttttt..............
..............LLCCCCLLCCLLGG00CCLLLLLLLLffffLLCCCCLLLLCCCCffttttCC880088@@@@888888880000GG000088888888008888888800000088CCLLLLfftttttttt..............
..............LLCCLLLLLLGGGG00CCCCCCLLffffffffCCCCLLLLCCCCLLttttGG0000888888888800ttffGGGGGGff11CC0000000000888800CCGG00CCffLLfftt1111tt..............
..............ffLLLLLLCCGGGGGGCCffLLLLLLffffffLLCCLLffLLLLffttffGG0000880000000000CCLL0000GGffLL0000GGGG0000008800GGCC00GGfffftt111111tt..............
..............ffffLLLLCCCCCCCCLLLLLLLLLLffttttLLLLLLffLLLLffttffGG00008800000000GG00GGGG00CCGG00GGGG00000000000088GGGG0000fftttt111111tt..............
..............ffLLLLLLLLLLLLLLLLCCCCCCLLLLffttffLLLLffffLLffffLL0000GGGG00000000CCGG00GGffGGGGGGCCCCGGGGGGGGGG00GGCCGG0000LLtttttttt11tt..............
..............ffffLLffLLLLCCCCCCCCCCCCLLLLffttffLLLLffLLLLLLLLCC0000CCCC00GGGGCCGGGGGGGGCCGGGGGGCCCCCCLLLLLLLLGGGGCCCC00GGLLtttttttt11tt..............
..............ffttffttffLLCCCCCCCCCCLLffffffffffLLLLLLLLLLLLffLLGG00CCCCGGCCCCCCCCCCCCCCGGCCCCCCCCLLffLLLLLLffGGGGLLLL00CCLLfftttttttttt..............
..............ffttttffLLLLLLCCCCLLLLffttttffffffLLLLCCCCLLtt11ffGG00CCCCGGCCCCCCLLCCCCCCCCCCCCLLLLffffffffffffGGGGLLLL8800CCfftttttttttt..............
..............ffffttLLLLLLLLCCCCLLffttttttffffffffCCCCGGCCff1111GG00GGCCLLLLLLLLLLLLLLLLffffffffffttttttttttffGGGGLLCC8888GGfftttttttttt..............
..............ffffGG888800CCLLLLLLffttttttffffLLCCGGGGGGGGLLttttGG00GGLLLLffffttffffttttttttttttttttttttttttffCCGGCCGGGG88GGLLffttttttff..............
..............ffff00000088CCLLLLffffffttffffLLGGGGGGGGGGGGLLffffGG8800CCLLffLLffffttttttttttttttffttttttttttLLCCGGGGCCCC00GGLLfffffffftt..............
..............ffffCCGG0088GGLLLLLLLLffffffLLGG0000GGGGCCCCLLffLLGG8888GGLLttffLLffffffffffttffffffffttttttttffCCGGGGCCCCGGGGGGCCLLfftttt..............
..............ffCCCCLLLLCCGGLLLLLLLLLLffLLCC000000GGCCCCCCLLLLLLGG008800CCffffLLffttffffffttffffffffffffffffffLLCCGGGGGGGGGGGGCCCCfftttt..............
..............ffCCCCLLLLLLLLCCCCCCCCCCCCCCGG000000GGCCCCCCCCCCCCGG000000GGLLttttffttttttttttttttffttttffffffffffCCGGGGGGGGGGGGCCLLLLffff..............
..............ffLLLLLLCCLLCCCCGGGGGGGGGGGG00000000GGGGGGGGGGGGGGGG0000GGGGGGLLttttffttttttttttttffffffffffffLLGGGGGGGG0000GGCCLLLLLLffff..............
..............ffCCCCLLLLCCLLLLLLCCCCGG000000000000GGGG0000000000GGGGGG0000GG00CCffttttttttttttttttttLLCCGGGGGG000000000000GGCCLLffffffff..............
..............ffffCCffttLLffffffCCLLLLGG0000000000GGGGGGGG0000000000000000000000GGCCCCLLLLLLLLLLLLLLCCGGGGGGGGGG000000000000GGCCffttttff..............
..............ffffCCLLttCCLLLLLLGGCCLLCC88000000000000GGGGGGGGGGGGGGGGGGGGGGGG00GGGGGGGGGGGGGGGGGGGG00000000GGGGGGGGGGGG0000GGCCCCLLffff..............
..............ffffCCCCffCCCCLLLLGGGGLLCC88000000000000GGGGGGGGCCCCCCGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG0000000000GGGGGGGGCCGGGGCCCCCCCCCCLLLL..............
..............LLffCCCCLLGGCCCCLLGGGGCCGG0000000000000000GGGGGGGGGGCCGGGGGGGGGG0000GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGCCCCCCCCCCCCGGLL..............
..............LLCCCCGGCCGGGGGGCCGGGGCCGG000000000000000000000000GGGG00GGGGGG000000000000GGGGGGCCCCCCCCCCCCCCGGGG000000GGGG00GGGGGGGG00CC..............
..............LLGGCCGGGGGGGGGGGGGGGGGGGG00000000000000000000000000000000GG00000000000000000000GGGGGGGGGGGGCCGGGG0000000000000000000000CC..............
..............LLGGGGGGGGGGGGGGGGGGGGGGGGGG0088880000000000000000000000GG0000000000GGGGGGGGGGGGGGGG00000000GG00GG0000000000GG00GG00GG00CC..............
..............CCGGGGGGGGGGGGGGGG00GG00GG0000888800000000000000000000000000000000GG00GGGGGGGGGGGGGGGG0000000000GGGG00GGGGGGGGGGGG0000GGCC..............
..............LLGGGG00GGGGGGGG00GGGG000000GG00880000000000GG00GGGGGGGGGGGGGG00GGGG00GGGG00GGGGGGGGGGGGGGGGGGGG00GGGGGGGGGGGGGGGGGG0000CC..............
..............LLGGGG00GGGGGGGGGGGGGG000000GGGG88000000GGGGGG00GGGGGGGGGGCCCCCCLLCCCCGGGGGGGGGGGGGGGGCCffLLLLCCCCCCLLLLGGGGGGGGCCGGGGCCLL..............
..............LLGGGGGGGGGGGGCCGGGGGGGGGGCCGGGG0000GGGGGGCCCCGGCCGGCCCCCCCCLLCCCCCCCCGGGGGGGGGGGGCCCCCCLLffffLLLLCCCCCCCCLLCCGGGGGGGGGGLL..............
..............LLGGGGCCCCGGGG00GGGGGGGGGGGGGGGG8800GGGGGGCCCCGGGGGGCCGGCCCCCCCCCCCCCCGGGGCCCCGGGG00GGCCttttLLffffLLLLffLLCCCCGGGG00GG00CC..............
..............LLGGGGCCCCCCGGGGCCGGCCGGGGGGGG0088GGGGGG00GGCCGGGGGGCCGGGGCCCCCCCCCCGGGGGGCCGGCCGGGGCCCCLLCCLLCCCCCCGGGGGGGGGGCCCCCCGGGGLL..............
..............11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111..............
..................................................................ff....11tt11..ttttii................................................................
..................................................................LLii..CC..CCiiLL..CC................................................................
..................................................................LLii..CC..CCfftt..GG................................................................
..................................................................LLii..CC..CCtttt..GG................................................................
..................................................................LLii..LL..LL..LLiiff................................................................
..................................................................11ii....11....ii11..................................................................
......................................................................................................................................................
..................................................................11ttttttfftt11ffii..................................................................
....................................................................iiiiiiiiiiiiii....................................................................
......................................................................................................................................................
......................................................................................................................................................
......................................................................................................................................................
......................................................................................................................................................
......................................................................................................................................................
```

```sh
$ node ./dist/index.js 100 --dog
```

```
......................................................................................................................................................
......................................................................................................................11iiii11iiii111111iiiiiiiiii....
......................................................................................................................................................
....ttffffLLLLLLLLLLLLLLCCCCCCCCCCGGGGGG000000000000000000888800000000000000000000888888000000888888888888888888000000GGGGGGGGGGGGGGCCLLLLLLCCGGLL....
....ttttffffLLLLLLLLLLLLLLLLCCCCCCCCGGGG000000000000008888888888888888000000008888888888888888888888888888888888880000GGCCCCGGGGGGGGCCLLLLLLCCCCLL....
....ttffffLLCCCCCCCCCCCCCCCCCCCCCCGGGG00000000000000000088888888888888880000008888888888888888888888888888888888888800GGGGGGGGGGGGGGCCLLLLLLLLCCff....
....ffLLLLCCCCCCCCCCCCCCCCCCCCCCGGGGGG00000000000000000000888888888888888888888888888888888800008888888888888888888800GGGGGGGGGGGGCCCCLLLLCCLLCCff....
....ffLLCCCCGGGGGGGGGGGGGGGGCCGGGGGG000000000000000000000000888888888888888888888888888888000000008888888888888888000000GGGGGGGGGGCCLLLLLLCCCCCCff....
....ffCCCCGGGGGGGGGGGGGGGGGGGGGGGGGG000000000000GGGGGG00000000888888888888888888888888888800000000008888888888880000000000GGGGGGGGCCLLLLLLCCCCCCff....
....ffCCCCGGGGGGGGGGGGGGGGGGGGGGGGGG000000GGGGGGGGGGGGGG000000888888888888888888888888888800000000000088888800000000000000GGGGGGCCLLLLLLLLCCCCCCff....
....LLCCGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG00000000000000888888888888888888888888888800000000000088880000000000000000GGGGGGCCLLLLLLLLCCCCCCff....
....LLGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG00000000000000888800LLCC0088888888888888888888888800000000GGGG0000000000000000GGGGCCLLLLLLCCCCCCCCff....
....LLGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG000000000000000088GG1111ff008888888888888888888888880000LLiiiiCC00GGGG00000000GGGGCCLLLLLLLLCCCCCCff....
....LLGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG000000000000000000iiiiiiLL00888888888888888888880000ffiiiiiiGG00GGGG00000000GGGGCCLLLLLLLLLLCCCCff....
....LLGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG0000000000000000111111iiff0000000000000000000000ttiiiiiiii0000GGGGGGGG0000GGGGCCLLLLLLLLLLLLCCff....
....LLCCCCGGGGGGGGGGGGGGGGGGGG0000GGGGGGGGGGGGGG000000000000000000ttttfftt11ttGG00000000000000GGttii11tttt110000GGGGGGGGGGGGGGGGCCLLLLLLLLLLLLCCff....
....ffCCCCCCCCCCGGGGGGGGGGGG00000000GGGGGGGGGGGG000000888888888800ttttfftttt11ff00000000000000111111ffffttiiGGGGGGGGGGGGGGGGGGCCCCLLLLLLLLLLLLLLff....
....ffCCCCCCCCGGGGGGGGGGGG000000000000GGGGGGGG00000088888888888888CC11fffftt11ffGGCCGGGGGGGGCCii11ttffffiiiiGGGGGGGGGGCCCCCCCCCCLLLLLLLLLLLLLLLLff....
....LLCCCCCCGGGGGGGGGGGGGGGGGG000000GGGGGGGGGG0000000000888888888800tttttttt11LLLLCCCCLLLLCCCCttiiffffttiiff00GGGGGGGGGGCCCCCCCCLLLLLLLLLLLLCCCCff....
....LLCCCCGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG0000000000000000000000fftttt11ttffLLLLLLffffffLLffttfftt11iiCC0000GGGGGGGGGGGGGGGGCCLLLLLLLLCCCCCCff....
....ffCCCCCCCCCCCCCCCCCCGGGGGGGGGGGGGGGGGGGGGGGGGG000000000000000000fftt11ii1111ttLLLLffff11ffff11111111ttGG000000GGGGGGGGGGGGGGCCCCLLLLCCCCCCCCff....
....ffCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCGGGGGGGGGGGGGGGGGGGG0000GG11ii11111111CCCCtt111111ff11iiii11LL0000GGGGGGGGGGGGGGGGGGGGCCLLLLCCCCCCCCff....
....ffCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCGGGGGGGGGGGGGGGGGGGGGGCCii..1111ttLLCCCCLLtttttttt11..11ffGGGGGGGGGGGGGGGGGGGGGGGGCCCCCCCCCCCCCCCCff....
....ffCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCGGGGGGGGGGGGGGGGGGLL..tt11LLGG00CCCCfftttttt....iiLLGGGGGGGGGGCCCCCCCCCCCCCCCCCCLLCCCCCCCCCCff....
....ffCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCGGGGGGGGGGGGGGGGGGCC11ttLLGG888800CCCCffttff11..11CCGGGGGGGGGGCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCff....
....ffCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCGGGGGGGGGGGGGGGGGGLLiittGGGGCCGG8800GGGGCCffffiiiiCCGGGGGGGGGGGGCCCCCCCCCCCCCCCCCCCCCCCCCCCCff....
....ffCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCGGGGGGGGGGGGGGGGCC1111GGtt11ttGGGGGGGGLLffttiiiiffGGGGGGGGGGGGGGGGGGGGCCCCCCCCCCCCCCCCCCCCff....
....ffCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCGGGGGGGGGGGGttiiGGffiiiiGGGGCCCCCCffii....LLGGGG000000GGGGGGGGGGGGGGCCCCCCCCCCCCCCCCff....
....ffCCLLLLLLLLCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCGGCCLLffttLLttffCCLLCCGGffffiiiiffGG00000000000000GGGGGGGGGGGGGGCCCCCCCCCCCCff....
....ffLLLLLLLLLLLLCCCCCCCCCCCCCCCCCCCCCCCCCCLLLLCCCCCCCCCCCCCCCCCCCCCCCCCCttttff1111LLLL11LLGGff11CCCCGG000000000000GGGGGGGGGGGGGGGGGGGGGGCCGGCCff....
....ffCCLLLLLLCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCLLCCCCCCCCCCCCCCCCCCCCCCCCGGttLLffCCCCCCGGCCffffLLCCGG00GG00880000GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGCCff....
....ffCCLLCCLLLLCCCCLLLLCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCffCCLLCCCCCCLLLLttttffttCC00GG008888GGGGGGGGCCCCCCCCCCCCCCCCCCCCCCCCCCCCff....
....ffLLLLCCLLLLLLLLLLLLLLCCCCCCCCCCCCCCCCLLLLCCCCCCCCCCCCCCCCCCCCCCCCLLCCCCLLCCCCLLLLffttttLLffLLCC00008888GGCCCCCCCCCCCCLLLLLLLLCCCCCCCCCCCCCCff....
....ffCCCCCCCCCCCCCCLLLLLLCCCCCCCCCCCCCCLLLLLLCCCCCCCCCCCCCCCCCCCCCCCCffCCCCLLCCLLLLffffLLLLffCCffLLGG008800CCCCCCCCCCCCLLLLLLLLLLLLLLLLLLLLLLLLff....
....ffCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCffLLffLLCCLLLLffffffLLLLffCCffCC888800CCCCLLLLLLLLLLLLLLLLLLffLLLLLLffffffff....
....ffCCCCGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGCCCCCCCCCCCCCCCCCCLLCCffttffffffffffffffLLCCLLCCLLCC0088GGCCLLLLLLLLLLLLLLLLLLLLffffLLLLfffffftt....
....LLGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGCCLLGGff11ffiiiittttffffffffLLLLLLCC0088CCLLCCCCCCCCLLLLLLLLLLLLffffffLLLLLLffff....
....LLGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGLLGGfftttt....ttffttffLLttLLLLff008800GGLLCCCCCCCCCCCCCCLLLLffffffLLLLLLLLffff....
....ffCCCCGGGGGGGGCCCCCCCCCCCCCCGGGGGGGGGGGGGGGGGGGGGG0000GGGGGGGGCCLLCCLLLLii..iittLLff11fftttt11GG000000CCLLCCGGGGCCCCLLLLLLLLLLLLffffLLLLLLffff....
....ffCCCCCCCCCCCCCCCCCCCCCCCCCCCCGGGGGGGGGGGGGGGGGGGG0000GGGGGGGGCCCCLLff11..iiffffLLCCLLttttLLCC00000000LLLLLLCCGGCCCCCCCCCCLLCCLLLLffffLLffffff....
....ffLLLLCCCCCCCCCCCCCCCCCCGGGGGGGGGGCCGGGGGGGGGGGGGGGGGGGGGGGGGGGGCCCCff11ii11ffLLCCGGGGCCCCCCGGGG0000GGffffffCCCCCCCCCCCCCCCCCCCCCCLLLLLLLLLLff....
....ffLLLLCCCCCCCCCCCCCCCCCCGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGCCLLLLLLCCCCCCGGGGGGCCCCCCGGGG00GGffttttLLCCCCCCGGGGCCCCCCGGCCCCCCCCCCLLff....
....ffCCCCCCCCCCCCCCCCCCCCCCCCGGGGGGGGCCCCGGGGGGGGGGGGGGCCCCGGGGGGGGGGCCLLCCCCGGCCCCCCCCGGGGGGGGCCGGGGGGCCtt1111LLCCCCCCGGCCCCCCCCGGGGGGGGCCCCCCff....
....ffCCCCCCCCCCCCCCGGGGCCCCCCGGGGGGCCCCCCCCCCCCGGGGCCCCCCCCCCGGGGGGCCffttGGGGGGCCCCCCLLCCGGGGCCCCCCGGGGLLiiii11ffLLCCCCCCCCCCCCCCCCCCCCCCCCCCCCff....
....ffLLLLCCCCCCCCCCCCCCCCCCCCGGGGGGCCCCCCCCCCCCCCCCLLLLCCCCCCCCCCCCCCffttCCCCCCLLffLLffCCCCCCLLCCCCCCGGLL....11ffffLLLLLLCCCCLLffttffffLLLLCCCCff....
....ffffttffLLLLLLffLLLLLLCCCCCCCCGGGGGGCCCCCCCCLLLLffLLLLCCLLLLLLLLLLLLttCCCCLLLLffffffffLLLLLLLLLLCCCCLL....ttffffffffffLLLLfftt11ttttffffffLLff....
....ttttttttffffffffffffLLLLLLLLCCCCCCCCCCCCCCCCLLLLffffLLLLLLLLLLLLLLLLffCCLLLLffffffffLLLLLLLLfffffftttt....11ttLLLLLLLLLLLLffffffttffffLLfffftt....
....ttffttffffffffffffLLffffffffLLLLLLLLLLffLLLLLLLLLLLLLLLLLLLLLLCCLLLLffffffffffLLLLLLLLLLLLLLffff11......iiiittCCCCCCLLLLLLCCCCffffffLLLLfffftt....
....ttffffffffffffffffffffffffffffffffffffffLLLLLLLLLLLLLLffffffCCGGGGCCLL1111ffffffLLLLLLLLffffttii......iiiittttLLLLLLLLCCCCLLLLffffffffLLLLfftt....
....ttffffffffttttffffLLLLLLLLffffffffffttffffLLLLLLLLLLLLLLLLffLLGGGGCCffii..11ttttffffffffffff11........iiii11ttLLLLLLCCGGCCLLffffttttffLLLLLLff....
....ii111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111ii....
......................................................................................................................................................
....................................................................ii..iiii....11....................................................................
................................................................iiGG00ff8888ttGG0088..................................................................
................................................................iiGG00CCGG00LL88LL@@11................................................................
..................................................................LL00CCGG00CC88LL@@11................................................................
..................................................................LL00CCGG00CC88LL@@11................................................................
..................................................................LL00LL0088ff00GG@@ii................................................................
..................................................................iitt..fftt..iiff11..................................................................
......................................................................................................................................................
......................................................................................................................................................
............................................................11iiii..11..11..ii..ii..ii..ii............................................................
............................................................11ii11ii11ii11..111111ii111111............................................................
......................................................................................................................................................
......................................................................................................................................................
......................................................................................................................................................
```

## Source material

- https://http.cat
- https://http.dog