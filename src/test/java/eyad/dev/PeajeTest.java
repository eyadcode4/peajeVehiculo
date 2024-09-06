package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PeajeTest {

    @Test
    public void testRegistraCoche() {
        Peaje peaje = new Peaje("Peaje principal", "mADRID");
        Vehiculo coche = new Coche("qwe555");

        peaje.registraVehiculo(coche);
        assertEquals(100.0, peaje.getValorTotalRecolectado());
    }

    @Test
    public void testRegistrarMoto() {
        Peaje peaje = new Peaje("Peaje principal", "mADRID");
        Vehiculo moto = new Moto("POI890");

        peaje.registraVehiculo(moto);
        assertEquals(50.0, peaje.getValorTotalRecolectado());
    }

    @Test
    public void testRegistrarCamion() {
        Peaje peaje = new Peaje("Peaje principal", "mADRID");
        Vehiculo camion = new Camion("IUY789", 2);

        peaje.registraVehiculo(camion);
        assertEquals(100.0, peaje.getValorTotalRecolectado());
    }

    @Test
    public void testValorTotalRecolectadoConVariosVehiculos() {
        Peaje peaje = new Peaje("Peaje principal", "mADRID");
        Vehiculo coche = new Coche("qwe555");
        Vehiculo moto = new Moto("POI890");
        Vehiculo camion = new Camion("IUY789", 3);

        peaje.registraVehiculo(coche);
        peaje.registraVehiculo(moto);
        peaje.registraVehiculo(camion);

        assertEquals(300.0, peaje.getValorTotalRecolectado());
    }

    @Test
    public void testImprimirListado() {
        Peaje peaje = new Peaje("Peaje principal", "mADRID");
        Vehiculo coche = new Coche("qwe555");
        Vehiculo moto = new Moto("POI890");

        peaje.registraVehiculo(coche);
        peaje.registraVehiculo(moto);

        assertEquals(150.0, peaje.getValorTotalRecolectado());
        
        peaje.imprimirListado(); 
    }
}