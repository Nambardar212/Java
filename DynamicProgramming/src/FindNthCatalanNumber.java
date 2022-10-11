//Given a number N. The task is to find the Nth catalan number.
//        The first few Catalan numbers for N = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
//        Note: Positions start from 0 as shown above.
//
//        Example 1:
//        Input:
//        N = 5
//        Output: 42

//        Example 2:
//        Input:
//        N = 4
//        Output: 14
//        Your Task:
//        Complete findCatalan() function that takes n as an argument and returns the Nth Catalan number. The output is printed by the driver code.
//
//        Expected Time Complexity: O(N).
//        Expected Auxiliary Space: O(N).
//
//        Constraints:
//        1 <= N <= 100
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class FindNthCatalanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findcatalan(n));
    }
    public static BigInteger findcatalan(int n){
        BigInteger []dp = new BigInteger[n+1];

        Arrays.fill(dp, BigInteger.valueOf(0));
        dp[0] = BigInteger.valueOf(1);
        dp[1] = BigInteger.valueOf(1);
        for(int i = 2; i < n + 1; i++){
            for(int j = 0; j < i; j++){
                dp[i] = dp[i].add(dp[j].multiply(dp[i-j-1]));
            }
        }
        return dp[n];
    }
}
