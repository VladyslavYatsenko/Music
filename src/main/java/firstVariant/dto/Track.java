package firstVariant.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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
