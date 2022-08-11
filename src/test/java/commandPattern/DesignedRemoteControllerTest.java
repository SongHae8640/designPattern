package commandPattern;

import org.junit.Test;

public class DesignedRemoteControllerTest {

    @Test
    public void commandTest(){
        DesignedRemoteController remoteController = getDesignedRemoteController();

        remoteController.pressOnButton(1);
        remoteController.pressOffButton(1);

        remoteController.pressOnButton(2);
        remoteController.pressOffButton(2);

        remoteController.pressOnButton(3);
        remoteController.pressOffButton(3);

        remoteController.pressOnButton(4);
        remoteController.pressOffButton(4);

        System.out.println(remoteController);

    }

    private DesignedRemoteController getDesignedRemoteController() {
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


        BathRoomLight bathRoomLight = new BathRoomLight();
        BathLightOnCommand bathLightOnCommand = new BathLightOnCommand(bathRoomLight);
        BathLightOffCommand bathLightOffCommand = new BathLightOffCommand(bathRoomLight);
        remoteController.setCommand(2,bathLightOnCommand, bathLightOffCommand);


        Tv tv = new Tv();
        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);
        remoteController.setCommand(3,tvOnCommand,tvOffCommand);


        LivingRoomLight livingRoomLight = new LivingRoomLight();
        LivingRoomLightOnCommand livingRoomLightOnCommand = new LivingRoomLightOnCommand(livingRoomLight);
        LivingRoomLightOffCommand livingRoomLightOffCommand = new LivingRoomLightOffCommand(livingRoomLight);
        remoteController.setCommand(4,livingRoomLightOnCommand, livingRoomLightOffCommand);
        return remoteController;
    }
}
