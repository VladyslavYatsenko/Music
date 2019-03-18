package dto;

import lombok.*;

import java.util.List;


@Getter
@Setter
@EqualsAndHashCode

public class Album {
    private List<Artist> artist;
    private String type;
    private String albumName;
    private String issueDate;
    private List<Track> tracks;

    public String checkAlbumType() {
        if (tracks.size() == 1) {
            return "Single";
        } else if (tracks.size() > 1 && tracks.size() < 5) {
            return "EP";
        } else {
            return "LP";
        }
    }

    public Album(List<Artist> artist, String albumName, String issueDate, List<Track> tracks) {
        this.artist = artist;
        this.albumName = albumName;
        this.issueDate = issueDate;
        this.tracks = tracks;
        this.type = checkAlbumType();
    }

    @Override
    public String toString() {
        return "ALBUM(NAME)-> " + albumName + "\n" +
                "ARTISTS->" + artist + "]\n" +
                "TYPE-> " + type + "\n" +
                "ISSUE DATE-> " + issueDate + "\n" +
                "TRACKS->" + tracks + "]";
    }
}
