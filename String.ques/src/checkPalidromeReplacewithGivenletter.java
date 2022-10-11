import java.util.Scanner;

public class checkPalidromeReplacewithGivenletter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char []c = new char[2];
        c[0] = sc.next().charAt(0);
        c[1] = sc.next().charAt(0);
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) - 'a' == c[0] - 'a'){
                res += c[1];
            }
            else{
                res += s.charAt(i);
            }
        }
        if(isPalidrome(res)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    public static boolean isPalidrome(String res){
        int n = res.length();
        int i = 0;
        int j = n-1;
        while (i < j) {
            if(res.charAt(i) != res.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
