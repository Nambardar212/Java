import java.util.Scanner;
import java.util.Stack;

public class RevrseStringUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        System.out.println(st);
        for(int i = 0; i < str.length(); i++) {
            System.out.print(st.pop());
        }
    }
}
