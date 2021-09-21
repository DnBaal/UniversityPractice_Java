package Lab_1_1;

public enum Gender{
    MALE (1, "Мужчина"),
    FEMALE (2, "Женщина"),
    OTHER (1024, "Другое");
    private final int value;
    private final String strvalue;
    Gender(int value, String strvalue){
        this.value = value;
        this.strvalue = strvalue;
    }
    public int getValue(){
        return this.value;
    }
    public String getStrValue(){
        return this.strvalue;
    }
}
