package commandPattern;

import java.util.Arrays;

public class DesignedRemoteController {

    Command[] onCommands;
    Command[] offCommands;

    public DesignedRemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
    }

    public void setCommand(int slotNumber, Command onCommand, Command offCommand){
        onCommands[slotNumber] = onCommand;
        offCommands[slotNumber] = offCommand;
    }

    public void pressOnButton(int slotNumber){
        onCommands[slotNumber].execute();
    }

    public void pressOffButton(int slotNumber){
        offCommands[slotNumber].execute();
    }

    @Override
    public String toString() {
        String toString = "";
        for (int i = 0; i < onCommands.length; i++) {
            toString += "[slot : " + i + "] "
                    + onCommands[i].getClass().getName() + ", "
                    + offCommands[i].getClass().getName() + "\n";
        }

        return toString;
    }
}
