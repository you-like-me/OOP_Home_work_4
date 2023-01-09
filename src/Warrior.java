public abstract class Warrior <T extends Weapon, D extends Def>  {
    private  String name;
    private int healthpoint;
    private T weapon;
    private D def;

    @Override
    public String toString() {
        return String.format("name: %s, здоровье: %d, вооружен: %s, защита: %s", name,healthpoint,weapon.toString(),
                def.toString());
    }

    public Warrior(String name, int healthpoint, T weapon, D def) {
        this.name = name;
        this.healthpoint = healthpoint;
        this.weapon = weapon;
        this.def = def;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthpoint() {
        return healthpoint;
    }

    public void setHealthpoint(int healthpoint) {
        this.healthpoint = healthpoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public D getDef() {
        return def;
    }

    public void setDef(D def) {
        this.def = def;
    }
}