package commandPattern;

public class BathLightOnCommand implements Command {

    BathRoomLight bathRoomLight;

    public BathLightOnCommand(BathRoomLight bathRoomLight){
        this.bathRoomLight = bathRoomLight;
    }

    @Override
    public void execute() {
        bathRoomLight.on();
    }
}
