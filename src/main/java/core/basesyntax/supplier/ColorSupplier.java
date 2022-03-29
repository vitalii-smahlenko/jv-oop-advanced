package core.basesyntax.supplier;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].toString().toLowerCase();
    }
}
