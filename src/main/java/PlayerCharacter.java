import java.util.Objects;

public class PlayerCharacter {
    public static int getX() {
        return 0;
    }
    public static int getY() {
        return 0;
    }
    public static int move(String keyPressed) {
        if (Objects.equals(keyPressed, "W")) {
            return 1;
        } else {
            return 0;
        }
    }
}
