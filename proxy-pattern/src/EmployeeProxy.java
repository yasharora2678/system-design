public class EmployeeProxy implements Employee {
    EmployeeImpl employee;

    public EmployeeProxy(EmployeeImpl employee) {
        this.employee = employee;
    }

    @Override
    public void create(String client) throws RuntimeException {
        if (client.equals("ADMIN")) {
            employee.create(client);
        } else {
            throw new RuntimeException("Access Denied");
        }
    }

    @Override
    public void delete(String client) throws RuntimeException {
        if (client.equals("ADMIN")) {
            employee.delete(client);
        } else {
            throw new RuntimeException("Access Denied");
        }
    }

    @Override
    public void get(String client) throws RuntimeException {
        if (client.equals("ADMIN") || client.equals("USER")) {
            employee.get(client);
        } else {
            throw new RuntimeException("Access Denied");
        }
    }
}
