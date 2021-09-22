package Lab_1_1;

import Lab_1_1.Employee;

public class EmployeeTesting {
    public static void RunTest() {

        Employee employee1 = new Employee("Dan");
        System.out.println("EmployeeTest started..");
        if ( employee1.think().equals("Lets go, for the USSR") )
            System.out.println("Test correct, method think returns: "+ employee1.think());
        else System.err.println("first error");

        if (employee1.getName().isEmpty()) {
            System.err.println("second error: Employee without name");
        } else{
            System.out.println("Test correct, method getName returns: " + employee1.getName());
        }

    }
}