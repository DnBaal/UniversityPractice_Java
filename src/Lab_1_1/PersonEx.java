package Lab_1_1;

public class PersonEx {
    private final static int MAX_AGE = 200;
    private final static double MAX_HEIGHT = 3.2;
    private int age;
    private double height;
    private String name;

    PersonEx(){};

    PersonEx(int age, double height, String name) throws Exception {
        this.setAge(age);
        this.setHeight(height);
        this.setName(name);
    }

    public void setAge(int age) throws Exception {
        if (age > MAX_AGE || age < 0) {
            throw new Exception("Возраст некорректен");
        }
        this.age = age;
    }
    public void setHeight(double height) throws Exception {
        if (height > MAX_HEIGHT || height <= 0) {
            throw new Exception("Рост некорректен");
        }
        this.height = height;
    }
    public void setName(String name) throws IllegalNameException {
        if (name.isEmpty()){
            throw new IllegalNameException("Строка пуста");
        }
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
