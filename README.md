# Projekt kółko i krzyżyk
Projekt studencki do stworzenia arkadowej gry online kółko i krzyżyk

Do odpalenia tego projektu potrzeba mavena w wersji 3.0.0+. Po pobraniu folderu, wykonujecie:

Linux: './mvnw spring-boot:run'

Windows(CMD): 'mvnw spring-boot:run'

 Aplikacja odpala się na porcie 8080
 
 Dostępne endpointy możecie zobaczyć w pliku GameController.java
 
 Przykładowy json do przesłania: 
 
 {
    "isCross": "false",
    "GameId": "2c4925a8-21ed-40e3-b8ce-ca962177a904",
    "UserId": "2c4925a8-21ed-40e3-b8ce-ca962177a904"
}

startGame - zwraca przesłaną zmienną isCross
joinGame -  zwraca przesłaną zmienną GameID
getMove -  zwraca przesłaną zmienną GameID i UserID
