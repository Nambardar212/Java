//                                      Count number of hops

import java.util.Scanner;

//
//        A frog jumps either 1, 2, or 3 steps to go to the top.
//        In how many ways can it reach the top.
//        As the answer will be large find the answer modulo 1000000007.
//
//        Example 1:
//
//        Input:
//        N = 1
//        Output: 1
//        Example 2:
//
//        Input:
//        N = 4
//        Output: 7
//        Explanation:Below are the 7 ways to reach
//        4
//        1 step + 1 step + 1 step + 1 step
//        1 step + 2 step + 1 step
//        2 step + 1 step + 1 step
//        1 step + 1 step + 2 step
//        2 step + 2 step
//        3 step + 1 step
//        1 step + 3 step
//        Your Task:
//        Your task is to complete the function countWays() which takes 1 argument(N) and returns the answer%(10^9 + 7).
//
//        Expected Time Complexity: O(N).
//        Expected Auxiliary Space: O(1).
//
//        Constraints:
//        1 ≤ N ≤ 10^5
public class CountNumberOfHops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countWays(n));
    }
    public static long countWays(int n){
        long mod = 1000000007;
        long dp[] = new long[n+1];
        if(n == 1)return 1;
        if(n == 2)return 2;
        if(n == 3)return 4;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
            for (int i = 4; i <= n; i++) {
                dp[i] = (dp[i - 3] + dp[i - 2] + dp[i - 1]) % mod;
                dp[i - 3] = dp[i - 2];
                dp[i - 2] = dp[i - 1];
                dp[i - 1] = dp[i];
            }

        return dp[n];
    }
}
