package Recusion;

import java.util.Scanner;

public class binarySeacrh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(search(a,k,0,n));
    }
    public static int search(int []a, int k ,int lo, int hi){
        int mid = (lo + hi)/2;
        if(lo == hi){
            return -1;
        }
        if(a[mid] > k){
            return  search(a,k,lo,mid);
        }
        if(a[mid] < k){
           return search(a,k,mid+1,hi);
        }
        else{
            return mid;
        }
    }
}
