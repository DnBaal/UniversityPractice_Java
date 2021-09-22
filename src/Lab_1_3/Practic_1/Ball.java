package Lab_1_3.Practic_1;

public class Ball {

    private int size;
    private String brand;

    public Ball(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public String getBrand() {
        return this.brand;
    }

    public int getSize() {
        return this.size;
    }


    public String toString() {
        return "Бренд: " + this.brand + ", размер: " + this.size;
    }
}

