package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CamionTest {

    @Test
    public void testCalcularPeaje() {
        Camion camion = new Camion("AWD876", 2);
        double peaje = camion.calcularPeaje();
        assertEquals(100.0, peaje);  
    }

    @Test
    public void testGetPlaca() {
        Camion camion = new Camion("AWD876", 4);
        assertEquals("AWD876", camion.getPlaca());
    }

    @Test
    public void testGetEjes() {
        Camion camion = new Camion("AWD876", 2);
        assertEquals(2, camion.getEjes());
    }
}