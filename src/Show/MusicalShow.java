package Show;

import Person.*;

import java.util.ArrayList;

public class MusicalShow extends Show {

    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
    }

    public void getLibrettoText() {
        System.out.println( librettoText);
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }
}
