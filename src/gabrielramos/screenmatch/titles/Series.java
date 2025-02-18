package gabrielramos.screenmatch.titles;
import gabrielramos.screenmatch.classification.Classifiable;

public class Series extends Title implements Classifiable {
    private int seasons;
    private int episodesPerSeasons;
    private boolean releaseStatus;
    private int minutesPerEpisodes;

    public Series(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeasons() {
        return episodesPerSeasons;
    }

    public void setEpisodesPerSeasons(int episodesPerSeasons) {
        this.episodesPerSeasons = episodesPerSeasons;
    }

    public boolean isReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(boolean releaseStatus) {
        this.releaseStatus = releaseStatus;
    }

    public int getMinutesPerEpisodes() {
        return minutesPerEpisodes;
    }

    public void setMinutesPerEpisodes(int minutesPerEpisodes) {
        this.minutesPerEpisodes = minutesPerEpisodes;
    }

    @Override
    public int getDurationMinutes() {
        return seasons * episodesPerSeasons * minutesPerEpisodes;
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
