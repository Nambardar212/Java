package Recusion;

import java.util.Scanner;

public class FirstOccurenceIndexOfElementInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []a = new int[n];

        for(int i = 0; i < n; i++ ) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int first = Occurense(a, 0, k);
        System.out.println(first);
    }
    public static int Occurense(int []a, int idx, int x) {

      if(idx == a.length) {
          return -1;
      }

        if(a[idx] == x) {
            return idx;
        }
        else {
            int fi = Occurense(a, idx + 1, x);
            return fi;
        }
    }
}
