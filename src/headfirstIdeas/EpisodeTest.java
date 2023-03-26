package headfirstIdeas;

public class EpisodeTest {
    public static void main(String[] args) {
        Episode episode = new Episode();

        episode.seriesNumber  = 4;
        episode.episodeNumber = 6;
        episode.skipIntro();
        episode.skipToNextEp();
    }
}
