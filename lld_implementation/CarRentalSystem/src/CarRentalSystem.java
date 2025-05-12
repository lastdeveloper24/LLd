import Core.Reservation;
import Locality.Location;
import Product.Car;
import Product.Status;
import Product.Type;
import Product.User;

import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {
    public static void main(String[] args) {
        List<Car> allCars = new ArrayList<>();
        List<User> allUsers = new ArrayList<>();

        Location hyderabad = new Location("HIG-A86","Hyderabad",500032);
        Location hitechCity = new Location("Smondo","Hyderabad", 500032);

        Car car1 = new Car("Desire", "Suzuki", "WB061122", Type.SEDAN, hyderabad);
        User pssUser = new User("Partha", 7872424789L);
        User User1 = new User("User1", 90001114455L);

        allCars.add(car1);
        allUsers.add(pssUser);

        if(car1.getLocation().getCity().equals(hyderabad.getCity()) && car1.getStatus()== Status.Available){
            Reservation reservation = new Reservation(pssUser,car1, hyderabad, "2024-01-29", "2024-01-29 11:20:35", "2024-01-31 11:50:35" );
            System.out.println("car has been reserved successfully");
        }else{
            System.out.println("asked car has been booked");
        }

        if(car1.getLocation().getCity().equals(hyderabad.getCity()) && car1.getStatus()==Status.Available){
            Reservation reservation = new Reservation(User1,car1, hyderabad, "2024-01-29", "2024-01-29 11:20:35", "2024-01-31 11:50:35" );
        }
        else {
            System.out.println("asked car has been booked");
        }





    }
}