import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircuitTest {

    @Test
    void getFirstSwitchState() {
        HallwaySwitch hallwaySwitch1 = new HallwaySwitch(true, false);
        assertEquals(hallwaySwitch1.getFirstSwitchState(), 1);

        hallwaySwitch1.toggleFirstSwitch();
        assertEquals(hallwaySwitch1.getLampState(), 0);

        hallwaySwitch1.toggleFirstSwitch();
        assertEquals(hallwaySwitch1.getLampState(), 1);

        hallwaySwitch1.toggleFirstSwitch();
        hallwaySwitch1.toggleFirstSwitch();
        assertEquals(hallwaySwitch1.getLampState(), 1);
    }

    @Test
    void getSecondSwitchState() {
        HallwaySwitch hallwaySwitch1 = new HallwaySwitch(true, false);
        assertEquals(hallwaySwitch1.getSecondSwitchState(), 0);

        hallwaySwitch1.toggleSecondSwitch();
        assertEquals(hallwaySwitch1.getSecondSwitchState(), 1);

        hallwaySwitch1.toggleSecondSwitch();
        assertEquals(hallwaySwitch1.getSecondSwitchState(), 0);

        hallwaySwitch1.toggleSecondSwitch();
        hallwaySwitch1.toggleSecondSwitch();
        assertEquals(hallwaySwitch1.getSecondSwitchState(), 0);
    }

    @Test
    void getLampState() {
        HallwaySwitch hallwaySwitch1 = new HallwaySwitch(false, false);
        assertEquals(hallwaySwitch1.getLampState(), 0);

        hallwaySwitch1.toggleSecondSwitch();
        assertEquals(hallwaySwitch1.getLampState(), 1);

        hallwaySwitch1.toggleFirstSwitch();
        assertEquals(hallwaySwitch1.getLampState(), 0);
    }
}