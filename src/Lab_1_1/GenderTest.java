package Lab_1_1;

import Lab_1_1.Gender;

public class GenderTest {
    public static void RunTestGender() {
        System.out.println("Creating 3 enum objects for test, 1. Other, 2. Female, 3. Male");
        Gender org1 = Gender.OTHER;
        Gender org2 = Gender.FEMALE;
        Gender org3 = Gender.MALE;
        if (org1.getValue() == 1024 && org1.getStrValue() == "Другое" ) {
            System.out.println("test correct first obj gender is defined,method GetValue returns: "+ org1.getValue() );
        }
        else System.err.println("Gender is not defined, method getValue passed not good");

        if (org2.getStrValue().isEmpty()) {
            System.err.println("No gender defined, method getStrValue passed not good");
        }
        else System.out.println("test correct,second object method getStrValue returns: "+ org2.getStrValue());
        if (org3.getStrValue().equals("Мужчина")) {
            System.out.println("test correct, third object gender is defined, method returns: "+ org3.getStrValue());
        }

    }
}
