import java.util.*;

public class Kmovies implements HallyuContent {
    public String movieName;
    public String director;
    public List<String> actorList = new ArrayList<>();

    Kmovies(String movieName, String director, List<String> actorList) {
        this.movieName = movieName;
        this.director = director;
        this.actorList = actorList;
    }

    @Override
    public void printInfo() {

    }

    @Override
    public void getInfoFromFile() {
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
        return "Kmovies{" +
                "movieName='" + movieName + '\'' +
                ", director='" + director + '\'' +
                ", actorList=" + actorList +
                '}';
    }
}
