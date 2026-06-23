package management;//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

/**
 *
 * @author aminoiu
 * @since 5/8/2026
 */
public class User {
    String name;
    String email;
    String address;
    long phoneNumber;

    User() {

    }

    User(String name) {
        this.name = name;

    }

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    User(String name, String email, String address) {
        this(name, email);
        this.address = address;
    }

    User(String name, long number) {
        this.toString();
    }

    @Override
    public String toString() {
        return "management.User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}