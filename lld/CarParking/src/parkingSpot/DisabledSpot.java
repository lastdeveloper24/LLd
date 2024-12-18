package parkingSpot;

public class DisabledSpot extends ParkingSpot{
    public DisabledSpot(String parkingSpotId, spotType parkingSpotType) {
        super(parkingSpotId, spotType.Disabled);
    }
}
