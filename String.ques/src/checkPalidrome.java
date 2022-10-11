import java.util.Scanner;

public class checkPalidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String s = sc.next();
         int n = s.length();
         if(IsPalidrome(s,n) == true){
             System.out.println(true);
         }
         else{
             System.out.println(false);
         }
    }
    public static boolean IsPalidrome(String s, int n){
        int i =0;
        int j = n-1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
