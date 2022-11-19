package HW_OOP_Java_1;

public class Unit {
    protected int attack;
    protected int protect;
    protected int[] damage;
    protected float helth;
    protected int speed;
    protected String state;

    public Unit(int attack, int protect, int[] damage, float helth, int speed, String state) {
        this.attack = attack;
        this.protect = protect;
        this.damage = damage;
        this.helth = helth;
        this.speed = speed;
        this.state = state;

    }

    @Override
    public String toString() {
        return "A:" + attack + ", З:" + protect + ", У:" + (damage[0] + damage[1]) / 2 + ", Зд:" + helth + ", С:"
                + speed;
    }
}
