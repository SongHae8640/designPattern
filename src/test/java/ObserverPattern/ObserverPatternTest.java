package ObserverPattern;

import org.junit.jupiter.api.Test;

public class ObserverPatternTest {

    @Test
    public void observerTest(){
        Singer iu = new Singer("아이유");

        Manager manager1 = new Manager("매니저1",iu);
        Reporter reporter1 = new Reporter("기자1",iu);
        Fan fan1 = new Fan("팬1",iu);
        Fan fan2 = new Fan("팬2",iu);

        iu.releaseAlbum("라일락");


        //탈덕
        System.out.println();
        iu.unregister(fan1);
        System.out.println();


        iu.releaseAlbum("스트로베리문");


    }
}
