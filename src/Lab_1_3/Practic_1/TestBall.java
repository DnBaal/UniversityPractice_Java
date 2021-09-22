package Lab_1_3.Practic_1;

import java.util.Scanner;

public class TestBall {


    public static void RunTest(){
        Scanner sc = new Scanner(System.in);

        Ball ball1 = new Ball("Adidas", 5);
        Ball ball2 = new Ball("", 0);
        System.out.println("enter name of ball's brand");
        String brand = sc.next();
        System.out.println("enter ball size");
        int size = sc.nextInt();
        ball2.setBrand(brand);
        ball2.setSize(size);
        System.out.println("Первая мяч: " +ball1.toString());
        System.out.println("Второй мяч: " +ball2.toString());
    }
}
