package HW_OOP_Java_1;

public class Spearmen extends Unit {

    public Spearmen() {
        super(4, 5, new int[] { 1, 3 }, 10, 4, "Stand");
    }

    @Override
    public String toString() {
        return "Копейщик -- " + super.toString() + ", " + state;
    }
}
