package Recusion;

import java.util.Scanner;

public class printAllPermutationsOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        permute(str);
    }
    public static void permute(String str){
        permutation("", str);
    }
    public static void permutation(String s, String word){
        if(word.isEmpty()){
            System.out.println(s + word);
        }else{
            for(int i = 0; i < word.length(); i++) {
                permutation(s + word.charAt(i) , word.substring(0,i) + word.substring(i+1 , word.length()));
            }
        }
    }
}
