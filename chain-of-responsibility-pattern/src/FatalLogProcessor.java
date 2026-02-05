public class FatalLogProcessor extends LoggerProcessor{
    public FatalLogProcessor(int level) {
        this.level = level;
    }
    public void writeMessage(String message) {
        System.out.println("Fatal: ----- " + message);
    }
}
