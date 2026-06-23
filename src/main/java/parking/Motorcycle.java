//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package parking;

/**
 *
 * @author aminoiu
 * @since 5/18/2026
 */
public class Motorcycle extends Vehicle {
    public static final double FEE_PER_HOUR = 10;
    public static final int FIX_FEE = 80;

    public Motorcycle(String plateNumber, int hoursParked) {
        super(plateNumber, hoursParked);
    }

    @Override
    public double calculateParkingFee() {
        if (getHoursParked() > MAX_HOURS_PARKED) {
            return FIX_FEE;
        }

        return getHoursParked() * FEE_PER_HOUR;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Vehicle type: Motorcycle");
        super.displayVehicleInfo();
    }
}