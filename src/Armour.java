public abstract class Armour implements Def {
    public abstract int protection();

    @Override
    public String toString() {
        return String.format("Защита %d  величина брони %d",protection(), armor());
    }
}
