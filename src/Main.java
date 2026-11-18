import personas.Entrenador;
import personas.LiderGimnasio;
import pokemon.Pocion;
import pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Charmander", 5, 65, 30, Pokemon.Tipo.FUEGO);
        Pokemon p2 = new Pokemon("Squirtle", 5, 65, 30, Pokemon.Tipo.AGUA);
        Pokemon p3 = new Pokemon("Bulbasaur", 5, 65, 30, Pokemon.Tipo.PLANTA);
        Pokemon p4 = new Pokemon("Mewtwo", 100, 650, 120, Pokemon.Tipo.PSIQUICO);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        p1.atacar(p4);
        System.out.println(p4.getPuntosSalud());
        p2.atacar(p4);
        System.out.println(p4.getPuntosSalud());

        Pocion p = new Pocion(3, 5);
        p.curar(p4);
        System.out.println(p4.getPuntosSalud());

        Entrenador e1 = new Entrenador("Andy", 25, p2, 3, 0, Entrenador.Clase.DOMINGUERO);
        Entrenador e2 = new Entrenador("Lucas", 26, p3, 4, 1, Entrenador.Clase.CAZABICHOS);

        System.out.println(e1);
        System.out.println(e2);

        LiderGimnasio l = new LiderGimnasio("Brock", 12, p3, 4, "Kanto", "Verde", false);

        System.out.println(l);
    }
}