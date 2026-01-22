import Person.*;
import Show.*;

public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        //Задание №1
        Actor actor1 = new Actor("Том", "Хэнкс", Gender.MALE, 183);
        Actor actor2 = new Actor("Мерил", "Стрип", Gender.FEMALE, 172);
        Actor actor3 = new Actor("Леонардо", "Ди Каприо", Gender.MALE, 180);
        Director director1 = new Director("Стивен", "Спилберг", Gender.MALE, 75);
        Director director2 = new Director("Хлоя", "Чжао", Gender.FEMALE, 8);
        Person choreographer = new Person("Анна", "Иванова", Gender.FEMALE);
        Person musicAuthor = new Person("Мик", "Гордон", Gender.MALE);

        //Задание №2
        Show show = new Show("Снегурочка", 120, director1);
        Opera opera = new Opera("Кармен", 180, director2, musicAuthor, 40);
        Ballet ballet = new Ballet("Лебединое озеро", 135, director1, musicAuthor, choreographer);
        opera.setLibrettoText("Текст Либретто для оперы");
        ballet.setLibrettoText("Текст Либретто для балета");

        //Задание №3
        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor2);

        //Задание №4
        show.printAllActor();
        opera.printAllActor();
        ballet.printAllActor();

        //Задание №5
        show.replaceActor(actor3, actor2);
        show.printAllActor();

        //Задание №6
        opera.replaceActor(actor1, actor3);

        System.out.println("------------------------------------");

        //Задание №7
        opera.getLibrettoText();
        ballet.getLibrettoText();

    }
}
