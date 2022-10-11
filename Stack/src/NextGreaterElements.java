import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int []nge = ngEinArray(a,n);
        System.out.print("Next Greater Elements is : ");
        for(int i = 0; i < n; i++) {
            System.out.print(nge[i] + " ");
        }
    }
    public static int []ngEinArray(int []a, int n){
        int []nge = new int[n];
        Stack<Integer> st = new Stack<>();
         for(int i = n -1; i>= 0; i--) {
             while(!st.isEmpty() && st.peek() <= a[i]){
                 st.pop();
             }
             if(!st.isEmpty()){
                 nge[i] = st.peek();
             }
             else{
                 nge[i] = -1;
             }
             st.push(a[i]);

         }

        return nge;
    }
}
