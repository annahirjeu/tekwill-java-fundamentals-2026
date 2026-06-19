//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package notification;

/**
 *
 * @author aminoiu
 * @since 6/16/2026
 */
public class NotificationManager {
    public static void notifyUser(String message, NotificationSender sender) {
        sender.send(message);
    }

    public static void main(String[] args) {
        String userNotificationMode = "email";
        String message = "Tomorrow we will have the lesson";

        if (userNotificationMode == "email") {
            notifyUser(message, message1 -> {
                System.out.println("Get email address");
                System.out.println("Send email service");
                System.out.println("Sending email");
                System.out.println("Validate email address");
                System.out.println("Email sent successfully");
            });
        }else if(userNotificationMode == "sms"){
            notifyUser(message, message1 -> {
                System.out.println("Get phone number");
                System.out.println("Send SMS service");
                System.out.println("Sending SMS");
                System.out.println("Validate phone number");
                System.out.println("SMS sent successfully");
            });
        }

        NotificationSender emailSender = new EmailNotificationSender();
        NotificationSender smsSender = new SmsNotificationSender();
        if (userNotificationMode == "email") {
            notifyUser(message, emailSender);
        } else if (userNotificationMode == "sms") {
            notifyUser(message, smsSender);
        }
    }
}