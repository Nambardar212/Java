package Recusion;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CountDown(n);
    }
    public static void CountDown(int n){
        if(n == 0){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        CountDown(n-1);

    }
}
