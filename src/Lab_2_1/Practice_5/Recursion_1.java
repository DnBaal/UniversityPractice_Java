package Lab_2_1.Practice_5;
import java.util.Scanner;
public class Recursion_1 {                          // 5. Сумма цифр числа
    public static int  recursion(int n) {
        if (n==0) return 0;
        else return recursion(n/10)+n%10;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(recursion(in.nextInt()));
    }
}
