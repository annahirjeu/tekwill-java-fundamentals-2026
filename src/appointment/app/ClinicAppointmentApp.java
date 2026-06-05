//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package appointment.app;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author aminoiu
 * @since 6/3/2026
 */
public class ClinicAppointmentApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter outputDateFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        DateTimeFormatter dateAndHourFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH:mm");

        System.out.println("Patient name:");
        String patientName = sc.nextLine();

        System.out.println("Birth date (dd.MM.yyyy):");
        String birthDateInput = sc.nextLine();

        System.out.println("Appointment date (dd.MM.yyyy):");
        String appointmentDateInput = sc.nextLine();

        System.out.println("Appointment time (HH:mm):");
        String appointmentTimeInput = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(birthDateInput, dateFormatter);
        LocalDate appointmentDate = LocalDate.parse(appointmentDateInput, dateFormatter);
        LocalTime appointmentTime = LocalTime.parse(appointmentTimeInput);

        LocalDateTime appointmentDateTime = LocalDateTime.of(appointmentDate, appointmentTime);

        LocalDate today = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        int age = Period.between(birthDate, today).getYears();
        long daysUntilAppointmentFromPeriod = Period.between(today, appointmentDate).getDays();
        long daysUntilAppointment = ChronoUnit.DAYS.between(today, appointmentDate);

        String appointmentStatus = "";
        if (appointmentDateTime.isBefore(LocalDateTime.now())) {
            appointmentStatus = "Appointment has passed";
        } else if (appointmentDateTime.isEqual(LocalDateTime.now())) {
            appointmentStatus = "Appointment is now";
        } else if (appointmentDate.isEqual(today)) {
            appointmentStatus = "Appointment is today";
        } else if (appointmentDateTime.isAfter(LocalDateTime.now())) {
            appointmentStatus = "Appointment is upcoming";
        }

        System.out.println();
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Appointment Date: " + appointmentDate.format(outputDateFormatter));
        System.out.println("Appointment Time: " + appointmentTime);
        System.out.println("Appointment Date and Time: " + appointmentDateTime.format(dateAndHourFormat));
        System.out.println("Days until appointment (using Period): " + daysUntilAppointmentFromPeriod + " - " + Period.between(today, appointmentDate));
        System.out.println("Days until appointment (using ChronoUnit): " + daysUntilAppointment);
        System.out.println("Appointment Status: " + appointmentStatus);


    }
}