package Person;

public class Actor extends Person {

    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Actor actor = (Actor) o;
        return height == actor.height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + getName() + "', " +
                "surname='" + getSurname() + "', " +
                "height=" + height + " cm" +
                "}";
    }

}
