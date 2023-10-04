import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests {
    @DisplayName("Ungueltiger Pfad")
    @Test
    public void pfadUngueltigTest(){
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> mapOriginal = new HashMap<>();
        try {
            Paar paar = new Paar(null);
            map.put(0, "Hund" + " - " + "https://creazilla-store.fra1.digitaloceanspaces.com/cliparts/6007/dog-clipart-md.png");
            map.put(1, "Baum" + " - " + "https://i.pinimg.com/originals/c5/17/da/c517da1b29ac7d142f40f489fb9d32ce.jpg");
            mapOriginal = paar.getMap();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(map, mapOriginal);
    }

}
