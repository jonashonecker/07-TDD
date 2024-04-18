import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @BeforeEach
    void setup() {
        PlayerCharacter.xPosition = 0;
        PlayerCharacter.yPosition = 0;
    }

    @Test
    void getXWhenInitializedReturnIntZero(){
        // GIVEN

        // WHEN
        int actual = PlayerCharacter.getX();

        // THEN
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void getYWhenInitializedReturnIntZero(){
        // GIVEN

        // WHEN
        int actual = PlayerCharacter.getY();

        // THEN
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void moveWhenKeyWPressedReturnIntOne(){
        // GIVEN
        String keyPressed = "W";

        // WHEN
        int actual = PlayerCharacter.move(keyPressed);

        // THEN
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void moveWhenKeySPressedReturnIntMinusOne(){
        // GIVEN
        String keyPressed = "S";

        // WHEN
        int actual = PlayerCharacter.move(keyPressed);

        // THEN
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void moveWhenKeyAPressedReturnIntMinusOne(){
        // GIVEN
        String keyPressed = "A";

        // WHEN
        int actual = PlayerCharacter.move(keyPressed);

        // THEN
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void moveWhenKeyDPressedReturnIntMinusOne(){
        // GIVEN
        String keyPressed = "D";

        // WHEN
        int actual = PlayerCharacter.move(keyPressed);

        // THEN
        int expected = 1;
        assertEquals(expected, actual);
    }

}
