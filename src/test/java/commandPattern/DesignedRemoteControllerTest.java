package commandPattern;

import org.junit.Test;

public class DesignedRemoteControllerTest {

    @Test
    public void test(){
        DesignedRemoteController remoteController = new DesignedRemoteController();

        LightOnCommand lightOnCommand = new LightOnCommand(new Light());
        remoteController.setCommand(lightOnCommand);
        remoteController.pressOnButton();

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(new CeilingFan());
        remoteController.setCommand(ceilingFanOnCommand);
        remoteController.pressOnButton();

    }
}
