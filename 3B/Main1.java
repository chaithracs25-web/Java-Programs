interface ParkingCharge
{
    double calculateCharge();
    void display();
}

abstract class VehicleParking implements ParkingCharge
{
    int vehicle_no;
    String vehicle_type;
    int parking_hours;

    VehicleParking(int vehicle_no, String vehicle_type,
                   int parking_hours)
    {
        this.vehicle_no = vehicle_no;
        this.vehicle_type = vehicle_type;
        this.parking_hours = parking_hours;
    }

    public void display()
    {
        System.out.println("\nVehicle Details");
        System.out.println("Vehicle Number: " + vehicle_no);
        System.out.println("Vehicle Type: " + vehicle_type);
        System.out.println("Parking Hours: " + parking_hours);

        if (parking_hours <= 0)
        {
            System.out.println("Invalid parking hours!");
        }
        else
        {
            System.out.println("Parking Charge: Rs. "
                               + calculateCharge());
        }
    }
}

class TwoWheeler extends VehicleParking
{
    TwoWheeler(int vehicle_no, String vehicle_type,
               int parking_hours)
    {
        super(vehicle_no, vehicle_type, parking_hours);
    }

    public double calculateCharge()
    {
        if (parking_hours <= 0)
            return 0;

        if (parking_hours <= 2)
            return parking_hours * 20;

        return 2 * 20 + (parking_hours - 2) * 10;
    }
}

class FourWheeler extends VehicleParking
{
    FourWheeler(int vehicle_no, String vehicle_type,
                int parking_hours)
    {
        super(vehicle_no, vehicle_type, parking_hours);
    }

    public double calculateCharge()
    {
        if (parking_hours <= 0)
            return 0;

        if (parking_hours <= 2)
            return parking_hours * 50;

        return 2 * 50 + (parking_hours - 2) * 30;
    }
}

public class Main1
{
    public static void main(String[] args)
    {
        VehicleParking vehicle;

        vehicle = new TwoWheeler(1, "Bike", 3);
        vehicle.display();

        vehicle = new FourWheeler(2, "Car", 4);
        vehicle.display();
    }
}