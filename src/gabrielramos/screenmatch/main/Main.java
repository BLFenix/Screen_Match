import gabrielramos.screenmatch.classification.RecommendClassifiable;
import gabrielramos.screenmatch.titles.Film;
import gabrielramos.screenmatch.titles.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film filmSonic = new Film("Sonic", 2019);
        Film filmTails = new Film("Tails", 2024);
        Series series = new Series("Alice in Booderland", 2015);
        RecommendClassifiable recommendByStars = new RecommendClassifiable();
        ArrayList<Film> films = new ArrayList<>();

        filmSonic.setIncludedInThePlan(false);
        filmSonic.setDurationMinutes(345);

        filmSonic.showCalculateRatingAverage();

        filmTails.setIncludedInThePlan(true);
        filmTails.setDurationMinutes(178);

        filmTails.showCalculateRatingAverage();

        series.setIncludedInThePlan(false);

        series.evaluate(8.9);
        series.evaluate(6.5);
        series.evaluate(3.9);

        series.showCalculateRatingAverage();

        recommendByStars.RecommendClassifiableFilter(series);

        films.add(filmSonic);
        films.add(filmTails);

        System.out.println(films);
    }
}
