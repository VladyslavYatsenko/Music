package dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Track {
    private String trackName;
    private String genre;
    private double length;
    @Override
    public String toString() {
        return "{Track Name: " + trackName +
                ", Genre: " + genre +
                ", Length: " + length +"}\n";
    }
}
