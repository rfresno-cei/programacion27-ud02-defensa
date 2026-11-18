package pokemon;

public class Pocion {
    private int puntosRestaurados;
    private double precio;

    public Pocion(int puntosRestaurados, double precio) {
        this.puntosRestaurados = puntosRestaurados;
        this.precio = precio;
    }

    public Pocion() {
    }

    public int getPuntosRestaurados() {
        return puntosRestaurados;
    }

    public void setPuntosRestaurados(int puntosRestaurados) {
        this.puntosRestaurados = puntosRestaurados;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void curar(Pokemon pokemon) {
        pokemon.setPuntosSalud(pokemon.getPuntosSalud() + this.puntosRestaurados);
    }

    public double getPrecioConImpuesto(double impuesto) {
        return this.precio + this.precio * impuesto / 100;
        // return this.precio * (1 + impuesto / 100);
    }

    public String toString() {
        return "Poción: " + this.precio + " Pokédólares";
    }
}
