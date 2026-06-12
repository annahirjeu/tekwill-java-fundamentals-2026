//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package course.registration.system;

import java.util.Objects;

/**
 *
 * @author aminoiu
 * @since 6/10/2026
 */
public class Student {
    private int id;
    private String name;
    private String email;

    Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Student student)) return false;
        if (this == obj) return true;
//        Student otherStudent = (Student) obj;
        return this.id == student.id;
    }

    @Override
    public int hashCode() {
        return id; //Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
    }
}