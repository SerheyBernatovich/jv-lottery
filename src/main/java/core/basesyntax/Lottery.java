package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomeBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_BALL_NUMBER);
        return new Ball(color, number);
    }
}
