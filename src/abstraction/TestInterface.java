package abstraction;//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

/**
 *
 * @author aminoiu
 * @since 5/13/2026
 */
public interface TestInterface {
    public static final int age = 20;

    void calculateAge();

    default int getAge() {
        return age;
    }

    static void printAge() {
        System.out.println("Age is: " + age);
    }
}
 