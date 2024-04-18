import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @Test
    void getXWhenCalledWithNoArgumentsReturnIntZero(){
        // GIVEN

        // WHEN
        int actual = PlayerCharacter.getX();

        // THEN
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void getYWhenCalledWithNoArgumentsReturnIntZero(){
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
}
