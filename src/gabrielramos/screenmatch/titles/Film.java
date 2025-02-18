package gabrielramos.screenmatch.titles;

import gabrielramos.screenmatch.classification.Classifiable;

public class Film extends Title implements Classifiable {

    public Film(String name, int releaseYear) {
        super(name, releaseYear);
    }

    @Override
    public int getClassifiableEvaluate() {
        return (int) getAverageRating() / 2;
    }

    @Override
    public String getClassifiableName() {
        return (String) getName();
    }
}
