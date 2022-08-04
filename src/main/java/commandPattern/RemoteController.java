package commandPattern;

public class RemoteController {

    BathRoomLight bathRoomLight = new BathRoomLight();
    CeilingFan ceilingFan = new CeilingFan();
    Light light = new Light();
    LivingRoomLight livingRoomLight = new LivingRoomLight();
    Tv tv = new Tv();

    public void clickOnButton(int buttonNumber) throws Exception {
        if(buttonNumber == 0){
            bathRoomLight.on();
        }else if(buttonNumber == 1){
            ceilingFan.high();;
        }else if(buttonNumber == 2){
            light.onLight();
        }else if(buttonNumber == 3){
            livingRoomLight.on();
        }else if(buttonNumber == 4){
            tv.onPower();
        }else{
            throw new Exception();
        }
    }

    public void clickOffButton(int buttonNumber) throws Exception {
        if(buttonNumber == 0){
            bathRoomLight.off();
        }else if(buttonNumber == 1){
            ceilingFan.low();;
        }else if(buttonNumber == 2){
            light.offLight();
        }else if(buttonNumber == 3){
            livingRoomLight.off();
        }else if(buttonNumber == 4){
            tv.offPower();
        }else{
            throw new Exception();
        }
    }

}
