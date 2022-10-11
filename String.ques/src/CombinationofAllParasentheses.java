import java.util.Scanner;

public class CombinationofAllParasentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printParentheses(n);
    }

    public static void printParentheses(int n) {
        validParentheses(n/2, n/2, "");
    }
    public static void validParentheses(int open, int close, String str) {
        if(open == 0 && close ==0){
            System.out.println(str);
        }
        if(open > close){
            return;
        }
        if(open > 0) {
            validParentheses(open - 1, close, str + "(");
        }
        if(close > 0) {
            validParentheses(open, close - 1, str + ")");
        }
    }
}
