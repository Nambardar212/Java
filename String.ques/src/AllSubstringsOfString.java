import java.util.Scanner;

public class AllSubstringsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        for(int i = 0; i < s.length(); i++) {
            int j = i + 1;
            while(j <= s.length()){
                System.out.println(s.substring(i , j));
                j++;
            }
        }
    }
}
