package gabrielramos.screenmatch.titles;

import gabrielramos.screenmatch.titles.exception.RuntimeCollectErrorException;

import java.util.Objects;

public class Title implements Comparable<Title>{
    private String name;
    private int durationMinutes;
    private int releaseYear;
    private boolean includedInThePlan;
    private double averageRating = 0;
    private int totalRatings = 0;
    private double sumOfRatings = 0;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(TitleOmdb titleOmdb) {
        this.name = titleOmdb.title();
        if (titleOmdb.runtime().replaceAll("\\D", "").equals("")){
            throw new RuntimeCollectErrorException("O tempo de duração não foi obtido!");
        }else {
            this.durationMinutes = Integer.parseInt(titleOmdb.runtime().replaceAll("\\D", ""));
        }
        this.releaseYear = Integer.parseInt(titleOmdb.year().replaceAll("\\D", ""));
    }

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

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
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
        averageRating = (double) sumOfRatings / totalRatings;

        System.out.println("Sua avaliação é: "+newReview);
    }

    @Override
    public String toString() {
        return ("\n(Nome: " + this.name
                + "\nTempo de duração: " + durationMinutes
                + " minutos!\nAno de lançamento: " + releaseYear + ")");
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
