import java.util.Scanner;

//Given a number N. Find the minimum number of operations required to reach N starting from 0.
// You have 2 operations available:
//
//        Double the number
//        Add one to the number
//
//        Example 1:
//
//        Input:
//        N = 8
//        Output: 4
//        Explanation: 0 + 1 = 1, 1 + 1 = 2,
//        2 * 2 = 4, 4 * 2 = 8
//
//        Example 2:
//
//        Input:
//        N = 7
//        Output: 5
//        Explanation: 0 + 1 = 1, 1 + 1 = 2,
//        1 + 2 = 3, 3 * 2 = 6, 6 + 1 = 7
//
//        Your Task:
//        You don't need to read input or print anything. Your task is to complete the function minOperation() which accepts an integer N and return number of minimum operations required to reach N from 0.
//
//
//        Expected Time Complexity: O(LogN)
//        Expected Auxiliary Space: O(1)
//
//
//        Constraints:
//        1 <= N <= 10^6
public class MiniumOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(minOperation(n));
    }
    public static int minOperation(int n){
        int count = 0;
        while(n > 0) {
            count++;
            if(n % 2 == 0){
                n = n/2;
            }
            else{
                n = n - 1;
            }
        }
        return count;
    }
}
