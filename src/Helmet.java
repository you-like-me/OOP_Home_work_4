public class Helmet extends Armour {
    @Override
    public int protection() {
        return 20;
    }

    @Override
    public int armor() {
        return 15;
    }

    @Override
    public String toString() {
        return "Шлем: " + super.toString();
    }
}
