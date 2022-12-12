package Contents;

import java.util.*;

public class Kmovies implements HallyuContent {
    public String movieName;    // 영화 제목
    public String director; // 영화 감독
    public List<String> actorList;  // 영화 출연진

    Kmovies(String movieName, String director, List<String> actorList) {    // 생성자 선언
        this.movieName = movieName;
        this.director = director;
        this.actorList = actorList;
    }

    @Override
    public void printInfo() {   // 함수 오버라이딩
        System.out.println("영화명: " + movieName);
        System.out.println("감독: " + director);
        System.out.println("배우: " + actorList);
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActorList() {
        return actorList;
    }

    public void setActorList(List<String> actorList) {
        this.actorList = actorList;
    }

    @Override
    public String toString() {
        return "Contents.Kmovies{" +
                "movieName='" + movieName + '\'' +
                ", director='" + director + '\'' +
                ", actorList=" + actorList +
                '}';
    }
}
