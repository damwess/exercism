class ProductionRemoteControlCar implements RemoteControlCar, Comparable {

    private int victories;
    private int distance;

    public void drive() {
        this.distance += 10;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    public int compareTo(Object obj) {
        ProductionRemoteControlCar car = (ProductionRemoteControlCar) obj;

        boolean isHigherThan =
            car.getNumberOfVictories() > this.getNumberOfVictories();

        boolean isLowerThan =
            car.getNumberOfVictories() < this.getNumberOfVictories();

        if (isHigherThan) return 1;
        if (isLowerThan) return -1;

        return 0;
    }
}
