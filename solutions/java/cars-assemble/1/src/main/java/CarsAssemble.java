public class CarsAssemble {

    int BASE_LOWEST_SPEED_PRODUCED_CARS = 221;

    public double productionRatePerHour(int speed) {
        int successRateOneHundred = 1;
        double successRateNinety = 90.0 / 100;
        double successRateEighty = 80.0 / 100;
        double successRateSeventySeven = 77.0 / 100;

        double successRate = 0;

        if (speed >= 1 && speed <= 4) {
            successRate = successRateOneHundred;
        } else if (speed >= 5 && speed <= 8) {
            successRate = successRateNinety;
        } else if (speed == 9) {
            successRate = successRateEighty;
        } else {
            successRate = successRateSeventySeven;
        }

        return speed * BASE_LOWEST_SPEED_PRODUCED_CARS * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed) / 60;
    }
}
