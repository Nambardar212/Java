package Recusion;

import java.util.Scanner;

public class ReverseofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String ans = "";
        System.out.println(reverse(str, ans, str.length()-1));
    }
    public static String reverse(String s,String ans, int i){
        if(i < 0){
            return ans;
        }
        ans += s.charAt(i);
        String  str =  reverse(s, ans,i - 1);
        return str;
    }
}
