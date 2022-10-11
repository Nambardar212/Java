import java.util.Scanner;

public class LastWordOfTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(s.length());
        int count =0;
       String x = s.trim();
        for(int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == ' '){
                count=0;
            }
            else{
                count++;
            }
        }
        System.out.println("-- With ExtraSpace---");
        System.out.println(count);
        System.out.println("-- Without ExtraSpace--");
        int length = LastWordLength(s);
        System.out.println(length);
    }
    public static int LastWordLength(String s) {
        boolean flag = false;
        int count =0;
        for(int i = s.length()-1; i >= 0; i--) {
            if(Character.isLetter(s.charAt(i))){
                flag = true;
                count++;
            }
            else {
                if(flag == true){
                    return count;
                }
            }
        }
        return count;
    }
}
