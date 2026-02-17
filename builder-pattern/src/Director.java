public class Director {
    StudentBuilder engineeringStudent;
    StudentBuilder schoolStudent;

    Director() {
        this.engineeringStudent = new EngineeringStudentBuilder();
        this.schoolStudent = new SchoolStudentBuilder();
    }

    public Student createStudent(StudentBuilder student) {
        if (student instanceof EngineeringStudentBuilder) {
            return student.setRollNumber(1) // EngineeringStudentBuilder
                    .setAge(22)
                    .setName("John")
                    .setFatherName("Paul")
                    .setMotherName("Jane")
                    .setBranch("Computer Science and Engineering")
                    .setSubjects() // Engineering-specific method
                    .setMobileNo("1234567890")
                    .setEmailId("jhondoe@iitb.com")
                    .build();

        } else {
            return student.setRollNumber(2) // MBAStudentBuilder
                    .setAge(24)
                    .setName("Sarah")
                    .setFatherName("Gabriel")
                    .setMotherName("Taylor")
                    .setBranch("Business Administration")
                    .setSubjects() // MBA-specific method
                    .setMobileNo("9876543210")
                    .setEmailId("sarahgabriel@iitb.com")
                    .build();

        }
    }
}
