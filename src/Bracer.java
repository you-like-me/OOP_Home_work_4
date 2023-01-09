public class Bracer extends Armour {
    @Override
    public int protection() {
        return 105;
    }

    @Override
    public int armor() {
        return 160;
    }

    @Override
    public String toString() {
        return "Наручи: " + super.toString();
    }
}
