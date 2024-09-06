package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MotoTest {

    @Test
    public void testCalcularPeaje() {
        Moto moto = new Moto("XYZ789");
        double peaje = moto.calcularPeaje();
        assertEquals(50.0, peaje);
    }

    @Test
    public void testGetPlaca() {
        Moto moto = new Moto("XYZ789");
        assertEquals("XYZ789", moto.getPlaca());
    }
}