package commandPattern;

public class LivingRoomLightOnCommand implements Command {

    LivingRoomLight livingRoomLight;

    public LivingRoomLightOnCommand(LivingRoomLight livingRoomLight){
        this.livingRoomLight = livingRoomLight;
    }

    @Override
    public void execute() {
        livingRoomLight.on();
    }

    @Override
    public void undo() {
        livingRoomLight.off();
    }
}
