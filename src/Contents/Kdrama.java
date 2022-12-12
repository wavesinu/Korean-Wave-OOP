package Contents;

import java.util.List;

public class Kdrama implements HallyuContent {
    public String dramaName;    // 드라마 제목
    public String director; // 드라마 감독
    public List<String> actor;  // 출연진 리스트

    Kdrama(String dramaName, String director, List<String> actor) { // 생성자 선언
        this.dramaName = dramaName;
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void printInfo() {   // 함수 오버라이딩
        System.out.println("드라마명: " + dramaName);
        System.out.println("감독: " + director);
        System.out.println("배우: " + actor);
    }

    public String getDramaName() {
        return dramaName;
    }

    public void setDramaName(String dramaName) {
        this.dramaName = dramaName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActor() {
        return actor;
    }

    public void setActor(List<String> actor) {
        this.actor = actor;
    }
}
