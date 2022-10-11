import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        if (CheckAnagram(s, t)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static boolean CheckAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char []a1 = s.toCharArray();
        char []a2 = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
    public static boolean AnagramString(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(hm.containsKey(s.charAt(i))){
                int of = hm.get(s.charAt(i));
                int nf = of + 1;
                hm.put(s.charAt(i), nf);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        System.out.println(hm);
        for(int i = 0; i < t.length(); i++) {
            if(hm.containsKey(t.charAt(i))){
                int of = hm.get(t.charAt(i));
                int nf = of - 1;
                hm.put(t.charAt(i), nf);
            }
            else{
                hm.put(t.charAt(i),1);
            }
        }
        System.out.println(hm);
        int count=0;
        for(Character ch : hm.keySet()){
            Integer val = hm.get(ch);
            if(val == 0){
                count++;
            }
        }
        if(count == hm.size()){
           return true;
        }
        else {
            return false;
        }
    }
}
