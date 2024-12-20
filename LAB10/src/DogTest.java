
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {
    @Test
    public void testName() {
        Dog rex = new Dog("Rex");
        assertEquals(rex.getName(), "Rex");
    }
    @Test
    public void testSetName() {
        Dog rex = new Dog("Rex");
        rex.setName("Bob");
        assertEquals(rex.getName(), "Bob");
    }
}
