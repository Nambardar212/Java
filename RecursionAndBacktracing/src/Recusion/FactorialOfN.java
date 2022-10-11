package Recusion;

import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = Factorial(n);
        System.out.println("Factorial Of N : " + fact);
    }

    public static int Factorial(int n) {

        if(n == 0) {
            return 1;
        }
        return n * Factorial(n - 1);
    }
}
