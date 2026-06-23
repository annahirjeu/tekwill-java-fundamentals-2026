//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package parking;

import java.util.Scanner;

/**
 *
 * @author aminoiu
 * @since 5/18/2026
 */
public class ParkingApp {
    private static Scanner sc = new Scanner(System.in);
    private static Vehicle vehicles[] = new Vehicle[10];
    private static int numberOfVehicles = 0;

    public static void main(String[] args) {
        int option;
        do {
            showMenu();
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1 -> addVehicle();//add vehicle

                case 2 -> displayAllVehicles();//display all vehicles.

                case 3 -> {
                    searchVehicleByPlateNumber();//search vehicle by plate number
                }
                case 4 -> {
                    sortVehicleByFee();//sort vehicles
                }
                default -> System.out.println("Invalid option, choose again:");

            }

        }
        while (option != 5);
    }

    private static void sortVehicleByFee() {
        if (numberOfVehicles < 2) {
            System.out.println("Not enough vehicles to sort");
            return;
        }

        Vehicle[] sortedVehicles = vehicles.clone();
        for (int i = 0; i < sortedVehicles.length; i++) {
            for (int j = 0; j < sortedVehicles.length - 1; j++) {
                if (sortedVehicles[j] == null || sortedVehicles[j + 1] == null) break;
                if (sortedVehicles[j].calculateParkingFee() > sortedVehicles[j + 1].calculateParkingFee()) {
                    Vehicle temp = sortedVehicles[j];
                    sortedVehicles[j] = sortedVehicles[j + 1];
                    sortedVehicles[j + 1] = temp;

                }
            }
        }
        displayAllVehicles(sortedVehicles);
    }

    private static void searchVehicleByPlateNumber() {
        System.out.println("Enter plate number to search:");
        String plateNumber = sc.nextLine();
        Vehicle vehicle = findVehicleByPlateNumber(plateNumber);
        if (vehicle == null) System.out.println("Vehicle not found");
        else vehicle.displayVehicleInfo();
    }

    private static Vehicle findVehicleByPlateNumber(String plateNumber) {
        for (int i = 0; i < numberOfVehicles; i++) {
            if (vehicles[i] == null) break;
            if (vehicles[i].getPlateNumber().equals(plateNumber)) return vehicles[i];
        }
        return null;
    }

    private static void displayAllVehicles() {
        if (numberOfVehicles == 0) {
            System.out.println("No vehicles in the parking lot");
            return;
        }
        System.out.println("Number of vehicles in the parking lot: " + numberOfVehicles);
        for (int i = 0; i < numberOfVehicles; i++) {
            if (vehicles[i] == null) break;
            System.out.println("Vehicle " + (i + 1) + ":");
            vehicles[i].displayVehicleInfo();
        }
    }

    private static void displayAllVehicles(Vehicle[] vehicles) {
        if (vehicles.length == 0) {
            System.out.println("No vehicles in the parking lot");
            return;
        }
        System.out.println("Number of vehicles in the parking lot: " + vehicles.length);
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) break;
            System.out.println("Vehicle " + (i + 1) + ":");
            vehicles[i].displayVehicleInfo();
        }
    }

    private static void addVehicle() {
        if (isParkingFull()) {
            System.out.println("Parking lot is full, cannot add more vehicles");
            return;
        }
        int vehicleType = getVehicleType();
        System.out.println("Enter plate number:");
        String plateNumber = sc.nextLine();

        Vehicle vehicle = createVehicle(vehicleType, plateNumber);
        if (vehicle == null) {
            System.out.println("Vehicle not added");
            return;
        }
        vehicles[numberOfVehicles++] = vehicle;
        System.out.println("Vehicle added successfully");
    }

    private static Vehicle createVehicle(int vehicleType, String plateNumber) {
        return switch (vehicleType) {
            case 1 -> new Car(plateNumber, 1);
            case 2 -> new Truck(plateNumber, 1);
            case 3 -> new Motorcycle(plateNumber, 1);
            default -> {
                System.out.println("Invalid vehicle type, vehicle now added");
                yield null;
            }
        };
    }

    private static boolean isParkingFull() {
        return numberOfVehicles >= vehicles.length;
    }

    private static int getVehicleType() {
        System.out.println("Enter vehicle type:");
        System.out.println("1. Car");
        System.out.println("2. Truck");
        System.out.println("3. Motorcycle");
        return Integer.parseInt(sc.nextLine());
    }

    private static void showMenu() {
        System.out.println("===PARKING MANAGEMENT SYSTEM===");
        System.out.println("1. Add Vehicle");
        System.out.println("2. Display Vehicles");
        System.out.println("3. Search vehicle by plate number");
        System.out.println("4. Sort vehicles by fee");
        System.out.println("5. Exit");
    }
}