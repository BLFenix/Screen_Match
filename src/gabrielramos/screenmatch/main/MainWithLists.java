package gabrielramos.screenmatch.main;
import gabrielramos.screenmatch.titles.Film;
import gabrielramos.screenmatch.titles.Series;
import gabrielramos.screenmatch.titles.Title;

import java.util.ArrayList;

public class MainWithLists {
    public static void main(String[] args) {
        Film sonic = new Film("Sonic", 2019);
        sonic.evaluate(8);
        Film tails = new Film("Tails", 2024);
        tails.evaluate(7);
        Series aliceInBooderland = new Series("Alice in Booderland", 2015);
        aliceInBooderland.evaluate(10);
        ArrayList<Title> titles = new ArrayList<>();

        titles.add(sonic);
        titles.add(tails);
        titles.add(aliceInBooderland);

        for (Title item : titles){
            System.out.println(item);
            if (item instanceof Film film) {
                System.out.println(film.getClassifiableEvaluate() + " estrelas");
            } else if (item instanceof Series series) {
                System.out.println(series.getClassifiableEvaluate() + " estrelas");
            }
        }
    }
}
