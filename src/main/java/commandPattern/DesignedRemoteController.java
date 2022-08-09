package commandPattern;

public class DesignedRemoteController {

    Command slot;

    public DesignedRemoteController(){}

    public void setCommand(Command command){
        slot = command;
    }

    public void pressOnButton(){
        slot.execute();
    }

}
