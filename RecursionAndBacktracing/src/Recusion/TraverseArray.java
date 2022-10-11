package Recusion;

import java.util.Scanner;

public class TraverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []a = new int[n];

        for(int i = 0; i < n; i++ ) {
            a[i] = sc.nextInt();
        }

        DisplayArray(a, 0);
    }
    public static void DisplayArray(int []a, int idx) {

        if(idx == a.length){
            return;
        }

        System.out.print(a[idx] + " ");
        DisplayArray(a, idx+1);
    }
}
