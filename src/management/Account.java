package management;//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

/**
 *
 * @author aminoiu
 * @since 5/8/2026
 */
public class Account {
    public static void main(String[] args) {
        User user = new User();

        User user1 = new User("Anna", "emails", "Chisinau");
        User user2 = new User("Ion", "email");

        User user3 = new User("John", 1234567890L);
    }
}