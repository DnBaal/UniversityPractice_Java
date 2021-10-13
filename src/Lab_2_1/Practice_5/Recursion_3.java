package Lab_2_1.Practice_5;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Recursion_3 {                                          // 7. Разложение на множители
    public static void recursion(int n) {
        if (n%2==0) {
            System.out.println(2);
            recursion(n/2);
        }

        else if (3 >= sqrt(n) && n!=1) {System.out.println(n);}
        else {
            for (int i = 3; i <= sqrt(n); i += 2) {
                if (n % i == 0) {
                    System.out.println(i);
                    recursion(n / i);
                    break;
                }
                if ( n % (i+2) == 0) {
                    System.out.println(i+2);
                    recursion(n / (i+2));
                    break;
                }
                else if (i + 2 >= sqrt(n)) {
                    System.out.println(n);
                    break;
                }
            }
        }



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        recursion(in.nextInt());

    }
}
