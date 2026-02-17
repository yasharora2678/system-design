import java.util.ArrayList;
import java.util.List;

public class SchoolStudentBuilder  extends StudentBuilder {
    public StudentBuilder setSubjects() {
        List<String> schoolSubjectsList = new ArrayList<>();
        schoolSubjectsList.add("English");
        schoolSubjectsList.add("Mathematics");
        schoolSubjectsList.add("Physics");
        this.subjects = schoolSubjectsList;
        return this;
    }
}
