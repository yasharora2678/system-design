public abstract class LoggerProcessor {
    int level;
    LoggerProcessor nextLogProcessor;

    static final int FATAL = 4;
    static final int ERROR = 3;
    static final int INFO = 1;
    static final int DEBUG = 2;

    public void setNextLogger(LoggerProcessor loggerProcessor) {
        this.nextLogProcessor = loggerProcessor;
    }

    public void logMessage(int level, String message) {
        if(this.level == level) {
            writeMessage(message);
            return;
        }

        if(this.nextLogProcessor != null) {
            nextLogProcessor.logMessage(level, message);
        }
    }

    abstract public void writeMessage(String message);

}
