import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Studenthashmap manager = new Studenthashmap();

        try {
            Student s1 = new Student(1, "john", 20);
            Student s2 = new Student(2, "locuse", 18);
            Student s3 = new Student(3, "mark", 5);

            manager.addStudent(s1);
            manager.addStudent(s2);
            manager.addStudent(s3);

        } catch (InvalidStudentage | DuplicateStudentIdException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}


class Studenthashmap {
    private HashMap<Integer, Student> students = new HashMap<>();

     void addStudent(Student student) throws DuplicateStudentIdException {
         if(students.containsKey(student.getId())) {
             throw new DuplicateStudentIdException("Student ID already exists: " + student.getId());
         }
        students.put(student.getId(), student);
    }


    }

class DuplicateStudentIdException extends Exception {
    public DuplicateStudentIdException(String message) {
        super(message);
    }
}


