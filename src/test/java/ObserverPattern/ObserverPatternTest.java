package ObserverPattern;

import org.junit.jupiter.api.Test;

public class ObserverPatternTest {

    @Test
    public void observerTest(){
        Influencer iu = new Influencer("아이유");

        Subscriber iuManager = new Subscriber("아이유 매니저");
        iuManager.subscribe(iu);
        Subscriber iuCeo = new Subscriber("아이유 소속사 사장");
        iuCeo.subscribe(iu);

        Subscriber people1 = new Subscriber("사람1");
        people1.subscribe(iu);
        Subscriber people2 = new Subscriber("사람2");
        people2.subscribe(iu);
        iu.postMessage("브로커 개봉~ 많관부~");

        System.out.println();

        Influencer coldPlay = new Influencer("콜드플레이");
        people1.subscribe(coldPlay);
        people2.subscribe(coldPlay);
        coldPlay.postMessage("Hi Korea 내한!!");

        System.out.println();

        people1.cancelSubscription(iu);
        iu.postMessage("싱글 발매!");

        System.out.println();

        coldPlay.postMessage("한쿡 싸랑해요");



    }
}
