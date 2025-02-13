public class Main {
    public static void main(String[] args) {
        Film film = new Film();

        film.name = "Sonic";
        film.includedInThePlan = false;
        film.durationInMinutes = 178;
        film.releaseYear = 2015;

        film.showcalculateRatingAverage();
    }
}
