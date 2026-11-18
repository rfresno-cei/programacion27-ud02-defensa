package personas;

import pokemon.Pokemon;

public class Entrenador extends Persona {
    private int medallas;
    public enum Clase {DOMINGUERO, CAZABICHOS, MONTANYERO, PESCADOR, ORNITOLOGO}
    private Clase clase;

    public Entrenador(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon, int medallas, Clase clase) {
        super(nombre, edad, pokemonFavorito, numPokemon);
        this.medallas = medallas;
        this.clase = clase;
    }

    public Entrenador() {
    }

    public Entrenador(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon, Clase clase) {
        super(nombre, edad, pokemonFavorito, numPokemon);
        this.clase = clase;
        //this.medallas = 0;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public void ganarMedallas(int numMedallas) {
        this.setMedallas(this.getMedallas() + numMedallas);
        //this.medallas = this.medallas + numMedallas;
        //this.medallas += numMedallas;
    }

    public boolean ligaDisponible() {
        return this.getMedallas() >= 8;
    }

    public String toString() {
        return this.clase + " " + super.toString();
    }
}
