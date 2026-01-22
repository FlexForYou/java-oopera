package Show;

import Person.Actor;
import Person.Director;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();;


    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }


    public void printDirector() {
        System.out.println(director);
    }

    public void printAllActor() {
        for (Actor actor:listOfActors){
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой Актер уже добавлен");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, Actor oldActor) {
        for (int i = 0; i < listOfActors.size(); i++) {

            if (listOfActors.get(i).equals(oldActor)) {
                listOfActors.set(i, newActor);
            }

        }
    }

}
