package Show;

import Person.*;

import java.util.ArrayList;

public class Ballet extends MusicalShow {


    private Person choreographer;

    public Ballet(String title, int duration, Director director,  Person musicAuthor, Person choreographer) {
        super(title, duration, director,  musicAuthor);
        this.choreographer = choreographer;
    }

}
