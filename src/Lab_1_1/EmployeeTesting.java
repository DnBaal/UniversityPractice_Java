package Lab_1_1;

import Lab_1_1.Employee;

public class EmployeeTesting {
    public static void RunTest() {

        Employee employee1 = new Employee("Dan");

        if ( employee1.think().equals("Lets go, for the USSR") )
            System.out.println("Test passed good..");
        else System.err.println("first error");

        if (employee1.getName().isEmpty()) {
            System.err.println("second error: Employee without name");
        } else{
            System.out.println("Test passed good..");
        }

    }
}