package manager;

import dto.Album;
import dto.Artist;
import dto.Track;

import java.util.*;

public class MusicManager {

    List<Album> fullAlbumsList = new ArrayList<>();

    public List<Album> getAlbums() {
        return fullAlbumsList;
    }

    public void addAlbum(List<Track> tracks, String albumName, String albumDate, List<Artist> artist) {
        fullAlbumsList.add(new Album(artist, albumName, albumDate, tracks));
    }

    public List<Album> getAlbumsByTrack(String trackName) {
        List<Album> result = new ArrayList<>();
        for (int i = 0; i < fullAlbumsList.size(); i++) {
            for(int j=0;j<fullAlbumsList.get(i).getTracks().size();j++){
                if(fullAlbumsList.get(i).getTracks().get(j).getTrackName().equals(trackName)){
                    result.add(fullAlbumsList.get(i));
                }
            }
        }
        return result;
    }

    public List<Track> getTracksByAlbum(String albumName) {
        List<Track> result = new ArrayList<>();
        for (int i = 0; i < fullAlbumsList.size(); i++) {
            if (fullAlbumsList.get(i).getAlbumName().equals(albumName)) {
                result = fullAlbumsList.get(i).getTracks();
            }
        }
        return result;
    }

    public List<Album> getAlbumsByYear(String year) {
        List<Album> result = new ArrayList<>();
        for (int i = 0; i < fullAlbumsList.size(); i++) {
            if (fullAlbumsList.get(i).getIssueDate().equals(year)) {
                result.add(fullAlbumsList.get(i));
            }
        }
        return result;
    }

    public List<Track> getTracksByAuthor(String authorName) {
        List<Track> result = new ArrayList<>();
        for (int i = 0; i < fullAlbumsList.size(); i++) {
            for (int j = 0; j < fullAlbumsList.get(i).getArtist().size();j++) {
                if(authorName.equals(fullAlbumsList.get(i).getArtist().get(j).getArtistName())){
                    result.addAll(fullAlbumsList.get(i).getTracks());
                }
            }
        }
        return result;
    }

}
