public class DebugLogProcessor extends LoggerProcessor{
    public DebugLogProcessor(int level) {
        this.level = level;
    }
    public void writeMessage(String message) {
        System.out.println("Debug: ----- " + message);
    }
}
