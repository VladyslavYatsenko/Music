package firstVariant.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Artist {
    private String artistName;
    private String country;

    @Override
    public String toString() {
        return "{Artist Name:" + artistName + ", " + "Country: " + country + "}\n" + "\t\t";
    }
}
