package Recusion;

import java.util.Scanner;

public class MaxElementInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []a = new int[n];

        for(int i = 0; i < n; i++ ) {
            a[i] = sc.nextInt();
        }

        int max = Maxium(a, 0);
        System.out.println(max);
    }
    public static int Maxium(int []a, int idx){

        if(idx == a.length - 1) {
            return a[idx];
        }

        int max = Maxium(a, idx+1);

        if(a[idx] < max) {
            return max;
        }
        else {
            return a[idx];
        }
    }
}
