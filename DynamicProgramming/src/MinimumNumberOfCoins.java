import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//                                      Minimum number of Coins
//
//
//
//        Given an infinite supply of each denomination of Indian currency
//        { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 } and a target value N.
//        Find the minimum number of coins and/or notes needed to make the change for Rs N.
//
//
//        Example 1:
//
//        Input: N = 43
//        Output: 20 20 2 1
//        Explaination:
//        Minimum number of coins and notes needed
//        to make 43.
//
//        Example 2:
//
//        Input: N = 1000
//        Output: 500 500
//        Explaination: minimum possible notes
//        is 2 notes of 500.
//
//        Your Task:
//        You do not need to read input or print anything. Your task is to complete the function minPartition() which takes the value N as input parameter and returns a list of integers in decreasing order.
//
//
//        Expected Time Complexity: O(N)
//        Expected Auxiliary Space: O(N)
//
//
//        Constraints:
//        1 ≤ N ≤ 10^6
public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> num = minPartition(n);
        for(int i : num){
            System.out.print(i + " ");
        }
    }

    public static  List<Integer> minPartition(int N) {
        List<Integer> ans = new ArrayList<>();
//        int dp[] = new int[N+1];
        int dp2[] = new int[N+1];
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int n = coins.length;
//        for(int i = n -1; i >= 0; i--){
//            while(N >= coins[i]){
//                N = N - coins[i];
//                ans.add(coins[i]);
//            }
//        }
 //       dp[0] = 0;
        dp2[0] = 0;
        for(int i = 1; i <= N; i++){
 //            dp[i] = Integer.MAX_VALUE;
            dp2[i] = -1;
        }
        for(int j = 0; j < n; j++){
            for(int i = 1; i <= N; i++){
                if(i >= coins[j]){
//                    dp[i] = Integer.min(dp[i], 1+dp[i-denom[j]]);
                     dp2[i] = j;
                }
            }
        }
        for(int i = N; i>0 && N>=0;){
            if(dp2[i] != -1)
                ans.add(coins[dp2[i]]);
            N = N - coins[dp2[i]];
            i = N;
        }
        return ans;
    }
}
