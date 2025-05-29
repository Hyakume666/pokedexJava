package ch.heg.ig.datastructure;

import ch.heg.ig.business.*;
import java.util.*;


public interface PokemonRepository {
    void ajouterPokemon(Pokemon p);
    Pokemon chercherParNumero(int numero);
    List<Pokemon> afficherTous();
}