package Recusion;

import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []a = new int[n];

        for(int i = 0; i < n; i++ ) {
            a[i] = sc.nextInt();
        }

        ReverseArray(a, 0);
    }
    public static void ReverseArray(int []a, int idx) {

        if(idx == a.length) {
            return;
        }

        ReverseArray(a,idx+1);
        System.out.print(a[idx] + " ");
    }
}
