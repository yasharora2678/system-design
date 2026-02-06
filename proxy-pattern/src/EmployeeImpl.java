public class EmployeeImpl implements Employee {
    @Override
    public void create(String client) {
        System.out.println("Creating Employee");
    }

    @Override
    public void delete(String client) {
        System.out.println("Deleting Employee");
    }

    @Override
    public void get(String client) {
        System.out.println("Getting Employee");
    }
}
