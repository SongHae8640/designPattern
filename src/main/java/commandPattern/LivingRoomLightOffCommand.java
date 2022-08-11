package commandPattern;

public class LivingRoomLightOffCommand implements Command {

    LivingRoomLight livingRoomLight;

    public LivingRoomLightOffCommand(LivingRoomLight livingRoomLight){
        this.livingRoomLight = livingRoomLight;
    }

    @Override
    public void execute() {
        livingRoomLight.off();
    }

    @Override
    public void undo() {
        livingRoomLight.on();
    }
}
