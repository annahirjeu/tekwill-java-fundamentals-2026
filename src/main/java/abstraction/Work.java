package abstraction;//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

/**
 *
 * @author aminoiu
 * @since 5/13/2026
 */
public class Work {
    public static void main(String[] args) {
        TestInterface testInterface = new ImplementInterface();
        testInterface.calculateAge();
        testInterface.getAge();
        TestInterface.printAge();
        System.out.println(TestInterface.age);
    }
}