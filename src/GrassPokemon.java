import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private static final String type = "grass";
    private static final List<String> attacks = Arrays.asList("leafStorm", "leaveBlade", "leechSeed", "solarBeam");


    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getType() + " with a Leafstorm. " );

        switch (enemy.getType()){
            case "grass":
                System.out.println(enemy.getName() + " loses 5 hp. ");
                enemy.setHp(enemy.getHp() - 5);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 25 hp. ");
                enemy.setHp(enemy.getHp() - 25);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 10 hp. ");
                enemy.setHp(enemy.getHp() - 10);
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

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getType() + " with a leaveblade. " );

        switch (enemy.getType()){
            case "grass":
                System.out.println(enemy.getName() + " loses 8 hp. ");
                enemy.setHp(enemy.getHp() - 8);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 40 hp. ");
                enemy.setHp(enemy.getHp() - 40);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 12 hp. ");
                enemy.setHp(enemy.getHp() - 12);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 20 hp. ");
                enemy.setHp(enemy.getHp() - 20);
                break;
            default:
                System.out.println("something goes wrong " );
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");

    }

    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getType() + " with a leechseed. " );

        switch (enemy.getType()){
            case "grass":
                System.out.println(enemy.getName() + " loses 7 hp. ");
                enemy.setHp(enemy.getHp() - 7);
                name.setHp(name.getHp() + 7);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 30 hp. ");
                enemy.setHp(enemy.getHp() - 30);
                name.setHp(name.getHp() + 30);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 11 hp. ");
                enemy.setHp(enemy.getHp() - 11);
                name.setHp(name.getHp() + 11);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 17 hp. ");
                enemy.setHp(enemy.getHp() - 17);
                name.setHp(name.getHp() + 7);
                break;
            default:
                System.out.println("something goes wrong " );
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left.");

    }

    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getType() + " with a solarbeam. " );

        switch (enemy.getType()){
            case "grass":
                System.out.println(enemy.getName() + " loses 3 hp. ");
                enemy.setHp(enemy.getHp() - 30);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 20 hp. ");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 8 hp. ");
                enemy.setHp(enemy.getHp() - 20);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 10 hp. ");
                enemy.setHp(enemy.getHp() - 5);
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


