import jdk.jfr.StackTrace;

import java.util.Scanner;
import java.util.Stack;

public class CheckParatheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("--Without extra space--");
        if(isBalanced(s)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        System.out.println("--With Extra Space--");
        if(isbalanced(s)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    public static boolean isBalanced(String s){
        int count = 0;
        for(int i =0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                count++;
            }
            else{
                count--;
            }
            if(count < 0) {
                return false;
            }
        }

        if(count != 0){
            return false;
        }
        return true;
    }
    public static boolean isbalanced(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0; i < s.length(); i++) {
            char ch = s.charAt(i);
//            if(ch == '('){
//                st.push(ch);
//            }
//            if(st.size() == 0) return false;
//            if(ch == ')'){
//                st.pop();
//            }
            if(!st.isEmpty() && ch == ')'){
                st.pop();
            }
            if(ch == '(')
                st.push(ch);

        }
       // System.out.println(st);
        if(st.size() == 0){
            return true;
        }
        return false;
    }
}
