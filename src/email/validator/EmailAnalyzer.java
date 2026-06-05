//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package email.validator;

import java.util.Scanner;

/**
 *
 * @author aminoiu
 * @since 5/29/2026
 */
public class EmailAnalyzer {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter email: \n");
        String emailAddress = scanner.nextLine().trim();

        int atIndex = emailAddress.indexOf('@');

        if (atIndex == -1) {
            System.out.println("Invalid email: missing '@' symbol.");
            return;
        }
        if (atIndex == 0) {
            System.out.println("Invalid email: '@' symbol is at the beginning.");
            return;
        }
        String domain = emailAddress.substring(atIndex + 1);//anna@gmail.com -> gmail.com
/*        if (!!domain.contains(".") && !domain.startsWith(".") && !domain.endsWith(".")) {
System.out.println("Valid domain");
        }*/
        if (!domain.contains(".") || domain.startsWith(".") || domain.endsWith(".")) {
            System.out.println("Invalid email: domain must contain a '.' and cannot start or end with a '.'.");
            return;
        }

        System.out.println("Valid email");
        String username = emailAddress.substring(0, atIndex);//anna@gmail.com -> anna

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
        System.out.println("DOMAIN: " + domain.toUpperCase());
        System.out.println("Length: " + emailAddress.length());

        if (domain.equalsIgnoreCase("gmail.com")) { //ANNA@GMAIL.COM
            System.out.println("Email is from Gmail");
        } else {
            System.out.println("Email is not from Gmail");
        }

    }
}