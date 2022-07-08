package observerPattern.noPattern;

import junit.framework.TestCase;
import org.junit.Test;

public class SingerTest extends TestCase {

    @Test
    public void test(){
        Singer iu = new Singer("아이유");

        iu.releaseAlbum("라일락");
    }

}