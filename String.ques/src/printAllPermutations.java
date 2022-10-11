import java.util.Scanner;

public class printAllPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String s = sc.next();

         String ans = "";
         permute(s, ans);
    }
    public static void permute(String s, String ans) {
        if(s.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String stringleft = s.substring(0, i);
            String stringRight = s.substring(i + 1);
            String res = stringleft + stringRight;
            permute(res, ans + ch);
        }
    }
}
