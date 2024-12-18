package vehicle;


import com.sun.org.apache.xpath.internal.objects.XString;

public abstract class Vehicle {
    private String registrationNumber;
    VehicleType vehicleType;

    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber=registrationNumber;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }


}
