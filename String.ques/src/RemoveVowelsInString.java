import java.util.Scanner;

public class RemoveVowelsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String rev = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i)!= 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u'){
                rev += s.charAt(i);
            }
        }
        System.out.println(rev);
    }
}
