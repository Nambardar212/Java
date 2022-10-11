package Recusion;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class sumofallSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        ArrayList<Integer> b = solve(a);
        Collections.sort(b);
        for(int i = 0; i < b.size(); i++) {
            System.out.print(b.get(i) + " ");
        }
    }
    public static ArrayList<Integer> solve(int []a){
        ArrayList<Integer> b = new ArrayList<>();
        helper(a, 0, 0, a.length, b );
        Collections.sort(b);
        return b;
    }
    public static void helper(int []a, int i, int sum, int n, ArrayList<Integer> b){
       if(i == n){
           b.add(sum);
           return;
       }
       helper(a, i + 1, sum + a[i], n, b);
       helper(a,i + 1, sum, n, b);
    }
}
