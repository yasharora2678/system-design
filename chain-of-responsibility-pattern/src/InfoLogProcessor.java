public class InfoLogProcessor extends LoggerProcessor{
    public InfoLogProcessor(int level) {
        this.level = level;
    }
    public void writeMessage(String message) {
        System.out.println("Info: ----- " + message);
    }
}
