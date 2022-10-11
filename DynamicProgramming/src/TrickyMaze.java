import java.util.Scanner;

public class TrickyMaze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char [][]maze = new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++ ){
                maze[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println(Trickymaze(maze,n,m));
    }
    public static int Trickymaze(char [][]a, int n, int m) {

        int [][]dp = new int[n+1][m+1];
        //dp[0][0] = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] == '#' ) {
                    dp[i][j] = 0;
                }
                if(a[i][j+1] == '#'){

                }
            }
        }
       // dp[n-1][m-1] = 1;
        return dp[n][m];
    }
}
