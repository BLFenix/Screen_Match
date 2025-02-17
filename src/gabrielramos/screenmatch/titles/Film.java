package gabrielramos.screenmatch.titles;

import gabrielramos.screenmatch.calculations.Classifiable;

public class Film extends Title implements Classifiable {

    @Override
    public int getClassifiableEvaluate() {
        return (int) getAverageRating();
    }

    @Override
    public String getClassifiableName() {
        return (String) getName();
    }
}
