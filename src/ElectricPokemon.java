import java.util.List;
import java.util.Arrays;

public class ElectricPokemon extends Pokemon{
    private static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("thunderPunch", "thunder", "electroBall", "VoltTackle");



    public ElectricPokemon (String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + "with a thunderpunch." );

        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + "loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "fire":
                System.out.println(enemy.getName() + "loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
                break;
            case "electric":
                System.out.println(enemy.getName() + "loses 2 hp");
                enemy.setHp(enemy.getHp() - 2);
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
                break;
            default:
                System.out.println("something went wrong");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }


    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + "with a thunder." );

        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + "loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
                break;
            case "fire":
                System.out.println(enemy.getName() + "loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "electric":
                System.out.println(enemy.getName() + "loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
                break;
            default:
                System.out.println("something went wrong");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }


    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + "with a electroball." );

        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + "loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
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
                System.out.println(enemy.getName() + "loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            default:
                System.out.println("something went wrong");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }
    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + "with a volttackle." );

        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + "loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
                break;
            case "fire":
                System.out.println(enemy.getName() + "loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
                break;
            case "electric":
                System.out.println(enemy.getName() + "gets 10 hp");
                enemy.setHp(enemy.getHp() + 10);
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
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
