package app;


import dto.Artist;
import dto.Track;
import manager.MusicManager;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        MusicManager musicManager = new MusicManager();

        List<Artist> acdcArtists = new ArrayList<>();
        acdcArtists.add(new Artist("Bon Scott", "UK"));
        acdcArtists.add(new Artist("Kliff Willams", "UK"));
        acdcArtists.add(new Artist("Bryan Johnson", "UK"));
        acdcArtists.add(new Artist("Angus Young", "AU"));
        acdcArtists.add(new Artist("Malkolm Young", "AU"));
        List<Track> backInBlackTracks = new ArrayList<>();
        backInBlackTracks.add(new Track("Hells Bells", "Rock", 5.12));
        backInBlackTracks.add(new Track("Shoot To Thrill", "Rock", 5.17));
        backInBlackTracks.add(new Track("Back In Black", "Rock", 4.15));
        backInBlackTracks.add(new Track("Shake A Leg ", "Rock", 4.05));
        backInBlackTracks.add(new Track("Have A Drink On Me", "Rock", 3.58));

        List<Artist> queenArtists = new ArrayList<>();
        queenArtists.add(new Artist("Freddy Mercury", "UK"));
        queenArtists.add(new Artist("Bryan May", "UK"));
        queenArtists.add(new Artist("Rojer Taylor", "UK"));
        queenArtists.add(new Artist("John Dfikon", "UK"));

        List<Track> newsOfTheWorld = new ArrayList<>();
        newsOfTheWorld.add(new Track("We Will Rock You", "Rock", 2.02));
        newsOfTheWorld.add(new Track("We Are The Champions", "Rock", 3.01));
        newsOfTheWorld.add(new Track("Sheer Heart Attack", "Rock", 3.28));
        newsOfTheWorld.add(new Track("Who Needs You", "Rock", 3.07));
        newsOfTheWorld.add(new Track("It`s Late", "Rock", 6.27));
        newsOfTheWorld.add(new Track("Get Down,Make Love", "Rock", 3.51));
        newsOfTheWorld.add(new Track("Fight From the Inside", "Rock", 3.04));
        newsOfTheWorld.add(new Track("All Dead,All Dead", "Rock", 3.10));

        musicManager.addAlbum(backInBlackTracks, "Back In Black", "1980-06-25", acdcArtists);
        musicManager.addAlbum(newsOfTheWorld, "News Of The World", "1977-10-28", queenArtists);
       // System.out.println(musicManager.getTracksByAuthor("Freddy Mercury"));

        System.out.println(musicManager.getAlbumsByYear("1980-06-25"));
        //System.out.println(musicManager.getAlbumsByTrack("We Will Rock You"));
    }
}
