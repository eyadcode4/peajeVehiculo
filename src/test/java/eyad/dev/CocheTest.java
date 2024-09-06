package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CocheTest {

    @Test
    public void testCalcularPeaje() {
        Coche coche = new Coche("ABC123");
        double peaje = coche.calcularPeaje();
        assertEquals(100.0, peaje);
    }

    @Test
    public void testGetPlaca() {
        Coche coche = new Coche("ABC123");
        assertEquals("ABC123", coche.getPlaca());
    }
}
