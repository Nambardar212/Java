package Recusion;

import java.util.Scanner;

public class LastOccurenceIndexOfElementInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int k = sc.nextInt();
         int []a = new int[n];
         for(int i=0;i<n;i++){
             a[i] = sc.nextInt();
         }

         int last = LAstOccurence(a,0, k);
         System.out.println(last);
    }

    public static int LAstOccurence(int []a, int idx, int k) {
        if(idx == a.length-1){
            return idx;
        }

         int last = LAstOccurence(a,  idx +1, k);
         if(a[last] == k){
             return last;
         }
         else{
             return idx;
         }
    }
}
