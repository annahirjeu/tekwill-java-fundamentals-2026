//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package bank.management;

/**
 *
 * @author aminoiu
 * @since 6/18/2026
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}