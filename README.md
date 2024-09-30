# Aide à la réussite Challenge
---


Le input du challenge ressemblera à ceci :

```
2-4,6-8
2-3,4-5
5-7,7-9
2-8,3-7
6-6,4-6
2-6,4-8
```
These lines represent two ranges of numbers. To be more visual, they look something like this.

```
.234.....  2-4
.....678.  6-8

.23......  2-3
...45....  4-5

....567..  5-7
......789  7-9

.2345678.  2-8
..34567..  3-7

.....6...  6-6
...456...  4-6

.23456...  2-6
...45678.  4-8
```

You have to extract how many ranges FULLY overlap another range. In the example provided above, you can see that in the 4th pair of ranges, the range 3-7 is fully included in the range 2-8. Same thing with the pair of ranges 6-6 and 4-6.


##### Comment commencer?

Vous inscrirerez votre code à partir du fichier `Main`. Quand votre code fonctionnera, un message de félicitation sera indiqué.

Le code dans la méthode `Quiz` lit ce qu'il y a dans le fichier `src>resources>input.txt` 
