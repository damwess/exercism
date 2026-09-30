public class JedliksToyCar {

  private int meters;
  private int battery = 100;

  public static JedliksToyCar buy() {
    return new JedliksToyCar();
  }

  public String distanceDisplay() {
    return String.format("Driven %d meters", this.meters);
  }

  public String batteryDisplay() {
    boolean isEmpty = this.battery == 0;

    if (isEmpty) return "Battery empty";
    return String.format("Battery at %d%%", this.battery);
  }

  public void drive() {
    if (this.battery == 0) return;
    this.meters += 20;
    this.battery -= 1;
  }
}
