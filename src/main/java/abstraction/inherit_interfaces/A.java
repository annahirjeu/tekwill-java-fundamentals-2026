//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package abstraction.inherit_interfaces;

/**
 *
 * @author aminoiu
 * @since 5/15/2026
 */
public interface A {
    default void show() {
        System.out.println("A");
    }

    default void write(String s) {
        System.out.println(s);
    }
}
 