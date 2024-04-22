package arrays.two_dimensional_arrays;

import java.util.Scanner;

/*Вводятся 2 натуральных числа: n и m. Затем вводится через пробел n*m целых чисел.
Сохраните их в табличном виде и выведите на экран (разделитель - пробел).
Sample Input:
2
3
2 5 89 12 4 -7
Sample Output:
2 5 89
12 4 -7
*/
public class Task2For114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] twoarr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                twoarr[i][j] = sc.nextInt();
                System.out.print(twoarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
