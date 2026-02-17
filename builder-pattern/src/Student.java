import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    String branch;
    // optional fields
    String fatherName;
    String motherName;
    List<String> subjects;
    String mobileNo;
    String emailId;


    Student(StudentBuilder builder) {
        this.subjects = builder.subjects;
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.name = builder.name;
        this.branch = builder.branch;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.mobileNo = builder.mobileNo;
        this.emailId = builder.emailId;
    }

    public void toString1() {
        System.out.println("Student rollNumber=" + rollNumber + ", age=" + age + ", name=" + name + ", branch=" + branch + ", fatherName=" + fatherName + ", motherName=" + motherName + ", subjects=" + subjects + ", mobileNo=" + mobileNo + ", emailId=" + emailId);
    }
}
