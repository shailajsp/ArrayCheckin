public class main {
    public static void main(String[] args) {

        StudentList studentList = new StudentList();


        studentList.addStudents();


        studentList.printStudents("Original list of students");


        studentList.removeStudent("Ved");
        studentList.printStudents("Updated list of students after removal");


        studentList.sortStudents();
        studentList.printStudents("Sorted list of students");
    }
}