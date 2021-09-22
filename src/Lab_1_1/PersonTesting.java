package Lab_1_1;


import Lab_1_1.Person;

public class PersonTesting {
    public static void RunTestPerson() {


        System.out.println("PersonTest started..");
        Person person = new Person(0, 0, "");

        System.out.println("empty Person's data:");
        person.info();
        if (person.getAge() == 0|| person.getHeight()==0|| person.getName() == "") {
            System.out.println("test correct");


            person.setAge(30);
            person.setHeight(1.7);
            person.setName("Andrew");
            System.out.println("Person's data after changes with methods:");
            person.info();
            System.out.println("Information Validity: " + person.isValid());
            System.out.println("test completed");

        }
        else System.out.println("test failed");
    }
}
