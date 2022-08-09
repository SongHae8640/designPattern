package commandPattern;

import org.junit.Test;

public class DesignedRemoteControllerTest {

    @Test
    public void test(){
        DesignedRemoteController remoteController = new DesignedRemoteController();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteController.setCommand(0,lightOnCommand, lightOffCommand);
        remoteController.pressOnButton(0);
        remoteController.pressOffButton(0);

        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        remoteController.setCommand(1, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteController.pressOnButton(1);
        remoteController.pressOffButton(1);

        BathRoomLight bathRoomLight = new BathRoomLight();
        BathLightOnCommand bathLightOnCommand = new BathLightOnCommand(bathRoomLight);
        BathLightOffCommand bathLightOffCommand = new BathLightOffCommand(bathRoomLight);
        remoteController.setCommand(2,bathLightOnCommand, bathLightOffCommand);
        remoteController.pressOnButton(2);
        remoteController.pressOffButton(2);

        Tv tv = new Tv();
        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);
        remoteController.setCommand(3,tvOnCommand,tvOffCommand);
        remoteController.pressOnButton(3);
        remoteController.pressOffButton(3);

        LivingRoomLight livingRoomLight = new LivingRoomLight();
        LivingRoomLightOnCommand livingRoomLightOnCommand = new LivingRoomLightOnCommand(livingRoomLight);
        LivingRoomLightOffCommand livingRoomLightOffCommand = new LivingRoomLightOffCommand(livingRoomLight);
        remoteController.setCommand(4,livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteController.pressOnButton(4);
        remoteController.pressOffButton(4);

        System.out.println(remoteController);

    }
}
