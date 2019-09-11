
# code-night-2019

# Schema

## Kort genomgånng
## Gruppindelning
## Få upp miljöer
* ```git clone https://github.com/roeri/code-night-2019```
* ```cd code-night-2019```
* ```./gradlew build  --continuous```
* ```./gradlew bootRun```

## Tips
* Ställa en fråga mot lokala APIet: ```curl localhost:8080/uppgift/1```

## Resurser
* Hur collectors funkar: https://www.baeldung.com/java-8-collectors
* Vanliga operationer (googla eller fråga om du behöver hjälp att använda dem):
  - filter()
  - map()
  - flatMap()
  - max()
  - min()
  - peek()
  - skip()
  - limit()
  - findFirst()
  - reduce()
  - collect()
  - forEach()

## Ölhackning

### Uppgift 1
Hur många ölsorter finns i butiken Hammarby Sjöstad, Lugnets Allé 26-28 (id 1337)?

### Uppgift 2
Vilket land har flest ölsorter representerade i samma butik?

### Uppgift 3
Vilken ölsort har bäst APK-värde i butiken av de öl som lanserats i år?

### Uppgift 4
Ni vill ta reda på om APK-värde är något att gå efter när man köper öl, så ni ska ta fram ett provsmaknings-kit från en butik, med de 3 öl som har bäst APK-värde och de 3 som har sämst APK-värde. Vad kostar kitet? Och vilka öl blev det?

Tilläggsfråga:
Hur många av den billigaste ölen från samma butik hade man kunnat köpa med de pengarna?

## Diskussion/wrap up
