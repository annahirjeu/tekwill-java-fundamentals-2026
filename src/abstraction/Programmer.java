package abstraction;//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

/**
 *
 * @author aminoiu
 * @since 5/13/2026
 */
public class Programmer extends Employee {
    String name = "Anna";
    String programmingLanguage;

    public void printName() {
        System.out.println("abstraction.Programmer name is: " + name);
    }

    @Override
    Programmer assemmentResult() {
        return new Programmer();
    }
}