//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package parking;

/**
 *
 * @author aminoiu
 * @since 5/18/2026
 */
public abstract class Vehicle {
    private String plateNumber;
    private int hoursParked;

    public static final int MAX_HOURS_PARKED = 8;

    public Vehicle(String plateNumber, int hoursParked) {
        this.plateNumber = plateNumber;
        this.hoursParked = hoursParked;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getHoursParked() {
        return hoursParked;
    }

    public void setHoursParked(int hoursParked) {
        if (hoursParked >= 0) {
            this.hoursParked = hoursParked;
        } else {
            System.out.println("Hours parked cannot be negative");
        }
    }

    public abstract double calculateParkingFee();

    public void displayVehicleInfo() {
        System.out.println("Vehicle Plate Number: " + plateNumber);
        System.out.println("Hours Parked: " + hoursParked);
        System.out.println("Parking Fee: " + calculateParkingFee());
    }
}