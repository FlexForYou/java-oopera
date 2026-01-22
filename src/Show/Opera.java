package Show;

import Person.*;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director,  Person musicAuthor, int choirSize) {
        super(title, duration, director,  musicAuthor);
        this.choirSize = choirSize;
    }
}
