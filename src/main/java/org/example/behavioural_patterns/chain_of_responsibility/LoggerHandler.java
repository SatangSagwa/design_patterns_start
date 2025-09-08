package org.example.behavioural_patterns.chain_of_responsibility;

public interface LoggerHandler {
    void setNextHandler(LoggerHandler nextHandler);
    void handleRequest(Integer request);


    InfoLogger infoLogger = new InfoLogger();
    DebugLogger debugLogger = new DebugLogger();
    ErrorLogger errorLogger = new ErrorLogger();

    int INFO = 1;
    int DEBUG = 2;
    int ERROR = 3;

    String message1 = "Detta är ett INFO meddelande";
    String message2 = "Detta är ett DEBUG meddelande";
    String message3 = "Detta är ett ERROR meddelande";


    class InfoHandler implements LoggerHandler {
        private LoggerHandler nextHandler;

        public void setNextHandler(LoggerHandler nextHandler) {
            this.nextHandler = nextHandler;
        }

        public void handleRequest(Integer request) {
            if(request == INFO) {
                infoLogger.log(message1);
            } else {
                nextHandler.handleRequest(request);
            }
        }
    }

    class DebugHandler implements LoggerHandler {
        private LoggerHandler nextHandler;

        public void setNextHandler(LoggerHandler nextHandler) {
            this.nextHandler = nextHandler;
        }

        public void handleRequest(Integer request) {
            if(request == DEBUG) {
                debugLogger.log(message2);
            } else {
                nextHandler.handleRequest(request);
            }
        }
    }

    class ErrorHandler implements LoggerHandler {
        private LoggerHandler nextHandler;

        public void setNextHandler(LoggerHandler nextHandler) {
            this.nextHandler = nextHandler;
        }

        public void handleRequest(Integer request) {
            if(request == ERROR) {
                errorLogger.log(message3);
            } else {
                nextHandler.handleRequest(request);
            }
        }
    }
}
