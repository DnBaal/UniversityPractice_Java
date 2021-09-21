package Lab_1_1;

import Lab_1_1.*;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter age for the Person");
        int age = in.nextInt();
        System.out.println("Enter height for the Person");
        float height = in.nextFloat();
        System.out.println("Enter name for the Person");
        String name = in.nextLine();

        Person gaben = new Person();

        gaben.setAge(age);
        gaben.setHeight(height);
        gaben.setName(name);
        System.out.println(gaben.isValid());

        System.out.println("Tests started..");

        PersonTesting.RunTestPerson();
        PersonExTesting.RunTestPersonEx();
        ClientTesting.RunTest();
        EmployeeTesting.RunTest();
        GenderTest.RunTestGender();

        System.out.println("Tests ended.");
    }
}
