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
            case "A" -> {
                xPosition--;
                return getX();
            }
            case "D" -> {
                xPosition++;
                return getX();
            }
            default -> {
                return 0;
            }
        }
    }
}
