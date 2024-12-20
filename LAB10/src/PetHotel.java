import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class PetHotel {
    HashMap<String, Integer> guests;

    public PetHotel() {
        guests = new HashMap<>();
    }
    public void addGuest(String guest, int room) {
        guests.put(guest, room);
    }
    public void showGuests() {
        for(Map.Entry<String, Integer> caine : guests.entrySet()) {
            System.out.println(caine.getKey() + ": " + caine.getValue());
        }
    }
}
