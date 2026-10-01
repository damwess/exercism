import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(
        List<ProductionRemoteControlCar> cars
    ) {
        cars.sort((o1, o2) -> o1.compareTo(o2));
        return cars;
    }
}
