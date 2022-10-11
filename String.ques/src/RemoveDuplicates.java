import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
//        Iterator<Character> it = set.iterator();
          String s = "";
//        while(it.hasNext()) {
//            s += it.next();
//        }
        for(Character ch : set){
            s += ch;
        }
        System.out.println(s);
    }
}
