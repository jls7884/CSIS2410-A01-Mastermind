import java.util.Random;

public enum Colors {
    RED, YELLOW, BLUE, GREEN, WHITE, BLACK;

    public static Colors getRandomColor() {
        Random rnd = new Random();
        return values()[rnd.nextInt(values().length)];
    }
}
