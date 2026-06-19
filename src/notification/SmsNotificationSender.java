//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package notification;

/**
 *
 * @author aminoiu
 * @since 6/16/2026
 */
public class SmsNotificationSender implements NotificationSender{
    @Override
    public void send(String message) {
        System.out.println("Get phone number");
        System.out.println("Send SMS service");
        System.out.println("Sending SMS");
        System.out.println("Validate phone number");
        System.out.println("SMS sent successfully");
    }
}