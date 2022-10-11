import java.util.Scanner;
import java.util.Stack;

public class CheckBalancedParasthes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(IsBalanced(s)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("NonBalanced");
        }
    }
    public static boolean IsBalanced(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
                continue;
            }
            if(st.isEmpty()) return false;

            char c;
            switch (ch){
                case ')':
                        c = st.pop();
                       if(c == '[' || c == '{')
                           return false;
                       break;
                case '}': c = st.pop();
                          if(c == '[' || c == '(')
                              return false;
                          break;
                case ']': c = st.pop();
                           if(c == '{' || c =='(')
                               return false;
                           break;
            }

        }


        return true;
    }
}
