package dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Artist {
    private String artistName;
    private String country;
    @Override
    public String toString() {
        return "{Artist Name:" +artistName +", "+"Country: "+country+"}\n"+"\t\t";
    }
}
