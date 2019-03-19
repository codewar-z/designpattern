import java.util.HashMap;

public class RemoteControl {
    private HashMap<String, Command> onCommands;
    private HashMap<String, Command> offCommands;

    public RemoteControl() {
        onCommands = new HashMap<>();
        offCommands = new HashMap<>();
    }

    public void setCommand(String device, Command onCommand, Command offCommand) {
        onCommands.put(device, onCommand);
        offCommands.put(device, offCommand);
    }

    public String turnOn(String device) {
        return onCommands.get(device).execute();
    }

    public String turnOff(String device) {
        return offCommands.get(device).execute();
    }
}
