public class HallwaySwitchRunner {
    public static void main(String[] args) {

        HallwaySwitch hallwaySwitch1 = new HallwaySwitch();

        System.out.println("------------------------ Hall a -------------------------------");
        System.out.println("Switch 1 Status: " + hallwaySwitch1.getFirstSwitchState());
        System.out.println("Switch 2 Status: " + hallwaySwitch1.getSecondSwitchState());
        System.out.println("Lamp Status: " + hallwaySwitch1.getLampState());

        System.out.println("----------------------------------------------------------");

        hallwaySwitch1.toggleFirstSwitch();
        hallwaySwitch1.toggleSecondSwitch();

        System.out.println("Switch 1 Status: " + hallwaySwitch1.getFirstSwitchState());
        System.out.println("Switch 2 Status: " + hallwaySwitch1.getSecondSwitchState());
        System.out.println("Lamp Status: " + hallwaySwitch1.getLampState());


        // Another HallWaySwitch Instance
        HallwaySwitch hallwaySwitch2 = new HallwaySwitch(true, false);

        System.out.println("------------------------ Hall b -------------------------------");

        System.out.println("Switch 1 Status: " + hallwaySwitch2.getFirstSwitchState());
        System.out.println("Switch 2 Status: " + hallwaySwitch2.getSecondSwitchState());
        System.out.println("Lamp Status: " + hallwaySwitch2.getLampState());
        hallwaySwitch2.toggleSecondSwitch();

        System.out.println("----------------------------------------------------------");

        System.out.println("Switch 1 Status: " + hallwaySwitch2.getFirstSwitchState());
        System.out.println("Switch 2 Status: " + hallwaySwitch2.getSecondSwitchState());
        System.out.println("Lamp Status: " + hallwaySwitch2.getLampState());
    }
}
