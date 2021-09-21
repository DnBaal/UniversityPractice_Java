package Lab_1_1;


public final class Employee extends AbstractPerson {
    final String department = "Num1";

    Employee(String name) {
        super(name);
    }

    public String think() {
        return "Lets go, for the USSR";
    }

    public String getName(){
        return this.name;

    }
}
