package Lab_1_1;

public abstract class AbstractPerson implements HumanInterface {

    protected String name;

    public AbstractPerson(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract String think();
}
