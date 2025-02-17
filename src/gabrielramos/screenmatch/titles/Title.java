package gabrielramos.screenmatch.titles;

public class Title {
    private String name;
    private int durationMinutes;
    private int releaseYear;
    private boolean includedInThePlan;
    private double averageRating = 0;
    private int totalRatings = 0;
    private double sumOfRatings = 0;

    public String getName() {
        return name;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void showTechnicalSheet(){
        System.out.println("Nome: "+name);
        System.out.println("Tempo de duração: "+ durationMinutes +" minutos!");
        System.out.println("Avaliações: "+ averageRating);
        System.out.println("Incluído no plano: "+ includedInThePlan);
        System.out.println("Ano de lançamento: "+releaseYear);
    }

    public void evaluate(double newReview){
        sumOfRatings += newReview;
        totalRatings++;

        System.out.println("Sua avaliação é: "+newReview);
    }

    public void showCalculateRatingAverage(){
        if (totalRatings != 0){
            averageRating = (double) sumOfRatings / totalRatings;
            System.out.println("A média de avaliação é: "+ averageRating);
        }else {
            System.out.println(("Não há nenhuma avaliação disponível"));
        }
    }
}
