import java.util.List;
import java.util.Arrays;

public class FirePokemon extends Pokemon {

        private static final String type = "fire";
        private static final List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");


        public FirePokemon (String name, int level, int hp, String food, String sound) {
            super(name, level, hp, food, sound, type);
        }
    void fireLash(Pokemon name, Pokemon enemy);
    void flameThrower(Pokemon name, Pokemon enemy);
    void pyroBall(Pokemon name, Pokemon enemy);
    void inferno(Pokemon name, Pokemon enemy);


    List<String> getAttacks() {
        return attacks;
    }


    }

