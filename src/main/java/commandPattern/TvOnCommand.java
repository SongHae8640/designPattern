package commandPattern;

public class TvOnCommand implements Command {

    Tv tv;

    public TvOnCommand(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.onPower();
    }

    @Override
    public void undo() {
        tv.offPower();
    }
}
