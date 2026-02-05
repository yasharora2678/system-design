//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("###### Chain of Responsibility Design Pattern ######");

        // Get the chain of loggers
        LoggerProcessor logProcessor = getChainOfLoggers();

        System.out.println("Logging messages:");
        System.out.println("===== Logging INFO message =====");
        logProcessor.logMessage(LoggerProcessor.INFO, "This is an info message");
        System.out.println("===== Logging DEBUG message =====");
        logProcessor.logMessage(LoggerProcessor.DEBUG, "This is a debug message");
        System.out.println("===== Logging ERROR message =====");
        logProcessor.logMessage(LoggerProcessor.ERROR, "This is an error message");
        System.out.println("===== Logging FATAL message =====");
        logProcessor.logMessage(LoggerProcessor.FATAL, "This is a fatal message");
    }

    private static LoggerProcessor getChainOfLoggers() {
        LoggerProcessor fatalLogger = new FatalLogProcessor(LoggerProcessor.FATAL);
        LoggerProcessor errorLogger = new ErrorLogProcessor(LoggerProcessor.ERROR);
        LoggerProcessor infoLogger = new InfoLogProcessor(LoggerProcessor.INFO);
        LoggerProcessor debugLogger = new DebugLogProcessor(LoggerProcessor.DEBUG);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(fatalLogger);

        return infoLogger;
    }
}