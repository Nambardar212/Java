import java.util.Arrays;
import java.util.Scanner;

public class preFixOfstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String []s = new String[n];
        for(int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        String prefix = prefixString(s, n);
        System.out.println("--Character Matching--");
        System.out.println(prefix);

        System.out.println("--Word Matching");
        String pre = preString(s);
        System.out.println(pre);
    }
    public static String prefixString(String []s, int n)  {

        if(n == 0) return "";
        if(n == 1) return s[0];

        Arrays.sort(s);

        int end = Math.min(s[0].length(), s[n-1].length());
        int i = 0;
        while(i < end && s[0].charAt(i) == s[n-1].charAt(i)){
            i++;
        }
        String pre = s[0].substring(0,i);
        return pre;
    }
    public static String preString(String []s) {
        int n = s.length;

        String prefix = s[0];

        for(int i = 1; i < n; i++){
            prefix = StringIs(prefix , s[i]);
        }

        return prefix;
    }
    public static String StringIs(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        int i = 0;
        int j = 0;
        String result = "";

        while(i < n1 && j < n2 ) {
            if(str1.charAt(i) != str2.charAt(j)){
                break;
            }
            else {
                result += str1.charAt(i);
                i++;
                j++;
            }

        }
        return result;
    }
}
