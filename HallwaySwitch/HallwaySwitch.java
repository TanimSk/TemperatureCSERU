public class HallwaySwitch {
    boolean firstSwitchState, secondSwitchState;

    public HallwaySwitch() {
        firstSwitchState = secondSwitchState = false;
    }

    public HallwaySwitch(boolean firstSwitchState, boolean secondSwitchState) {
        this.firstSwitchState = firstSwitchState;
        this.secondSwitchState = secondSwitchState;
    }

    public void toggleFirstSwitch() {
        firstSwitchState = !firstSwitchState;
    }

    public void toggleSecondSwitch() {
        secondSwitchState = !secondSwitchState;
    }

    public int getFirstSwitchState() {
        return firstSwitchState ? 1 : 0;
    }

    public int getSecondSwitchState() {
        return secondSwitchState ? 1 : 0;
    }

    public int getLampState() {
        // if 1st and 2nd both switches are on, then the lamp will be turned on
        // else it is off
        boolean state = (firstSwitchState != secondSwitchState);
        return state ? 1 : 0;
    }
}
