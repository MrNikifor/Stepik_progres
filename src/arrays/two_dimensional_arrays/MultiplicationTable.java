package arrays.two_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Вводятся 2 натуральных числа: n и m. Выведите на экран таблицу умножения размером n*m через пробел.
Sample Input:
3
4
Sample Output:
1 2 3 4
2 4 6 8
3 6 9 12
*/
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mas = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = (i + 1) * (j + 1);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

}
