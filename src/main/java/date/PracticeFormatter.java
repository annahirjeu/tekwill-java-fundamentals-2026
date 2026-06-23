//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author aminoiu
 * @since 6/3/2026
 */
public class PracticeFormatter {
    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("y");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("YYYY");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("Y M D");
        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("e");
        DateTimeFormatter f5 = DateTimeFormatter.ofPattern("yyyy MM dd");
        DateTimeFormatter f6 = DateTimeFormatter.ofPattern("yyyy MM DD");
        DateTimeFormatter f8 = DateTimeFormatter.ofPattern("MM*dd*yyyy");
        DateTimeFormatter f7 = DateTimeFormatter.ofPattern("yy MM dd");

/*        LocalDate date = LocalDate.now();
        System.out.println(date.format(f1));
        System.out.println(date.format(f2));
        System.out.println(date.format(f3));
        System.out.println(date.format(f4));
        System.out.println(date.format(f5));
        System.out.println(date.format(f6));
        System.out.println(date.format(f7));

        LocalDate date2 = LocalDate.of(2026, 11, 25);
        System.out.println(date2.format(f3));*/

        LocalDate date3 = LocalDate.parse("2026 11 25", f5);
        LocalDate date4 = LocalDate.parse("06*25*2026", f8);


/*        System.out.println(date3);
        System.out.println(date4);*/


        DateTimeFormatter f9 = DateTimeFormatter.ofPattern("mm:HH");
        LocalTime time = LocalTime.now();
//        System.out.println(time.format(f9));

        DateTimeFormatter f10 = DateTimeFormatter.ofPattern("yyyy MM dd -> HH:mm-ss");
        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime.format(f10));


        LocalDate today = LocalDate.now();
        LocalDate futureDay = LocalDate.of(2026, 11, 25);

        LocalTime time2 = LocalTime.of(12, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(2026, 11, 25, 13, 30);

        System.out.println(ChronoUnit.DAYS.between(today, futureDay));
        System.out.println(ChronoUnit.MONTHS.between(today, futureDay));
        System.out.println(ChronoUnit.YEARS.between(today, futureDay));
        System.out.println(ChronoUnit.HOURS.between(time2, dateTime2));
        System.out.println(ChronoUnit.WEEKS.between(today, futureDay));

    }
}