package parkingSpot;

import vehicle.Vehicle;

public class ParkingSpot {
    private String parkingSpotId;
    private boolean spotAvailability ;
    private Vehicle vehicle;
    private spotType parkingSpotType;

    public ParkingSpot(String parkingSpotId, spotType parkingSpotType){
        this.parkingSpotId = parkingSpotId;
        this.parkingSpotType = parkingSpotType;
        this.spotAvailability = true;
        this.vehicle = null;
    }

    public boolean isSpotAvailable(){
        return this.spotAvailability;
    }

    public String getParkingSpotId(){
        return this.parkingSpotId;
    }

    public spotType getParkingSpotType(){
        return this.parkingSpotType;
    }

    public Vehicle getVehicle(){
        return  this.vehicle;
    }

    public void assignVehicleToSpot(Vehicle vehicle){
        if(!this.spotAvailability){
            System.out.println("the spot is already occupied");
        }
        this.vehicle = vehicle;
        this.spotAvailability = false;
    }

    public void vacateVehicleFromSpot(){
        this.vehicle = null;
        this.spotAvailability = true;
    }

}
