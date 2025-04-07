import java.util.List;
import java.util.Arrays;

public class WaterPokemon extends Pokemon {
        private static final String type = "water";
    private static final List<String> attacks = Arrays.asList("Surf", "hydroPump", "hydroCanon", "rainDance");

        public WaterPokemon (String name, int level, int hp, String food, String sound) {
            super(name, level, hp, food, sound, type);
        }
    void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + "with a surf." );

        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + "loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "fire":
                System.out.println(enemy.getName() + "loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            case "electric":
                System.out.println(enemy.getName() + "loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
                break;
            default:
                System.out.println("something went wrong");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");

    }

    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + "with a hydropump." );

        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + "loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
                break;
            case "fire":
                System.out.println(enemy.getName() + "loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            case "electric":
                System.out.println(enemy.getName() + "loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 2 hp");
                enemy.setHp(enemy.getHp() - 2);
                break;
            default:
                System.out.println("something went wrong");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");

        }

    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + "with a hydroCanon." );

        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + "loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
            case "fire":
                System.out.println(enemy.getName() + "loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
                break;
            case "electric":
                System.out.println(enemy.getName() + "loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            default:
                System.out.println("something went wrong");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");



    }

    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + "with a raindance." );

        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + "gets 10 hp extra, because grass grows");
                enemy.setHp(enemy.getHp() + 10);
                break;
            case "fire":
                System.out.println(enemy.getName() + "loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            case "electric":
                System.out.println(enemy.getName() + "doesn´t loose any points. Raindance doesn´t have any effect.");
                break;
            case "water":
                System.out.println(enemy.getName() + "gets 20 hp extra, because has more water to fight with");
                enemy.setHp(enemy.getHp() + 20);
                break;
            default:
                System.out.println("something went wrong");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");

    }

    List<String> getAttacks() {
        return attacks;
    }

    }

