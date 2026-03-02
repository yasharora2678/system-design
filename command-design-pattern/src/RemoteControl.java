public class RemoteControl {
    private static final int numButtons = 4;
    private Command[] buttons;
    private boolean[] buttonPressed;

    public RemoteControl() {
        buttons = new Command[numButtons];
        buttonPressed = new boolean[numButtons];
        for (int i = 0; i < numButtons; i++) {
            buttons[i] = null;
            buttonPressed[i] = false;  // false = off, true = on
        }
    }

    public void setCommand(int idx, Command cmd) {
        if (idx >= 0 && idx < numButtons) {
            buttons[idx] = cmd;
            buttonPressed[idx] = false;
        }
    }

    public void pressButton(int idx) {
        if (idx >= 0 && idx < numButtons && !buttonPressed[idx] && buttons[idx] != null) {
            buttons[idx].execute();
        }
        else if (idx >= 0 && idx < numButtons && buttonPressed[idx] && buttons[idx] != null) {
            buttons[idx].undo();
        }
        else {
            System.out.println("Invalid button number");
        }
    }

}
