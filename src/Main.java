public class Main {
    public static void main(String[] args) {
        Film film = new Film();

        film.setName("Sonic");
        film.setIncludedInThePlan(false);
        film.setDurationInMinutes(178);
        film.setReleaseYear(2015);

        film.showCalculateRatingAverage();
    }
}
