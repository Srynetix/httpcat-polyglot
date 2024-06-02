# httpcat-deno - Simple, stupid http.cat client made in Deno

Show HTTP status code as cute images of cats (or dogs!), with colors!

## Prerequisites

- nix
- nix-direnv
- devenv
- ...or just a recent version of Deno.

## Build

```sh
deno compile --allow-net --allow-read main.ts
```

## Usage

```sh
$ httpcat-deno 200
```

```
$/fj{fj)fr(fxnxxj);:){}11)(fUJdhttfrnXuuvczYYXYUCUJUYYYzzcvvvvunnnQo*aaQnftt//((1$         
$/rt/xr1x|jx|rjrrrj|/){1((|fcLL0aMkwphoWW*W&88WW&8&M#*wqUQ0LYZ&**oaoOUznxrjfft/|($         
$nn(uv/jr1nrfx|xtnxjt||/ttjrnvUUZqbhkhhdobhakkkkhoakdddkaahkdqOCJYXXXzcvuunxxrfft$         
$vtjuv|vjrvfurrr/1/rfttfjrxnucYLh*hhkkhbbdbkpwppkhaaaoahbmOYXcYnuzUYUUXXzzcvnnxrj$         
$x/f1})f)rnjn/uj(rxrftfjxxuuX0oaabw0ZOQLqwqZOZLUmZ00ZqqwpbkOC|ttrQQLCCJUYYXzcvvnx$         
$?__>~~+_---?-]]][[[_!{}}1}(ZkbdadOJznuZqqwQzrjfjrxXOqwOLUUCpY[}/OOO0QLCCUUYXzzvu$         
$+_i-?[{11t/|/t|fjjjrrr}++_Xoaab?},,>(ko#oakwXtf>I<,;<YCXYUUCZwrtOmOO00QLCJUUYXzc$         
$+~]t/frxxvccczXYUUJJJj>>~{bbhddqY/uhh#o*ahdmOXQu}!I!}cZUvzzzXObZUUZZO0QQLCCJUUXz$         
$+lf~!?jxuvuu)<~~++~_?]ii>(wwwko&MMM**hbpqpmZX0haaoohpLzurxvuvvXJXXLqmO0QLLCJUYXz$         
$+|/l!zzXYYUJJJJJJUYcc!!ii/OYLwbbbh*bcxrj|{+/UOqkbdwmQYvnnuuunuuvuvjcpmOOO0LCJUYX$         
$lt_<-}(txvXYUCLLLQ00x!!!i<uccLccOddb[<1{{:>-tzvLcnvcucvuvvunnunnnnjrxwhbZpqZLUYX$         
$(fjn||truv))1{{1)((zi!!!!i|vuXJddqQ0L[?-~}1|/jcLnzcvnnvuunnuuuxxnrj//rmbkhhOQJUY$         
@/1/jruczXYYUXYUJUL0z!~!>!!_YvCOCZQct/)}_{1(||jnxcjxnuunxvXnuuuxnnjjtffx0mmqdhhbo$         
$ffrunfxrrncJCLQ0OO0~!!!l+liJUCccuxj)?~++_?-[(ftjfrnxuXXnuuUvvunurfffjjxcmZLqpbkd$         
$xuvzzzzYYzXJC00OZmQ!!}}>>)~}uXzvvxj|({?+_}1)tjjjxvxncunxvvxunnunfttfjxuuXZkhdwOm@         
@xccxnYJJCLQ00OOZZmti>><l]iii>1Xzzvunxj|)1)(/jrrxxnnnnrrxYununxjf/t/fxnuuucUwQwmq$         
$vcXYUYCLLQQ00OZwqmi{iii>>>>><>>zccvvunnnxxnuvuuunnxxxxxnnvxzjjt/t/fjxvcunruLdkpd$         
$+;;;I<[u00OZZmmwqu>>><<<>><~>>-kdJccvvuuvvvcuunxxrxxxnnnxujj|t/||tfjnczuxrtxUpqw$         
$QUYXYXv00OQZOqpdq]+<<<<<~~~~<>]bpCcvcccvvunnnnnnnnnxxxrj/|(|//|ttffrnczcuxrfnYZO@         
$~<<<~++-(uJZqdadZ+~~~~~~~~~+~~]qwCzvvvvuuunxjjxrrjtffftt|((|t||/ffrxuvcnvxrxjuJC$         
$1(()1(()({[??]+~++__-__-???-++{qZLXvuunnunnnrtjjjjtt//|((((((||/fjxnuvvvcuuvnunz$         
$){)(((|t)|ttf)tf|)||(1[-_+__-?tqZLYzvnxxrrrx(t|/tf//|(()(((|/ttfjrxnnuuuuvvunnuu$         
$JJJCJCCXvur||1|t|(|1|//(t|t|frnL00JXvuxrjfttt1||{||(())1))|||/ftjrnnuvunuvvvurxc$         
$JJJCCLLQ00QQ00UufruYYvrt|/(1?[0awUJUXvuxjft/|)(()(|1)))))((|/tjjrnnnnnnuuvcccccu$         
$0ZqddpwmZ000OO0QQLJc{/|jj<~uOYd*dJunXzvnjf/|())))(())11)))(|tfjrxxnnnnnuuvXcznxr$         
$';;(xczfLOwbX]}t?j<u?tfx(-!:,>makmLurrnnxj/()1{)))11{{{111|//tfjrjjtffjxnuuczzvc$         
$";!l;>~+[1[++{1(]jx)(}QhahaooX~wkpmXuft({/(|{}{{{{}}[}}}{{))||//tttffrrxuzzzzzzv$         
                                   .           .                                           
                                  ' ^$ $  @.B  @                                           
                                    ~''B  B.$  $                                           
                                   + ..$  $ $ .$                                           
                                     .  ..  .. '                                           
                                       *J$
```

```sh
$ httpcat-deno 200 --dog
```

````````````````````
                                                                            .      .@ ' .:,'."   
                                                                                :                
cCZko*M#omfruzzur/)|tfjt|||tnvYULmpkhhbkh*aaakkkhkbda#MWWMMW#*M#WWW#adh*MW#kYcXXc/()((((fjjrft   
jUwkahpXcxrnvXXvxt()txuur/truYLCUQZo##MM#oakha###*ahoMMMM*#MMWWW&WWM##M#*kQn|YYcu(|)(1)(/rxrjx   
YUzvujrrnftfrvzYYYzcunvvnjtrnuYCLQwa#MMM*ohkao*#MM#****ohhao*#MW&&&WWM**aaodLJYJYvf/11))1[[[})   
CUvrt|t)||))[1jvXUJCQCcnxjfjjuU0qddbkhaahbqZZqbao**#***#*oaaoo###M#MMMobqOwJncCQLx(||1(1{}?--]   
XJLQLUzfruunf(1)/txYUXntttfjjuJOqqdho**ohdmpdbmqdkhhkdbhaooaaooo*oooo*oakpO0CUUYrjjjxvnrr/)]_-   
zYCQZmZO0cxnjuUYn|/vL0QzttffttfuULZdoW&WWMWWWWWW&&&&&MmqpdpddaaahbpqqdppdpmOQJCCUzxrxxxjjt({[-   
ffjrnXQZOCYrfvYXX/nvQ00c(/jzzxfjnYW&WM#####MMMMMWWW&&WW&8Maaha#M*opCXvuvzUCUvrjnnnf)}[}}}{{1][   
rf/(/jxnvcnxj/((1juczvucffXCYznrb&#*M**#ooooo*#MWMMMMW&W*a8&oho**awUvxfrcCQQLzjt)1{}]??}))){{1   
{{}[{|//|tfjfruurt/fruCCJLLmww##aakooaha##*o****abpd#W&WMdQ*8Wddqm0Yvuxjfxunur|((1}]?[|//|(1][   
f/{{[[{}1}{{{tuvvx|(1jvLUcCZdWpQqbdhkmXmkh*aok*khdOz?roMWMpLb88*kq0Yvrrttt/|ruur)}]]])///(1}?-   
fftcYu)?][[]?{fXQ0CxtzYCCx(J*hUUbhhp|-|Upbo*aoao*ww!,,}c*M*QZ**&&kZLYzvuzXUvXYzvf1}???{{))11[|   
}|vJQQCOZOX|){)vLQLu|)z0OZpokwLmhqC`,^!vdkhaaa**##adqXYQqkhwOZM**W*dqmZOOOZQcrnnjtt(f|xvzvf{_?   
{tnvvxu0mw0nvn/|(/|)(|fUQph0OZZ0qJ1<zCOpaa*ooo*###*##a*aaaadJO*ook#WbppdkkbpOUvrxfffjxcczvj}_~   
]tnccxt{)/nYOmwmJv|}1/xckdZJQqwQJO0LmddbahQjUzcQZdhMM*#ohooqcCkhkka#oO0ZZmmZLUcfrt(/t(]{1){[_i   
[txnn|([[}{xUZZ0Ju([-?|JpdOCLZpLLp0Ldwwbd+,,;l,`;/Oa*#*ko*obrUbbZwmOkJ0O0Ccnxjf///|(11[?[1{[+~   
)rrnxnuvr(}|U0OCj|[~<<fqmmLUQdknZZmmZOZkbt?:,,"<}xQkho#apdkpvzbwYJCOUOqpqmCJXvxfttt/|){]_++_?[   
/jucXXUUXJUUmqpZn{-~_?tCQXQzc0ZzUYOJOZmqpLui;l;~_)JmdbhbaoOwzvwYnQ0L0qdpqOQCUXzunt)){}[?-__-??   
ttxjxx{)cJLQ0OCYf)}]/YLYxxxcrLQxx(CqJCXvznr+}}[?_(uXLOdQ0ZkXqMi#mUUCOqwqw0CCXvnxj/){{[?_~--_+_   
/)/(//f|//ttjf||/t/])vXJbZ({ztuht1rU-Xxt|/->:,""::;}czI_zQQ0aMMWML((tuULJzvnxnrft/|(|((11{)(1{   
][}{((xzYv|[{1)|t/1{1{)Zhooo|}bbZX|(/_^"><_;III:I>]{/"_XmOLwo#*#Wh/c]]tuuvnx//////|)()|/frrnrt   
))]-?])uvr((1]--]?-_{}uphaahhhkhkUf)/|~1``]}{{|]|xczQ}~0pL0dooa*##UfncUUJCzu/1}}}}{}{})|fxuurj   
]?]>>~-[[}|rr/}+<ii<~-XqkahhhhaadUu/1|f}:,!)tuJxUOYL!zUZJLpbdbho*MmnnxzUQOQUuxf){{}}[)ttfjjffr   
<>><?[?{uzvrtt1}[?-?}fQqbkhhhhkbQXcu|)(||]":mQmOwpZUZ|QLJZdbdbao*Mk(){/uzXvuvvnft||1)ncYcrt)(f   
<<+[11)jvzzrtzXu)1)|)vZqdbkhkkdwUvnxr|1{{fr<"tXmC";<pOuXLmdbbkao***crjfffruczcr/())((/xur|{]?+   
~~_-]]?_[{??xCmOn{-?]zmmpbhhkdp0Xcnnxf|){[[)/>_}~tXmrrzJ0mqbkhaoo*MmUcxjtnzJCYXurt|)1)/ff|}-+~   
]-?-__+-?-__tXQ0Xf+I)mpqkkhkdppYvunjf/|(1}{1{1{()/tfuxXLOqpbbkaoo*#kj(1(/jnvuunuYXcj1(trr(]~+]   
_+++~[}}?_+~+{jr))1{JddpqqddpwOcnnxjjt|)1}})(/|t(jucuuJY0mpdkhaaoo*#Jjnvnnxrrt(fvXJnf/||([_~_]   
~>!l+{(/}??-]}}}1({|OqwOZwqqqOQvnxxjft|({{1(/jtfrvcXXczJ0wpddhhaaao#dzUUYcvvxt/tjxcunt{?+~~_-}   
__ill>??[[{{(()1}[}xZZwZ0QQQJXUunxnjff/|1}/trnrxucUQZOOOwmwqdbkkhho#hvcvvxjf//))|)(/|(1]_~<<~<   
[}?>l~_+??}1))1{{{(UmZZZZ0Jzn|nvnrrjj|(1)|(rfxvcUUJJUJUULQZqpkhhkhooutf/|11{{}[}[]?][}}]_~~<<i   
_]-_1rnu-><~~~~~~_{CwmZO0QJcf{(cxrjfjff/(|trrjvccUUUJQQ0Omwwwqpddkoan({]+_-?][{(1}}[}}[-++~~~+   
`^^^^^```````````````````^^^^^``^^^^^^^^^``^^``^^^^^^`^^^^^^^`^^^``^^^^^`^`````````````````^^^   
                                                                                                 
                                        $%$@ $W$$ $@$$                                           
                                          $% $u$$ $ $$                                           
                                         $@  $u$$ $ $$                                           
                                        @@@$ $$$  8@$                                            
                                                                                                 
                                             ~                                                   
                                            . $c
````````````````````

> Note: Colors are visible in the terminal if it's compatible.

## Source material

- https://http.cat
- https://http.dog
