package Lab_1_1;

public class Client extends AbstractPerson {
    String service;
    float price;

    public Client(String name, String service, float price) {
        super(name);
        this.service = service;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String think() {
        return "hello juicyworld ill use your song";
    }

}
