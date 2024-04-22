package arrays.two_dimensional_arrays;
/*
Проверьте, является ли двумерный массив симметричным относительно главной диагонали.
 Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.
Входные данные

Программа получает на вход число n < 100, являющееся числом строк и столбцов в массиве.
 Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.
Выходные данные

Программа должна выводить слово YES для симметричного массива и слово NO для несимметричного.
Sample Input 1:
3
0 1 2
1 5 3
2 3 4
Sample Output 1:
YES
Sample Input 2:
3
0 0 0
0 0 0
1 0 0
Sample Output 2:
NO
*/

import java.util.Scanner;

public class Task4IsSymmetryFor114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] twoarr = new int[n][n];
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twoarr[i][j] = sc.nextInt();
                if (i < j) {
                    left = left + twoarr[i][j];
                }
                if (j < i) {
                    right = right + twoarr[i][j];
                }
            }
        }
        if (left == right) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
