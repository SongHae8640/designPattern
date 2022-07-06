package ObserverPattern.noPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingerTest {

    @Test
    public void test(){
        Singer iu = new Singer("아이유");

        iu.releaseAlbum("라일락");
    }

}