public class RangeInput {
    private int minTemperature, maxTemperature, currentTemperature;

    private void calculateAverage() {
        currentTemperature = (minTemperature + maxTemperature) / 2;
    }

    public RangeInput() {
        minTemperature = 60;
        maxTemperature = 80;
        calculateAverage();
    }

    public RangeInput(int min, int max) {
        minTemperature = min;
        maxTemperature = max;
        calculateAverage();
    }

    public void up() {
        currentTemperature = Math.min(currentTemperature + 1, maxTemperature);
    }

    public void down() {
        currentTemperature = Math.max(currentTemperature - 1, minTemperature);
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}
