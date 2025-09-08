package org.example.behavioural_patterns.chain_of_responsibility;

public class LoggerDemo {
// =====================================================
// CHAIN OF RESPONSIBILITY - CHALLENGE
// =====================================================

/*
INSTRUKTION:
Den här koden fungerar, men den följer inte Chain of Responsibility-mönstret.
Alla if-else statements gör koden svår att underhålla och utöka.

Er uppgift:
1. Skapa en abstrakt basklass som kan hantera "kedjan" av hanterare
2. Gör så att varje logger-typ bara behöver bry sig om sin egen nivå
3. Implementera så att meddelanden automatiskt skickas vidare till nästa
hanterare om den nuvarande inte kan hantera det
4. Ta bort alla if-else statements från main-metoden

HINTS:
- Tänk på hur du kan länka objekten tillsammans i en kedja
- Varje hanterare behöver veta vem som kommer näst i kedjan
- En abstrakt metod kan tvinga subklasser att implementera sin egen skrivfunktion
*/

    public static void main(String[] args) {
        int INFO = 1;
        int DEBUG = 2;
        int ERROR = 3;

        /*String message1 = "Detta är ett INFO meddelande";
        String message2 = "Detta är ett DEBUG meddelande";
        String message3 = "Detta är ett ERROR meddelande";


        InfoLogger infoLogger = new InfoLogger();
        DebugLogger debugLogger = new DebugLogger();
        ErrorLogger errorLogger = new ErrorLogger();
         */


       /* if (INFO == 1) {
            infoLogger.log(message1);
        } else if (DEBUG == 1) {
            debugLogger.log(message1);
        } else if (ERROR == 1) {
            errorLogger.log(message1);
        }

        if (INFO == 2) {
            infoLogger.log(message2);
        } else if (DEBUG == 2) {
            debugLogger.log(message2);
        } else if (ERROR == 2) {
            errorLogger.log(message2);
        }

        if (INFO == 3) {
            infoLogger.log(message3);
        } else if (DEBUG == 3) {
            debugLogger.log(message3);
        } else if (ERROR == 3) {
            errorLogger.log(message3);
        }
        */

        LoggerHandler infoHandler = new LoggerHandler.InfoHandler();
        LoggerHandler errorHandler = new LoggerHandler.ErrorHandler();
        LoggerHandler debugHandler = new LoggerHandler.DebugHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        infoHandler.handleRequest(INFO);
        infoHandler.handleRequest(DEBUG);
        infoHandler.handleRequest(ERROR);
    }
}