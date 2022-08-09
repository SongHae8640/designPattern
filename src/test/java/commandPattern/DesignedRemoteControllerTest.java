package commandPattern;

import org.junit.Test;

public class DesignedRemoteControllerTest {

    @Test
    public void test(){
        DesignedRemoteController remoteController = new DesignedRemoteController();

        Light light = new Light();
        remoteController.setCommand(0, () -> light.onLight(), () -> light.offLight());
        remoteController.pressOnButton(0);
        remoteController.pressOffButton(0);

        CeilingFan ceilingFan = new CeilingFan();
        remoteController.setCommand(1, () -> ceilingFan.high(), () -> ceilingFan.high());
        remoteController.pressOnButton(1);
        remoteController.pressOffButton(1);

        BathRoomLight bathRoomLight = new BathRoomLight();
        remoteController.setCommand(2, () -> bathRoomLight.on(), () -> bathRoomLight.off());
        remoteController.pressOnButton(2);
        remoteController.pressOffButton(2);

        Tv tv = new Tv();
        remoteController.setCommand(3, () -> tv.onPower(), () -> tv.offPower());
        remoteController.pressOnButton(3);
        remoteController.pressOffButton(3);

        LivingRoomLight livingRoomLight = new LivingRoomLight();
        remoteController.setCommand(4, () -> livingRoomLight.on(), () -> livingRoomLight.off());
        remoteController.pressOnButton(4);
        remoteController.pressOffButton(4);

        System.out.println(remoteController);

    }
}
