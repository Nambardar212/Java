package Recusion;

import java.util.Scanner;

public class
TowerOFHuai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Tower(n , "A", "B", "C");
    }
    public static void Tower(int n, String A, String B, String C) {
        if(n == 0) {
            return;
        }

        Tower(n - 1, A, C, B);

        System.out.println("Move the Disk " + n + " From " + A + " to " + B);

        Tower(n - 1, C, B, A);
    }
}
