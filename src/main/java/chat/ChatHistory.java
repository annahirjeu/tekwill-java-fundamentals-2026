//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package chat;

import java.util.Scanner;

/**
 *
 * @author aminoiu
 * @since 5/29/2026
 */
public class ChatHistory {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder chatHistory = new StringBuilder();
        while (true) {
            System.out.println("Enter username: ");
            String username = scanner.nextLine();
            if (username.equalsIgnoreCase("exit")) break;

            System.out.println("Enter message: ");
            String message = scanner.nextLine();
            chatHistory.append(username).append(": ").append(message).append("\n");

        }
        System.out.println("======================================");
        System.out.println(chatHistory.toString());
        System.out.println("======================================");
        System.out.println(chatHistory.length());

        String error = "error";
        int errorPosition = chatHistory.indexOf(error);
        System.out.println(errorPosition);
        if (errorPosition != -1)
            System.out.println(chatHistory.replace(errorPosition, errorPosition + error.length() + 1, "*****"));

        System.out.println(chatHistory.reverse());




    }
}