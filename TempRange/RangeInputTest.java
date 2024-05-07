import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class RangeInputTest {
    RangeInput remoteInput1 = new RangeInput(20, 40);
    RangeInput remoteInput2 = new RangeInput();

    @Test
    void up() {
        remoteInput1.up();
        remoteInput1.up();
        assertEquals(32, remoteInput1.getCurrentTemperature());

        remoteInput2.up();
        remoteInput2.up();
        remoteInput2.up();
        assertEquals(73, remoteInput2.getCurrentTemperature());

        // Testing Range of remoteInput1
        for (int i = 0; i < 200; i++) {
            remoteInput1.up();
        }
        assertEquals(40, remoteInput1.getCurrentTemperature());

        // Testing Range of remoteInput2
        for (int i = 0; i < 200; i++) {
            remoteInput2.up();
        }
        assertEquals(80, remoteInput2.getCurrentTemperature());

    }

    @Test
    void down() {
        remoteInput1.down();
        remoteInput1.down();
        assertEquals(28, remoteInput1.getCurrentTemperature());

        remoteInput2.down();
        assertEquals(69, remoteInput2.getCurrentTemperature());

        // Testing Range of remoteInput1
        for (int i = 0; i < 200; i++) {
            remoteInput1.down();
        }
        assertEquals(20, remoteInput1.getCurrentTemperature());

        // Testing Range of remoteInput2
        for (int i = 0; i < 200; i++) {
            remoteInput2.down();
        }
        assertEquals(60, remoteInput2.getCurrentTemperature());
    }

    @Test
    void getCurrentTemperature() {
        remoteInput1.up();
        remoteInput1.down();
        assertEquals(30, remoteInput1.getCurrentTemperature());

        remoteInput2.up();
        remoteInput2.down();
        assertEquals(70, remoteInput2.getCurrentTemperature());

    }
}