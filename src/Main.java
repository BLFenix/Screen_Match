import gabrielramos.screenmatch.calculations.RecommendClassifiable;
import gabrielramos.screenmatch.titles.Film;
import gabrielramos.screenmatch.titles.Series;

public class Main {
    public static void main(String[] args) {
        Film film = new Film();
        Series series = new Series();

        film.setName("Sonic");
        film.setIncludedInThePlan(false);
        film.setDurationMinutes(178);
        film.setReleaseYear(2015);

        film.showCalculateRatingAverage();

        series.setName("Sonic");
        series.setIncludedInThePlan(false);
        series.setDurationMinutes(178);
        series.setReleaseYear(2015);

        series.evaluate(8.9);
        series.evaluate(6.5);
        series.evaluate(3.9);

        series.showCalculateRatingAverage();

        RecommendClassifiable recommendByStars = new RecommendClassifiable();

        recommendByStars.RecommendClassifiableFilter(series);
    }
}
