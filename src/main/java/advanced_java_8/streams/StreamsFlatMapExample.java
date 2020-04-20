package advanced_java_8.streams;

import advanced_java_8.functional_interfaces.data.Student;
import advanced_java_8.functional_interfaces.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

    static List<String> printStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream) //create Stream<String>
                .distinct()
                .sorted()
                .collect(toList());
        return studentActivities;
    }

    static long getStudentActivitiesCount() {

        long count = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream) //create Stream<String>
                .distinct() //Stream<String> ->with distinct function performed
                .count();
        return count;
    }

    public static void main(String[] args) {
        System.out.println("printStudentActivities:" + printStudentActivities());
        System.out.println("getStudentActivitiesCount:" + getStudentActivitiesCount());

    }
}
