package Lab_1_1;

import Lab_1_1.PersonEx;

public class PersonExTesting {
    public static void RunTestPersonEx() throws Exception {



        System.out.println("PesonExTest started..");

        PersonEx person1 = new PersonEx(66, 1.8, "Luka");
        PersonEx person2 = new PersonEx();

        if (person1.getAge() == 66|| person1.getHeight()==1.8|| person1.getName() == "Luka") {
            System.out.println("test correct, tested Person1 with filled constructor:");

            System.out.println("Tested Person2's Age: " + person2.getAge()+"\n"+
                    "Tested Person2's Height: " + person2.getHeight()+"\n"+"Person2's Name: " + person2.getName());

            person2.setAge(30);
            person2.setHeight(1.7);
            person2.setName("Andrew");

            System.out.println("Tested Person2's data after changes with methods:");
            System.out.println("Tested Person2's Age: " + person2.getAge()+"\n"+
                    "Tested Person2's Height: " + person2.getHeight()+"\n"+"Person2's Name: " + person2.getName());


            System.out.println("test completed");

        }
        else System.out.println("test failed");
    }
}
