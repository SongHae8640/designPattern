package commandPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DesignedRemoteController {

    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> undoCommandStack;

    public DesignedRemoteController(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommandStack = new Stack<Command>();
    }

    public void setCommand(int slotNumber, Command onCommand, Command offCommand){
        onCommands[slotNumber] = onCommand;
        offCommands[slotNumber] = offCommand;
    }

    public void pressOnButton(int slotNumber){
        onCommands[slotNumber].execute();
        undoCommandStack.push(onCommands[slotNumber]);
    }

    public void pressOffButton(int slotNumber){
        offCommands[slotNumber].execute();
        undoCommandStack.push(offCommands[slotNumber]);
    }

    public void pressUndoButton(){
        undoCommandStack.pop().undo();
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
