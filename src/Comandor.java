public class Comandor extends Warrior<Weapon, Def>{
    public Comandor(String name, int healthpoint, Weapon weapon, Def def) {
        super(name, healthpoint, weapon, def);
    }

    @Override
    public String toString() {
        return "Командир: "+ super.toString();
    }
}