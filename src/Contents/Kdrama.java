package Contents;

import java.util.List;

public class Kdrama implements HallyuContent {
    public String dramaName;
    public String director;
    public List<String> actor;

    Kdrama(String dramaName, String director, List<String> actor) {
        this.dramaName = dramaName;
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void printInfo() {
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
