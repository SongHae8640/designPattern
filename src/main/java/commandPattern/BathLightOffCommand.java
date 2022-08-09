package commandPattern;

public class BathLightOffCommand implements Command {

    BathRoomLight bathRoomLight;

    public BathLightOffCommand(BathRoomLight bathRoomLight){
        this.bathRoomLight = bathRoomLight;
    }

    @Override
    public void execute() {
        bathRoomLight.off();
    }
}
