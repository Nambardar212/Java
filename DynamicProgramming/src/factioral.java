import java.util.Scanner;

public class factioral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = Factorial(n, new int[n+1]);
        System.out.println("Factorial Of N : " + fact);
    }

    public static  int Factorial(int n , int dp[]){
        if(n == 0){
            return 1;
        }

        if(dp[n] != 0){
            return dp[n];
        }

           int fact = n * Factorial(n-1 , dp);
           dp[n] = fact;

           return fact;
    }
}
