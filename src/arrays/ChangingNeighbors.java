package arrays;

import java.util.Scanner;

/*Переставьте соседние элементы списка (A[0] c A[1], A[2] c A[3] и т.д.).
Если элементов нечетное число, то последний элемент остается на своем месте.
Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.
Выходные данные
Выведите ответ на задачу.
Sample Input:
6
4
5
3
4
2
3
Sample Output:
5
4
4
3
3
2
*/
public class ChangingNeighbors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i += 2) {
            int a;
            if (i % 2 == 0 && i != n - 1) {
                a = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = a;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
