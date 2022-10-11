import java.util.Scanner;

public class PrintAllPladromeSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        AllPladromeSubString(str);
    }

    public static void AllPladromeSubString(String str) {
        int count=0;
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1 ; j < str.length(); j++){
                String subString = str.substring(i, j);
                if(isPladrome(subString) == true) {
                    System.out.println(subString + " ");
                    count++;
                }
            }
        }
        System.out.println("No. of total pladerome substring--> " + count);
    }
    public static boolean isPladrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i <= j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
