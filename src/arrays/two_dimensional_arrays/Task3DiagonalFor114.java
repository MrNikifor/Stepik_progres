package arrays.two_dimensional_arrays;

import java.util.Scanner;

public class Task3DiagonalFor114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] twoarr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    twoarr[i][j] = 1;
                }
                if (i < j) {
                    twoarr[i][j] = 0;
                }
                if (i > j) {
                    twoarr[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(twoarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
