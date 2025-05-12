import com.sun.javafx.scene.control.skin.VirtualFlow;
import parkingSpot.CarSpot;
import parkingSpot.ParkingSpot;
import parkingSpot.spotType;
import vehicle.Car;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome ! to my private parking lot ");
        List<Vehicle> vehicleList = new ArrayList<>();

        List<ParkingSpot> parkingSpotList = new ArrayList<>();

        Vehicle car1 = new Car();
        car1.setRegistrationNumber("TS06WX0644");

        Vehicle car2 = new Car();
        car2.setRegistrationNumber("TS09JJ0008");

        ParkingSpot p1 = new CarSpot("P001", spotType.Compact);
        ParkingSpot p2 = new CarSpot("P002", spotType.Compact);

        p1.assignVehicleToSpot(car1);
        p1.assignVehicleToSpot(car2);

        System.out.println("Reg number of car1 is"+ car1.getRegistrationNumber());
        System.out.println("vehicle type is " + car1.getVehicleType());
    }
}