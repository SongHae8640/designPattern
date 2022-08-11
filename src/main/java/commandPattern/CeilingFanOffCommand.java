package commandPattern;

public class CeilingFanOffCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.low();
    }

    @Override
    public void undo() {
        ceilingFan.high();
    }
}
