package arrays;

import java.util.Scanner;

/*
Сумма 2
Вводится массив (сначала количество элементов, потом сами элементы).
Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
Sample Input:
4
1
2
3
4
Sample Output:
4
1
3
*/
public class Sum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
