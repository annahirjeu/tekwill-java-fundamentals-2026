//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package registration.system;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author aminoiu
 * @since 6/8/2026
 */
public class EventRegistrationSystem {
    static Scanner scanner = new Scanner(System.in);
    static Set<String> participants = new HashSet<>();

    public static void main(String[] args) {
        do {
            System.out.println("================");
            System.out.println("1. Add participant");
            System.out.println("2. Add a number of participants");
            System.out.println("3. Show participants");
            System.out.println("4. Verify participant");
            System.out.println("5. Remove a participant");
            System.out.println("6. Get number of participants");
            System.out.println("7. Exit");
            System.out.println("================");
            int option = Integer.parseInt(scanner.nextLine());
            if (option == 7) break;
            switch (option) {
                case 1 -> addParticipant();
                case 2 -> addNumberOfParticipants();
                case 3 -> showParticipants();
                case 4 -> verifyParticipant();
                case 5 -> removeParticipant();
                case 6 -> getNumberOfParticipants();
//                case 7 -> System.exit(0);
                default -> System.out.println("Invalid option, choose again:");
            }
        }
        while (true);
    }

    private static void getNumberOfParticipants() {
        System.out.println("Number of participants: " + participants.size());
    }

    private static void removeParticipant() {
        System.out.println("Enter participant name: ");
        String participantName = scanner.nextLine();
//        participants.remove(participantName);
        for (String participant : participants) {
            if (participant.equalsIgnoreCase(participantName)) {
                participants.remove(participant);
                System.out.println("Participant removed");
                return;
            }
        }
        System.out.println("Participant not found");
    }

    private static void verifyParticipant() {
        System.out.println("Enter participant name: ");
        String participantName = scanner.nextLine();
        for (String participant : participants) {
            if (participant.equalsIgnoreCase(participantName)) {
                System.out.println("Participant is registered");
                return;
            }
        }
        System.out.println("Participant is not registered");
    }

    private static void addNumberOfParticipants() {
        System.out.println("Enter number of participants: ");
        int nrOfParticipants = Integer.parseInt(scanner.nextLine());
        addParticipant(nrOfParticipants);
    }

    private static void showParticipants() {
        int count = 1;
        for (String participant : participants) {
            System.out.println(count++ + "." + participant);
        }
    }

    private static void addParticipant() {
        System.out.println("Enter participant name: ");
        String participantName = scanner.nextLine();
        participants.add(participantName);
    }

    private static void addParticipant(int nrOfParticipants) {
        for (int i = 0; i < nrOfParticipants; i++) {
            addParticipant();
        }
    }
}