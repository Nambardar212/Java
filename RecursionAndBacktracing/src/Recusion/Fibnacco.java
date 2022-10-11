package Recusion;

import java.util.Scanner;

public class Fibnacco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
            System.out.print(Fib(i) + " ");

    }
    public static int Fib(int n) {

        if(n ==1 || n== 2) return 1;
//        System.out.println("hello");
        return Fib(n-1) + Fib(n-2);
    }
}
