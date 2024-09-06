package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CamionTest {

    @Test
    public void testCalcularPeaje() {
        Camion camion = new Camion("LMN456", 4);
        double peaje = camion.calcularPeaje();
        assertEquals(200.0, peaje);  
    }

    @Test
    public void testGetPlaca() {
        Camion camion = new Camion("LMN456", 4);
        assertEquals("LMN456", camion.getPlaca());
    }

    @Test
    public void testGetEjes() {
        Camion camion = new Camion("LMN456", 4);
        assertEquals(4, camion.getEjes());
    }
}