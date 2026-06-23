//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package bank.management;

/**
 *
 * @author aminoiu
 * @since 6/18/2026
 */
public class BankAccount {
    private Double balance;
    private String accountNumber;
    private String accountHolderName;

    public BankAccount(Double balance, String accountNumber, String accountHolderName) {
        validateBalance(balance);
        validateData(accountNumber, accountHolderName);
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount) {
        validateBalance(amount);
        balance += amount;
        System.out.println("Deposited: " + amount + ", New balance: " + balance);
    }

    public void withdraw(Double amount) throws InsufficientFundsException {

        validateBalance(amount);
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds to withdraw");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
    }

    private void validateBalance(Double amount) throws IllegalArgumentException {
        if (amount == null || amount < 0) {
            throw new IllegalArgumentException("Deposit amount has to be a positive number");
        }
    }

    private void validateData(String accountNumber, String accountHolderName) {
        if (accountNumber == null || accountNumber.isEmpty() || accountHolderName == null || accountHolderName.isEmpty()) {
            throw new IllegalArgumentException("Account number and account holder name cannot be null or empty");
        }
    }
}