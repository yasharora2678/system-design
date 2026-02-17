public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Director director = new Director();
        Student engineerStudent = director.createStudent(new EngineeringStudentBuilder());
        Student schoolStudent = director.createStudent(new SchoolStudentBuilder());
        engineerStudent.toString1();
        schoolStudent.toString1();
    }
}