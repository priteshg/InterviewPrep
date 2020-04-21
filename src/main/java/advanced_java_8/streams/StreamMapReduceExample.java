package advanced_java_8.streams;

import advanced_java_8.functional_interfaces.data.Student;
import advanced_java_8.functional_interfaces.data.StudentDataBase;

public class StreamMapReduceExample {

    private static int noOfNoteBooks() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .filter((s) -> s.getGradeLevel() >= 3)
                .map(Student::getNoteBooks) // Stream<Integer>
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
    }
}
