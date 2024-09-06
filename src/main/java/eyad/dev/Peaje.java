package eyad.dev;

import java.util.ArrayList;
import java.util.List;

public class Peaje {
    private String nombre;
    private String ciudad;
    private double valorTotalRecolectado;
    private List<Vehiculo> vehiculos;

    public Peaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.vehiculos = new ArrayList<>();
        this.valorTotalRecolectado = 0.0;
    }

    public void registraVehiculo(Vehiculo vehiculo) {
        double peaje = vehiculo.calcularPeaje();
        valorTotalRecolectado += peaje;
        vehiculos.add(vehiculo);
    }

    public double getValorTotalRecolectado() {
        return valorTotalRecolectado;
    }

    public void imprimirListado() {
        System.out.println("Estación de Peaje: " + nombre + " en " + ciudad);
        System.out.println("Vehículos que pasaron por el peaje:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("- " + vehiculo.getPlaca() + " pagó: $" + vehiculo.calcularPeaje());
        }
        System.out.println("Total Recolectado: $" + valorTotalRecolectado);
    }
}