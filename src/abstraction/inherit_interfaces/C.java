//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package abstraction.inherit_interfaces;

/**
 *
 * @author aminoiu
 * @since 5/15/2026
 */
public class C implements A, B {
    @Override
    public void show() {
        A.super.show();
    }
}