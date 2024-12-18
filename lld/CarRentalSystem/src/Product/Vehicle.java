package Product;

public class Vehicle {
    private int numberOfWheels;
    private String vehicleNumber;
    Type type;
    Status status;

    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }
    public void setType(Type type){
        this.type = type;
    }
    public void setStatus(Status status){
        this.status = status;
    }
    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }
    public String getVehicleNumber(){
        return this.vehicleNumber;
    }
    public Type getType(){
        return this.type;
    }
    public Status getStatus(){
        return this.status;
    }


}
