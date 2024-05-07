public class RangeInputRunner {

    public static void main(String[] args) {
        RangeInput rangeInput1 = new RangeInput(10, 50);

        rangeInput1.up();
        rangeInput1.up();
        rangeInput1.up();
        rangeInput1.down();
        rangeInput1.down();

        System.out.println("Temperature of rangeInput1: " + rangeInput1.getCurrentTemperature());


        RangeInput rangeInput2 = new RangeInput();

        rangeInput2.up();
        rangeInput2.up();
        rangeInput2.down();

        System.out.println("Current Temperature: " + rangeInput2.getCurrentTemperature());
    }
}
