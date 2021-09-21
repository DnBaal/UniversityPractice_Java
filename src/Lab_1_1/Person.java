package Lab_1_1;

public class Person {
    private final static int MAX_AGE = 200;
    private final static double MAX_HEIGHT = 3.2;
    private int age;
    private double height;
    private String name;

    public Person() {}

    Person(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public void info() {
        System.out.println("age = " + this.age);
        System.out.println("height = " + this.height);
        System.out.println("name = " + this.name);
    }
    public boolean isValid() {
        if (this.age > MAX_AGE || this.height > MAX_HEIGHT){
            return false;
        }
        if (this.age <= 0 || this.height <= 0 || this.name.isEmpty()){
            return false;
        }
        return true;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public double getHeight() {
        return this.height;
    }
    public String getName() {
        return this.name;
    }
}
