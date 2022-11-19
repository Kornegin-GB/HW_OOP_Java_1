package HW_OOP_Java_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        for (int index = 0; index < 50; index++) {
            units.add(getUnit());
        }
        getType(units, "Монах");
        // units.forEach(unit -> System.out.println(unit.toString()));
    }

    private static Unit getUnit() {
        int num = new Random().nextInt(7);
        return switch (num) {
            case 0 -> new Peasant();
            case 1 -> new Robber();
            case 2 -> new Sniper();
            case 3 -> new Wizard();
            case 4 -> new Spearmen();
            case 5 -> new Xbowman();
            default -> new Monk();
        };
    }

    private static void getType(List<Unit> units, String type) {
        for (Unit unit : units) {
            if (unit.toString().split(" ")[0].equals(type)) {
                System.out.println(unit);
            }
        }
    }
}
