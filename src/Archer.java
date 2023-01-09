public class Archer extends Warrior<Bow, Armour>{
    public Archer(String name, int healthpoint, Bow bow, Armour armour) {
        super(name, healthpoint, bow, armour);
    }

    @Override
    public String toString() {
        return "Лучник: "+super.toString();
    }
}