package Core;

import Locality.Location;
import Product.Status;
import Product.User;
import Product.Vehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Reservation {
    int regId;
    User user;
    Vehicle vehicle;
    LocalDate bookingDate;
    Date bookedFrom;
    Date bookedTill;
    Location location;

    public Reservation(User user, Vehicle vehicle, Location location, String bookingDate, String bookedFrom, String bookedTill){
        this.user = user;
        this.vehicle = vehicle;
        this.location = location;
        this.bookingDate = LocalDate.parse(bookingDate);
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            this.bookedFrom = dateFormat.parse(bookedFrom);
            this.bookedTill =dateFormat.parse(bookedTill);
        } catch (ParseException e){
            System.err.println("Error parsing the date: " + e.getMessage());
        }
        vehicle.setStatus(Status.Booked);
    }


}
