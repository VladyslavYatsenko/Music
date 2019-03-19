package firstVariant.manager;

import firstVariant.dto.Album;
import firstVariant.dto.Artist;
import firstVariant.dto.Track;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MusicManagerStream {
    List<Album> fullAlbumsList = new ArrayList<>();

    public List<Album> getAlbums() {
        return fullAlbumsList;
    }

    public void addAlbum(List<Track> tracks, String albumName, String albumDate, List<Artist> artist) {
        fullAlbumsList.add(new Album(artist, albumName, albumDate, tracks));
    }

    public List<Album> getAlbumsByAlbumName(String albumName) {
        return fullAlbumsList.stream().filter(p -> p.getAlbumName().equals(albumName)).collect(Collectors.toList());
    }

    public List<Album> getAlbumsByYear(String year) {
        return fullAlbumsList.stream().filter(x -> x.getIssueDate().equals(year)).collect(Collectors.toList());
    }

    public List<Album> getAlbumsByTrack(String trackName) {
        List<Album> result = new ArrayList<>();
        for (int i = 0; i < fullAlbumsList.size(); i++) {
            long count = fullAlbumsList.get(i).getTracks().stream().filter(track -> track.getTrackName().equals(trackName)).count();
            if (count > 0) {
                result.add(fullAlbumsList.get(i));
            }
        }
        return result;
    }

    public List<Track> getTracksByAuthor(String authorName) {
        List<Track> result = new ArrayList<>();
        for (int i = 0; i < fullAlbumsList.size(); i++) {
            long count = fullAlbumsList.get(i).getArtists().stream().filter(author -> author.getArtistName().equals(authorName)).count();
            if (count > 0) {
                result.addAll(fullAlbumsList.get(i).getTracks());
            }
        }
        return result;
    }

    public List<Track> getTracksByAlbum(String albumName) {
        List<Track> result = new ArrayList<>();
        List<Album> albums = fullAlbumsList.stream().filter(x -> x.getAlbumName().equals(albumName)).collect(Collectors.toList());
        for (int i = 0; i < albums.size(); i++) {
            result.addAll(albums.get(i).getTracks());
        }
        return result;
    }
}
