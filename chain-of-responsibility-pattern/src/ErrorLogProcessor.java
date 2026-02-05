public class ErrorLogProcessor extends LoggerProcessor{
    public ErrorLogProcessor(int level) {
        this.level = level;
    }
    public void writeMessage(String message) {
        System.out.println("Error: ----- " + message);
    }
}
