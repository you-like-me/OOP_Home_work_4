public class Shield extends Armour {
    @Override
    public int protection() {
        return 90;
    }

    @Override
    public int armor() {
        return 100;
    }

    @Override
    public String toString() {
        return "Щит: " + super.toString();
    }
}
