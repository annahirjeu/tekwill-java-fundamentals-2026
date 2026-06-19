//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package bank.management;

/**
 *
 * @author aminoiu
 * @since 6/18/2026
 */
public class UserInterface {
    public static void main(String[] args) {
        BankAccount newAccount = null;
        try {
            newAccount = new BankAccount(1000.0, "123456789", "ggfvh");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Account creation process completed");
        }

        try {
            if (newAccount != null) {
                newAccount.deposit(-1.0);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid deposit amount");
        }

        try {
            if (newAccount != null)
                newAccount.withdraw(200.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient funds");
        }
    }
}