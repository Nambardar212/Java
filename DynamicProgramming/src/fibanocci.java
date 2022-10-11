import java.util.Scanner;

public class fibanocci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
//  System.out.print(Fib(i, new int[i + 1]) + " ");
            System.out.print(fab(i) + " ");
    }

    public static int Fib(int n , int dp[]){
        if(n == 1 || n == 2) return 1;

        if(dp[n] != 0) {
            return dp[n];
        }
        System.out.println("hello" + n);
        int fab1 = Fib(n-1, dp); int fab2 = Fib(n-2, dp);
        int fab = fab1 + fab2;
        dp[n] = fab;
        return fab;

    }
    public static int fab(int n) {
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}

