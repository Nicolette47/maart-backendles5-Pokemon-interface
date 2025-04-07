public abstract class Pokemon {
    String name;
    int level;
    int hp;
    String food;
    String sound;
    String type;

    public Pokemon (String name, int level, int hp, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void feed (){
        int hpboost = 10;
        this.hp += hpboost;
        System.out.println(this.name + "is nu aan het smikkelen van " + this.food + " en je krijgt een HP boost van 10 hp." );
    }
}
