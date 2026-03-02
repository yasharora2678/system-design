//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Light  light = new Light();
        Fan fan = new Fan();

        LightCommand lightCommand = new LightCommand(light);
        FanCommand fanCommand = new FanCommand(fan);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, lightCommand);
        remoteControl.setCommand(1, fanCommand);

        remoteControl.pressButton(0);
        remoteControl.pressButton(1);
        remoteControl.pressButton(2);
    }
}