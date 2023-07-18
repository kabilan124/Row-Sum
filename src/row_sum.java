import java.util.Arrays;
import java.util.Scanner;

public class row_sum {
    public static int[] Collsum(int arr[][], int N, int M) {
        int ar[] = new int[M];
        for (int j = 0; j < N; j++) {
            int sum = 0;
            for (int i = 0; i < M; i++) {
                sum = sum + arr[j][i];
            }
            ar[j] = sum;
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}