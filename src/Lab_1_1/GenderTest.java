package Lab_1_1;

import Lab_1_1.Gender;

public class GenderTest {
    public static void RunTestGender() {

        Gender org1 = Gender.OTHER;
        Gender org2 = Gender.FEMALE;
        Gender org3 = Gender.MALE;
        if (org1.getValue() == 1024 && org1.getStrValue() == "Другое" ) {
            System.out.println("first method GetValue is successful" );
        }
        else System.err.println("Gender is not defined, method getValue passed not good");

        if (org2.getStrValue().isEmpty()) {
            System.err.println("No gender defined, method getStrValue passed not good");
        }
        else System.out.print("second method getStrValue is successful  ");
        if (org3.getStrValue().equals("Мужчина")) {
            System.out.println("the test is successful");
        }

    }
}
