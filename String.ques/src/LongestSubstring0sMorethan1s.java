import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstring0sMorethan1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        solve(s);
    }
    public static void solve(String s) {
        int n = s.length();
        int i;
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxlen = 0;
        int curlen = 0;
        for(i = 0; i < n; i++) {
            if(s.charAt(i) == '1'){
                sum++;
            }
            else{
                sum--;
            }
            if(sum > 0) {
                maxlen = i + 1;
            } else if (sum <= 0) {
                if(hm.containsKey(sum - 1)){
                    if(i  - (hm.get(sum - 1)) == 0){
                        curlen = 1;
                    }
                    else{
                        curlen = hm.get(sum - 1);
                    }
                }
                maxlen = Math.max(maxlen, curlen);
            }
            if(!hm.containsKey(sum)){
                hm.put(sum, i);
            }
        }
        System.out.println(maxlen);
    }
}
