import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

    private ArrayList<String> students;


    public StudentList() {
        students = new ArrayList<>();
    }


    public void addStudents() {
        students.add("Jay");
        students.add("Sai");
        students.add("Ved");
        students.add("Surya");
        students.add("Neha");
    }


    public void printStudents(String message) {
        System.out.println(message + ": " + students);
    }


    public void removeStudent(String studentName) {
        students.remove(studentName);
    }


    public void sortStudents() {
        Collections.sort(students);
    }
}