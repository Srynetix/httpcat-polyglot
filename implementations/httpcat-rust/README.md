# httpcat-rs - Simple, stupid http.cat client made in Rust

Show HTTP status code as cute images of cats (or dogs!), with colors!

## Prerequisites

- nix
- nix-direnv
- devenv
- ...or just a recent version of Rust and Cargo.

## Build

```sh
cargo build --release
```

## Usage

```sh
$ httpcat-rs 200
```

```
         !iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii>I         
         }|\/{/t1\/(//tftt(<!1}[}{1)fvYOmzffjrxxxuzXXcczXXXzXcvzcunxxrrrrvUZpdpOct\||())1{?         
         }xujjvn/ufrvjnuvvur\f/|\tffvY0ObMWdqdhaM8%@$%&%%88WW#opq0mmQOpo&8&&#hZCzvunxrrjt/?         
         [vcfvzrrutvnrvruucunrftfjrxucJ0Zbo##MW&W&M88&WW&&%%W*o*#WWM&&*hpqwOQLCUXzccvunxrj?         
         [zurXXfcurXnuunutjvuxjjrnnvcXLZOk*##MM#*M*#W*ooo#M&WMM###*abqZOQCCLLLCJJUYYXzcunx?         
         [zrvXvxYxcUuXnvnfjrunrxnuvczYLpo&&M#MM#hoooohhho#MWM#WWMMad0LXcvzQ00O0QLCCJUYXcvu?         
         [n|({[})}(|)\(/({\ffttjrnucXLbW&W*kqqwZwkkhdqw0QmmmwdhahhaokQxfjvmwmZZO0QQLCJUXzc?         
         }1?--????????]]]][[[_~}}}11tdM*#MawLJczqhhkwCznnucXLqkbdm0OqkC\|rmpqqwZZO0QLCJUYX?         
         [?-~]{{1){1111))|\//tff1-]]zMW#oY(!>}um*WM*kOcjj)-_>}vmZQLLQmdJjj0ddpqwmmO00QLCUY?         
         }---///ffruvzzzYJJCCCzr?+_\h&W##Y1><{Y&%%&&#opO/+>~;~_t0LCLLLmhop0ddppqwmZZO0QLJU?         
         }-~(\}(nuuvzXzcXUJCLLLf~<+\ka##M*bqa88%&&MMohdZkOzt1(jUZQUUUJCZbp0CbbdqqwmZO0QLCJ?         
         }__f->{nuuccc)_-??[[{/}>>~tppk#&%B$$%MobddbqZOqMWW&MokmCzccXYYULQLC0bbdqwmZO0QLCJ?         
         [~)\i<uYUUUUUXzcvunxru+ii~/wQwho*M8%*0Xznrjtn0qa*#*akpOUczXXXXXXYYYvLhbbdpqwZ0QLC?         
         }+f[>]ucXUJCLQ0OOZZmmniii>]JJQw00b*#wftft/{}1xUZm000QLLUXXXXzzXXzzzuc0*&W*#*bZ0QC?         
         }}f1{fnuuuut///fjnvcJ1!iii~xUULCmhahbv?))_+}\juYYUvvczXXYYXzzzXzczcvnnL*##okqZOQL?         
         }/jxunuucYYzcccvuuunY~!!>~-nJYJmbpwOOU|]?[|/ffnJQCYzXUJJYXzXXXXczzvxrxuOa*o#*bZ0U?         
         [f/fxnuczYJCCCLQ000Zuii>ii>|QCLO0OLYxf\1](\tfjxcvzzXXXXXUUYYYXzczzunxxnzmbka*M#a*?         
         [ftrnuruuvzULQOZmwwm{!!!i--1LLJJUXvnt)}]-}1)\jxnvuccXUUYXYUUYYXzXcnxxnuvLdpdao*#o?         
         }xnuvcczYYYUCLOZwqpQ<!>+_>[)xJJUYXvnt|)[]]{(\rnnuzXYYYXYYYYXYUYYznxrrnvzXOd*#oohh?         
         }trnuYJCLQ0OZmmwqpdu<~++-]~i~}zJUYXcnj/({1(\/rucccczzzYYXzzYXzXznxrrxvczzUZb*hqOp?         
         [vzXcXCL0OZmmwwpddp)i+~+i~ii!i-vJUYXXzvxfjjrnvcczzzzzccczYYXXzvnxjrxncXXXzXOqwbha?         
         }vXUJCCQOZZmwqqpbbZ<+~>!!~iiiii+ULUYYXzzzzzzXXXXzzccccczzzzXzunrjrjxucYYXcuXZa*aa?         
         }-<+?}(tYZmwqpdbkkv<~iiii<iiiii}bhQUUYYXXYYYYYXzcccccczzzzzuxjjrjjxxuzUYXcunXZahh?         
         }Uuxj([-XZZZwpkhhk1~iiiii>iiiii|oaZUUUYYYYXzXzXzzzzzzzzcvnxrffjjrrxnuzUJUzvnnX0bd?         
         }{(trcULZwqqppbaoZ~>iiiiiiiiii>tokZUYYYYXXXzcvccvvuuuuuxxjftjjjjrxxncXUJYXcunvUmm?         
         [}[]?-___]1txvYQZv~<<<>>>>>>>i>tkbOJYXXYXXXzcunvvunxnxxrjffffjjrxxnuzXYYXXcvcvzCO?         
         [||||(\\(|)))))[-_____+_+++~~~+tbpOCYXzzzzzccuxnnnnxxjjjfffffjrrxnuczXYYYYXXXzXXJ?         
         }f\|\||tf/ttff/tt||(){{}]??--?]xdpOLUXzccvvvuxrjjxxrjjfttfffjrxnnnvczXXXXXXXzczcX?         
         }LLCJYXcxjjt/ttjt|\/|\tt/fttt/\r0pm0CYXcvunxxr/ff/fjft///ttfjrrxxnvzzXXXXzXXXXcvY?         
         }LQQQQ0OO00CYzuxj(\f/|\//tt//\tckdZOLJYzvnxrrftff/tft////ttffjrnnvczzzXzzzUUYXzzX?         
         }mmZZOOZZZmmmmmZLvxjrcXUYc(]-?\pWbLLQLJXcnxrjft/tttt/////ttfjrxuvcczzzXzzXYUUYzzz?         
         }LOwdbkkbbppqwmZQCUXz\)txj+ifXUa8*mYzUJYzunjft/////t/\\\//tfjrnnvcccczzzzXYJJYzcv?         
         }]1(tncULwdk*0t//(j}n||xut]!I;]b&Mk0zvczcvnjt/||///\\|\|\//fjrxnuvuunuuuvzXXYUUYz?         
         }l<+-?]1(\jxj{(/(+x)uxfuvYdahX1ta#aqCcnrjjrft|(((|||(((|(|\/tfrxxxxxxnnuvcXXYYYYX?         
         )<<~+_--?[}{}}1))1)))fYCCCCCCLCxxUUzurt\|)(||(((())111)))((||\\\////ttffjrxnnxxrj}         
                                           !j|^ ^]?` ^]]^                                           
                                          `]`tC q\:k`h\,m                                           
                                             \-,#  8]#  &.                                          
                                           .]!.`o .8:W  *                                           
                                          \Ynnr -[}+ ?[}~                                           
                                                                                                    
                                                1/r{                                                
                                                :l,:                                                
```

```sh
$ httpcat-rs 200 --dog
```

```
                                                                               I\`:"^ ^:\^\\^\l\\   
                                                                               I\^,l\""::;I\\";"\   
   jvzYJCLCCYnxuccvxftfrxxrjffjxuvczYUJJJJJJCCJJJUUUUUUJCCLLLCLCCCCLLLLJUUCLLLJcnvunf/\//ttjrrrj/   
   UZk#WWMokZJ0wppZLYvcUQO0JYYCOqdddka*MWWWWWWM##MWMM#*M&&&&&&&&&&&&8&&MMWW&WoZX0ZO0XcunnucULQQCY   
   CZdkhbmQ0LC0ZpdpwOLUJ0mwOCUCOqddpdhMW&&&&WMMMW&&&WM#MWWWMMMW&&8888&&&&WWW#od0ZwwOYcvxrnuvzYXzX   
   QmOLCJJUJUzcY0wdbkbdpwwmZQCLQOqdbka#W&&WM##**MW&&&WWWWWMM##MMW&&&&8&&&WM##*apqwpqZUcxjjrf\||\n   
   OqmQCUXcXUXznnX0wdkhkbq0QLLLQZpko***####*ahbbho#MWWWWMMWWMM#MMWWWW&&&&M#abbwOZqpZUcccunrjt|11j   
   0pbbdqZCLOZOJcuvXJ0wpqOJUJCCCOpho**#MWWM#*aaaoo*#####**###M##MMMM#MMMMM#*akbpwwZJYYUUJYcvxf|1f   
   LmpkhhkbdwO0LQZOCzXQpdpOJUJJUJLZpka#W&&&&W&WW&&&&&&WM#aaaaaao#M#*oahaaaooohkdqqwm0CJJUXvvurt|f   
   YUL0mqbhhbwLCZmmZYCmdbdmXXJQ0QJLOq*WWWMMMMMMMMMWWW&&&&&MMM#*o*MWW#hqZZmmqqpqOCLQQLYvnrffjrrj\j   
   UJYXYLZqpqmQJJCCXCZmqqQUzUOwwm0Qq#M#####***###MMMMWW&&&W#M&M##WWW#kmCUYJQwppq0UXzvrft\|/rnurtx   
   XzuxuYCCJJCLCJUUXYQOmOZwwmZqqqaM#*oo*oo*#*oo**###*o*MWWW#bpWWoo##obZ0LUUCOwwm0Ycunrt||fxuunxfx   
   vrjjjnvvczzXXCZZOCcvzJmwwqpkho#kbahaakpko**ooo*ohdqkh*W&WhLw&&#hkbpm0LUXzzYXYYXcvxf/txzYYcxt\r   
   XcrrftffjrjffcQmq0YccJ0mOLZbo*p0qkkahwYZba*ooo*oapL)[[jaWMh0pW&&*hpm0CJYYzzXJQQJcj/\\xzzzvjf\j   
   XzY0Z0Xccnft/jUmdbpLXQmqpOYwokOQkhbU[?}Xphooooo**kO}<>[/a#*wmaM&&#kdqwZ0OZm00O0QUuj/\|/rnunj|x   
   vzOpbdqdbd0zuxuLqpqQcc0pbkhokq0whdUl;i~Xkaaooo*###odQzQ0daaq0p###WMoaakbbddqOCJJYzvnuxvYJJct{f   
   vX0wqZZdkkd0QCzczUYcvvYZphawmmZQp0/]\jJdhaooo**#MMM#*oaoooabLZo*oaMW#*oaooakpOCUYXcczzYUJJv\}t   
   nz0ww0YcYJQOdbbpOUvrncUCmhwOOwZJ0LLZqdddhaqJUXzUOdoMM##*a*obUOhoha*#*hbbbkkdqmQUYXvvcujjxxf([\   
   nXQZOUzrfjuCwkhbwLvf\fvQkdZLLmwLZwmZqdpkbc+~}{]~-jZoMM****obYOkodbbbawwqqwO0QCJUXzvnrt()(\\(}\   
   cXJCJYXvrfrcOqqmLYr\}}tppqZCLmwUmpwwpqqkd1:\\,:I<(Zho##ahoadzCkhZOZmpmdbbdmZ0LUzzccvxf|11)1}}f   
   cXUQ0OOOQJvYqbhdJv|}}{nmmmQUUmmXOmwmOmqddY)>,,,I_jCpha#oakpqzcqwJCZddkhhakdpZQCJUXcvxf\){}}{{f   
   zXLLQ0QQOqqqhahbUf(1(rYYUJCXzQOvUXO0ZwmmmUj->lI++}vOqdabqhqmYZULCqbbko*oohbdwOQCUcnrf\(1}[[}{f   
   zcUUUYnxYOwqppZLcxf/nLZQuvuxuLQCujJZCCJzXvf{-?~?-}fYQmdzvmwCp#rhkO0mphhaabdpmQUXcvnrf|1{}{)1{f   
   cxvvzXYcccvzccuuuux|fXC0dOc\rrChYtnz|tzuj\}>l:\\:;<{nt]_UmZwa##M#OrruY0wwmZ0CJXcvcunxjt//tjjtx   
   x\txvcUQ0Cuffjrnunt|/trOaooav\OkpXjxj[<_?]>I;I;:Ii-1|!-xwqZqo##MWhvt/\uJLQCUzunnnunrjfjrxvccuu   
   uf/|(\nJLUuj/|||\|)(\\zpaooowwhkb0nfrt~:^;_--]]_{/ruU{1Zdmmb***#M#CncULQOZLUvjfttt//\\tjnczzvc   
   x\\}[{\frrxvvx|}]]?][}zphaaaahaabQzftxf_:;])\fxtnXYLX/UwmZphaao##MqXUJQZpddq0Uuj/\||||/tjuuunc   
   j1}?]}1|rvvzzut(1[][{\CqkhhhhhhhwLYvttrf[!I(uzLULOCr|XmZ0mbaaho*#MbXccUQwppwmZQYurf\|rvXzvnrxc   
   \?]1/tfvC0QXxccxt\(|fcOqdkhhhhkd0Uzznt//f)I!jLZZm0f?zZOL0qkhhho*#MaznnvYJUYC00LYurjttnYJYujt/n   
   \]}|ttfxYCJxvJLLx//f/zZqdbhhhkbwCYccvrt\|fn|>!_?_<]uZCULZpkhhho**##mLUXccYC0OQYvxjjjjjvcvr/1}t   
   t}{1()11\/|1vOqqCx{]}XwwdkhhhbpOUYzvuxf/|(|/|{})|jzUvvU0mqdkhao**#Md0JcuncCOOQCYXzujfjxunf(}?/   
   j1)1{}})()11rCmwQu[<|mdpbkkkbdqLYzcunrff\||\\t/ttjnuczJOwpdkhho***MaXrfjruzUYXXUQQJutfxunt1??t   
   f}}[[(|\(1}[{fuzuf\(UdbdpdddpqmUzzcunjft/|\/fjjjfncXzXCQmwdbhaoo**##QucXzcccvnxvJLLYxjfft([-]t   
   \-++[\jx/)1}1)((|t/j0ppwmqpdpmOYzcvunrft/|\fjxrxncYUUXYLOwpbkaaoo**#dJCLCYXXzvuucXUXzn\)}?-?[j   
   /-~<~[|/\|(|/t/\||\nZqqmOZmmOLLYcccunxjf/|fxnvnucXC0O00Owwqdkkaaao*#kJJCJYzcunxrxxnunx/)]-__?t   
   j)[~i<-}1(|/fftt/\/XmmwwmOLJzxXYcvvuuxjftfjnucczUCQOZZmZmmwpbkhhaa**mcczvnxjtt/\\|(||\\)[-_++\   
   j(1?]fx/{}{1(()))(tCwwwmmOLUu\rYvuunnrft\trxnuzUCJCLLCCLQZmqdkhhha*oJnxf\((()1)||){1)){}]--__\   
   /{}?|xcv{<<~~~~~+?(CwwmO0LJcr|\ccunxnnnxjjruuxcYJCCLQQL0Zwqpqqdbkhobu|{]-[{)1(\/\||||(1}][]]?/   
   lii!iiii!!!!!!!!!!i><<>>>>>>iiii>iiiiiiiiiiiii>>>>>>>>>>>><<<<<<<<<<i!!!!!iiiiiiiiiiiiiiiiii!l   
                                            ..   .    .                                             
                                           C*hwlbhWYlab&u                                           
                                           j)k8(@vaB(@t&#                                           
                                           "q&+]@vaB(@t&#                                           
                                           d@Qni%ZWh_BL%w                                           
                                           ><<< ,-+` :-+.                                           
                                                                                                    
                                               ,;l~<^                                               
                                               :I!_!"                                                                                        
```

> Note: Colors are visible in the terminal if it's compatible.

## Source material

- https://http.cat
- https://http.dog