package Product;
import Locality.Location;

public class Car extends Vehicle{
    String name ;
    String brand ;
    Location location;

    public Car(String name, String brand, String vehicleNumer, Type type, Location location){
        this.name = name;
        this.brand = brand;
        this.location = location;
        setNumberOfWheels(4);
        setVehicleNumber(vehicleNumer);
        setType(type);
        setStatus(Status.Available);
    }

    public void setLocation(Location location){
        this.location = location;
    }
    public Location getLocation(){
        return this.location;
    }


}
