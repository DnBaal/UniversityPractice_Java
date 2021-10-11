package Lab_2_1.Practice_5;
import java.util.Scanner;
public class Recursion_2 {                                          // 6. Проверка числа на простоту
    public static void recursion(int n, int del) {
        del++;
        if (n==2) System.out.println("YES");
        else if (del != 1 & n % del == 0) System.out.println("NO");
        else if (del * del >= n) System.out.println("YES");
        else recursion(n, del);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        recursion(in.nextInt(), 0);
    }

}
