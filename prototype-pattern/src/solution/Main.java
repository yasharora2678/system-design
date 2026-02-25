package solution;

public class Main {
    public static void main(String[] args) {
        Student studentOrg = new Student(1, "Aman", "CSE", 123);
        studentOrg.printDetails();

        Student student = (Student) studentOrg.clonable();
        student.printDetails();

        System.out.println(student == studentOrg);
    }
}
