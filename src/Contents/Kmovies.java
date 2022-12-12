package Contents;

import java.util.*;

public class Kmovies implements HallyuContent {
    public String movieName;
    public String director;
    public List<String> actorList;

    Kmovies(String movieName, String director, List<String> actorList) {
        this.movieName = movieName;
        this.director = director;
        this.actorList = actorList;
    }

    @Override
    public void printInfo() {
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
