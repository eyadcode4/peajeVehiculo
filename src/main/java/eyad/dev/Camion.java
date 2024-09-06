package eyad.dev;

public class Camion extends Vehiculo {
    private int ejes;

    public Camion(String placa, int ejes) {
        super(placa);
        this.ejes = ejes;
    }

    @Override
    public double calcularPeaje() {
        return 50.0 * ejes;
    }

    public int getEjes() {
        return ejes;
    }
}
