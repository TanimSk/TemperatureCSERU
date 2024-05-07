public class HallWaySwitchV2 {
    boolean firstSwitchState, secondSwitchState;

    public HallWaySwitchV2() {
        firstSwitchState = secondSwitchState = false;
    }

    public HallWaySwitchV2(boolean firstSwitchState, boolean secondSwitchState) {
        this.firstSwitchState = firstSwitchState;
        this.secondSwitchState = secondSwitchState;
    }

    public void toggleSwitch(int switchNum) {
        if (switchNum == 1) {
            firstSwitchState = !firstSwitchState;
        } else if (switchNum == 2) {
            secondSwitchState = !firstSwitchState;
        }
    }

    public int getSwitchState(int switchNum) {
        if (switchNum == 1) {
            return firstSwitchState ? 1 : 0;
        } else if (switchNum == 2) {
            return secondSwitchState ? 1 : 0;
        }
        return -1;
    }


    public int getLampState() {
        // if 1st and 2nd both switches are on, then the lamp will be turned on
        // else it is off
        boolean state = (firstSwitchState != secondSwitchState);
        return state ? 1 : 0;
    }
}
