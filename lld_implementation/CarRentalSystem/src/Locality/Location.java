package Locality;

public class Location {
    String address;
    String city;
    int zipCode;
    Float longitude;
    Float latitute;
    public Location(String address, String city, int zipCode){
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
    }

    public void setLongitude(Float longitude){
        this.longitude = longitude;

    }
    public void setLatitute(Float latitute){
        this.latitute = latitute;
    }
    public Float getLatitute(){
        return this.latitute;
    }
    public Float getLongitude(){
        return this.longitude;
    }

    public String getCity(){
        return this.city;
    }


}
