//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package course.registration.system;

import java.util.*;

/**
 *
 * @author aminoiu
 * @since 6/10/2026
 */
public class CourseRegistrationApp {
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        students.add(new Student(1, "Anna", "anna@gmail.com"));
        students.add(new Student(2, "John", "john@gmail.com"));
        students.add(new Student(3, "Maria", "maria@gmail.com"));
        students.add(new Student(2, "Petru", "petru@gmail.com"));
//Show all students
        System.out.println("List of registrations");
        for (Student student : students) {
            System.out.println(student.toString());
        }
        Set<Student> uniqueStudents = new HashSet<>();
        uniqueStudents.addAll(students);
        System.out.println("Number of unique students: " + uniqueStudents.size());
/*        for (Student student : uniqueStudents) {
            System.out.println(student.toString());
        }*/

        Iterator<Student> iterator = uniqueStudents.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student student : students) {
            studentMap.putIfAbsent(student.getId(), student);
        }

        Student studentWithId = studentMap.get(2);
        System.out.println(studentWithId);

        Iterator<Map.Entry<Integer, Student>> iterator2 = studentMap.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, Student> entry = iterator2.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}