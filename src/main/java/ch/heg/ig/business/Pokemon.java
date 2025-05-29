package ch.heg.ig.business;

public class Pokemon {
    private final int numero;
    private final String nom;
    private final PokemonType type;

    public Pokemon(int numero, String nom, PokemonType type) {
        this.numero = numero;
        this.nom = nom;
        this.type = type;
    }

    public int getNumero() { return numero; }
    public String getNom() { return nom; }
    public PokemonType getType() { return type; }

    @Override
    public String toString() {
        return "#" + numero + " - " + nom + " [" + type + "]";
    }
}
