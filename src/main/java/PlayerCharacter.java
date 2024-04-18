public class PlayerCharacter {
    static int xPosition = 0;
    static int yPosition = 0;

    public static int getX() {
        return xPosition;
    }
    public static int getY() {
        return yPosition;
    }
    public static int move(String keyPressed) {
        switch (keyPressed) {
            case "W" -> {
                yPosition++;
                return getY();
            }
            case "S" -> {
                yPosition--;
                return getY();
            }
            default -> {
                return 0;
            }
        }
    }
}
