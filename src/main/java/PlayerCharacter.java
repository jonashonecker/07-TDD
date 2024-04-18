import java.util.Objects;

public class PlayerCharacter {
    static int defaultPosition = 0;

    public static int getX() {
        return defaultPosition;
    }
    public static int getY() {
        return defaultPosition;
    }
    public static int move(String keyPressed) {
        if (Objects.equals(keyPressed, "W")) {
            return 1;
        } else {
            return defaultPosition;
        }
    }
}
