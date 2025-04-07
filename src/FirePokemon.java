import java.util.List;
import java.util.Arrays;

public class FirePokemon extends Pokemon {

        private static final String type = "fire";
        private static final List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");


        public FirePokemon (String name, int level, int hp, String food, String sound) {
            super(name, level, hp, food, sound, type);
        }

    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getType() + " with a fireLash. " );

        switch (enemy.getType()){
            case "grass":
                System.out.println(enemy.getName() + " loses 30 hp. ");
                enemy.setHp(enemy.getHp() - 30);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 10 hp. ");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 20 hp. ");
                enemy.setHp(enemy.getHp() - 20);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 5 hp. ");
                enemy.setHp(enemy.getHp() - 5);
                break;
            default:
                System.out.println("something goes wrong " );
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");

    }



    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getType() + " with a flameThrower. " );

        switch (enemy.getType()){
            case "grass":
                System.out.println(enemy.getName() + " loses 40 hp. ");
                enemy.setHp(enemy.getHp() - 40);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 15 hp. ");
                enemy.setHp(enemy.getHp() - 15);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 25 hp. ");
                enemy.setHp(enemy.getHp() - 25);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 10 hp. ");
                enemy.setHp(enemy.getHp() - 10);
                break;
            default:
                System.out.println("something goes wrong " );
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");

    }

    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getType() + " with a pyroball. " );

        switch (enemy.getType()){
            case "grass":
                System.out.println(enemy.getName() + " loses 15 hp. ");
                enemy.setHp(enemy.getHp() - 15);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 5 hp. ");
                enemy.setHp(enemy.getHp() - 5);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 7 hp. ");
                enemy.setHp(enemy.getHp() - 7);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 2 hp. ");
                enemy.setHp(enemy.getHp() - 2);
                break;
            default:
                System.out.println("something goes wrong " );
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");

    }

    void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getType() + " with an inferno. " );

        switch (enemy.getType()){
            case "grass":
                System.out.println(enemy.getName() + " loses 50 hp. ");
                enemy.setHp(enemy.getHp() - 50);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 25 hp. ");
                enemy.setHp(enemy.getHp() - 25);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 30 hp. ");
                enemy.setHp(enemy.getHp() - 30);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 15 hp. ");
                enemy.setHp(enemy.getHp() - 15);
                break;
            default:
                System.out.println("something goes wrong " );
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");

    }


    List<String> getAttacks() {
        return attacks;
    }


    }

