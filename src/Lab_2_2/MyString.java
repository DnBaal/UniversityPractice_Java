package Lab_2_2;

import java.util.Arrays;

public final class MyString {       ///

    private final char[] value;

    public MyString(char[] value){
        this.value = value;
    }
    public MyString(MyString original){
        this.value = original.value;
    }
    public MyString(String original){
        this.value = original.toCharArray();
    }
    public MyString() {
        value = null;
    }
    int length(){
        return this.value.length;
    }

    int compareTo(MyString anotherString){
        return Arrays.compare(this.value, anotherString.value);
    }

    MyString substring(int beginIndex, int endIndex){
        char[] new_value = new char[endIndex-beginIndex];
        System.arraycopy(this.value, beginIndex, new_value, 0, endIndex-beginIndex);
        return new MyString(new_value);
    }

    @Override
    public String toString(){
        return Arrays.toString(this.value);
    }

    public MyString concat(MyString obj){
        int n = this.value.length;
        char[] new_value = new char[n+obj.value.length];
        System.arraycopy(this.value, 0, new_value, 0, n);
        int m = 0;
        for (int i = n; i < n+obj.value.length; i++){
            new_value[i] = obj.value[m];
            m++;
        }
        return new MyString(new_value);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public char charAt(int index){
        return this.value[index];
    }



    public MyString trim(){
        char[] new_value = new char[this.value.length-1];
        System.arraycopy(value, 0, new_value, 0, new_value.length);
        return new MyString(new_value);
    }

    public boolean isEmpty(){
        return this.value.length == 0;
    }
}
