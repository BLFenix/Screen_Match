package gabrielramos.screenmatch.main;

import gabrielramos.screenmatch.classification.RecommendClassifiable;
import gabrielramos.screenmatch.titles.Film;
import gabrielramos.screenmatch.titles.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film sonic = new Film("Sonic", 2019);
        Film tails = new Film("Tails", 2024);
        Series aliceInBooderland = new Series("Alice in Booderland", 2015);
        RecommendClassifiable recommendByStars = new RecommendClassifiable();
        ArrayList<Film> films = new ArrayList<>();

        sonic.setIncludedInThePlan(false);
        sonic.setDurationMinutes(345);
        sonic.evaluate(10);
        System.out.println(sonic.getAverageRating());

        tails.setIncludedInThePlan(true);
        tails.setDurationMinutes(178);
        tails.evaluate(9);
        System.out.println(tails.getAverageRating());

        aliceInBooderland.setIncludedInThePlan(false);
        aliceInBooderland.evaluate(8.9);
        aliceInBooderland.evaluate(6.5);
        aliceInBooderland.evaluate(3.9);
        System.out.println(aliceInBooderland.getAverageRating());

        recommendByStars.RecommendClassifiableFilter(aliceInBooderland);

        films.add(sonic);
        films.add(tails);

        System.out.println(films);
    }
}
