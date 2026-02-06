//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        EmployeeProxy employeeProxy = new EmployeeProxy(employeeImpl);

        employeeProxy.create("ADMIN");
        employeeProxy.delete("ADMIN");
        employeeProxy.get("USER");
    }
}