package gabrielramos.screenmatch.calculations;

public class RecommendClassifiable {

    public void RecommendClassifiableFilter(Classifiable classifiable) {
        if (classifiable.getClassifiableEvaluate() >= 4){
            System.out.println("A obra " + classifiable.getClassifiableName() + " é muito bem avaliada, no momento!");
        }else if (classifiable.getClassifiableEvaluate() >= 2 && classifiable.getClassifiableEvaluate() < 4){
            System.out.println("A obra " + classifiable.getClassifiableName() + " é bem avaliada, no momento!");
        }else {
            System.out.println("A obra " + classifiable.getClassifiableName() + " é aconselhada a estar em sua lista!");
        }
    }
}
