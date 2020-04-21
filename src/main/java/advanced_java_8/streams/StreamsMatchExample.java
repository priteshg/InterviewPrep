package advanced_java_8.streams;

import advanced_java_8.data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.5);

    }

    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 4.0);

    }

    public static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >= 4.2);

    }

    public static void main(String[] args) {
        System.out.println("Result of all match:" + allMatch());
        System.out.println("Result of all any match:" + anyMatch());
        System.out.println("Result of all none match:" + noneMatch());
    }

}
