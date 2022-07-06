package ObserverPattern.noPattern;

import java.util.ArrayList;
import java.util.List;

public class Singer {
    private String name;
    private List<String> albums;

    public Singer(String name) {
        this.name = name;
        albums = new ArrayList<>();
    }

    public void releaseAlbum(String newAlbum) {
        System.out.printf("Singer(%s).releaseAlbum :: newAlbum=%s\n",this.name,newAlbum);
        albums.add(newAlbum);

        Fan fan = new Fan("팬1");
        fan.update(newAlbum);

        Reporter reporter = new Reporter("기자1");
        reporter.update(newAlbum);

        Manager manager = new Manager("매니저1");
        manager.update(newAlbum);

        //...
        // 구현 클래스를 이용했기 때문에 새로운 작업이 추가 될때 마다 주체에 변화가 생김
        // 실행중에 앨범을 듣는 객체를 추가/삭제 하지 못함
        // 공통된 인터페이스를 사용중

    }
}
