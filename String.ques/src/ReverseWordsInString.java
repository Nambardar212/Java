import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s += " ";
        String rev = "";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i) == ' ') {
                 if(rev == ""){
                     rev = str;
                 }
                 else{
                     rev = str + " " + rev;
                 }
                 str = "";
             }
             else{
                 str += s.charAt(i);
             }
        }
        System.out.println(rev);
    }
}