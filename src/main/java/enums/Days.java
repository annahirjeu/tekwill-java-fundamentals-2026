//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package enums;

/**
 *
 * @author aminoiu
 * @since 5/22/2026
 */
public enum Days {
    MONDAY(1, "Luni"),
    TUESDAY(2, "Marti"),
    WEDNESDAY(3, "Miercuri"),
    THURSDAY(4, "Joi"),
    FRIDAY(5, "Vineri"),
    SATURDAY(6, "Sambata"),
    SUNDAY(7, "Duminica");

    private int dayNumber;
    private String romanianDay;

    Days(int i, String romanianDay) {
        this.dayNumber = i;
        this.romanianDay = romanianDay;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public String getRomanianDay() {
        return romanianDay;
    }
}
 