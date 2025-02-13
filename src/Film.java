public class Film {

    private String name;
    private int durationInMinutes;
    private int releaseYear;
    private boolean includedInThePlan;
    private double ratingAverage = 0;
    private int totalRating = 0;
    private double ratingSum = 0;

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalRating(){
        return totalRating;
    }

    public void showTechnicalSheet(){
        System.out.println("Nome do filme: "+name);
        System.out.println("Tempo de duração: "+durationInMinutes+" minutos!");
        System.out.println("Avaliações: "+ ratingAverage);
        System.out.println("Incluído no plano: "+includedInThePlan);
        System.out.println("Ano de lançamento: "+releaseYear);
    }

    public void evaluate(double newReview){
        ratingSum += newReview;
        totalRating++;

        System.out.println("Sua avaliação é: "+newReview);
    }

    public void showCalculateRatingAverage(){
        if (totalRating != 0){
            ratingAverage = (double) ratingSum / totalRating;
            System.out.println("A média de avaliação é: "+ ratingAverage);
        }else {
            System.out.println(("Não há nenhuma avaliação disponível"));
        }
    }
}
