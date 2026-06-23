//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package payment;

/**
 *
 * @author aminoiu
 * @since 5/20/2026
 */
public class PaymentSystem {
    public static void main(String[] args) {
        Payment payment = new CardPayment();
        ((CardPayment) payment).validateCard();
        payment.processPayment();

        Payment payment1 = new CashPayment();
        payment1.processPayment();

        processPayments(new Payment[]{new CardPayment(), new CashPayment()});

    }

    static void processPayments(Payment[] payments) {
        for (Payment payment : payments) {
            if (payment instanceof CardPayment)
                ((CardPayment) payment).validateCard();

            if (payment instanceof CashPayment)
                ((CashPayment) payment).countCash();

            payment.processPayment();
        }
    }
}