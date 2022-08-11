package commandPattern;

import java.util.Stack;

public class DesignedRemoteController {

    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> undoCommandStack;
    Command onAllCommand;
    Command offAllCommand;

    public DesignedRemoteController(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommandStack = new Stack<>();
        onAllCommand = noCommand;
        offAllCommand = noCommand;
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

    public void setAllCommand(Command onAllCommand, Command offAllCommand){
        this.onAllCommand = onAllCommand;
        this.offAllCommand = offAllCommand;
    }

    public void pressOnMacroButton(){
        this.onAllCommand.execute();
        undoCommandStack.push(this.onAllCommand);
    }

    public void pressOffMacroButton(){
        this.offAllCommand.execute();
        undoCommandStack.push(this.offAllCommand);
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
