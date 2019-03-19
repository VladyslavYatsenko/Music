package firstVariant.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@EqualsAndHashCode
public class Album {
    private List<Artist> artists;
    private String type;
    private String albumName;
    private String issueDate;
    private List<Track> tracks;

    private String checkAlbumType() {
        if (tracks.size() == 1) {
            return "Single";
        } else if (tracks.size() > 1 && tracks.size() < 5) {
            return "EP";
        } else {
            return "LP";
        }
    }

    public Album(List<Artist> artist, String albumName, String issueDate, List<Track> tracks) {
        this.artists = artist;
        this.albumName = albumName;
        this.issueDate = issueDate;
        this.tracks = tracks;
        this.type = checkAlbumType();
    }

    @Override
    public String toString() {
        return "ALBUM(NAME)-> " + albumName + "\n" +
                "ARTISTS->" + artists + "]\n" +
                "TYPE-> " + type + "\n" +
                "ISSUE DATE-> " + issueDate + "\n" +
                "TRACKS->" + tracks + "]";
    }
}
