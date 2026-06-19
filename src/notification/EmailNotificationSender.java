//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package notification;

/**
 *
 * @author aminoiu
 * @since 6/16/2026
 */
public class EmailNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Get email address");
        System.out.println("Send email service");
        System.out.println("Sending email");
        System.out.println("Validate email address");
        System.out.println("Email sent successfully");
    }
}