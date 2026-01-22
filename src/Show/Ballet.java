import Person.Person;

import java.util.ArrayList;

public class Ballet extends MusicalShow{
    public Ballet(String title, int duration, String director, ArrayList<Actor> listOfActors, String librettoText, Person musicAuthor, Person choreographer) {
        super(title, duration, director, listOfActors, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }

    private Person
            choreographer;
}
