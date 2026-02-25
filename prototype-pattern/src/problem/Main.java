package problem;

public class Main {
    public static void main(String[] args) {
        Student studentOrg = new Student(1, "Aman", "CSE", 123);
        studentOrg.printDetails();

        Student student = new Student();
        student.id = studentOrg.id;
        student.name = studentOrg.name;
        student.branch = studentOrg.branch;
        student.printDetails();
        System.out.println(student == studentOrg);
//        student.rollNo = studentOrg.getRollNo(); Compilation error
    }
}
