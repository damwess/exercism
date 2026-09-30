class NeedForSpeed {

  public int speed;
  public int batteryDrain;
  private int meters;
  private int battery = 100;

  public NeedForSpeed(int speed, int batteryDrain) {
    this.speed = speed;
    this.batteryDrain = batteryDrain;
  }

  public boolean batteryDrained() {
    return this.battery < this.batteryDrain;
  }

  public int distanceDriven() {
    return this.meters;
  }

  public void drive() {
    if (this.batteryDrained()) return;
    this.meters += this.speed;
    this.battery -= this.batteryDrain;
  }

  public static NeedForSpeed nitro() {
    return new NeedForSpeed(50, 4);
  }
}

class RaceTrack {

  public int distance;

  RaceTrack(int distance) {
    this.distance = distance;
  }

  public boolean canFinishRace(NeedForSpeed car) {
    while (car.distanceDriven() < this.distance) {
      if (car.batteryDrained()) return false;
      car.drive();
    }
    return true;
  }
}
